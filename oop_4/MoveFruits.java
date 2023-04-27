package oop_4;

public class MoveFruits<T extends Fruit> {
    private Box<T> from;
    private Box<T> to;
    private int amount;

    public MoveFruits(Box<T> from, Box<T> to, int amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public void move() {
        if (from.fruits.get(0).getClass().equals(to.fruits.get(0).getClass())) {
            if (amount > from.fruits.size()) {
                System.out.printf("Not enough fruits in the box %d\n", from.id);
            } else {
                to.addFruits(from.getFruits(this.amount));
            }
        } else {
            System.out.println("Error! Can't mix fruits of different types in the same box.");
        }
    }
}
