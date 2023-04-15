package oop_1;

public class Phone extends Product {

    private int displaySize;

    {
        type = "Phone";
    }

    public Phone(String name) {
        super(name);
    }

    public Phone(String name, int display) {
        super(name);
        this.displaySize = display;
    }

    public Phone(String brand, String name, int display, double price) {
        super(name, price);
        this.brand = brand;
        this.displaySize = display;
    }

    public void setDisplaySize(int size) {
        this.displaySize = size;
    }

    public String displayInfo() {
        return String.format("%s - %s - %s - Display: %dsm - %.2f$", type, brand, name, displaySize, price);
    }

    @Override
    public String toString() {
        return this.displayInfo();
    }

}
