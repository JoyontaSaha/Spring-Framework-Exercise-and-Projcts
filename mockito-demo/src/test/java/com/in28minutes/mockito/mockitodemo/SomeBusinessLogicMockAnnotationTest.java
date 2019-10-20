package com.in28minutes.mockito.mockitodemo;


	import static org.junit.Assert.assertEquals;
	import static org.mockito.Mockito.when;

	import org.junit.Test;
	import org.junit.runner.RunWith;
	import org.mockito.InjectMocks;
	import org.mockito.Mock;
	import org.mockito.junit.MockitoJUnitRunner;

	@RunWith(MockitoJUnitRunner.class)
	public class SomeBusinessLogicMockAnnotationTest {

		@Mock
		DataService dataServiceMock; 

		@InjectMocks
		SomeBusinessLogicImpl businessImpl;

		@Test
		public void testFindTheGreatestFromAllData() {
			when(dataServiceMock.retriveAllData()).thenReturn(new int[] { 24, 15, 3 });
			assertEquals(24, businessImpl.findGreatestFromAllData());
		}

		@Test
		public void testFindTheGreatestFromAllData_ForOneValue() {
			when(dataServiceMock.retriveAllData()).thenReturn(new int[] { 15 });
			assertEquals(15, businessImpl.findGreatestFromAllData());
		}

		@Test
		public void testFindTheGreatestFromAllData_NoValues() {
			when(dataServiceMock.retriveAllData()).thenReturn(new int[] {});
			assertEquals(Integer.MIN_VALUE, businessImpl.findGreatestFromAllData());
		}
	}