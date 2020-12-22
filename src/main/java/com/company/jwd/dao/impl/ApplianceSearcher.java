package com.company.jwd.dao.impl;

import com.company.jwd.entity.Appliance;
import com.company.jwd.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ApplianceSearcher {

    private List<Appliance> resultList;

    public ApplianceSearcher() {
        resultList = new ArrayList<>();
    }

    public List<Appliance> search(List<Appliance> applianceList, Criteria criteria) {
        String criteriaGroup = criteria.getGroupSearchName();

        List<Appliance> itemGroupList = new ArrayList<>();
        for (Appliance appliance : applianceList) {
            if (criteriaGroup.equalsIgnoreCase(appliance.getApplianceType())) {
                itemGroupList.add(appliance);
            }
        }

        for (Appliance appliance : itemGroupList) {
            if (compare(criteria.getCriteria(), appliance.ConvertToCriteria())) {
                resultList.add(appliance);
            }
        }

        return resultList;
    }

    public boolean compare(Map<String, Object> criteria, Map<String, Object> item) {
        for (Map.Entry<String, Object> criteriaProperty : criteria.entrySet()) {
            for (Map.Entry<String, Object> itemProperty : item.entrySet()) {
                if (criteriaProperty.getKey().equalsIgnoreCase(itemProperty.getKey()) &&
                        !criteriaProperty.getValue().toString().equalsIgnoreCase(itemProperty.getValue().toString())) {
                    return false;
                }
            }
        }
        return true;
    }
}
