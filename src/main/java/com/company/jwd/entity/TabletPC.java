package com.company.jwd.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TabletPC extends Appliance {
    // you may add your own code here
    private double batteryCapacity;
    private int displayInches;
    private int memoryRom;
    private int flashMemoryCapacity;
    private String color;

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TabletPC() {
        super("TabletPC");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabletPC tabletPC = (TabletPC) o;
        return Double.compare(tabletPC.batteryCapacity, batteryCapacity) == 0 && displayInches == tabletPC.displayInches && memoryRom == tabletPC.memoryRom && flashMemoryCapacity == tabletPC.flashMemoryCapacity && color.equals(tabletPC.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "battery_capacity=" + batteryCapacity +
                ", display_inches=" + displayInches +
                ", memory_rom=" + memoryRom +
                ", flash_memory_capacity=" + flashMemoryCapacity +
                ", color='" + color + '\'' +
                '}';
    }

    public TabletPC(double batteryCapacity, int displayInches, int memoryRom, int flashMemoryCapacity, String color) {
        super("TabletPC");
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    @Override
    public Map<String, Object> ConvertToCriteria() {
        Map<String, Object> converted_object = new HashMap<>();

        converted_object.put("BATTERY_CAPACITY", this.batteryCapacity);
        converted_object.put("DISPLAY_INCHES", this.displayInches);
        converted_object.put("MEMORY_ROM", this.memoryRom);
        converted_object.put("FLASH_MEMORY_CAPACITY", this.flashMemoryCapacity);
        converted_object.put("COLOR", this.color);

        return converted_object;
    }
}
