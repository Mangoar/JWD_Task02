package com.company.jwd.main;

import com.company.jwd.entity.Appliance;

import java.util.List;

public class PrintApplianceInfo {

    public static void print(List<Appliance> appliances) {
        if (appliances == null) {
            System.out.println("There is no such devices in stock!\n");
        } else if (appliances.size() == 0) {
            System.out.println("There is no devices with entered search criterias in stock!\n");
        } else {
            System.out.println("Result of search by entered criterias: ");
            for (Appliance appliance : appliances) {
                System.out.println(appliance);
            }
        }
        // you may add your own code here

    }

    // you may add your own code here

}
