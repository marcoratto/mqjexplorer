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

import java.awt.Dimension;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Vector;

import javax.swing.JTree;
import javax.swing.tree.TreeModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.kolban.mqjexplorer.MQSeriesTree.MQJExplorerNode;
import com.kolban.mqjexplorer.jms.JNDINameSpace;
import com.kolban.swing.TableMetaData;
import com.kolban.xml.DOMTree;
import com.kolban.xml.XMLUtils;

// Referenced classes of package com.kolban.mqjexplorer:
//            MQSeriesTree

public class Profile {
	
	private final static Logger logger = Logger.getLogger("com.kolban.mqjexplorer");
	
	private static Profile instance = null;

	public class CommonSettings {

		public int dividerPosition;
		public Dimension windowSize;

		public CommonSettings() {
			dividerPosition = 200;
			windowSize = new Dimension(640, 400);
		}
	}

	public class MessageListSettings {

		public Dimension windowSize;

		public MessageListSettings() {
			windowSize = new Dimension(580, 400);
		}
	}

	public class BrowseSettings {

		public Dimension dimensions;

		public BrowseSettings() {
			dimensions = new Dimension(440, 405);
		}
	}

	public class PubSubSettings {

		public String initialStreamName;
		public Dimension topicDlgSize;
		public TableMetaData topicDlgTableMetaData;

		public PubSubSettings() {
			topicDlgTableMetaData = new TableMetaData();
			topicDlgSize = new Dimension(640, 230);
			initialStreamName = null;
		}
	}

	public class TailFileSettings {

		public Font font;
		public Vector fileNames;

		public TailFileSettings() {
			font = null;
			fileNames = new Vector();
		}
	}

	public class QStatsSettings {

		public Dimension dimensions;
		public boolean loggingEnabled;
		public String fileName;

		public QStatsSettings() {
			dimensions = new Dimension(440, 405);
			loggingEnabled = false;
			fileName = "";
		}
	}

	public class AdvancedPutSettings {

		public String lastFileName;
		public String lastRFH2Data;
		public Dimension windowSize;
		public static final int SELECTED_FILE = 1;
		public static final int SELECTED_SCREEN = 2;
		public static final int SELECTED_SIZE = 3;
		public int selected;

		public AdvancedPutSettings() {
			lastFileName = null;
			lastRFH2Data = null;
			windowSize = null;
			selected = 2;
			lastFileName = "";
			lastRFH2Data = "";
			windowSize = new Dimension(400, 300);
		}
	}

	private Profile() {
		queueViewTableMetaData = null;
		messageListTableMetaData = null;
		commonSettings = null;
		messageListSettings = null;
		browseSettings = null;
		pubSubSettings = null;
		tailFileSettings = null;
		qStatsSettings = null;
		advancedPutSettings = null;
		queueViewTableMetaData = new TableMetaData();
		messageListTableMetaData = new TableMetaData();
		tree = new MQSeriesTree();
		browseSettings = new BrowseSettings();
		advancedPutSettings = new AdvancedPutSettings();
		messageListSettings = new MessageListSettings();
		qStatsSettings = new QStatsSettings();
		tailFileSettings = new TailFileSettings();
		pubSubSettings = new PubSubSettings();
		commonSettings = new CommonSettings();		
	}
	
	public TableMetaData getMessageListTableMetaData() {
		return messageListTableMetaData;
	}

	public TableMetaData getQueueViewTableMetaData() {
		return queueViewTableMetaData;
	}

	public MQSeriesTree getTree() {
		return tree;
	}

	public static Profile getInstance() {
		if (instance == null) {
			instance = new Profile();
		} 
		return instance;
	}

