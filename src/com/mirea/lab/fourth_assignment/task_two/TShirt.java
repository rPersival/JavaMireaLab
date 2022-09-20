package com.mirea.lab.fourth_assignment.task_two;

public class TShirt extends Clothes implements MenClothing, WomenClothing {

    public TShirt(ClothingSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Man dressed in TShirt.\n" + this.getSize());
    }

    @Override
    public void dressWoman() {
        System.out.println("Woman dressed in TShirt.\n" + this.getSize());
    }
}
