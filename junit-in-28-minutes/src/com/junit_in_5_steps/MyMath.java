package com.junit_in_5_steps;

public class MyMath {
	int sum (int[] numbers) {
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		
		return sum;
	}

}
