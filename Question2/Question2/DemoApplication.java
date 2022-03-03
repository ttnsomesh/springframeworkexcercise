package com.example.demo.Question2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Fruit fruit = new Fruit(new Apple());
		fruit.getFruitColor();
	}

}
