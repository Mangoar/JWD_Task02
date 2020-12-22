package com.company.jwd.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Laptop extends Appliance {
    private double batteryCapacity;
    private String os;
    private int memoryRom;
    private int systemMemory;
    private double cpu;
    private int displayInches;

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public Laptop() {
        super("Laptop");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.batteryCapacity, batteryCapacity) == 0 &&
                memoryRom == laptop.memoryRom && systemMemory == laptop.systemMemory &&
                Double.compare(laptop.cpu, cpu) == 0 && displayInches == laptop.displayInches &&
                os.equals(laptop.os);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, os, memoryRom, systemMemory, cpu, displayInches);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "battery_capacity=" + batteryCapacity +
                ", os='" + os + '\'' +
                ", memory_rom=" + memoryRom +
                ", system_memory=" + systemMemory +
                ", cpu=" + cpu +
                ", display_inch=" + displayInches +
                '}';
    }

    public Laptop(double batteryCapacity, String os, int memoryRom, int systemMemory, double cpu, int displayInches) {
        super("Laptop");
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;
    }

    @Override
    public Map<String, Object> ConvertToCriteria() {
        Map<String, Object> converted_object = new HashMap<>();

        converted_object.put("BATTERY_CAPACITY", this.batteryCapacity);
        converted_object.put("OS", this.os);
        converted_object.put("MEMORY_ROM", this.memoryRom);
        converted_object.put("SYSTEM_MEMORY", this.systemMemory);
        converted_object.put("CPU", this.cpu);
        converted_object.put("DISPLAY_INCHES", this.displayInches);

        return converted_object;
    }
}
