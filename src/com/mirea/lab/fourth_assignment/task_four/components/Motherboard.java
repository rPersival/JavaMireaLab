package com.mirea.lab.fourth_assignment.task_four.components;

import com.mirea.lab.fourth_assignment.task_four.manufacturers.MotherboardManufacturer;

public class Motherboard {
    private final MotherboardManufacturer manufacturer;
    private final String socket;
    private final String formFactor;
    private final String chipset;
    private final String name;

    public Motherboard(MotherboardManufacturer manufacturer, String socket, String formFactor, String chipset,
                       String name) {
        this.manufacturer = manufacturer;
        this.socket = socket;
        this.formFactor = formFactor;
        this.chipset = chipset;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "\nManufacturer: " + manufacturer.name()
                + " | Form Factor: " + formFactor + " | Socket: " + socket + " | Chipset: " + chipset;
    }
}
