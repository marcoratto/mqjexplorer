// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Profile.java
package com.kolban.mqjexplorer;

import com.kolban.swing.TableMetaData;
import java.awt.Dimension;
import java.awt.Font;
import java.io.*;
import java.util.Vector;

// Referenced classes of package com.kolban.mqjexplorer:
//            MQSeriesTree

public class Profile implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6610861383693162452L;

	public class CommonSettings implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = -352100144286885308L;
		public int dividerPosition;
		public Dimension windowSize;

		public CommonSettings() {
			dividerPosition = 200;
			windowSize = new Dimension(640, 400);
		}
	}

	public class MessageListSettings implements Serializable {

		public Dimension windowSize;

		public MessageListSettings() {
			windowSize = new Dimension(580, 400);
		}
	}

	public class BrowseSettings implements Serializable {

		public Dimension dimensions;

		public BrowseSettings() {
			dimensions = new Dimension(440, 405);
		}
	}

	public class PubSubSettings implements Serializable {

		public String initialStreamName;
		public Dimension topicDlgSize;
		public TableMetaData topicDlgTableMetaData;

		public PubSubSettings() {
			topicDlgTableMetaData = new TableMetaData();
			topicDlgSize = new Dimension(640, 230);
			initialStreamName = null;
		}
	}

	public class TailFileSettings implements Serializable {

		public Font font;
		public Vector fileNames;

		public TailFileSettings() {
			font = null;
			fileNames = new Vector();
		}
	}

	public class QStatsSettings implements Serializable {

		public Dimension dimensions;
		public boolean loggingEnabled;
		public String fileName;

		public QStatsSettings() {
			dimensions = new Dimension(440, 405);
			loggingEnabled = false;
			fileName = "";
		}
	}

	public class AdvancedPutSettings implements Serializable {

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

	public Profile() {
		queueViewTableMetaData = null;
		messageListTableMetaData = null;
		tree = null;
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

	public static Profile load(File f) {
		Profile profile = null;
		FileInputStream fileinputstream = null;
		
		try {
			System.out.println("Try to read settings from file " + f.getAbsolutePath().toString());
			fileinputstream = new FileInputStream(f);
			ObjectInputStream objectinputstream = new ObjectInputStream(
					fileinputstream);
			profile = (Profile) objectinputstream.readObject();
		} catch (Exception exception) {
			System.out.println("Profile::Exception: " + exception.toString());
			profile = new Profile();
		}
		if (fileinputstream != null)
			try {
				fileinputstream.close();
			} catch (Exception _ex) {
			}
		return profile;
	}

	public void save(File f) {
		queueViewTableMetaData.setWidthsFromTable();
		messageListTableMetaData.setWidthsFromTable();
		try {
			FileOutputStream fileoutputstream = new FileOutputStream(f);
			ObjectOutputStream objectoutputstream = new ObjectOutputStream(
					fileoutputstream);
			objectoutputstream.writeObject(this);
			objectoutputstream.flush();
			fileoutputstream.close();
		} catch (Exception exception) {
			System.out.println("Exception : " + exception.toString());
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
