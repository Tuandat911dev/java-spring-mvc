package com.laptopshop.__java_spring_laptopshop_starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

// @SpringBootApplication
@SpringBootApplication(exclude = org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class)
public class Application {

	public static void main(String[] args) {
	SpringApplication.run(Application.class, args);
	}
}
