package com.main.dateapp_main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DateApplication.class, args);
		System.out.println("Hello World From Home");
	}

}
