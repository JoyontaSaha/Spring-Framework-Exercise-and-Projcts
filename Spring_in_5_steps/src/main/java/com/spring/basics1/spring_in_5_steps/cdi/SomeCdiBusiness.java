package com.spring.basics1.spring_in_5_steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {
	@Inject
	SomeCdiDao cdiDao;

	public SomeCdiDao getCdiDao() {
		return cdiDao;
	}

	public void setCdiDao(SomeCdiDao cdiDao) {
		this.cdiDao = cdiDao;
	}
	
	
}
