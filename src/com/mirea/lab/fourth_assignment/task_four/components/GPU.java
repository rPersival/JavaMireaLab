package com.mirea.lab.fourth_assignment.task_four.components;

import com.mirea.lab.fourth_assignment.task_four.manufacturers.GPUManufacturer;

public class GPU {
    private final GPUManufacturer gpuManufacturer;
    private final String pciInterface;
    private final int memory;
    private final String name;

    public GPU(GPUManufacturer gpuManufacturer, String pciInterface, int memory, String name) {
        this.gpuManufacturer = gpuManufacturer;
        this.pciInterface = pciInterface;
        this.memory = memory;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "\nManufacturer: " + gpuManufacturer.name() + " | PCI Interface: " + pciInterface
                + " | Memory Size: " + memory + "MB";
    }
}
