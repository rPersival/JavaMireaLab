package com.mirea.lab.third_assignment.task_three;

public enum Rates {
    USD(1, "USD"),
    RUB(60.025, "RUB"),
    EUR(1.0033, "EUR");

    private double rate;
    private String name;

    Rates(double rate, String name) {
        this.rate = rate;
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public String getName() {
        return name;
    }
}
