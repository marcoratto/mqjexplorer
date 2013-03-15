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
package com.kolban.mqjexplorer.beans;

import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

import org.apache.log4j.Logger;

public class ShowQueueManager extends JDialog {
	
	private final static Logger logger = Logger.getLogger(ShowQueueManager.class);
	
	class IvjEventHandler implements ActionListener, ItemListener, PropertyChangeListener, DocumentListener {

		public void actionPerformed(ActionEvent actionevent) {
			logger.info("ActionCommand is " + actionevent.getActionCommand());
			logger.info("ID is " + actionevent.getID());
			if (actionevent.getSource() == getCancel()) {
				logger.info("Button Cancel");
				connEtoC1(actionevent);
				return;
			} 
			if (actionevent.getSource() == getOK()) {
				logger.info("Button OK");
				connEtoC2(actionevent);
				return;
			} 
			if (actionevent.getSource() == remoteMainframeRadioButton) {
				logger.info("Radio Button Mainframe");
				queueManagerType = "M";
				return;
			} 
			if (actionevent.getSource() == remoteDistributedRadioButton) {
				logger.info("Radio Button Distributed");
				queueManagerType = "D";
				return;
			} 
			if (actionevent.getSource() == defaultChannelButton) {	
				logger.info("Button Default Channel");
				if (remoteMainframeRadioButton.isSelected()) {
					logger.info("Radio Button Mainframe");
					setChannelName("SYSTEM.DEF.SVRCONN");
				} else if (remoteDistributedRadioButton.isSelected()) {
					logger.info("Radio Button Distributed");
					setChannelName("SYSTEM.ADMIN.SVRCONN");
				}
			}
		}

		public void changedUpdate(DocumentEvent documentevent) {
			if (documentevent.getDocument() == getLocalQueueManagerDocument())
				connEtoC3(documentevent);
			if (documentevent.getDocument() == getRemoteQueueManagerDocument())
				connEtoC4(documentevent);
			if (documentevent.getDocument() == getConnectionNameDocument())
				connEtoC5(documentevent);
		}

		public void insertUpdate(DocumentEvent documentevent) {
			if (documentevent.getDocument() == getLocalQueueManagerDocument())
				connEtoC3(documentevent);
			if (documentevent.getDocument() == getRemoteQueueManagerDocument())
				connEtoC4(documentevent);
			if (documentevent.getDocument() == getConnectionNameDocument())
				connEtoC5(documentevent);
		}

		public void itemStateChanged(ItemEvent itemevent) {
			if (itemevent.getSource() == getShowLocalRadioButton()) {
				local = true;
				connEtoM1(itemevent);		
				connEtoM6(itemevent);			
				connEtoC6(itemevent);
				setChannelName("");
			}
			
			if (itemevent.getSource() == getShowRemoteRadioButton()) {				
				local = false;
				connEtoM2(itemevent);
				connEtoM3(itemevent);
				connEtoM4(itemevent);
				connEtoM5(itemevent);							
				connEtoM7(itemevent);
				connEtoM8(itemevent);		
				connEtoM9(itemevent);
				connEtoC7(itemevent);
				connMainframeOrdistributed(itemevent);
			}
		}

		public void propertyChange(PropertyChangeEvent propertychangeevent) {
			if (propertychangeevent.getSource() == getLocalQueueManagerName()
					&& propertychangeevent.getPropertyName().equals("document"))
				connPtoP1SetTarget();
			if (propertychangeevent.getSource() == getRemoteQueueManagerName()
					&& propertychangeevent.getPropertyName().equals("document"))
				connPtoP2SetTarget();
			
			if (propertychangeevent.getSource() == getRemoteConnectionName()
					&& propertychangeevent.getPropertyName().equals("document"))
				connPtoP3SetTarget();
			
			if (propertychangeevent.getSource() == getRemoteChannelName()
					&& propertychangeevent.getPropertyName().equals("document")) {				
				connPtoP4SetTarget();
			}
		}

		public void removeUpdate(DocumentEvent documentevent) {
			if (documentevent.getDocument() == getLocalQueueManagerDocument())
				connEtoC3(documentevent);
			if (documentevent.getDocument() == getRemoteQueueManagerDocument())
				connEtoC4(documentevent);
			if (documentevent.getDocument() == getConnectionNameDocument())
				connEtoC5(documentevent);
		}

		IvjEventHandler() {
		}
	}

	public ShowQueueManager() {
		logger.trace("ShowQueueManager()");
		
		ivjCancel = null;
		ivjFooterPanel = null;
		ivjFooterPanelFlowLayout = null;
		ivjJDialogContentPane = null;
		labelQueueManagerName = null;
		QueueManagerName = null;
		labelConnectionName = null;
		ivjJSeparator1 = null;
		ivjOK = null;
		ivjButtonGroup1 = null;
		ivjEventHandler = new IvjEventHandler();
		ivjShowLocalRadioButton = null;
		ivjShowRemoteRadioButton = null;
		returnCode = 0;
		queueManagerName = null;
		connectionName = null;
		local = true;
		textLocalQueueManagerName = null;
		ivjRemoteQueueManagerName = null;
		ivjRemoteConnectionName = null;
		ivjConnPtoP1Aligning = false;
		ivjLocalQueueManagerDocument = null;
		ivjConnectionNameDocument = null;
		ivjConnPtoP2Aligning = false;
		ivjConnPtoP3Aligning = false;
		ivjRemoteQueueManagerDocument = null;
		ivjBanner = null;
		ivjBannerFlowLayout = null;
		ivjBannerIcon = null;
		ivjJPanel1 = null;
		ivjJSeparator2 = null;
		defaultChannelButton = null;
		initialize();
	}

	public ShowQueueManager(Dialog dialog) {
		super(dialog);
		
		logger.trace("ShowQueueManager(Dialog)");
		
		ivjCancel = null;
		ivjFooterPanel = null;
		ivjFooterPanelFlowLayout = null;
		ivjJDialogContentPane = null;
		labelQueueManagerName = null;
		QueueManagerName = null;
		labelConnectionName = null;
		ivjJSeparator1 = null;
		ivjOK = null;
		ivjButtonGroup1 = null;
		ivjEventHandler = new IvjEventHandler();
		ivjShowLocalRadioButton = null;
		ivjShowRemoteRadioButton = null;
		returnCode = 0;
		queueManagerName = null;
		connectionName = null;
		local = true;
		textLocalQueueManagerName = null;
		ivjRemoteQueueManagerName = null;
		ivjRemoteConnectionName = null;
		ivjConnPtoP1Aligning = false;
		ivjLocalQueueManagerDocument = null;
		ivjConnectionNameDocument = null;
		ivjConnPtoP2Aligning = false;
		ivjConnPtoP3Aligning = false;
		ivjRemoteQueueManagerDocument = null;
		ivjBanner = null;
		ivjBannerFlowLayout = null;
		ivjBannerIcon = null;
		ivjJPanel1 = null;
		ivjJSeparator2 = null;
		initialize();
	}

