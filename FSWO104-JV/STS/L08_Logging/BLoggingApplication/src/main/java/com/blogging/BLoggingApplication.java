package com.blogging;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BLoggingApplication {

	private static final Logger LOGGER = Logger.getLogger(BLoggingApplication.class.getName());
	
	private static final LogManager logManager = LogManager.getLogManager();
	
	static {
		
		try {
			String path = "src/main/resources/logging.properties";
			logManager.readConfiguration(new FileInputStream(path));
			
		} catch (IOException exception) {
			
			LOGGER.log(Level.SEVERE, "Error, could not load configuration file", exception);
		}
	}
	
	public static void main(String[] args) {
		
		LOGGER.info("The name of the logger is: " + LOGGER.getName());
		
		LOGGER.warning("An ArrayIndexOutOfBoundException may occur when using arrays.");
		
		int[] a = {1, 2, 3};
		
		int index = 4;
		
		LOGGER.config("Setting the index to " + index + "...");
		
		try {
			System.out.println("" + a[index]);
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Exception occurred.", e);
		}
				
//		SpringApplication.run(BLoggingApplication.class, args);
	}

}
