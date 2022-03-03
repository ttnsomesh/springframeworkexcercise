package com.example.demo.Question2;

public class Fruit {
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
