package com.zeed.test.oauth2.client.test.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//@SpringBootApplication

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class Oauth2ClientTestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2ClientTestAppApplication.class, args);
	}

}
