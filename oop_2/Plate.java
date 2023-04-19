package oop_2;

public class Plate {
    private int food;
    private int capacity;

    public Plate(int capacity) {
        this.capacity = capacity;
        this.food = 0;
    }

    public Integer getCapacity() {
        return this.capacity;
    }

    public Integer getFoodLevel() {
        return this.food;
    }

    public void addFood(int foodToAdd) {
        if (foodToAdd <= (capacity - food)) {
            this.food = food + foodToAdd;
        } else {
            System.out.println("Can't add food, plate will be overloaded.");
        }
    }

    public void takeFood(int foodToEat) {
        if (foodToEat <= food) {
            this.food = food - foodToEat;
        } else {
            System.out.println("Not enough food on the plate");
        }
    }

    public String info() {
        return "plate capacity: " + this.getCapacity() + "\nfood available: " + this.getFoodLevel();
    }
}
