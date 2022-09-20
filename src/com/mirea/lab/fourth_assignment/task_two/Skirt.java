package com.mirea.lab.fourth_assignment.task_two;

public class Skirt extends Clothes implements WomenClothing {

    public Skirt(ClothingSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Woman dressed in Skirt.\n" + this.getSize());
    }
}
