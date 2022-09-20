package com.mirea.lab.fourth_assignment.task_four.components;

import com.mirea.lab.fourth_assignment.task_four.manufacturers.RAMManufacturer;

public class RAM {
    private final RAMManufacturer manufacturer;
    private final int clockRateInMHZ;
    private final int memorySizeInMB;
    private final String name;

    public RAM(RAMManufacturer manufacturer, int clockRateInMHZ, int memorySizeInMB, String name) {
        this.manufacturer = manufacturer;
        this.clockRateInMHZ = clockRateInMHZ;
        this.memorySizeInMB = memorySizeInMB;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "\nManufacturer: " + manufacturer.name()
                + " | Memory Size: " + memorySizeInMB + "MB | Memory Speed: " + clockRateInMHZ + " MHz";
    }
}
