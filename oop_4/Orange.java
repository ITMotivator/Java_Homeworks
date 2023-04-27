package oop_4;

public class Orange extends Fruit {

    public Orange() {
        super(1.5);
    }


    @Override
    public String toString() {
        return String.format("%s weighs %.1f kg", this.getClass().getName(), weight);
    }
}
