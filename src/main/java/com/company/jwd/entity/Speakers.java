package com.company.jwd.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Speakers extends Appliance {
    // you may add your own code here
    private int powerConsumption;
    private int numberOfSpeakers;
    private String frequencyRange;
    private int cordLength;

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCord_liength(int cord_liength) {
        this.cordLength = cordLength;
    }

    public Speakers() {
        super("Speakers");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speakers speakers = (Speakers) o;
        return powerConsumption == speakers.powerConsumption && numberOfSpeakers == speakers.numberOfSpeakers &&
                cordLength == speakers.cordLength && frequencyRange.equals(speakers.frequencyRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "power_consumption=" + powerConsumption +
                ", number_of_speakers=" + numberOfSpeakers +
                ", frequency_range='" + frequencyRange + '\'' +
                ", cord_liength=" + cordLength +
                '}';
    }

    public Speakers(int powerConsumption, int numberOfSpeakers, String frequencyRange, int cordLength) {
        super("Speakers");
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    @Override
    public Map<String, Object> ConvertToCriteria() {
        Map<String, Object> converted_object = new HashMap<>();

        converted_object.put("POWER_CONSUMPTION", this.powerConsumption);
        converted_object.put("NUMBER_OF_SPEAKERS", this.numberOfSpeakers);
        converted_object.put("FREQUENCY_RANGE", this.frequencyRange);
        converted_object.put("CORD_LENGTH", this.cordLength);

        return converted_object;
    }
}
