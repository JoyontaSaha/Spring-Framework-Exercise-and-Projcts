package com.spring.basics1.spring_in_5_steps.cdi;

import javax.inject.Named;

@Named
public class SomeCdiDao {

	public SomeCdiDao() {
		super();
		System.out.println("SomeCdiDao");
	}
	
}
