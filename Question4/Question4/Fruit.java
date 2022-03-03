package com.example.demo.Question4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Fruit {
    @Autowired
    private FruitColor fruitColor;

    public Fruit(FruitColor fruitColor) {
        this.fruitColor = fruitColor;
    }

    public void getFruitColor(){
        FruitColor fruitColor = new Apple();
        String col = fruitColor.getColor();
        System.out.println("Apple color is : "+col);
    }
}
