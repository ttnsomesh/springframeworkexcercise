package com.example.demo.Question6;

import org.springframework.stereotype.Component;

@Component
public class Apple implements FruitColor {
    public String getColor(){
        return "Apple is red";
    }
}
