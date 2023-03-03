package com.javatechie.spring.ws.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWebsocketApplication {

	static Logger logger = LogManager.getLogger(SpringBootWebsocketApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebsocketApplication.class, args);
		logger.fatal("this is fatal");
		logger.error("this is error");
		logger.info("this is info");
		logger.warn("this is warn");
		logger.debug("this is debug");
	}


}

