package com.ing.zoo.animals;

/**
 * Animal
 *
 * @author DennisBleeker
 */
public class Animal {
    public String name;
    public String helloText;
    public String eatText;
    public boolean isCarnivore;
    public boolean isHerbivore;

    public Animal(String name, String helloText, String eatText, boolean isCarnivore, boolean isHerbivore) {
        this.name = name;
        this.helloText = helloText;
        this.eatText = eatText;
        this.isHerbivore = isHerbivore;
        this.isCarnivore = isCarnivore;
    }

    public Animal(String name, String helloText, boolean isCarnivore, boolean isHerbivore) {
        this.name = name;
        this.helloText = helloText;
        this.isHerbivore = isHerbivore;
        this.isCarnivore = isCarnivore;
    }

    public void sayHello(){
        System.out.println(helloText);
    }

    public void eat(String command){
        System.out.println(eatText);
    }
}
