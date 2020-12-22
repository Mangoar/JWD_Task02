package com.company.jwd.dao;

import com.company.jwd.entity.Appliance;
import com.company.jwd.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceDAO {
	List<Appliance> find(Criteria criteria);
}
