package com.dw.patient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationMain {

	static Logger logger=LoggerFactory.getLogger(ApplicationMain.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationMain.class, args);
		logger.info("*** Patient Service Started ***");
	}

}
