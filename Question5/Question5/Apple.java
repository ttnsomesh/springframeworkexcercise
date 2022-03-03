package com.example.demo.Question5;

import org.springframework.stereotype.Component;

@Component
public class Apple implements FruitColor {
    public String getColor(){
        return "Apple is red";
    }
}
