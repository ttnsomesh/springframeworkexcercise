package com.example.demo.Question3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		Apple apple = applicationContext.getBean(Apple.class);
		String col = apple.getColor();
		System.out.println(col);
	}

}
