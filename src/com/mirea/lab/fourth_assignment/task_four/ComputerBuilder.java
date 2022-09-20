package com.mirea.lab.fourth_assignment.task_four;

import com.mirea.lab.fourth_assignment.task_four.components.*;

import java.util.List;

public class ComputerBuilder {
    private CPU cpu;
    private GPU gpu;
    private Motherboard motherboard;
    private List<StorageDevice> storageDevices;
    private List<RAM> memory;
    private final Computer computer;

    public ComputerBuilder() {
        computer = new Computer();
    }

    public ComputerBuilder setCPU(CPU cpu) {
        computer.setCpu(cpu);
        return this;
    }

    public ComputerBuilder setGPU(GPU gpu) {
        computer.setGpu(gpu);
        return this;
    }

    public ComputerBuilder setMemory(List<RAM> memory) {
        computer.setMemory(memory);
        return this;
    }

    public ComputerBuilder setStorageDevices(List<StorageDevice> storageDevices) {
        computer.setStorageDevices(storageDevices);
        return this;
    }

    public ComputerBuilder setMotherboard(Motherboard motherboard) {
        computer.setMotherboard(motherboard);
        return this;
    }

    public Computer build() {
        return computer;
    }
}
