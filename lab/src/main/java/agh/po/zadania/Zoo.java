package agh.po.zadania;

import agh.po.animals.*;
import java.util.Random;

public class Zoo {

    Animal[] animals = new Animal[100];

    public void fillZoo() {

        Random random = new Random();

        for (int i = 0; i < animals.length; i++) {

            int type = random.nextInt(3);

            if (type == 0) {
                animals[i] = new Parrot("Papuga" + i);
            } else if (type == 1) {
                animals[i] = new Dog("Pies" + i);
            } else {
                animals[i] = new Snake("Waz" + i);
            }
        }
    }

    public int countLegs() {

        int sum = 0;

        for (Animal animal : animals) {
            sum += animal.getLegs();
        }

        return sum;
    }

    public void showAnimals() {

        for (Animal animal : animals) {

            String description = animal.getDescription();

            int legs = animal.getLegs();

            System.out.println(description);

            animal.makeSound();
        }
    }

    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        zoo.fillZoo();

        zoo.showAnimals();

        System.out.println("Suma nog: " + zoo.countLegs());
    }
}
