package com.mirea.lab.fourth_assignment.task_two;

import java.util.Arrays;

public enum ClothingSize {
    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40);

    private final int euroSize;

    ClothingSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription() {
        if (this == ClothingSize.XXS)
            return "Child size";
        return "Adult size";
    }

    public int getEuroSize() {
        return euroSize;
    }

    public static void getInfo() {
        Arrays.stream(values()).forEach(System.out::println);
    }

    private String getName() {
        switch (this) {
            case XXS:
                return "XXS";
            case XS:
                return "XS";
            case S:
                return "S";
            case M:
                return "M";
            case L:
                return "L";
        }
        return "";
    }

    public static ClothingSize getByName(String name) {
        switch (name) {
            case "XXS":
                return ClothingSize.XXS;

            case "XS":
                return ClothingSize.XS;

            case "S":
                return ClothingSize.S;

            case "M":
                return ClothingSize.M;

            default:
            case "L":
                return ClothingSize.L;
        }
    }

    @Override
    public String toString() {
        return this.getName() + " | EU size: " + this.getEuroSize() + " | " + this.getDescription();
    }
}
