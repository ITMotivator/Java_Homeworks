package oop_4;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private double capacity;// max weight allowed
    ArrayList<T> fruits;
    protected double boxWeight = 0.0;
    protected String boxType;
    protected int id;
    static int counter = 1;

    public Box(double capacity) {
        this.id = counter++;
        this.capacity = capacity;
        this.fruits = new ArrayList<T>();
    }

    public Box(double capacity, ArrayList<T> list) {
        this.id = counter++;
        this.capacity = capacity;
        if (list.size() * list.get(0).getWeight() <= capacity) {
            this.fruits = new ArrayList<T>(list);
            this.boxType = this.getClass().getName();
        } else {
            System.out.println("Box " + this.id + " is too small for these fruits");
        }

    }

    public double getWeight() {
        if (fruits.isEmpty()) {
            return this.boxWeight;
        } else
            return fruits.size() * fruits.get(0).getWeight();

    }

    public void addFruits(T fruit) {
        if ((this.getWeight() + fruit.getWeight()) > this.capacity) {
            System.out.println("Box " + this.id + " is full!");
        } else if (!fruits.isEmpty()) {
            if (fruits.get(0).getClass().equals(fruit.getClass())) {
                fruits.add(fruit);
            } else {
                System.out.println("Error! Can't mix fruits of different types in the same box.");
            }
        } else {
            fruits.add(fruit);
            this.boxType = this.getClass().getName();
        }
    }

    public void addFruits(ArrayList<T> fewFruits) {
        double fruitsWeight = fewFruits.get(0).getWeight() * fewFruits.size();

        if ((this.getWeight() + fruitsWeight) > this.capacity) {
            System.out.println("Box " + this.id + " is full!");
        } else if (!this.fruits.isEmpty()) {
            if (this.fruits.get(0).getClass().equals(fewFruits.get(0).getClass())) {
                for (T fruit : fewFruits) {
                    this.fruits.add(fruit);
                }
            } else {
                System.out.println("Error! Can't mix fruits of different types in the same box.");
            }
        } else {
            fruits.addAll(fewFruits);
            this.boxType = this.getClass().getName();
        }
    }

    public ArrayList<T> getFruits(int amount) {
        ArrayList<T> removedFruits = new ArrayList<T>();
        if (amount > this.fruits.size()) {
            System.out.printf("Not enough fruits in the box %d\n", this.id);
        } else {
            for (int i = 0, j = this.fruits.size() - 1; i < amount; i++, j--) {
                removedFruits.add(this.fruits.remove(j));
            }
        }
        return removedFruits;
    }

    @Override
    public String toString() {
        String result = this.boxType + " box " + this.id +  " contains "
                + this.fruits.size() + " items, weighs " + this.getWeight();
        return result;
    }

    public boolean compareTo(Box<?> o) {
        int res = Double.compare(getWeight(), o.getWeight());
        if (res == 0)
            return true;
        else
            return false;
    }
}
