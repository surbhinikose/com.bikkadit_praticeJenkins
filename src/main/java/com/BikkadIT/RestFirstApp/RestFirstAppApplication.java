package com.BikkadIT.RestFirstApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.BikkadIT.RestFirstApp.controller"})
public class RestFirstAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestFirstAppApplication.class, args);
		System.out.println("Hi");
	}

}
