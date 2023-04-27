package oop_4;

import java.util.ArrayList;
import java.util.Arrays;

public class Main_4 {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Box<Apple> box1 = new Box<Apple>(10.0);
        box1.addFruits(apple1);
        box1.addFruits(apple2);
        box1.addFruits(apple3);
        System.out.println(box1);

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Orange orange5 = new Orange();

        ArrayList<Orange> list = new ArrayList<Orange>(Arrays.asList(orange1, orange2, orange3, orange4, orange5));
        Box<Orange> box2 = new Box<Orange>(7, list);
        box2 = new Box<Orange>(12, list);
        System.out.println(box2);

        System.out.println(box1.compareTo(box2));

        box2.getFruits(1);
        System.out.println(box2);

        // MoveFruits move1 = new MoveFruits(box1, box2, 2);
        // move1.move();

        Orange orange6 = new Orange();
        Orange orange7 = new Orange();
        ArrayList<Orange> list2 = new ArrayList<Orange>(Arrays.asList(orange6, orange7));
        Box<Orange> box3 = new Box<Orange>(5, list2);
        System.out.println(box3);
        MoveFruits<Orange> move2 = new MoveFruits<Orange>(box3, box2, 3);
        move2.move();
        System.out.println(box2);
        System.out.println(box3);

        MoveFruits<Orange> move3 = new MoveFruits<Orange>(box3, box2, 2);
        move3.move();
        System.out.println(box2);
        System.out.println(box3);
        
    }
}