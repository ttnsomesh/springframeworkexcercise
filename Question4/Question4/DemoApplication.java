package com.example.demo.Question4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		Apple apple = applicationContext.getBean(Apple.class);
		apple.setName("Apple");
		apple.setPrice(34.12);
		String col = apple.getColor();
		System.out.println(col);
		String f = apple.getName();
		System.out.println("fruit name is "+f);
		double d = apple.getPrice();
		System.out.println(" "+f+"price is "+d);
	}

}
