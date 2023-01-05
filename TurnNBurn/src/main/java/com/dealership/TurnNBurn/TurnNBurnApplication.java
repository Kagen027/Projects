package com.dealership.TurnNBurn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.dealership")
public class TurnNBurnApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurnNBurnApplication.class, args);
	}

}
