package oop_4;

public abstract class Fruit {

    protected final double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

}
