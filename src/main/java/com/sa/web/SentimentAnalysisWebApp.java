package com.sa.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SentimentAnalysisWebApp {

	//main class
	public static void main(String[] args) {
		System.out.println("Starting SentimentAnalysisWebApp...");
		System.out.println("hotfix");
		SpringApplication.run(SentimentAnalysisWebApp.class, args);
	}
}
