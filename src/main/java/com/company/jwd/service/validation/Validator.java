package com.company.jwd.service.validation;

import com.company.jwd.entity.criteria.Criteria;
import com.company.jwd.entity.criteria.SearchCriteria;

import java.util.Map;

public class Validator {

    public static boolean criteriaValidator(Criteria criteria) {
        String criteriaGroup = criteria.getGroupSearchName();
        switch (criteriaGroup) {
            case "Oven": {
                return isOvenCriteriaValid(criteria);
            }
            case "Laptop": {
                return isLaptopCriteriaValid(criteria);
            }
            case "Refrigerator": {
                return isRefrigeratorCriteriaValid(criteria);
            }
            case "Speakers": {
                return isSpeakersCriteriaValid(criteria);
            }
            case "TabletPC": {
                return isTabletPCCriteriaValid(criteria);
            }
            case "VacuumCleaner": {
                return isVacuumCleanerCriteriaValid(criteria);
            }
        }
        return false;
    }

    public static boolean isOvenCriteriaValid(Criteria criteria) {
        for (Map.Entry<String, Object> criteria_list_item : criteria.getCriteria().entrySet()) {
            try {
                if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.Oven.POWER_CONSUMPTION.toString())) {
                    if (Integer.parseInt(criteria_list_item.getValue().toString()) < 0) {
                        return false;
                    }
                } else if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.Oven.WEIGHT.toString())) {
                    if (Integer.parseInt(criteria_list_item.getValue().toString()) < 0) {
                        return false;
                    }
                } else if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.Oven.CAPACITY.toString())) {
                    if (Integer.parseInt(criteria_list_item.getValue().toString()) < 0) {
                        return false;
                    }
                } else if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.Oven.DEPTH.toString())) {
                    if (Integer.parseInt(criteria_list_item.getValue().toString()) < 0) {
                        return false;
                    }
                } else if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.Oven.HEIGHT.toString())) {
                    if (Double.parseDouble(criteria_list_item.getValue().toString()) < 0) {
                        return false;
                    }
                } else if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.Oven.WIDTH.toString())) {
                    if (Double.parseDouble(criteria_list_item.getValue().toString()) < 0) {
                        return false;
                    }
                } else {
                    return false;
                }
            } catch (Exception e) {
                System.out.println("Something wrong with your criterias!");
                return false;
            }
        }
        return true;
    }

    public static boolean isLaptopCriteriaValid(Criteria criteria) {
        for (Map.Entry<String, Object> criteria_list_item : criteria.getCriteria().entrySet()) {
            try {
                if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.Laptop.BATTERY_CAPACITY.toString())) {
                    if (Double.parseDouble(criteria_list_item.getValue().toString()) < 0) {
                        return false;
                    }
                } else if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.Laptop.OS.toString())) {
                    if (!criteria_list_item.getValue().toString().equalsIgnoreCase("Linux") ||
                            !criteria_list_item.getValue().toString().equalsIgnoreCase("Windows")) {
                        return false;
                    }
                } else if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.Laptop.MEMORY_ROM.toString())) {
                    if (Integer.parseInt(criteria_list_item.getValue().toString()) < 0) {
                        return false;
                    }
                } else if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.Laptop.SYSTEM_MEMORY.toString())) {
                    if (Integer.parseInt(criteria_list_item.getValue().toString()) < 0) {
                        return false;
                    }
                } else if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.Laptop.CPU.toString())) {
                    if (Double.parseDouble(criteria_list_item.getValue().toString()) < 0) {
                        return false;
                    }
                } else if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.Laptop.DISPLAY_INCHS.toString())) {
                    if (Integer.parseInt(criteria_list_item.getValue().toString()) < 0) {
                        return false;
                    }
                } else {
                    return false;
                }
            } catch (Exception e) {
                System.out.println("Something wrong with your criterias!");
                return false;
            }
        }
        return true;
    }

    public static boolean isRefrigeratorCriteriaValid(Criteria criteria) {
        for (Map.Entry<String, Object> criteria_list_item : criteria.getCriteria().entrySet()) {
            try {
                if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString())) {
                    if (Integer.parseInt(criteria_list_item.getValue().toString()) < 0) {
                        return false;
                    }
                } else if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.Refrigerator.WEIGHT.toString())) {
                    if (Integer.parseInt(criteria_list_item.getValue().toString()) < 0) {
                        return false;
                    }
                } else if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString())) {
                    if (Integer.parseInt(criteria_list_item.getValue().toString()) < 0) {
                        return false;
                    }
                } else if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString())) {
                    if (Double.parseDouble(criteria_list_item.getValue().toString()) < 0) {
                        return false;
                    }
                } else if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.Refrigerator.HEIGHT.toString())) {
                    if (Double.parseDouble(criteria_list_item.getValue().toString()) < 0) {
                        return false;
                    }
                } else if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.Refrigerator.WIDTH.toString())) {
                    if (Double.parseDouble(criteria_list_item.getValue().toString()) < 0) {
                        return false;
                    }
                } else {
                    return false;
                }
            } catch (Exception e) {
                System.out.println("Something wrong with your criterias!");
                return false;
            }
        }
        return true;
    }

    public static boolean isSpeakersCriteriaValid(Criteria criteria) {
        for (Map.Entry<String, Object> criteria_list_item : criteria.getCriteria().entrySet()) {
            try {
                if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.Speakers.POWER_CONSUMPTION.toString())) {
                    if (Integer.parseInt(criteria_list_item.getValue().toString()) < 0) {
                        return false;
                    }
                } else if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString())) {
                    if (Integer.parseInt(criteria_list_item.getValue().toString()) < 0) {
                        return false;
                    }
                } else if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.Speakers.FREQUENCY_RANGE.toString())) {
                    double min = Double.parseDouble(criteria_list_item.getValue().toString().substring(0, criteria_list_item.getValue().toString().lastIndexOf("-")));
                    double max = Double.parseDouble(criteria_list_item.getValue().toString().substring(criteria_list_item.getValue().toString().lastIndexOf("-") + 1));
                    if (min < 0 || min > max) {
                        return false;
                    }
                } else if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.Speakers.CORD_LENGTH.toString())) {
                    if (Integer.parseInt(criteria_list_item.getValue().toString()) < 0) {
                        return false;
                    }
                } else {
                    return false;
                }
            } catch (Exception e) {
                System.out.println("Something wrong with your criterias!");
                return false;
            }
        }
        return true;
    }

    public static boolean isTabletPCCriteriaValid(Criteria criteria) {
        for (Map.Entry<String, Object> criteria_list_item : criteria.getCriteria().entrySet()) {
            try {
                if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString())) {
                    if (Integer.parseInt(criteria_list_item.getValue().toString()) < 0) {
                        return false;
                    }
                } else if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.TabletPC.DISPLAY_INCHES.toString())) {
                    if (Integer.parseInt(criteria_list_item.getValue().toString()) < 0) {
                        return false;
                    }
                } else if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.TabletPC.MEMORY_ROM.toString())) {
                    if (Integer.parseInt(criteria_list_item.getValue().toString()) < 0) {
                        return false;
                    }
                } else if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString())) {
                    if (Integer.parseInt(criteria_list_item.getValue().toString()) < 0) {
                        return false;
                    }
                } else if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.TabletPC.COLOR.toString())) {
                    if (criteria_list_item.getValue().toString().isEmpty()) {
                        return false;
                    }
                } else {
                    return false;
                }
            } catch (Exception e) {
                System.out.println("Something wrong with your criterias!");
                return false;
            }
        }
        return true;
    }

    public static boolean isVacuumCleanerCriteriaValid(Criteria criteria) {
        for (Map.Entry<String, Object> criteria_list_item : criteria.getCriteria().entrySet()) {
            try {
                if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString())) {
                    if (Integer.parseInt(criteria_list_item.getValue().toString()) < 0) {
                        return false;
                    }
                } else if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString())) {
                    if (criteria_list_item.getValue().toString().isEmpty()) {
                        return false;
                    }
                } else if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.VacuumCleaner.BAG_TYPE.toString())) {
                    if (criteria_list_item.getValue().toString().isEmpty()) {
                        return false;
                    }
                } else if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.VacuumCleaner.WAND_TYPE.toString())) {
                    if (criteria_list_item.getValue().toString().isEmpty()) {
                        return false;
                    }
                } else if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString())) {
                    if (Integer.parseInt(criteria_list_item.getValue().toString()) < 0) {
                        return false;
                    }
                } else if (criteria_list_item.getKey().equalsIgnoreCase(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString())) {
                    if (Integer.parseInt(criteria_list_item.getValue().toString()) < 0) {
                        return false;
                    }
                } else {
                    return false;
                }
            } catch (Exception e) {
                System.out.println("Something wrong with your criterias!");
                return false;
            }
        }
        return true;
    }

}

//you may add your own new classes