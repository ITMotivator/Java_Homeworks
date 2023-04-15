package oop_1;

public class Product {

    protected String type;
    protected String brand;
    protected String name;
    protected double price;

    {
        type = "Product";
        brand = "noname";
        price = 0.00;
    }

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, double price) {
        this(name);
        this.price = price;

    }

    public Product(String type, String brand, String name, double price) {
        this.type = type;
        this.brand = brand;
        this.name = name;
        if (price < 0) {
            this.price = Math.abs(price);
        } else
            this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = Math.abs(price);
        } else
            this.price = price;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setType(String newType) {
        this.type = newType;
    }

    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    public String displayInfo() {
        return String.format("%s - %s - %s - %.2f$", type, brand, name, price);
    }

    @Override
    public String toString() {
        return this.displayInfo();
    }
}
