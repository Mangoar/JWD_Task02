package com.company.jwd.main;

import com.company.jwd.entity.Appliance;
import com.company.jwd.entity.criteria.Criteria;
import com.company.jwd.service.ApplianceService;
import com.company.jwd.service.ServiceFactory;
import com.company.jwd.entity.criteria.SearchCriteria;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Appliance> result;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //////////////////////////////////////////////////////////////////
/*
		Criteria criteriaOven = new Criteria(SearchCriteria.Oven.class.getSimpleName());//"Oven"
		criteriaOven.add(SearchCriteria.Oven.CAPACITY.toString(), 33);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(SearchCriteria.Oven.class.getSimpleName());
		criteriaOven.add(SearchCriteria.Oven.CAPACITY.toString(), 33);
		criteriaOven.add(SearchCriteria.Oven.DEPTH.toString(), 60);

		result = service.find(criteriaOven);

		PrintApplianceInfo.print(result);

		//////////////////////////////////////////////////////////////////

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria(SearchCriteria.Oven.class.getSimpleName());
		criteriaOven.add(SearchCriteria.Oven.HEIGHT.toString(), 200);
		criteriaOven.add(SearchCriteria.Oven.DEPTH.toString(), 300);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);
*/
        //////////////////////////////////////////////////////////////////

        Criteria criteriaTabletPC = new Criteria(SearchCriteria.TabletPC.class.getSimpleName());
        criteriaTabletPC.add(SearchCriteria.TabletPC.COLOR.toString(), "BLUE");
        //criteriaTabletPC.add(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), 14);
        criteriaTabletPC.add(SearchCriteria.TabletPC.MEMORY_ROM.toString(), 8000);

        result = service.find(criteriaTabletPC);// find(Object...obj)

        PrintApplianceInfo.print(result);

    }

}
