package com.fatou.microservice.springcloudcinfigserver4;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudCinfigServer4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCinfigServer4Application.class, args);
	}

}