	public ShowQueueManager(Dialog dialog, String s) {
		super(dialog, s);
		logger.trace("ShowQueueManager(Dialog, String)");
		
		ivjCancel = null;
		ivjFooterPanel = null;
		ivjFooterPanelFlowLayout = null;
		ivjJDialogContentPane = null;
		labelQueueManagerName = null;
		QueueManagerName = null;
		labelConnectionName = null;
		ivjJSeparator1 = null;
		ivjOK = null;
		ivjButtonGroup1 = null;
		ivjEventHandler = new IvjEventHandler();
		ivjShowLocalRadioButton = null;
		ivjShowRemoteRadioButton = null;
		returnCode = 0;
		queueManagerName = null;
		connectionName = null;
		local = true;
		textLocalQueueManagerName = null;
		ivjRemoteQueueManagerName = null;
		ivjRemoteConnectionName = null;
		ivjConnPtoP1Aligning = false;
		ivjLocalQueueManagerDocument = null;
		ivjConnectionNameDocument = null;
		ivjConnPtoP2Aligning = false;
		ivjConnPtoP3Aligning = false;
		ivjRemoteQueueManagerDocument = null;
		ivjBanner = null;
		ivjBannerFlowLayout = null;
		ivjBannerIcon = null;
		ivjJPanel1 = null;
		ivjJSeparator2 = null;
	}

	public ShowQueueManager(Dialog dialog, String s, boolean flag) {
		super(dialog, s, flag);
		logger.trace("ShowQueueManager(Dialog, String, boolean)");
		
		ivjCancel = null;
		ivjFooterPanel = null;
		ivjFooterPanelFlowLayout = null;
		ivjJDialogContentPane = null;
		labelQueueManagerName = null;
		QueueManagerName = null;
		labelConnectionName = null;
		ivjJSeparator1 = null;
		ivjOK = null;
		ivjButtonGroup1 = null;
		ivjEventHandler = new IvjEventHandler();
		ivjShowLocalRadioButton = null;
		ivjShowRemoteRadioButton = null;
		returnCode = 0;
		queueManagerName = null;
		connectionName = null;
		local = true;
		textLocalQueueManagerName = null;
		ivjRemoteQueueManagerName = null;
		ivjRemoteConnectionName = null;
		ivjConnPtoP1Aligning = false;
		ivjLocalQueueManagerDocument = null;
		ivjConnectionNameDocument = null;
		ivjConnPtoP2Aligning = false;
		ivjConnPtoP3Aligning = false;
		ivjRemoteQueueManagerDocument = null;
		ivjBanner = null;
		ivjBannerFlowLayout = null;
		ivjBannerIcon = null;
		ivjJPanel1 = null;
		ivjJSeparator2 = null;
	}

	public ShowQueueManager(Dialog dialog, boolean flag) {
		super(dialog, flag);
		logger.trace("ShowQueueManager(Dialog, boolean)");
		ivjCancel = null;
		ivjFooterPanel = null;
		ivjFooterPanelFlowLayout = null;
		ivjJDialogContentPane = null;
		labelQueueManagerName = null;
		QueueManagerName = null;
		labelConnectionName = null;
		ivjJSeparator1 = null;
		ivjOK = null;
		ivjButtonGroup1 = null;
		ivjEventHandler = new IvjEventHandler();
		ivjShowLocalRadioButton = null;
		ivjShowRemoteRadioButton = null;
		returnCode = 0;
		queueManagerName = null;
		connectionName = null;
		local = true;
		textLocalQueueManagerName = null;
		ivjRemoteQueueManagerName = null;
		ivjRemoteConnectionName = null;
		ivjConnPtoP1Aligning = false;
		ivjLocalQueueManagerDocument = null;
		ivjConnectionNameDocument = null;
		ivjConnPtoP2Aligning = false;
		ivjConnPtoP3Aligning = false;
		ivjRemoteQueueManagerDocument = null;
		ivjBanner = null;
		ivjBannerFlowLayout = null;
		ivjBannerIcon = null;
		ivjJPanel1 = null;
		ivjJSeparator2 = null;
	}

	public ShowQueueManager(Frame frame) {
		super(frame);
		logger.trace("ShowQueueManager(Frame)");
		ivjCancel = null;
		ivjFooterPanel = null;
		ivjFooterPanelFlowLayout = null;
		ivjJDialogContentPane = null;
		labelQueueManagerName = null;
		QueueManagerName = null;
		labelConnectionName = null;
		ivjJSeparator1 = null;
		ivjOK = null;
		ivjButtonGroup1 = null;
		ivjEventHandler = new IvjEventHandler();
		ivjShowLocalRadioButton = null;
		ivjShowRemoteRadioButton = null;
		returnCode = 0;
		queueManagerName = null;
		connectionName = null;
		local = true;
		textLocalQueueManagerName = null;
		ivjRemoteQueueManagerName = null;
		ivjRemoteConnectionName = null;
		ivjConnPtoP1Aligning = false;
		ivjLocalQueueManagerDocument = null;
		ivjConnectionNameDocument = null;
		ivjConnPtoP2Aligning = false;
		ivjConnPtoP3Aligning = false;
		ivjRemoteQueueManagerDocument = null;
		ivjBanner = null;
		ivjBannerFlowLayout = null;
		ivjBannerIcon = null;
		ivjJPanel1 = null;
		ivjJSeparator2 = null;
		initialize();
	}

	public ShowQueueManager(Frame frame, String s) {
		super(frame, s);
		logger.trace("ShowQueueManager(Frame, String)");
		ivjCancel = null;
		ivjFooterPanel = null;
		ivjFooterPanelFlowLayout = null;
		ivjJDialogContentPane = null;
		labelQueueManagerName = null;
		QueueManagerName = null;
		labelConnectionName = null;
		ivjJSeparator1 = null;
		ivjOK = null;
		ivjButtonGroup1 = null;
		ivjEventHandler = new IvjEventHandler();
		ivjShowLocalRadioButton = null;
		ivjShowRemoteRadioButton = null;
		returnCode = 0;
		queueManagerName = null;
		connectionName = null;
		local = true;
		textLocalQueueManagerName = null;
		ivjRemoteQueueManagerName = null;
		ivjRemoteConnectionName = null;
		ivjConnPtoP1Aligning = false;
		ivjLocalQueueManagerDocument = null;
		ivjConnectionNameDocument = null;
		ivjConnPtoP2Aligning = false;
		ivjConnPtoP3Aligning = false;
		ivjRemoteQueueManagerDocument = null;
		ivjBanner = null;
		ivjBannerFlowLayout = null;
		ivjBannerIcon = null;
		ivjJPanel1 = null;
		ivjJSeparator2 = null;
	}

