package com.mirea.lab.fourth_assignment.task_four.components;

public abstract class StorageDevice {
    protected int memorySize;
    protected int speed;

    public StorageDevice(int memorySize, int speed) {
        this.memorySize = memorySize;
        this.speed = speed;
    }
}
