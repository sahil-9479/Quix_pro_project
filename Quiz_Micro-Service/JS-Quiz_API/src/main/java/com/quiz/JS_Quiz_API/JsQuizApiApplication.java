package com.quiz.JS_Quiz_API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class JsQuizApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsQuizApiApplication.class, args);
	}

}
