package com.company.jwd.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Refrigerator extends Appliance {
    // you may add your own code here
    private int powerConsumption;
    private int weigth;
    private int freezerCapacity;
    private double overallCapacity;
    private double height;
    private double width;

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
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

    public Refrigerator() {
        super("Refrigerator");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refrigerator that = (Refrigerator) o;
        return powerConsumption == that.powerConsumption && weigth == that.weigth &&
                freezerCapacity == that.freezerCapacity && Double.compare(that.overallCapacity, overallCapacity) == 0 &&
                Double.compare(that.height, height) == 0 && Double.compare(that.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weigth, freezerCapacity, overallCapacity, height, width);
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "power_consumption=" + powerConsumption +
                ", weigth=" + weigth +
                ", freezer_capacity=" + freezerCapacity +
                ", overall_capacity=" + overallCapacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    public Refrigerator(int powerConsumption, int weigth, int freezerCapacity, double overallCapacity, double height, double width) {
        super("Refrigerator");
        this.powerConsumption = powerConsumption;
        this.weigth = weigth;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

    @Override
    public Map<String, Object> ConvertToCriteria() {
        Map<String, Object> converted_object = new HashMap<>();

        converted_object.put("POWER_CONSUMPTION", this.powerConsumption);
        converted_object.put("WEIGHT", this.weigth);
        converted_object.put("FREEZER_CAPACITY", this.freezerCapacity);
        converted_object.put("OVERALL_CAPACITY", this.overallCapacity);
        converted_object.put("HEIGHT", this.height);
        converted_object.put("WIDTH", this.width);

        return converted_object;
    }
}