	public ShowQueueManager(Frame frame, String s, boolean flag) {
		super(frame, s, flag);
		logger.trace("ShowQueueManager(Frame, String, boolean)");
		ivjCancel = null;
		ivjFooterPanel = null;
		ivjFooterPanelFlowLayout = null;
		ivjJDialogContentPane = null;
		labelQueueManagerName = null;
		QueueManagerName = null;
		labelConnectionName = null;
		ivjJSeparator1 = null;
		ivjOK = null;
		ivjButtonGroup1 = null;
		ivjEventHandler = new IvjEventHandler();
		ivjShowLocalRadioButton = null;
		ivjShowRemoteRadioButton = null;
		returnCode = 0;
		queueManagerName = null;
		connectionName = null;
		local = true;
		textLocalQueueManagerName = null;
		ivjRemoteQueueManagerName = null;
		ivjRemoteConnectionName = null;
		ivjConnPtoP1Aligning = false;
		ivjLocalQueueManagerDocument = null;
		ivjConnectionNameDocument = null;
		ivjConnPtoP2Aligning = false;
		ivjConnPtoP3Aligning = false;
		ivjRemoteQueueManagerDocument = null;
		ivjBanner = null;
		ivjBannerFlowLayout = null;
		ivjBannerIcon = null;
		ivjJPanel1 = null;
		ivjJSeparator2 = null;
	}

	public ShowQueueManager(Frame frame, boolean flag) {
		super(frame, flag);
		logger.trace("ShowQueueManager(Frame, boolean)");
		ivjCancel = null;
		ivjFooterPanel = null;
		ivjFooterPanelFlowLayout = null;
		ivjJDialogContentPane = null;
		labelQueueManagerName = null;
		QueueManagerName = null;
		labelConnectionName = null;
		ivjJSeparator1 = null;
		ivjOK = null;
		ivjButtonGroup1 = null;
		ivjEventHandler = new IvjEventHandler();
		ivjShowLocalRadioButton = null;
		ivjShowRemoteRadioButton = null;
		returnCode = 0;
		queueManagerName = null;
		connectionName = null;
		local = true;
		textLocalQueueManagerName = null;
		ivjRemoteQueueManagerName = null;
		ivjRemoteConnectionName = null;
		ivjConnPtoP1Aligning = false;
		ivjLocalQueueManagerDocument = null;
		ivjConnectionNameDocument = null;
		ivjConnPtoP2Aligning = false;
		ivjConnPtoP3Aligning = false;
		ivjRemoteQueueManagerDocument = null;
		ivjBanner = null;
		ivjBannerFlowLayout = null;
		ivjBannerIcon = null;
		ivjJPanel1 = null;
		ivjJSeparator2 = null;
	}

	private void cancel() {
		returnCode = 1;
		dispose();
	}

	private void connEtoC1(ActionEvent actionevent) {
		try {
			cancel();
		} catch (Throwable throwable) {
			handleException(throwable);
		}
	}

	private void connEtoC2(ActionEvent actionevent) {
		try {
			oK();
		} catch (Throwable throwable) {
			handleException(throwable);
		}
	}

	private void connEtoC3(DocumentEvent documentevent) {
		try {
			enableOK();
		} catch (Throwable throwable) {
			handleException(throwable);
		}
	}

	private void connEtoC4(DocumentEvent documentevent) {
		try {
			enableOK();
		} catch (Throwable throwable) {
			handleException(throwable);
		}
	}

	private void connEtoC5(DocumentEvent documentevent) {
		try {
			enableOK();
		} catch (Throwable throwable) {
			handleException(throwable);
		}
	}

	private void connEtoC6(ItemEvent itemevent) {
		try {
			enableOK();
		} catch (Throwable throwable) {
			handleException(throwable);
		}
	}

	private void connEtoC7(ItemEvent itemevent) {
		try {
			enableOK();
		} catch (Throwable throwable) {
			handleException(throwable);
		}
	}

	private void connEtoM1(ItemEvent itemevent) {
		try {
			getLocalQueueManagerName().setEnabled(
					getShowLocalRadioButton().isSelected());
		} catch (Throwable throwable) {
			handleException(throwable);
		}
	}

	private void connEtoM2(ItemEvent itemevent) {
		try {
			getRemoteQueueManagerName().setEnabled(
					getShowRemoteRadioButton().isSelected());
		} catch (Throwable throwable) {
			handleException(throwable);
		}
	}

	private void connEtoM3(ItemEvent itemevent) {
		try {
			getRemoteConnectionName().setEnabled(
					getShowRemoteRadioButton().isSelected());
		} catch (Throwable throwable) {
			handleException(throwable);
		}
	}

	private void connEtoM4(ItemEvent itemevent) {
		try {
			getLabelQueueManagerName().setEnabled(getShowRemoteRadioButton().isSelected());
		} catch (Throwable throwable) {
			handleException(throwable);
		}
	}

	private void connEtoM5(ItemEvent itemevent) {
		try {
			getLabelConnectionName().setEnabled(getShowRemoteRadioButton().isSelected());
		} catch (Throwable throwable) {
			handleException(throwable);
		}
	}
	
	private void connEtoM6(ItemEvent itemevent) {
		try {
			getJLabel1().setEnabled(getShowLocalRadioButton().isSelected());
		} catch (Throwable throwable) {
			handleException(throwable);
		}
	}

	private void connEtoM7(ItemEvent itemevent) {
		try {
			getLabelChannelName().setEnabled(getShowRemoteRadioButton().isSelected());
		} catch (Throwable throwable) {
			handleException(throwable);
		}
	}

	private void connEtoM8(ItemEvent itemevent) {
		try {
			getRemoteChannelName().setEnabled(getShowRemoteRadioButton().isSelected());
			getDefaultChannelButton().setEnabled(getShowRemoteRadioButton().isSelected());
		} catch (Throwable throwable) {
			handleException(throwable);
		}
	}

	private void connEtoM9(ItemEvent itemevent) {
		try {
			getLabelUsername().setEnabled(getShowRemoteRadioButton().isSelected());
			getLabelPassword().setEnabled(getShowRemoteRadioButton().isSelected());
			getTextUsername().setEnabled(getShowRemoteRadioButton().isSelected());
			getTextPassword().setEnabled(getShowRemoteRadioButton().isSelected());
		} catch (Throwable throwable) {
			handleException(throwable);
		}
	}

