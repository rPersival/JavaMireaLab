package com.mirea.lab.third_assignment.task_three;

public class Product {
    private String name;
    private double priceInUSD;

    public Product(String name, double priceInUSD) {
        this.name = name;
        this.priceInUSD = priceInUSD;
    }

    public String getName() {
        return name;
    }

    public double getPriceInRate(Rates rate) {
        return Converter.convert(priceInUSD, Rates.USD, rate);
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nPrice: " + String.format("%.2f", priceInUSD) + " USD";
    }
}
