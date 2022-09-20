package com.mirea.lab.fourth_assignment.task_four;

import com.mirea.lab.fourth_assignment.task_four.components.*;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private CPU cpu;
    private GPU gpu;
    private Motherboard motherboard;
    private List<StorageDevice> storageDevices;
    private List<RAM> memory;

    public Computer(CPU cpu, GPU gpu, List<StorageDevice> storageDevices, List<RAM> memory) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.storageDevices = storageDevices;
        this.memory = memory;
    }

    public Computer() {
        storageDevices = new ArrayList<>();
        memory = new ArrayList<>();
    }

    public static ComputerBuilder createBuilder() {
        return new ComputerBuilder();
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public GPU getGpu() {
        return gpu;
    }

    public void setGpu(GPU gpu) {
        this.gpu = gpu;
    }

    public List<StorageDevice> getStorageDevices() {
        return storageDevices;
    }

    public void addStorageDevice(StorageDevice storageDevice) {
        this.storageDevices.add(storageDevice);
    }

    public void removeStorageDevice(StorageDevice storageDevice) {
        this.storageDevices.remove(storageDevice);
    }

    public void setStorageDevices(List<StorageDevice> storageDevices) {
        this.storageDevices = storageDevices;
    }

    public List<RAM> getMemory() {
        return memory;
    }

    public void addMemory(RAM memory) {
        this.memory.add(memory);
    }

    public void removeMemory(RAM memory) {
        this.memory.remove(memory);
    }

    public void setMemory(List<RAM> memory) {
        this.memory = memory;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public void getInfo() {
        System.out.println("CPU:\n" + cpu
        + "\n\nGPU:\n" + gpu
        + "\n\nMotherboard:\n" + motherboard + "\n");
        for (int i = 0; i < storageDevices.size(); i++) {
            StorageDevice device = storageDevices.get(i);
            System.out.print("#" + (i + 1) + (device instanceof SSD ? " SSD:\n" : " HDD:\n") + device);
            System.out.println("\n");
        }
        for (int i = 0; i < memory.size(); i++) {
            RAM device = memory.get(i);
            System.out.print("#" + (i + 1) + " RAM:\n" + device);
            System.out.println("\n");
        }
    }

}