	private void connMainframeOrdistributed(ItemEvent itemevent) {
		try {
			getRemoteMainframeDistributedRadioButton().setEnabled(getShowRemoteRadioButton().isSelected());
			this.labelQueueManagerType.setEnabled(getShowRemoteRadioButton().isSelected());
			this.remoteDistributedRadioButton.setEnabled(getShowRemoteRadioButton().isSelected());
			this.remoteMainframeRadioButton.setEnabled(getShowRemoteRadioButton().isSelected());
			if (this.remoteDistributedRadioButton.isEnabled()) {
				this.remoteDistributedRadioButton.setSelected(true);
				this.queueManagerType = "D";
			}
		} catch (Throwable throwable) {
			handleException(throwable);
		}
	}
	
	private void connPtoP1SetSource() {
		try {
			if (!ivjConnPtoP1Aligning) {
				ivjConnPtoP1Aligning = true;
				if (getLocalQueueManagerDocument() != null)
					getLocalQueueManagerName().setDocument(getLocalQueueManagerDocument());
				ivjConnPtoP1Aligning = false;
			}
		} catch (Throwable throwable) {
			ivjConnPtoP1Aligning = false;
			handleException(throwable);
		}
	}

	private void connPtoP1SetTarget() {
		try {
			if (!ivjConnPtoP1Aligning) {
				ivjConnPtoP1Aligning = true;
				setLocalQueueManagerDocument(getLocalQueueManagerName().getDocument());
				ivjConnPtoP1Aligning = false;
			}
		} catch (Throwable throwable) {
			ivjConnPtoP1Aligning = false;
			handleException(throwable);
		}
	}

	private void connPtoP2SetSource() {
		try {
			if (!ivjConnPtoP2Aligning) {
				ivjConnPtoP2Aligning = true;
				if (getRemoteQueueManagerDocument() != null)
					getRemoteQueueManagerName().setDocument(
							getRemoteQueueManagerDocument());
				ivjConnPtoP2Aligning = false;
			}
		} catch (Throwable throwable) {
			ivjConnPtoP2Aligning = false;
			handleException(throwable);
		}
	}

	private void connPtoP2SetTarget() {
		try {
			if (!ivjConnPtoP2Aligning) {
				ivjConnPtoP2Aligning = true;
				setRemoteQueueManagerDocument(getRemoteQueueManagerName()
						.getDocument());
				ivjConnPtoP2Aligning = false;
			}
		} catch (Throwable throwable) {
			ivjConnPtoP2Aligning = false;
			handleException(throwable);
		}
	}

	private void connPtoP3SetSource() {
		try {
			if (!ivjConnPtoP3Aligning) {
				ivjConnPtoP3Aligning = true;
				if (getConnectionNameDocument() != null)
					getRemoteConnectionName().setDocument(
							getConnectionNameDocument());
				ivjConnPtoP3Aligning = false;
			}
		} catch (Throwable throwable) {
			ivjConnPtoP3Aligning = false;
			handleException(throwable);
		}
	}
	
	private void connPtoP3SetTarget() {
		try {
			if (!ivjConnPtoP3Aligning) {
				ivjConnPtoP3Aligning = true;
				setConnectionNameDocument(getRemoteConnectionName()
						.getDocument());
				ivjConnPtoP3Aligning = false;
			}
		} catch (Throwable throwable) {
			ivjConnPtoP3Aligning = false;
			handleException(throwable);
		}
	}

	private void connPtoP4SetTarget() {
		try {
			if (!ivjConnPtoP4Aligning) {
				ivjConnPtoP4Aligning = true;
				setConnectionNameDocument(getRemoteChannelName()
						.getDocument());
				ivjConnPtoP4Aligning = false;
			}
		} catch (Throwable throwable) {
			ivjConnPtoP4Aligning = false;
			handleException(throwable);
		}
	}

	private void enableOK() {
		boolean flag;
		if (getShowLocalRadioButton().isSelected()) {
			flag = getLocalQueueManagerDocument().getLength() > 0;
		} else {
			flag = getRemoteQueueManagerDocument().getLength() > 0;
			flag &= getConnectionNameDocument().getLength() > 0;
		}
		getOK().setEnabled(flag);
	}

	private JPanel getBanner() {
		if (ivjBanner == null)
			try {
				ivjBanner = new JPanel();
				ivjBanner.setName("Banner");
				ivjBanner.setBorder(BorderFactory.createEtchedBorder());
				ivjBanner.setLayout(getBannerFlowLayout());
				getBanner().add(getBannerIcon(), getBannerIcon().getName());
			} catch (Throwable throwable) {
				handleException(throwable);
			}
		return ivjBanner;
	}

	private FlowLayout getBannerFlowLayout() {
		FlowLayout flowlayout = null;
		try {
			flowlayout = new FlowLayout();
			flowlayout.setAlignment(2);
			flowlayout.setVgap(0);
			flowlayout.setHgap(0);
		} catch (Throwable throwable) {
			handleException(throwable);
		}
		return flowlayout;
	}

	private JLabel getBannerIcon() {
		if (ivjBannerIcon == null)
			try {
				ivjBannerIcon = new JLabel();
				ivjBannerIcon.setName("BannerIcon");
				ivjBannerIcon
						.setIcon(new ImageIcon(this.getClass().getResource(
								"/icons/queueManagerSelectionBanner.jpg")));
				ivjBannerIcon.setText("");
			} catch (Throwable throwable) {
				handleException(throwable);
			}
		return ivjBannerIcon;
	}

	private ButtonGroup getButtonGroup1() {
		if (ivjButtonGroup1 == null)
			try {
				ivjButtonGroup1 = new ButtonGroup();
			} catch (Throwable throwable) {
				handleException(throwable);
			}
		return ivjButtonGroup1;
	}

	private JButton getCancel() {
		if (ivjCancel == null)
			try {
				ivjCancel = new JButton();
				ivjCancel.setName("Cancel");
				ivjCancel.setMnemonic('C');
				ivjCancel.setText("Cancel");
			} catch (Throwable throwable) {
				handleException(throwable);
			}
		return ivjCancel;
	}

	private JButton getDefaultChannelButton() {
		if (defaultChannelButton == null)
			try {
				defaultChannelButton = new JButton();
				defaultChannelButton.setName("Default Channel");				
				defaultChannelButton.setMnemonic('D');
				defaultChannelButton.setText("Default Channel");
				defaultChannelButton.setEnabled(false);
			} catch (Throwable throwable) {
				handleException(throwable);
			}
		return defaultChannelButton;
	}

	public String getChannelName() {
		return this.channelName;
	}

	public String getConnectionName() {
		return connectionName;
	}

	private Document getConnectionNameDocument() {
		return ivjConnectionNameDocument;
	}

	private JPanel getFooterPanel() {
		if (ivjFooterPanel == null)
			try {
				ivjFooterPanel = new JPanel();
				ivjFooterPanel.setName("FooterPanel");
				ivjFooterPanel.setLayout(getFooterPanelFlowLayout());
				getFooterPanel().add(getOK(), getOK().getName());
				getFooterPanel().add(getCancel(), getCancel().getName());
			} catch (Throwable throwable) {
				handleException(throwable);
			}
		return ivjFooterPanel;
	}

