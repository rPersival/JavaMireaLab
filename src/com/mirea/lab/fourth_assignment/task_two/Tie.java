package com.mirea.lab.fourth_assignment.task_two;

public class Tie extends Clothes implements MenClothing {

    public Tie(ClothingSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Man dressed in Tie.\n" + this.getSize());
    }
}
