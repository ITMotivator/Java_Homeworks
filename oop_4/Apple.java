package oop_4;

public class Apple extends Fruit{

   
    public Apple() {
        super(1.0);
    }
    
    @Override
    public String toString() {
        return String.format("%s weighs %.1f", this.getClass().getName(), weight);
    }
}
