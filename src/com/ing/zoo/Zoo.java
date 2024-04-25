package com.ing.zoo;

import com.ing.zoo.animals.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Lion henk = new Lion("henk", "roooaoaaaaar", "nomnomnom thx mate", true, false);

        Hippo elsa = new Hippo("elsa", "splash", "munch munch lovely", false, true);

        Pig dora = new Pig("dora", "splash", true, true);

        Tiger wally = new Tiger("wally", "rraaarww", "nomnomnom oink wubalubadubdub", true, false);

        Zebra marty = new Zebra("marty", "zebra zebra", "munch munch zank yee bra", false, true);

        Human dennis = new Human("bennis", "Hi Martijn!", true, true);

        Dog babs = new Dog("babs", "I love my owner woof", "nom nom nom i eat too much", true, false);

        List<Animal> animals = new ArrayList<>();
        animals.add(henk);
        animals.add(elsa);
        animals.add(dora);
        animals.add(wally);
        animals.add(marty);
        animals.add(dennis);
        animals.add(babs);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        if (input.equals(commands[1])) {
            for (Animal animal : animals) {
                if (animal.isHerbivore) {
                    animal.eat(commands[1]);
                }
            }
        } else if (input.equals(commands[2])) {
            for (Animal animal : animals) {
                if (animal.isCarnivore) {
                    animal.eat(commands[2]);
                }
            }
        } else if (input.equals(commands[3])) {
            dora.performTrick();
            wally.performTrick();
            dennis.performTrick();
            babs.performTrick();
        } else if (input.equals(commands[0] + " henk")) {
            henk.sayHello();
        } else if (input.equals(commands[0] + " elsa")) {
            elsa.sayHello();
        } else if (input.equals(commands[0] + " dora")) {
            dora.sayHello();
        } else if (input.equals(commands[0] + " wally")) {
            wally.sayHello();
        } else if (input.equals(commands[0] + " marty")) {
            marty.sayHello();
        }else if (input.equals(commands[0] + " dennis")) {
            dennis.sayHello();
        }else if (input.equals(commands[0] + " babs")) {
            babs.sayHello();
        } else if (input.equals(commands[0])) {
            for (Animal animal : animals
            ) {
                animal.sayHello();
            }
        } else {
            System.out.println("Unknown command: " + input);
        }
    }
}