	public void load(File f) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(f), "UTF-8"));
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(Constants.XML_CONFIG_FILE);
			doc.getDocumentElement().normalize();	 
			NodeList listOfQueueManager = doc.getElementsByTagName("QueueManager");	 
			QueueManagerModel queueManagerModel = null;
			for (int j=0; j<listOfQueueManager.getLength(); j++) {
				   Node nNode = listOfQueueManager.item(j);
				   if (nNode.getNodeType() == Node.ELEMENT_NODE) {	
					   Element eElement = (Element) nNode;					   
					   String queueManagerName = XMLUtils.getTagValue("QueueManagerName", eElement);
					   String hostname = XMLUtils.getTagValue("HostName", eElement);
					   int port = Integer.parseInt(XMLUtils.getTagValue("Port", eElement));
					   String channel = XMLUtils.getTagValue("Channel", eElement);
					   
					   String queueManagerType = XMLUtils.getTagValue("QueueManagerType", eElement);
					   if ((queueManagerType == null) || (queueManagerType.trim().length() == 0)){
						   queueManagerType = "D";
					   }					   
					   queueManagerModel = new QueueManagerModel();
					   queueManagerModel.setHostName(hostname);
  					   queueManagerModel.setPort(port);
					   queueManagerModel.setQueueManagerName(queueManagerName);
					   queueManagerModel.setChannel(channel);
					   queueManagerModel.setQueueManagerType(queueManagerType);
					   tree.addQueueManager(queueManagerModel);					   
				   }
			}	 
		} catch (IOException e) {
			e.printStackTrace();
			logger.error(e);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
			logger.error(e);
		} catch (SAXException e) {
			e.printStackTrace();
			logger.error(e);
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (Exception e) {
				logger.warn(e);
			}
		}
	}

	public void save(File f, JTree jtree) {
		queueViewTableMetaData.setWidthsFromTable();
		messageListTableMetaData.setWidthsFromTable();
		try {
			logger.info("Found " + tree.getQueueManagerCount() + " definitions.");

			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			//root elements
			Document doc = docBuilder.newDocument();

			Element rootElement = doc.createElement("MQJExplorer");
			doc.appendChild(rootElement);
					
			TreeModel treeModel = jtree.getModel();
			MQJExplorerNode nodeIBMMQSeries = (MQJExplorerNode) treeModel.getRoot();			
			MQJExplorerNode nodeQueueManagers = (MQJExplorerNode) nodeIBMMQSeries.getChildAt(0);
			
			Element queueManagersElement = doc.createElement("QueueManagers");
			rootElement.appendChild(queueManagersElement);
			for (int i=0; i<nodeQueueManagers.getChildCount(); i++) {
					MQSeriesTree.MQJExplorerNode node = (MQJExplorerNode) nodeQueueManagers.getChildAt(i);
					QueueManagerModel queueManagerModel = node.getQueueManagerModel();
					if (queueManagerModel != null) {
						String queueManagerName = queueManagerModel.getQueueManagerName();
						String hostName = queueManagerModel.getHostName();
						int port = queueManagerModel.getPort();
						String channel = queueManagerModel.getChannel();
						String queueManagerType = queueManagerModel.getQueueManagerType();
						
						if ((queueManagerType == null) || 
							(queueManagerType.trim().length() == 0)) {
							queueManagerType = "D";
							logger.info("queueManagerType forced to " + queueManagerType);
						}
						
						boolean local = queueManagerModel.isLocal();
						
						Element hostnameElement = doc.createElement("HostName");
						hostnameElement.setTextContent(hostName);
						Element portElement = doc.createElement("Port");
						portElement.setTextContent("" + port);

						Element queueManagerNameElement = doc.createElement("QueueManagerName");
						queueManagerNameElement.setTextContent(queueManagerName);
						
						Element channelElement = doc.createElement("Channel");
						channelElement.setTextContent(channel);

						Element queueManagerTypeElement = doc.createElement("QueueManagerType");
						queueManagerTypeElement.setTextContent(queueManagerType);

						Element queueManagerElement = doc.createElement("QueueManager");						
						queueManagerElement.appendChild(hostnameElement);
						queueManagerElement.appendChild(portElement);						
						queueManagerElement.appendChild(queueManagerNameElement);
						queueManagerElement.appendChild(channelElement);
						queueManagerElement.appendChild(queueManagerTypeElement);
						queueManagersElement.appendChild(queueManagerElement);
					}
				}
				MQSeriesTree.MQJExplorerNode nodeJMS = (MQJExplorerNode) nodeIBMMQSeries.getChildAt(1);
				Element jmsElement = doc.createElement("JMS");
				rootElement.appendChild(jmsElement);
				for (int i=0; i<nodeJMS.getChildCount(); i++) {
					MQSeriesTree.MQJExplorerNode node = (MQJExplorerNode) nodeJMS.getChildAt(i);
					QueueManagerModel queueManagerModel = node.getQueueManagerModel();
					if (queueManagerModel != null) {
						JNDINameSpace jndi = node.getJNDINameSpace();
						String initialContext = jndi.getInitialContext();
						String providerURL = jndi.getProviderURL();

						Element jndiElement = doc.createElement("JNDI");	
						Element initialContextElement = doc.createElement("InitialContext");	
						initialContextElement.setTextContent(initialContext);
						Element providerURLElement = doc.createElement("ProviderURL");
						providerURLElement.setTextContent(providerURL);
						jndiElement.appendChild(initialContextElement);		
						jndiElement.appendChild(providerURLElement);
						
						jmsElement.appendChild(jndiElement);
						logger.info(jndi.getProviderURL());			
					}
				}			
				
			  //write the content into xml file
			  TransformerFactory transformerFactory = TransformerFactory.newInstance();
			  Transformer transformer = transformerFactory.newTransformer();
			  transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "3");
			  transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			  DOMSource source = new DOMSource(doc);
			  StreamResult result =  new StreamResult(Constants.XML_CONFIG_FILE);
			  transformer.transform(source, result);
			  
			  logger.info("New file " + Constants.XML_CONFIG_FILE + " created.");						
		} catch (ParserConfigurationException e) {
			logger.error(e);
		} catch (TransformerException e) {
			logger.error(e);
		} 
	}

	private TableMetaData queueViewTableMetaData;
	private TableMetaData messageListTableMetaData;
	private MQSeriesTree tree;
	public CommonSettings commonSettings;
	public MessageListSettings messageListSettings;
	public BrowseSettings browseSettings;
	public PubSubSettings pubSubSettings;
	public TailFileSettings tailFileSettings;
	public QStatsSettings qStatsSettings;
	public AdvancedPutSettings advancedPutSettings;
}
