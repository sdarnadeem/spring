package com.nasyxnadeem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class JavaConfigSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaConfigSpringApplication.class, args);
	}

	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

}
