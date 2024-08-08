package com.example.narutoapi.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example"})
public class NarutoapiApplication  {
	public static void main(String[] args) {
		SpringApplication.run(NarutoapiApplication.class, args);
	}
}
