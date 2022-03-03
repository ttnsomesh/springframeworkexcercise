package com.example.demo.Question4;

import org.springframework.stereotype.Component;

@Component
public class Apple implements FruitColor {
    private String name;
    private double price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getColor(){
        return "Apple is red";
    }
}
