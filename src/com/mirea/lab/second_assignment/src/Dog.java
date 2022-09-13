package com.mirea.lab.second_assignment.src;

public class Dog {
    private String dogName;
    private int dogAge;

    public Dog(String dogName, int dogAge) {
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public int getDogAge() {
        return dogAge;
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }

    public int getHumanAge() {
        return dogAge * 7;
    }

    @Override
    public String toString() {
        return "Name: " + dogName + " | Age: " + dogAge;
    }
}
