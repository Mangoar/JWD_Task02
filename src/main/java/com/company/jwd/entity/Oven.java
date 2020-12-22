package com.company.jwd.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Oven extends Appliance {
    // you may add your own code here
    private int powerConsumption;
    private int weight;
    private int capacity;
    private int depth;
    private double height;
    private double width;

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Oven() {
        super("Oven");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oven oven = (Oven) o;
        return powerConsumption == oven.powerConsumption && weight == oven.weight &&
                capacity == oven.capacity && depth == oven.depth && Double.compare(oven.height, height) == 0 &&
                Double.compare(oven.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, capacity, depth, height, width);
    }

    @Override
    public String toString() {
        return "Oven{" +
                "power_consumption=" + powerConsumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    public Oven(int powerConsumption, int weight, int capacity, int depth, double height, double width) {
        super("Oven");
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    @Override
    public Map<String, Object> ConvertToCriteria() {
        Map<String, Object> converted_object = new HashMap<>();

        converted_object.put("POWER_CONSUMPTION", this.powerConsumption);
        converted_object.put("WEIGHT", this.weight);
        converted_object.put("CAPACITY", this.capacity);
        converted_object.put("DEPTH", this.depth);
        converted_object.put("HEIGHT", this.height);
        converted_object.put("WIDTH", this.width);

        return converted_object;
    }

}
