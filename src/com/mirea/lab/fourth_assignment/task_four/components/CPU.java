package com.mirea.lab.fourth_assignment.task_four.components;

import com.mirea.lab.fourth_assignment.task_four.manufacturers.CPUManufacturer;

public class CPU {
    private final CPUManufacturer cpuManufacturer;
    private final double clockSpeed;
    private final int TDP;
    private final int coresCount;
    private final String socket;
    private final String name;

    public CPU(CPUManufacturer cpuManufacturer, double clockSpeed, int TDP, int coresCount, String socket, String name) {
        this.cpuManufacturer = cpuManufacturer;
        this.clockSpeed = clockSpeed;
        this.TDP = TDP;
        this.coresCount = coresCount;
        this.socket = socket;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "\nManufacturer: " + cpuManufacturer.name() + " | Clock Speed: " + clockSpeed
                + " | TDP: " + TDP + " | Cores: " + coresCount + " | Socket: " + socket;
    }
}
