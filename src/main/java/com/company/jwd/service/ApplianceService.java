package com.company.jwd.service;

import com.company.jwd.entity.Appliance;
import com.company.jwd.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceService {	
	
	List<Appliance> find(Criteria criteria);
	
}
