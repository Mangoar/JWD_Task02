package com.company.jwd.dao.impl;

import com.company.jwd.entity.*;

import java.util.ArrayList;
import java.util.List;

public class ApplianceDbRowParser {

    private List<String> dbRows;
    private List<Appliance> itemsList;


    public ApplianceDbRowParser(List<String> dbRows) {
        this.dbRows = dbRows;
        itemsList = new ArrayList<>();
    }

    public void parseRows() {
        for (String str : dbRows) {
            String applianceType = str.substring(0, str.indexOf(':')).trim();
            switch (applianceType) {
                case "Oven": {
                    addOven(str.replaceAll("\\s+", ""));
                    break;
                }
                case "Laptop": {
                    addLaptop(str.replaceAll("\\s+", ""));
                    break;
                }
                case "Refrigerator": {
                    addRefrigerator(str.replaceAll("\\s+", ""));
                    break;
                }
                case "Speakers": {
                    addSpeakers(str.replaceAll("\\s+", ""));
                    break;
                }
                case "TabletPC": {
                    addTabletPC(str.replaceAll("\\s+", ""));
                    break;
                }
                case "VacuumCleaner": {
                    addVacuumCleaner(str.replaceAll("\\s+", ""));
                    break;
                }
            }
        }
    }

    private void addVacuumCleaner(String row) {
        int tempPowerConsumption = Integer.parseInt(row.substring(row.indexOf("POWER_CONSUMPTION=") + 18,
                row.indexOf(",FILTER_TYPE")));
        String tempFilterType = row.substring(row.indexOf("FILTER_TYPE=") + 12,
                row.indexOf(",BAG_TYPE"));
        String tempBagType = row.substring(row.indexOf("BAG_TYPE=") + 9,
                row.indexOf(",WAND_TYPE"));
        String tempWandType = row.substring(row.indexOf("WAND_TYPE=") + 10,
                row.indexOf(",MOTOR_SPEED_REGULATION"));
        int tempMotorSpeedRegulation = Integer.parseInt(row.substring(row.indexOf("MOTOR_SPEED_REGULATION=") + 23,
                row.indexOf(",CLEANING_WIDTH")));
        int tempCleaningWidth = Integer.parseInt(row.substring(row.indexOf("CLEANING_WIDTH=") + 15));

        itemsList.add(new VacuumCleaner(tempPowerConsumption, tempFilterType, tempBagType, tempWandType,
                tempMotorSpeedRegulation, tempCleaningWidth));
    }

    private void addTabletPC(String row) {
        int tempBatteryCapacity = Integer.parseInt(row.substring(row.indexOf("BATTERY_CAPACITY=") + 17,
                row.indexOf(",DISPLAY_INCHES")));
        int tempDisplayInches = Integer.parseInt(row.substring(row.indexOf("DISPLAY_INCHES=") + 15,
                row.indexOf(",MEMORY_ROM")));
        int tempMemoryRom = Integer.parseInt(row.substring(row.indexOf("MEMORY_ROM=") + 11,
                row.indexOf(",FLASH_MEMORY_CAPACITY")));
        int tempFlashMemoryCapacity = Integer.parseInt(row.substring(row.indexOf("FLASH_MEMORY_CAPACITY=") + 22,
                row.indexOf(",COLOR")));
        String tempColor = row.substring(row.indexOf("COLOR=") + 6);

        itemsList.add(new TabletPC(tempBatteryCapacity, tempDisplayInches, tempMemoryRom,
                tempFlashMemoryCapacity, tempColor));
    }

    private void addSpeakers(String row) {
        int tempPowerConsumption = Integer.parseInt(row.substring(row.indexOf("POWER_CONSUMPTION=") + 18,
                row.indexOf(",NUMBER_OF_SPEAKERS")));
        int tempNumOfSpeakers = Integer.parseInt(row.substring(row.indexOf("NUMBER_OF_SPEAKERS=") + 19,
                row.indexOf(",FREQUENCY_RANGE")));
        String tempFrequencyRange = row.substring(row.indexOf("FREQUENCY_RANGE=") + 16,
                row.indexOf(",CORD_LENGTH"));
        int tempCordLength = Integer.parseInt(row.substring(row.indexOf("CORD_LENGTH=") + 12));

        itemsList.add(new Speakers(tempPowerConsumption, tempNumOfSpeakers, tempFrequencyRange, tempCordLength));
    }

