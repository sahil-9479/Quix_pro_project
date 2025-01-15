package com.quiz.Quiz_Admin_Server;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class QuizAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizAdminServerApplication.class, args);
	}

}
