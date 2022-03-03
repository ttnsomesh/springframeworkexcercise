package com.example.demo.Question5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		Orange orange = applicationContext.getBean(Orange.class);
		String col = orange.getColor();
		System.out.println(col);
	}

}
