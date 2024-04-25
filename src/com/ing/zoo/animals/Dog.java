package com.ing.zoo.animals;

import java.util.Random;

public class Dog extends Animal {

    public String trick;
    public Dog(String name, String helloText, String eatText, boolean isCarnivore, boolean isHerbivore) {
        super(name, helloText, eatText, isCarnivore, isHerbivore);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "barks at cat";
        }
        else
        {
            trick = "sniffs you";
        }
        System.out.println(trick);
    }
}
