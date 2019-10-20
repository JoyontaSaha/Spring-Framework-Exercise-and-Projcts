package com.spring.basics1.spring_in_5_steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
@Primary
@Qualifier("bubbleSort")
public class BubbleSortAlgorithm implements SortAlgorithm{

	@Override
	public void execute() {
		System.out.println("BubbleSorting");
		
	}

}