	private FlowLayout getFooterPanelFlowLayout() {
		FlowLayout flowlayout = null;
		try {
			flowlayout = new FlowLayout();
			flowlayout.setAlignment(2);
		} catch (Throwable throwable) {
			handleException(throwable);
		}
		return flowlayout;
	}

	private JPanel getJDialogContentPane() {
		if (ivjJDialogContentPane == null)
			try {
				ivjJDialogContentPane = new JPanel();
				ivjJDialogContentPane.setName("JDialogContentPane");
				ivjJDialogContentPane.setLayout(new GridBagLayout());
				
				GridBagConstraints gridbagconstraints = new GridBagConstraints();
				gridbagconstraints.gridx = 0;
				gridbagconstraints.gridy = 0;
				gridbagconstraints.gridwidth = 2;
				gridbagconstraints.fill = 1;
				gridbagconstraints.anchor = 13;
				gridbagconstraints.weightx = 1.0D;
				gridbagconstraints.weighty = 1.0D;
				gridbagconstraints.insets = new Insets(4, 4, 4, 4);
				getJDialogContentPane().add(getBanner(), gridbagconstraints);
				
				GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
				gridbagconstraints1.gridx = 0;
				gridbagconstraints1.gridy = 1;
				gridbagconstraints1.fill = 2;
				gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
				getJDialogContentPane().add(getJSeparator2(),
						gridbagconstraints1);
				
				GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
				gridbagconstraints2.gridx = 0;
				gridbagconstraints2.gridy = 2;
				gridbagconstraints2.fill = 1;
				gridbagconstraints2.weightx = 1.0D;
				gridbagconstraints2.weighty = 1.0D;
				gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
				getJDialogContentPane().add(getJPanel1(), gridbagconstraints2);
				
				GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
				gridbagconstraints3.gridx = 0;
				gridbagconstraints3.gridy = 3;
				gridbagconstraints3.gridwidth = 2;
				gridbagconstraints3.fill = 2;
				gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
				
				getJDialogContentPane().add(getJSeparator1(),
						gridbagconstraints3);
				GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
				gridbagconstraints4.gridx = 0;
				gridbagconstraints4.gridy = 4;
				gridbagconstraints4.gridwidth = 2;
				gridbagconstraints4.anchor = 14;
				gridbagconstraints4.weightx = 1.0D;
				gridbagconstraints4.weighty = 1.0D;
				gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
				getJDialogContentPane().add(getFooterPanel(),
						gridbagconstraints4);
			} catch (Throwable throwable) {
				handleException(throwable);
			}
		return ivjJDialogContentPane;
	}

	private JLabel getJLabel1() {
		if (labelQueueManagerName == null)
			try {
				labelQueueManagerName = new JLabel();
				labelQueueManagerName.setName("JLabel1");
				labelQueueManagerName.setText("Queue Manager Name:");
			} catch (Throwable throwable) {
				handleException(throwable);
			}
		return labelQueueManagerName;
	}

	private JLabel getLabelQueueManagerName() {
		if (QueueManagerName == null)
			try {
				QueueManagerName = new JLabel();
				QueueManagerName.setName("JLabel2");
				QueueManagerName.setText("Queue Manager Name:");
				QueueManagerName.setEnabled(false);
			} catch (Throwable throwable) {
				handleException(throwable);
			}
		return QueueManagerName;
	}

	private JLabel getLabelConnectionName() {
		if (labelConnectionName == null)
			try {
				labelConnectionName = new JLabel();
				labelConnectionName.setName("JLabel3");
				labelConnectionName.setText("Connection Name:");
				labelConnectionName.setEnabled(false);
			} catch (Throwable throwable) {
				handleException(throwable);
			}
		return labelConnectionName;
	}

	private JLabel getLabelChannelName() {
		if (labelChannelName == null)
			try {
				labelChannelName = new JLabel();
				labelChannelName.setName("JLabel4");
				labelChannelName.setText("Channel Name:");
				labelChannelName.setEnabled(false);
			} catch (Throwable throwable) {
				handleException(throwable);
			}
		return labelChannelName;
	}

	private JLabel getLabelQueueManagerType() {
		if (labelQueueManagerType == null)
			try {
				labelQueueManagerType = new JLabel();
				labelQueueManagerType.setName("JLabel5");
				labelQueueManagerType.setText("Queue Manager Type:");
				labelQueueManagerType.setEnabled(false);
			} catch (Throwable throwable) {
				handleException(throwable);
			}
		return labelQueueManagerType;
	}
	
	private JLabel getLabelUsername() {
		if (labelUsername == null)
			try {
				labelUsername = new JLabel();
				labelUsername.setName("labelUsername");
				labelUsername.setText("Username:");
				labelUsername.setEnabled(false);
			} catch (Throwable throwable) {
				handleException(throwable);
			}
		return labelUsername;
	}
	
	private JLabel getLabelPassword() {
		if (labelPassword == null)
			try {
				labelPassword = new JLabel();
				labelPassword.setName("labelPassword");
				labelPassword.setText("Password:");
				labelPassword.setEnabled(false);
			} catch (Throwable throwable) {
				handleException(throwable);
			}
		return labelPassword;
	}	
	
