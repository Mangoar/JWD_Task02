package com.company.jwd.service.impl;

import com.company.jwd.dao.ApplianceDAO;
import com.company.jwd.dao.DAOFactory;
import com.company.jwd.entity.Appliance;
import com.company.jwd.entity.criteria.Criteria;
import com.company.jwd.service.ApplianceService;
import com.company.jwd.service.validation.Validator;

import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {

    @Override
    public List<Appliance> find(Criteria criteria) {
        if (!Validator.criteriaValidator(criteria)) {
            System.out.println("You've entered bad criterias for search!");
            return null;
        }

        DAOFactory factory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = factory.getApplianceDAO();

        List<Appliance> appliances = applianceDAO.find(criteria);

        // you may add your own code here

        return appliances;
    }

}

//you may add your own new classes
