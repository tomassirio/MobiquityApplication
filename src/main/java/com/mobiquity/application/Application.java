package com.mobiquity.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.mobiquity"})
public class Application{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
