package oop_2;

public class Main_2 {
    public static void main(String[] args) {
        Plate plateOfSheba = new Plate(20);
        plateOfSheba.addFood(17);
        System.out.println(plateOfSheba.info() + "\n");

        Cat[] hungryCats = { new Cat("Barsik", 9),
                new Cat("Anchous", 7), new Cat("Alisa", 5) };

        for (Cat cat : hungryCats) {
            System.out.println(cat + " hungry? " + cat.checkIfHungry());
        }
        System.out.println();

        for (Cat cat : hungryCats) {
            cat.eat(plateOfSheba);
            System.out.println(cat + " hungry: " + cat.checkIfHungry());
            System.out.println("Food left: " + plateOfSheba.getFoodLevel());
        }
        System.out.println();

        plateOfSheba.addFood(12);
        System.out.println("Food level: " + plateOfSheba.getFoodLevel());
        for (Cat cat : hungryCats) {
            if (cat.checkIfHungry()) {
                cat.eat(plateOfSheba);
            }
        }

        System.out.println();
        for (Cat cat : hungryCats) {
            System.out.println(cat + " hungry: " + cat.checkIfHungry());
        }
        System.out.println("Food left: " + plateOfSheba.getFoodLevel());

    }
}
