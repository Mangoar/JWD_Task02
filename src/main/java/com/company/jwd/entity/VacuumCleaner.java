package com.company.jwd.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class VacuumCleaner extends Appliance {
    // you may add your own code here
    private int powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private int motorSpeedRegulation;
    private int cleaningWidth;

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    public VacuumCleaner() {
        super("VacuumCleaner");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return powerConsumption == that.powerConsumption && motorSpeedRegulation == that.motorSpeedRegulation &&
                cleaningWidth == that.cleaningWidth && filterType.equals(that.filterType) &&
                bagType.equals(that.bagType) && wandType.equals(that.wandType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "power_consumption=" + powerConsumption +
                ", filter_type='" + filterType + '\'' +
                ", bag_type='" + bagType + '\'' +
                ", wand_type='" + wandType + '\'' +
                ", motor_speed_regulation=" + motorSpeedRegulation +
                ", cleaning_width=" + cleaningWidth +
                '}';
    }

    public VacuumCleaner(int powerConsumption, String filterType, String bagType, String wandType, int motorSpeedRegulation, int cleaningWidth) {
        super("VacuumCleaner");
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public Map<String, Object> ConvertToCriteria() {
        Map<String, Object> converted_object = new HashMap<>();

        converted_object.put("POWER_CONSUMPTION", this.powerConsumption);
        converted_object.put("FILTER_TYPE", this.filterType);
        converted_object.put("BAG_TYPE", this.bagType);
        converted_object.put("WAND_TYPE", this.wandType);
        converted_object.put("MOTOR_SPEED_REGULATION", this.motorSpeedRegulation);
        converted_object.put("CLEANING_WIDTH", this.cleaningWidth);

        return converted_object;
    }
}
