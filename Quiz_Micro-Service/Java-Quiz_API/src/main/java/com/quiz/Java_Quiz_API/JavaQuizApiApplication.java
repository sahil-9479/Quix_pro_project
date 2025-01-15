package com.quiz.Java_Quiz_API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class JavaQuizApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaQuizApiApplication.class, args);
	}

}
