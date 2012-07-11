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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import javax.swing.JTree;
import javax.swing.tree.TreeModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.kolban.mqjexplorer.MQSeriesTree;
import com.kolban.mqjexplorer.Profile;
import com.kolban.mqjexplorer.QueueManagerModel;
import com.kolban.mqjexplorer.MQSeriesTree.MQJExplorerNode;
import com.kolban.mqjexplorer.jms.JNDINameSpace;

public class ConfigFileMigrationTool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConfigFileMigrationTool instance = new ConfigFileMigrationTool();
		File f = null;
		if (args.length == 0) {
			f = CONFIG_FILE;
		} else {			
			f = new File(args[0]);
		}
		instance.runme(f);
	}
	
	public void runme(File aConfigFile) {
		if (XML_CONFIG_FILE.exists()) {
			System.err.println("File " + XML_CONFIG_FILE.getAbsolutePath() + " already exists!");
			System.exit(1);
		}
		System.out.println("Try to load config file " + aConfigFile);
		int retCode = 0;
		try {
			// MQJExplorer.main(args);
			profile = Profile.load(aConfigFile);
			System.out.println("Config file " + aConfigFile + " loaded.");
			MQSeriesTree tree = profile.getTree();
	        JTree jtree = tree.buildTree();
			TreeModel treeModel = jtree.getModel();

			System.out.println("Found " + tree.getQueueManagerCount() + " definitions.");

			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			//root elements
			Document doc = docBuilder.newDocument();

			Element rootElement = doc.createElement("MQJExplorer");
			doc.appendChild(rootElement);
					
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
						
						Element hostnameElement = doc.createElement("HostName");
						hostnameElement.setTextContent(hostName);
						Element portElement = doc.createElement("Port");
						portElement.setTextContent("" + port);
						Element queueManagerNameElement = doc.createElement("QueueManagerName");
						queueManagerNameElement.setTextContent(queueManagerName);
						Element channelElement = doc.createElement("Channel");
						channelElement.setTextContent(channel);
						Element queueManagerTypeElement = doc.createElement("QueueManagerType");
						queueManagerTypeElement.setTextContent("D");
						
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
						System.out.println(jndi.getProviderURL());			
					}
				}			
				
			  //write the content into xml file
			  TransformerFactory transformerFactory = TransformerFactory.newInstance();
			  Transformer transformer = transformerFactory.newTransformer();
			  transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "3");
			  transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			  DOMSource source = new DOMSource(doc);
			  StreamResult result =  new StreamResult(XML_CONFIG_FILE);
			  transformer.transform(source, result);
			  
			  System.out.println("New file " + XML_CONFIG_FILE + " created.");
		} catch (Throwable t) {
			t.printStackTrace();
			retCode = 1;
		} finally {
			System.exit(retCode);			
		}
	}

	public void stringToFile(File file, String buffer) {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
			System.out.println("Write " + buffer.length() + " bytes on the file " + file.getAbsoluteFile().toString());
			bw.write(buffer);
		} catch (Throwable t) {
			t.printStackTrace(System.err);
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (Exception e) {
					// Ignore
				}
			}
		}
	}

	private Profile profile = null;
    public final static File CONFIG_DIR = new File(System.getProperty("user.home"), ".MQJExplorer");
    public final static File CONFIG_FILE = new File(CONFIG_DIR, "config.dat");
    public final static File XML_CONFIG_FILE = new File(CONFIG_DIR, "config.xml");

}
