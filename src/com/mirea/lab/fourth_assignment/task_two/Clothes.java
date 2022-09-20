package com.mirea.lab.fourth_assignment.task_two;

public abstract class Clothes {

    private ClothingSize size;
    private double price;
    private String color;

    public Clothes(ClothingSize size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public ClothingSize getSize() {
        return size;
    }

    public void setSize(ClothingSize size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getClothingInfo() {
        System.out.println("Clothing size: " + size + "\nPrice: " + price + "$\nColor: " + color);
    }
}
