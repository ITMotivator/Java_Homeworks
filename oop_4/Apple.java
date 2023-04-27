package oop_4;

public class Apple extends Fruit{

   
    public Apple() {
        super(1.0);
        this.fruitType = "Apple";
    }
    
    @Override
    public String toString() {
        return String.format("%s weighs %.1f", fruitType, weight);
    }
}
