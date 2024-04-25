package com.ing.zoo.animals;

import java.util.Random;

public class Pig extends Animal{
    public String eatText;
    public String trick;

    public Pig(String name, String helloText, boolean isCarnivore, boolean isHerbivore) {
        super(name, helloText, isCarnivore, isHerbivore);
    }

    @Override
    public void eat(String command){
        if (command.equals("give leaves")){
            eatText = "munch munch oink";
        } else if (command.equals("give meat")) {
            eatText = "nomnomnom oink thx";
        }
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "rolls in the mud";
        }
        else
        {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}
