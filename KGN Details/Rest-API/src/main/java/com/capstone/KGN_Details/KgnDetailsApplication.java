package com.capstone.KGN_Details;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.capstone")
@SpringBootApplication
public class KgnDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(KgnDetailsApplication.class, args);
	}

}
