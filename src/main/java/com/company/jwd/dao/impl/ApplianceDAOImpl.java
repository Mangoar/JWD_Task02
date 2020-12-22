package com.company.jwd.dao.impl;

import com.company.jwd.dao.ApplianceDAO;
import com.company.jwd.entity.Appliance;
import com.company.jwd.entity.criteria.Criteria;

import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {

    @Override
    public List<Appliance> find(Criteria criteria) {
        // you may add your own code here

        ApplianceDBReader applianceDBReader = new ApplianceDBReader("appliances_db.txt");
        applianceDBReader.readFromDB();
        ApplianceDbRowParser applianceDbRowParser = new ApplianceDbRowParser(applianceDBReader.getStringList());
        applianceDbRowParser.parseRows();
        //applianceDbRowParser.PrintAppliances();
        ApplianceSearcher applianceSearcher = new ApplianceSearcher();
        return applianceSearcher.search(applianceDbRowParser.getItemsList(), criteria);
    }

    // you may add your own code here

}
//you may add your own new classes