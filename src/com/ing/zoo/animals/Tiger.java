package com.ing.zoo.animals;

import java.util.Random;

public class Tiger extends Animal {
    public String trick;

    public Tiger(String name, String helloText, String eatText, boolean isCarnivore, boolean isHerbivore) {
        super(name, helloText, eatText, isCarnivore, isHerbivore);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
