package oop_2;

public class Cat extends Animal {
    private String color;
    private Integer tempHunger = super.appetite;

    public Cat(String name, Integer appetite) {
        super(name, appetite);
    }

    public Cat(String name, Integer appetite, String color) {
        super(name, appetite);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void eat(Plate plate) {
        if (plate.getFoodLevel() != 0) {
            if (this.tempHunger <= plate.getFoodLevel()) {
                this.hunger = false;
                plate.takeFood(this.tempHunger);
                System.out.println("Cat " + this.getName() + " has eaten " + this.tempHunger);
                this.tempHunger = 0;
            } else {
                this.tempHunger = this.appetite - plate.getFoodLevel();
                System.out
                        .println("Cat " + this.getName() + " has eaten " + plate.getFoodLevel() + ", but still hungry");
                plate.takeFood(plate.getFoodLevel());
            }
        } else {
            System.out.println("Plate is empty");
        }
    }

    @Override
    public String jump() {
        return "Cat " + this.getName() + "jumps";
    }

    @Override
    public String makeVoice() {
        return "Cat meaws";
    }

    @Override
    public String toString() {
        return "Cat " + this.getName();
    }

}
