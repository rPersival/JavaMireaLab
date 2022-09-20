package com.mirea.lab.fourth_assignment.task_two;

public class Pants extends Clothes implements MenClothing, WomenClothing {

    public Pants(ClothingSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Man dressed in Pants.\n" + this.getSize());
    }

    @Override
    public void dressWoman() {
        System.out.println("Woman dressed in Pants.\n" + this.getSize());
    }
}
