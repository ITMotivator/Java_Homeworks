package oop_2;

public abstract class Animal {
    protected String name;
    protected Integer appetite;
    protected Boolean hunger;


    public Animal(String name, Integer appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hunger = true;
    }

    public String getName() {
        return this.name;
    }

    public Boolean checkIfHungry() {
        return this.hunger;
    }

    //Чтобы животное проголодалось, можно, например, вызывать метод ниже при определенных условиях.
    private void gethungry() {
        this.hunger = true;
    }

    public String jump() {
        return "Animal " + this.name + "jumps";
    }

    public abstract String makeVoice();

}
