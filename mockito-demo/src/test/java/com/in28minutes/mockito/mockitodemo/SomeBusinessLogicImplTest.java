package com.in28minutes.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SomeBusinessLogicImplTest {
	
	
	@Test
	void findGreatestFromAllDataTest() {
		SomeBusinessLogicImpl sImpl = new SomeBusinessLogicImpl(new DataServiceStub());
		int result = sImpl.findGreatestFromAllData(); 
		assertEquals(26, result);
		
	}

}

class DataServiceStub implements DataService {

	@Override
	public int[] retriveAllData() {
		// TODO Auto-generated method stub
		return new int[] {26, 5, 3};
	}
	
}