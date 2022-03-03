package com.example.demo.Question5;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Orange implements FruitColor {
    public String getColor(){
        return "Orange is yellow";
    }
}
