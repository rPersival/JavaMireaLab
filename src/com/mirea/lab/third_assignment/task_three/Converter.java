package com.mirea.lab.third_assignment.task_three;

public class Converter {

    public static double convert(double num, Rates from, Rates to) {
        return num * to.getRate() / from.getRate();
    }
}
