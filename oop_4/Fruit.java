package oop_4;

public abstract class Fruit {

    protected final double weight;
    protected String fruitType;
    

    public Fruit(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    public String getFruitType() {
        return this.fruitType;
    }


}