	private JPanel getJPanel1() {
		if (ivjJPanel1 == null)
			try {
				ivjJPanel1 = new JPanel();
				ivjJPanel1.setName("JPanel1");
				ivjJPanel1.setLayout(new GridBagLayout());
				GridBagConstraints gridbagconstraints = new GridBagConstraints();
				gridbagconstraints.gridx = 0;
				gridbagconstraints.gridy = 0;
				gridbagconstraints.gridwidth = 2;
				gridbagconstraints.fill = 2;
				gridbagconstraints.anchor = 17;
				gridbagconstraints.insets = new Insets(4, 4, 4, 4);
				getJPanel1().add(getShowLocalRadioButton(), gridbagconstraints);
				GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
				gridbagconstraints1.gridx = 0;
				gridbagconstraints1.gridy = 1;
				gridbagconstraints1.anchor = 17;
				gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
				getJPanel1().add(getJLabel1(), gridbagconstraints1);
				GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
				gridbagconstraints2.gridx = 1;
				gridbagconstraints2.gridy = 1;
				gridbagconstraints2.fill = 2;
				gridbagconstraints2.weightx = 1.0D;
				gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
				getJPanel1().add(getLocalQueueManagerName(),
						gridbagconstraints2);
				GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
				gridbagconstraints3.gridx = 0;
				gridbagconstraints3.gridy = 2;
				gridbagconstraints3.gridwidth = 2;
				gridbagconstraints3.fill = 2;
				gridbagconstraints3.anchor = 17;
				gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
				getJPanel1().add(getShowRemoteRadioButton(),
						gridbagconstraints3);
				
				GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
				gridbagconstraints4.gridx = 0;
				gridbagconstraints4.gridy = 3;
				gridbagconstraints4.anchor = 17;
				gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
				getJPanel1().add(getLabelQueueManagerName(), gridbagconstraints4);
				
				GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
				gridbagconstraints5.gridx = 1;
				gridbagconstraints5.gridy = 3;
				gridbagconstraints5.fill = 2;
				gridbagconstraints5.weightx = 1.0D;
				gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
				getJPanel1().add(getRemoteQueueManagerName(), gridbagconstraints5);
				
				GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
				gridbagconstraints6.gridx = 0;
				gridbagconstraints6.gridy = 4;
				gridbagconstraints6.anchor = 17;
				gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
				getJPanel1().add(getLabelConnectionName(), gridbagconstraints6);
				
				GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
				gridbagconstraints7.gridx = 1;
				gridbagconstraints7.gridy = 4;
				gridbagconstraints7.fill = 2;
				gridbagconstraints7.weightx = 1.0D;
				gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
				getJPanel1().add(getRemoteConnectionName(), gridbagconstraints7);

				GridBagConstraints gridbagconstraints8 = new GridBagConstraints();
				gridbagconstraints8.gridx = 0;
				gridbagconstraints8.gridy = 5;
				gridbagconstraints8.anchor = 17;
				gridbagconstraints8.insets = new Insets(4, 4, 4, 4);
				getJPanel1().add(getLabelChannelName(), gridbagconstraints8);

				JPanel panelChannelButton = new JPanel();
				panelChannelButton.setLayout(new FlowLayout(2));
				panelChannelButton.add(getRemoteChannelName());
				panelChannelButton.add(getDefaultChannelButton());
				GridBagConstraints gridbagconstraints9 = new GridBagConstraints();
				gridbagconstraints9.gridx = 1;
				gridbagconstraints9.gridy = 5;
				gridbagconstraints9.fill = 2;
				gridbagconstraints9.weightx = 1.0D;
				gridbagconstraints9.insets = new Insets(4, 4, 4, 4);
				getJPanel1().add(panelChannelButton, gridbagconstraints9);

				GridBagConstraints gridbagconstraints10 = new GridBagConstraints();
				gridbagconstraints10.gridx = 0;
				gridbagconstraints10.gridy = 6;
				gridbagconstraints10.anchor = 17;
				gridbagconstraints10.insets = new Insets(4, 4, 4, 4);
				getJPanel1().add(getLabelQueueManagerType(), gridbagconstraints10);
				
				GridBagConstraints gridbagconstraints11 = new GridBagConstraints();
				gridbagconstraints11.gridx = 1;
				gridbagconstraints11.gridy = 6;
				gridbagconstraints11.fill = 2;
				gridbagconstraints11.weightx = 1.0D;
				gridbagconstraints11.insets = new Insets(4, 4, 4, 4);
				getJPanel1().add(getRemoteMainframeDistributedRadioButton(), gridbagconstraints11);
				
				GridBagConstraints gridbagconstraints12 = new GridBagConstraints();
				gridbagconstraints12.gridx = 0;
				gridbagconstraints12.gridy = 7;
				gridbagconstraints12.anchor = 17;
				gridbagconstraints12.insets = new Insets(4, 4, 4, 4);
				getJPanel1().add(getLabelUsername(), gridbagconstraints12);
				
				GridBagConstraints gridbagconstraints13 = new GridBagConstraints();
				gridbagconstraints13.gridx = 1;
				gridbagconstraints13.gridy = 7;
				gridbagconstraints13.fill = 2;
				gridbagconstraints13.weightx = 1.0D;
				gridbagconstraints13.insets = new Insets(4, 4, 4, 4);
				getJPanel1().add(getTextUsername(), gridbagconstraints13);
				
				GridBagConstraints gridbagconstraints14 = new GridBagConstraints();
				gridbagconstraints14.gridx = 0;
				gridbagconstraints14.gridy = 8;
				gridbagconstraints14.anchor = 17;
				gridbagconstraints14.insets = new Insets(4, 4, 4, 4);
				getJPanel1().add(getLabelPassword(), gridbagconstraints14);
				
				GridBagConstraints gridbagconstraints15 = new GridBagConstraints();
				gridbagconstraints15.gridx = 1;
				gridbagconstraints15.gridy = 8;
				gridbagconstraints15.fill = 2;
				gridbagconstraints15.weightx = 1.0D;
				gridbagconstraints15.insets = new Insets(4, 4, 4, 4);
				getJPanel1().add(getTextPassword(), gridbagconstraints15);
				
			} catch (Throwable throwable) {
				handleException(throwable);
			}
		return ivjJPanel1;
	}

	private JSeparator getJSeparator1() {
		if (ivjJSeparator1 == null)
			try {
				ivjJSeparator1 = new JSeparator();
				ivjJSeparator1.setName("JSeparator1");
			} catch (Throwable throwable) {
				handleException(throwable);
			}
		return ivjJSeparator1;
	}

	private JSeparator getJSeparator2() {
		if (ivjJSeparator2 == null)
			try {
				ivjJSeparator2 = new JSeparator();
				ivjJSeparator2.setName("JSeparator2");
			} catch (Throwable throwable) {
				handleException(throwable);
			}
		return ivjJSeparator2;
	}

	private Document getLocalQueueManagerDocument() {
		return ivjLocalQueueManagerDocument;
	}

	private JTextField getLocalQueueManagerName() {
		if (textLocalQueueManagerName == null)
			try {
				textLocalQueueManagerName = new JTextField();
				textLocalQueueManagerName.setName("LocalQueueManagerName");
				textLocalQueueManagerName.setColumns(20);
			} catch (Throwable throwable) {
				handleException(throwable);
			}
		return textLocalQueueManagerName;
	}

	private JButton getOK() {
		if (ivjOK == null)
			try {
				ivjOK = new JButton();
				ivjOK.setName("OK");
				ivjOK.setMnemonic('O');
				ivjOK.setText("OK");
				ivjOK.setEnabled(false);
			} catch (Throwable throwable) {
				handleException(throwable);
			}
		return ivjOK;
	}

	public String getQueueManagerName() {
		return queueManagerName;
	}

	private JTextField getRemoteConnectionName() {
		if (ivjRemoteConnectionName == null)
			try {
				ivjRemoteConnectionName = new JTextField();
				ivjRemoteConnectionName.setName("RemoteConnectionName");
				ivjRemoteConnectionName.setEnabled(false);
				ivjRemoteConnectionName.setColumns(20);
			} catch (Throwable throwable) {
				handleException(throwable);
			}
		return ivjRemoteConnectionName;
	}

