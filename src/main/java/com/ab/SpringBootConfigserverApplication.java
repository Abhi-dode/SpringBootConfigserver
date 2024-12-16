package com.ab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringBootConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConfigserverApplication.class, args);
	}

}
