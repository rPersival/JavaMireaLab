package com.mirea.lab.fourth_assignment.task_four.components;

import com.mirea.lab.fourth_assignment.task_four.manufacturers.SSDManufacturer;

public class SSD extends StorageDevice {
    SSDManufacturer manufacturer;
    private final String name;

    public SSD(int memorySize, int speed, SSDManufacturer manufacturer, String name) {
        super(memorySize, speed);
        this.manufacturer = manufacturer;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "\nManufacturer: " + manufacturer.name()
                + " | Memory Size: " + memorySize + "GB | Memory Speed: " + speed + " MB/sec";
    }
}