    private void addRefrigerator(String row) {
        int tempPowerConsumption = Integer.parseInt(row.substring(row.indexOf("POWER_CONSUMPTION=") + 18,
                row.indexOf(",WEIGHT")));
        int tempWeight = Integer.parseInt(row.substring(row.indexOf("WEIGHT=") + 7,
                row.indexOf(",FREEZER_CAPACITY")));
        int tempFreezerCapacity = Integer.parseInt(row.substring(row.indexOf("FREEZER_CAPACITY=") + 17,
                row.indexOf(",OVERALL_CAPACITY")));
        double tempOverallCapacity = Double.parseDouble(row.substring(row.indexOf("OVERALL_CAPACITY=") + 17,
                row.indexOf(",HEIGHT")));
        double tempHeight = Double.parseDouble(row.substring(row.indexOf("HEIGHT=") + 7,
                row.indexOf(",WIDTH")));
        double tempWidth = Double.parseDouble(row.substring(row.indexOf("WIDTH=") + 6));

        itemsList.add(new Refrigerator(tempPowerConsumption, tempWeight, tempFreezerCapacity,
                tempOverallCapacity, tempHeight, tempWidth));
    }

    private void addLaptop(String row) {
        double tempBatteryCapacity = Double.parseDouble(row.substring(row.indexOf("BATTERY_CAPACITY=") + 17,
                row.indexOf(",OS")));
        String tempOs = row.substring(row.indexOf("OS=") + 3,
                row.indexOf(",MEMORY_ROM"));
        int tempMemoryRom = Integer.parseInt(row.substring(row.indexOf("MEMORY_ROM=") + 11,
                row.indexOf(",SYSTEM_MEMORY")));
        int tempSystemMemory = Integer.parseInt(row.substring(row.indexOf("SYSTEM_MEMORY=") + 14,
                row.indexOf(",CPU")));
        double tempCpu = Double.parseDouble(row.substring(row.indexOf("CPU=") + 4,
                row.indexOf(",DISPLAY_INCHES")));
        int tempDisplayInches = Integer.parseInt(row.substring(row.indexOf("DISPLAY_INCHES=") + 15));

        itemsList.add(new Laptop(tempBatteryCapacity, tempOs, tempMemoryRom, tempSystemMemory,
                tempCpu, tempDisplayInches));
    }

    private void addOven(String row) {
        int tempPowerConsumption = Integer.parseInt(row.substring(row.indexOf("POWER_CONSUMPTION=") + 18,
                row.indexOf(",WEIGHT")));
        int tempWeight = Integer.parseInt(row.substring(row.indexOf("WEIGHT=") + 7,
                row.indexOf(",CAPACITY")));
        int tempCapacity = Integer.parseInt(row.substring(row.indexOf("CAPACITY=") + 9,
                row.indexOf(",DEPTH")));
        int tempDepth = Integer.parseInt(row.substring(row.indexOf("DEPTH=") + 6,
                row.indexOf(",HEIGHT")));
        double tempHeight = Double.parseDouble(row.substring(row.indexOf("HEIGHT=") + 7,
                row.indexOf(",WIDTH")));
        double tempWidth = Double.parseDouble(row.substring(row.indexOf("WIDTH=") + 6));

        itemsList.add(new Oven(tempPowerConsumption, tempWeight, tempCapacity, tempDepth, tempHeight, tempWidth));
    }

    public List<Appliance> getItemsList() {
        return itemsList;
    }

    public void printAppliances() {
        System.out.println("Appliances:");
        for (Appliance appliance : itemsList) {
            System.out.println(appliance);
        }
    }
}