	private JTextField getRemoteChannelName() {
		if (ivjRemoteChannelName == null)
			try {
				ivjRemoteChannelName = new JTextField();
				ivjRemoteChannelName.setName("Remote Channel Name");
				ivjRemoteChannelName.setEnabled(false);
				ivjRemoteChannelName.setColumns(20);
			} catch (Throwable throwable) {
				handleException(throwable);
			}
		return ivjRemoteChannelName;
	}

	private JTextField getTextUsername() {
		if (textUsername == null)
			try {
				textUsername = new JTextField();
				textUsername.setName("textUsername");
				textUsername.setEnabled(false);
				textUsername.setColumns(20);
			} catch (Throwable throwable) {
				handleException(throwable);
			}
		return textUsername;
	}
	
	private JPasswordField getTextPassword() {
		if (textPassword == null)
			try {
				textPassword = new JPasswordField();
				textPassword.setName("textPassword");
				textPassword.setEnabled(false);
				textPassword.setColumns(20);	
				textPassword.setEchoChar('*');
			} catch (Throwable throwable) {
				handleException(throwable);
			}
		return textPassword;
	}

	private Document getRemoteQueueManagerDocument() {
		return ivjRemoteQueueManagerDocument;
	}

	private JTextField getRemoteQueueManagerName() {
		if (ivjRemoteQueueManagerName == null)
			try {
				ivjRemoteQueueManagerName = new JTextField();
				ivjRemoteQueueManagerName.setName("RemoteQueueManagerName");
				ivjRemoteQueueManagerName.setEnabled(false);
				ivjRemoteQueueManagerName.setColumns(20);
			} catch (Throwable throwable) {
				handleException(throwable);
			}
		return ivjRemoteQueueManagerName;
	}

	public int getReturnCode() {
		return returnCode;
	}

	private JRadioButton getShowLocalRadioButton() {
		if (ivjShowLocalRadioButton == null)
			try {
				ivjShowLocalRadioButton = new JRadioButton();
				ivjShowLocalRadioButton.setName("ShowLocalRadioButton");
				ivjShowLocalRadioButton.setSelected(true);
				ivjShowLocalRadioButton.setText("Show a local queue manager");
				getButtonGroup1().add(ivjShowLocalRadioButton);
			} catch (Throwable throwable) {
				handleException(throwable);
			}
		return ivjShowLocalRadioButton;
	}

	private JRadioButton getShowRemoteRadioButton() {
		if (ivjShowRemoteRadioButton == null)
			try {
				ivjShowRemoteRadioButton = new JRadioButton();
				ivjShowRemoteRadioButton.setName("ShowRemoteRadioButton");
				ivjShowRemoteRadioButton.setText("Show a remote queue manager");
				getButtonGroup1().add(ivjShowRemoteRadioButton);
			} catch (Throwable throwable) {
				handleException(throwable);
			}
		return ivjShowRemoteRadioButton;
	}
	
	private JPanel getRemoteMainframeDistributedRadioButton() {
		if (remoteMainframePanel == null)
			try {
				remoteMainframePanel = new JPanel();
				GridLayout gl = new GridLayout(1, 1);
				remoteMainframePanel.setLayout(gl);
				
				remoteDistributedRadioButton = new JRadioButton();
				remoteDistributedRadioButton.setName("RemoteDistributedRadioButton");
				remoteDistributedRadioButton.setText("Distributed");
				remoteDistributedRadioButton.setEnabled(false);
				getButtonGroupMainframeDistributed().add(remoteDistributedRadioButton);
				remoteMainframePanel.add(remoteDistributedRadioButton);

				remoteMainframeRadioButton = new JRadioButton();
				remoteMainframeRadioButton.setName("RemoteMainframeRadioButton");
				remoteMainframeRadioButton.setText("Mainframe");
				remoteMainframeRadioButton.setEnabled(false);
				getButtonGroupMainframeDistributed().add(remoteMainframeRadioButton);
				
				remoteMainframePanel.add(remoteMainframeRadioButton);
				
				if (this.getQueueManagerType().equalsIgnoreCase("M")) {
					remoteMainframeRadioButton.setSelected(true);
				} else {
					remoteDistributedRadioButton.setSelected(true);									
				}

			} catch (Throwable throwable) {
				handleException(throwable);
			}
		return remoteMainframePanel;
	}

	private void handleException(Throwable throwable) {
	}

	private void initConnections() throws Exception {
		logger.trace("initConnections()");
		
		getShowLocalRadioButton().addItemListener(ivjEventHandler);
		getShowRemoteRadioButton().addItemListener(ivjEventHandler);
		getCancel().addActionListener(ivjEventHandler);
		getOK().addActionListener(ivjEventHandler);
		
		getLocalQueueManagerName().addPropertyChangeListener(ivjEventHandler);
		getRemoteQueueManagerName().addPropertyChangeListener(ivjEventHandler);
		getRemoteConnectionName().addPropertyChangeListener(ivjEventHandler);
		getDefaultChannelButton().addActionListener(ivjEventHandler);
		
		connPtoP1SetTarget();
		connPtoP2SetTarget();
		connPtoP3SetTarget();
	}

	private void initialize() {
		try {
			setName("ShowQueueManager");
			setDefaultCloseOperation(0);
			setTitle("Show Queue Manager");
			setSize(426, 350);
			setModal(true);
			setResizable(false);
			setContentPane(getJDialogContentPane());
			initConnections();
		} catch (Throwable throwable) {
			handleException(throwable);
		}
	}

	public boolean isLocal() {
		return local;
	}

	public static void main(String args[]) {
		try {
			ShowQueueManager showqueuemanager = new ShowQueueManager();
			showqueuemanager.setModal(true);
			showqueuemanager.addWindowListener(new WindowAdapter() {

				public void windowClosing(WindowEvent windowevent) {
					System.exit(0);
				}

			});
			showqueuemanager.pack();
			Insets insets = showqueuemanager.getInsets();
			showqueuemanager.setSize(showqueuemanager.getWidth() + insets.left
					+ insets.right, showqueuemanager.getHeight() + insets.top
					+ insets.bottom);
			showqueuemanager.setVisible(true);
		} catch (Throwable throwable) {
			System.err
					.println("Exception occurred in main() of javax.swing.JDialog");
			throwable.printStackTrace(System.out);
		}
	}

