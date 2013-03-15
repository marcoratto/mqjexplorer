package com.kolban.mqjexplorer;

import org.apache.log4j.Logger;

public class ConfigurationException extends Exception {

	private static final long serialVersionUID = 4417499029054079808L;
	
	private final static Logger logger = Logger.getLogger("com.kolban.mqjexplorer");

	public ConfigurationException(Exception e) {
		super(e);
		logger.error(e.getMessage(), e);
	}

	public ConfigurationException(String s) {
		super(s);
		logger.error(s);		
	}
}
