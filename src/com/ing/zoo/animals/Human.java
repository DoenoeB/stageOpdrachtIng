package com.ing.zoo.animals;

import java.util.Random;

public class Human extends Animal{

    public String trick;

    public Human(String name, String helloText, boolean isCarnivore, boolean isHerbivore) {
        super(name, helloText, isCarnivore, isHerbivore);
    }


    @Override
    public void eat(String command){
        if (command.equals("give leaves")){
            eatText = "hmm i don't like salads that much";
        } else if (command.equals("give meat")) {
            eatText = "KFC is tasty!";
        }
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "Says: This was a fun practice assignment!";
        }
        else
        {
            trick = "Says: Have a nice day!";
        }
        System.out.println(trick);
    }
}
