package com.bj.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationMain {

	private static final Logger logger = LoggerFactory.getLogger(ApplicationMain.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationMain.class, args);
		
		logger.info("系统启动成功!.......");
	}

}
