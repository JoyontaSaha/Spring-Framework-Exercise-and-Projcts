package com.spring.basics1.spring_in_5_steps.basic;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("quickSort")
public class QuickSortAlgorithm implements SortAlgorithm{

	@Override
	public void execute() {
		System.out.println("QuickSorting");
		
	}

}
