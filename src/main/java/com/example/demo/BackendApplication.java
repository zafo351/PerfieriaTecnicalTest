package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@ComponentScan(basePackages = "com.controller")
@CrossOrigin(origins = "http://localhost:4200")
public class BackendApplication {
	
	private static Logger LOG = LoggerFactory.getLogger(BackendApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
		LOG.info("Inicio de aplicacion Backend");
	}

}