	private void oK() {
		returnCode = 0;
		local = getShowLocalRadioButton().isSelected();
		if (local) {
			queueManagerName = getLocalQueueManagerName().getText();
			connectionName = "";
			this.channelName = "";
			this.queueManagerType = "";
			this.username = null;
			this.password = null;
		} else {
			queueManagerName = getRemoteQueueManagerName().getText();
			logger.debug("queueManagerName is " + queueManagerName);
			
			connectionName = getRemoteConnectionName().getText();
			logger.debug("connectionName is " + connectionName);
			
			this.channelName = getRemoteChannelName().getText();
			logger.debug("channelName is " + channelName);
			
			if (this.remoteMainframeRadioButton.isSelected()) {
				this.queueManagerType = "M";
			} else {
				this.queueManagerType = "D";
			}
			logger.debug("queueManagerType is " + queueManagerType);
			
			this.username = getTextUsername().getText();
			logger.debug("username is " + username);
			
			String tmpPassword = new String(getTextPassword().getPassword());
			if (tmpPassword.trim().length() == 0) {
				this.password = null;
			} else {
				this.password = tmpPassword;
			}
			logger.debug("password is " + password);			
		}
		dispose();
	}

	public void setConnectionName(String s) {
		connectionName = s;
		if (!isLocal()) {
			getRemoteConnectionName().setText(connectionName);
		}
	}

	public void setChannelName(String value) {
		if (!isLocal()) {
			this.channelName = value;
			this.getRemoteChannelName().setText(this.channelName);
			logger.info("channelName is " + channelName);
		} else {
			this.channelName = "";
			this.getRemoteChannelName().setText(this.channelName);			
		}
	}

	private void setConnectionNameDocument(Document document) {
		if (ivjConnectionNameDocument != document)
			try {
				Document document1 = getConnectionNameDocument();
				if (ivjConnectionNameDocument != null)
					ivjConnectionNameDocument
							.removeDocumentListener(ivjEventHandler);
				ivjConnectionNameDocument = document;
				if (ivjConnectionNameDocument != null)
					ivjConnectionNameDocument
							.addDocumentListener(ivjEventHandler);
				connPtoP3SetSource();
				firePropertyChange("localQueueManagerNameDocument", document1,
						document);
			} catch (Throwable throwable) {
				handleException(throwable);
			}
	}

	public void setLocal(boolean flag) {
		local = flag;
		getShowLocalRadioButton().setSelected(local);
		getShowRemoteRadioButton().setSelected(!local);
	}

	private void setLocalQueueManagerDocument(Document document) {
		if (ivjLocalQueueManagerDocument != document)
			try {
				Document document1 = getLocalQueueManagerDocument();
				if (ivjLocalQueueManagerDocument != null)
					ivjLocalQueueManagerDocument
							.removeDocumentListener(ivjEventHandler);
				ivjLocalQueueManagerDocument = document;
				if (ivjLocalQueueManagerDocument != null)
					ivjLocalQueueManagerDocument
							.addDocumentListener(ivjEventHandler);
				connPtoP1SetSource();
				firePropertyChange("localQueueManagerNameDocument", document1,
						document);
			} catch (Throwable throwable) {
				handleException(throwable);
			}
	}

	private void setLocalQueueManagerNameDocument(Document document) {
		getLocalQueueManagerName().setDocument(document);
	}

	public void setQueueManagerName(String s) {
		queueManagerName = s;
		if (isLocal())
			getLocalQueueManagerName().setText(queueManagerName);
		else
			getRemoteQueueManagerName().setText(queueManagerName);
	}

	private void setRemoteQueueManagerDocument(Document document) {
		if (ivjRemoteQueueManagerDocument != document)
			try {
				Document document1 = getRemoteQueueManagerDocument();
				if (ivjRemoteQueueManagerDocument != null)
					ivjRemoteQueueManagerDocument
							.removeDocumentListener(ivjEventHandler);
				ivjRemoteQueueManagerDocument = document;
				if (ivjRemoteQueueManagerDocument != null)
					ivjRemoteQueueManagerDocument
							.addDocumentListener(ivjEventHandler);
				connPtoP2SetSource();
				firePropertyChange("localQueueManagerNameDocument", document1,
						document);
			} catch (Throwable throwable) {
				handleException(throwable);
			}
	}

	private ButtonGroup getButtonGroupMainframeDistributed() {
		if (buttonGroupMainframeDistributed == null)
			try {
				buttonGroupMainframeDistributed = new ButtonGroup();
			} catch (Throwable throwable) {
				handleException(throwable);
			}
		return buttonGroupMainframeDistributed;
	}

	public String getQueueManagerType() {
		return queueManagerType;
	}

	public void setQueueManagerType(String value) {
		this.queueManagerType = value;
		logger.info("queueManagerType set to " + value);
		if (!isLocal()) {
			if ((this.queueManagerType != null) && 
				(this.queueManagerType.equalsIgnoreCase("M"))) {
				this.remoteMainframeRadioButton.setSelected(true);
			} else {
				this.remoteDistributedRadioButton.setSelected(true);
			}
		}
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
		this.getTextUsername().setText(this.username);
		logger.info("setUsername():" + username);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
		this.getTextPassword().setText(password);
		logger.info("setPassword():" + password);
	}

	private JButton ivjCancel;
	private JPanel ivjFooterPanel;
	private FlowLayout ivjFooterPanelFlowLayout;
	private JPanel ivjJDialogContentPane;
	private JLabel labelQueueManagerName;
	private JLabel QueueManagerName;
	private JLabel labelConnectionName;
	private JLabel labelChannelName;
	private JLabel labelQueueManagerType;
	
	private JLabel labelUsername;
	private JLabel labelPassword;
	private JSeparator ivjJSeparator1;
	private JButton ivjOK;
	private ButtonGroup ivjButtonGroup1;
	IvjEventHandler ivjEventHandler;
	private JRadioButton ivjShowLocalRadioButton;
	private JRadioButton ivjShowRemoteRadioButton;
	
	public static final int OK = 0;
	public static final int CANCEL = 1;
	private int returnCode;
	private String queueManagerName;
	private String connectionName;
	private String channelName;
	
	private String queueManagerType;
	
	private String username;
	private String password;
	
	private boolean local;
		
	private JTextField textLocalQueueManagerName;
	private JTextField ivjRemoteQueueManagerName;
	private JTextField ivjRemoteConnectionName;
	private JTextField ivjRemoteChannelName;
	
	private JTextField textUsername;
	private JPasswordField textPassword;
	
	private boolean ivjConnPtoP1Aligning;
	private Document ivjLocalQueueManagerDocument;
	private Document ivjConnectionNameDocument;
	private boolean ivjConnPtoP2Aligning;
	private boolean ivjConnPtoP3Aligning;
	private boolean ivjConnPtoP4Aligning;
	private Document ivjRemoteQueueManagerDocument;
	private JPanel ivjBanner;
	private FlowLayout ivjBannerFlowLayout;
	private JLabel ivjBannerIcon;
	private JPanel ivjJPanel1;
	private JSeparator ivjJSeparator2;

	private JButton defaultChannelButton;
	
	private JPanel remoteMainframePanel;
	private ButtonGroup buttonGroupMainframeDistributed;
	private JRadioButton remoteMainframeRadioButton;
	private JRadioButton remoteDistributedRadioButton;
}
