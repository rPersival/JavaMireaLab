package com.mirea.lab.fourth_assignment.task_four.components;

import com.mirea.lab.fourth_assignment.task_four.manufacturers.HDDManufacturer;

public class HDD extends StorageDevice {
    private final HDDManufacturer manufacturer;
    private final String name;

    public HDD(int memorySize, int speed, HDDManufacturer manufacturer, String name) {
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
