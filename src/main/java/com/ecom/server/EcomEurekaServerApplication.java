package com.ecom.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * E-Commerce eureka application server.
 * @author yuvaraj
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EcomEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomEurekaServerApplication.class, args);
	}

}
