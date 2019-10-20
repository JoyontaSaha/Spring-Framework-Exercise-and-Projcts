package com.junit_in_5_steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyMathTest {
	MyMath myMath = new MyMath();
	
	@BeforeAll
	public static void beforeClass() {
		System.out.println("BeforeClass");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("BeforeEach");
	}
	
	
	@Test
	public void sumWith3Numbers() {
		System.out.println("Test1");
		assertEquals(6, myMath.sum(new int[] {1, 2, 3}));		
	}
	
	@Test
	public void sumWith1Numbers() {
		System.out.println("Test2");
		assertEquals(3, myMath.sum(new int[] {3}));		
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("AfterEach");
	}
	
	@AfterAll
	public static void afterClass() {
		System.out.println("AfterClass");
	}
	

}
