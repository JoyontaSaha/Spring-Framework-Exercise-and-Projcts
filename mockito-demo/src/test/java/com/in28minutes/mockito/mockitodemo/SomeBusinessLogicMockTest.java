package com.in28minutes.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

class SomeBusinessLogicMockTest {

	@Test
	void findGreatestFromAllDataTest() {
		DataService dataServiceMock = Mockito.mock(DataService.class);
		 Mockito.when(dataServiceMock.retriveAllData()).thenReturn(new int[] {25, 8, 5});
		 
		SomeBusinessLogicImpl sImpl = new SomeBusinessLogicImpl(dataServiceMock);
		int result = sImpl.findGreatestFromAllData(); 
		assertEquals(25, result);
		
	}
	
	@Test
	void findGreatestFromAllDataTest2() {
		DataService dataServiceMock = Mockito.mock(DataService.class);
		 Mockito.when(dataServiceMock.retriveAllData()).thenReturn(new int[] {5});
		 
		SomeBusinessLogicImpl sImpl = new SomeBusinessLogicImpl(dataServiceMock);
		int result = sImpl.findGreatestFromAllData(); 
		assertEquals(5, result);
		
	}

}
