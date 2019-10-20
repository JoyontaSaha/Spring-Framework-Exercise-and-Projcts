package com.in28minutes.mockito.mockitodemo;

public class SomeBusinessLogicImpl {
	DataService dataService;
	
	public SomeBusinessLogicImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	int findGreatestFromAllData () {
		int[] data = dataService.retriveAllData();
		
		int greatest = Integer.MIN_VALUE;
		
		for (int value : data) {
			if(value > greatest) {
				greatest = value;
			}
		}
		
		return greatest;
	}

}
