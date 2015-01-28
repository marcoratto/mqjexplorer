/*
 * Copyright (C) 2012 Marco Ratto
 *
 * This file is part of the project MQJExplorer.
 *
 * MQJExplorer is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * any later version.
 *
 * MQJExplorer is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MQJExplorer; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package com.kolban.mqjexplorer;

import java.io.IOException;
import java.util.Properties;

import javax.swing.JOptionPane;

import org.apache.log4j.Logger;

import com.ibm.mq.MQC;
import com.ibm.mq.MQException;
import com.ibm.mq.MQMessage;
import com.ibm.mq.MQQueue;
import com.ibm.mq.MQQueueManager;
import com.ibm.mq.MQSecurityExit;
import com.ibm.mq.pcf.PCFMessage;
import com.ibm.mq.pcf.PCFMessageAgent;
import com.kolban.mq.PCFUtils;
import com.kolban.mq.SimpleSecurityExit;
import com.kolban.mqjexplorer.beans.QMgrDlg;

public class QueueManagerModel implements Comparable<QueueManagerModel> {

	private final static Logger logger = Logger.getLogger(QueueManagerModel.class);

	public QueueManagerModel() {
		logger.trace("QueueManagerModel()");
		agent = null;
		queueManagerName = null;
		hostName = "";
		channel = "";
		port = DEFAULT_PORT;
		queueManager = null;
		queueListModel = new QueueListModel();
		processListModel = new ProcessListModel();
		channelListModel = new ChannelListModel();
		nameListListModel = new NamelistListModel();
		responses = null;
	}

	public void changeProperties() {
		QMgrDlg qmgrdlg = new QMgrDlg();
		qmgrdlg.change(this);
		refreshQMgrProperties();
	}

	   public void connect() throws MQException {
		      logger.trace("connect()");
		      // TODO: Change for Mainframe connection
		      try {
		         logger.info("hostName= " + hostName);
		         logger.info("port= " + port);
		         logger.info("channel= " + channel);
		         logger.info("queueManagerName= " + queueManagerName);

		         queueManager = new MQQueueManager(queueManagerName, getMQProperties());
		      } catch (MQException mqexception) {
		         mqexception.printStackTrace();
		         logger.info("Failed to connect to queue manager: "
		               + mqexception.toString());
		         queueManager = null;
		         throw mqexception;
		      }
		      MQQueue mqqueue = queueManager.accessQueue(
		            queueManager.getCommandInputQueueName(), 32);
		      int i = mqqueue.getOpenInputCount();
		      mqqueue.close();
		      if (i == 0) {
		         disconnect();
		         throw new MQException(2, 1, "No command server running!");
		      } else {
		         queueListModel.refreshAll(getAgent());
		         channelListModel.refreshAll(getAgent());
		         nameListListModel.refreshAll(getAgent());
		         processListModel.refreshAll(getAgent());
		         refreshQMgrProperties();
		         return;
		      }
		   }

	public void deleteQueue(String s, boolean flag) throws MQException {
		PCFUtils.deleteQueue(getAgent(), s, flag);
		queueListModel.deleteQueue(s);
	}

	public void disconnect() {
		try {
			if (agent != null) {
				agent.disconnect();
				agent = null;
			}
			if (queueManager != null) {
				queueManager.disconnect();
				queueManager = null;
			}
		} catch (Exception exception) {
			logger.error("Exception: " + exception.toString());
		}
	}

	public static boolean displayError(MQException mqexception) {
		String s = null;
		switch (mqexception.reasonCode) {
		case 4068:
			s = "Cell directory is not available";
			break;

		case 4004:
			s = "Object open";
			break;

		case 2042:
			s = "Object in use";
			break;

		case 2016:
			s = "Get Inhibited";
			break;

		case 2053:
			s = "Queue full";
			break;

		case 2059:
			s = "Queue manager not available";
			break;

		case 2063:
			s = "Security error";
			break;

		case 1: // '\001'
			s = "No command server running!";
			break;

		case 2161:
			s = "Queue manager quiescing";
			break;

		case 4001:
			s = "Object already exists";
			break;

		case 4010:
			s = "Host not available";
			break;

		case 4033:
			s = "Unknown remote channel";
			break;

		default:
			s = "Unknown error: " + mqexception.toString();
			break;
		}
		JOptionPane.showMessageDialog(MQJExplorer.mainFrame, s,
				"MQSeries error", 0);
		return true;
	}

	public boolean equals(QueueManagerModel queuemanagermodel) {
		if (queuemanagermodel.port != port)
			return false;
		if (!hostName.equals(queuemanagermodel.hostName))
			return false;
		return queueManagerName.equals(queuemanagermodel.queueManagerName);
	}
	
	public void executePCF(PCFMessage pcfmessage) throws MQException {
		PCFMessageAgent pcfmessageagent = getAgent();
		try {
			pcfmessageagent.send(pcfmessage);
		} catch (IOException ioexception) {
			logger.error("executePCF: " + ioexception.toString());
		}
	}

	public PCFMessage findQueueByName(String s) {
		return queueListModel.findQueueByName(s);
	}

	public PCFMessageAgent getAgent() throws MQException {
		if (agent != null) {
			return agent;
		} else {
			MQQueueManager mqqueuemanager = getQueueManager();
			agent = new PCFMessageAgent(mqqueuemanager);
			agent.setWaitInterval(30);
			return agent;
		}
	}

	public String getChannel() {
		return channel;
	}

	public ChannelListModel getChannelListModel() {
		return channelListModel;
	}

	public String getHostName() {
		return hostName;
	}

	public NamelistListModel getNamelistListModel() {
		return nameListListModel;
	}

   public MQQueueManager getNewQueueManager() throws MQException {

	      // TODO: Change for Mainframe connection
	      MQQueueManager mqqueuemanager = null;
	      try {
	         mqqueuemanager = new MQQueueManager(queueManagerName, getMQProperties());
	      } catch (MQException mqexception) {
	         mqexception.printStackTrace();
	         logger.error("Failed to connect to queue manager: "
	               + mqexception.toString());
	         mqqueuemanager = null;
	         throw mqexception;
	      }
	      return mqqueuemanager;
	   }

	public int getPort() {
		return port;
	}

	public ProcessListModel getProcessListModel() {
		return processListModel;
	}

	public PCFMessage getQMgrProperties() {
		if (responses == null)
			return null;
		else
			return responses[0];
	}

	public QueueListModel getQueueListModel() {
		return queueListModel;
	}

	public MQQueueManager getQueueManager() throws MQException {
		if (queueManager == null)
			connect();
		return queueManager;
	}

	public String getQueueManagerName() {
		return queueManagerName;
	}

	public boolean hasPubSub() {
		QueueListModel queuelistmodel = getQueueListModel();
		if (queuelistmodel == null)
			return false;
		return queuelistmodel.findQueueByName("SYSTEM.BROKER.CONTROL.QUEUE") != null;
	}

	public boolean hasWMQI() {
		return false;
	}

	public boolean isConnected() {
		return queueManager != null;
	}

	public boolean isLocal() {
		return hostName == null || hostName.length() == 0;
	}

	boolean isShowAliasQueues() {
		return queueListModel.isShowAliasQueues();
	}

	boolean isShowLocalQueues() {
		return queueListModel.isShowLocalQueues();
	}

	boolean isShowModelQueues() {
		return queueListModel.isShowModelQueues();
	}

	boolean isShowRemoteQueues() {
		return queueListModel.isShowRemoteQueues();
	}

	boolean isShowSystemQueues() {
		return queueListModel.isShowSystemQueues();
	}

	boolean isShowTempQueues() {
		return queueListModel.isShowTempQueues();
	}

	public void parseConnectionString(String s) throws Exception {
		int j = s.indexOf('(');
		if (j > 0) {
			int i = s.indexOf(')');
			if (i < 0)
				throw new Exception("Badly formed connection string - no ')'");
			String s1 = s.substring(j + 1, i);
			try {
				port = Integer.parseInt(s1);
				hostName = s.substring(0, j);
			} catch (Exception _ex) {
				throw new Exception(
						"Badly formed connection string - not a numeric port");
			}
		} else {
			port = 1414;
			hostName = s;
		}
	}

	public void putText(String s, String s1) throws MQException {
		MQMessage mqmessage = new MQMessage();
		mqmessage.format = "MQSTR   ";
		MQQueue mqqueue = null;
		try {
			mqqueue = getQueueManager().accessQueue(s, 16);
			mqmessage.writeString(s1);
			mqqueue.put(mqmessage);
			mqqueue.close();
		} catch (MQException mqexception) {
			if (mqqueue != null)
				mqqueue.close();
			throw mqexception;
		} catch (IOException _ex) {
		}
	}

	public void refreshQMgrProperties() {
		try {
			logger.info("Refreshing queue manager");
			PCFMessage pcfmessage = new PCFMessage(2);
			int ai[] = { 1009 };
			pcfmessage.addParameter(1001, ai);
			responses = agent.send(pcfmessage);
		} catch (Exception exception) {
			logger.error("Exception (QueueManagerModel::refresh): " + exception.toString());
		}
	}

	public String getQueueManagerType() {
		return queueManagerType;
	}

	public void setQueueManagerType(String queueManagerType) {
		this.queueManagerType = queueManagerType;
	}

	public void setChannel(String s) {
		queueManager = null;
		channel = s;
	}

	public void setHostName(String s) {
		if (s != null) {
			hostName = s;
			queueManager = null;
		}
	}

	public void setPort(int i) {
		port = i;
		queueManager = null;
	}

	public void setQueueManagerName(String s) {
		queueManagerName = s;
		queueManager = null;
		agent = null;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setShowAliasQueues(boolean flag) {
		queueListModel.setShowAliasQueues(flag);
	}

	public void setShowLocalQueues(boolean flag) {
		queueListModel.setShowLocalQueues(flag);
	}

	public void setShowModelQueues(boolean flag) {
		queueListModel.setShowModelQueues(flag);
	}

	public void setShowRemoteQueues(boolean flag) {
		queueListModel.setShowRemoteQueues(flag);
	}

	public void setShowSystemQueues(boolean flag) {
		queueListModel.setShowSystemQueues(flag);
	}

	public void setShowTempQueues(boolean flag) {
		queueListModel.setShowTempQueues(flag);
	}

	public String getSecurityExit() {
		return securityExit;
	}

	public void setSecurityExit(String value) {
		this.securityExit = value;
		logger.info("securityExit is " + securityExit);
	}

	private Properties getMQProperties()
	   {
	      if (username == null) {
	    	  // username = System.getProperty("user.name");
	    	  this.username = DEFAULT_USER;
	      }

	      Properties properties = new Properties();
	      properties.put(MQC.HOST_NAME_PROPERTY, hostName);
	      properties.put(MQC.PORT_PROPERTY, new Integer(port));
	      properties.put(MQC.CHANNEL_PROPERTY, channel);
	      properties.put(MQC.USER_ID_PROPERTY, username);

	      if (password != null) {
	         properties.put(MQC.PASSWORD_PROPERTY, password);
	      }

	      if (securityExit != null)
	      {
	          try
	          {
	             Class se = Class.forName(securityExit, false, getClass().getClassLoader());
	             MQSecurityExit mqse = (MQSecurityExit) se.newInstance();
	             properties.put(MQC.SECURITY_EXIT_PROPERTY, mqse);
	          }
	          catch (Exception e)
	          {
	             logger.error("Exception: " + e.getLocalizedMessage());
	          }
	      }

	      return properties;
	   }
	   
	public String toString() {
		if (hostName.length() > 0)
			return queueManagerName + " on " + hostName + "(" + port + ")";
		else
			return queueManagerName;
	}

	private transient PCFMessageAgent agent;
	private String queueManagerName;
	private String queueManagerType;
	private String hostName;
	private String channel;
	
	private String username = null;
	private String password = null;
	
	private final int DEFAULT_PORT = 1414;
	private final String DEFAULT_USER = "mqm";
	
	private String securityExit = null;
	
	private int port;
	private transient MQQueueManager queueManager;
	private transient QueueListModel queueListModel;
	private transient ProcessListModel processListModel;
	private transient ChannelListModel channelListModel;
	private transient NamelistListModel nameListListModel;
	private transient PCFMessage responses[];
	private static final int NO_COMMAND_SERVER = 1;

	public int compareTo(QueueManagerModel qmm) {
		// QueueManagerModel qmm = (QueueManagerModel) obj;		
		int out = this.queueManagerName.compareTo(qmm.queueManagerName);
		return out;
	}
}
