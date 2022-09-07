package eygds.maven.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingDemo {

	static Logger logger = LogManager.getLogger(LoggingDemo.class);

	public static void main(String[] args) {

		logger.info("Info log");
		logger.warn("Warning log");
		logger.error("Error log");
		logger.fatal("Fatal log");

	}

}
