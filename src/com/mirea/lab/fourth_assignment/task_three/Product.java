package com.mirea.lab.fourth_assignment.task_three;

public class Product {
    private final ProductType type;
    private final String name;
    private final double price;

    public Product(ProductType type, String name, double price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public ProductType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nPrice: " + this.price + "$\nType: " +
                this.type;
    }
}
