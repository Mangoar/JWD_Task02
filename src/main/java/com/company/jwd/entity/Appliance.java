package com.company.jwd.entity;

import java.util.HashMap;
import java.util.Map;

public class Appliance {
    // you may add your own code here
    private String applianceType;

    public Appliance(String applianceType) {
        this.applianceType = applianceType;
    }

    public String getApplianceType() {
        return applianceType;
    }

    public void setApplianceType(String applianceType) {
        this.applianceType = applianceType;
    }

    public Map<String, Object> ConvertToCriteria() {
        return new HashMap<>();
    }
}
