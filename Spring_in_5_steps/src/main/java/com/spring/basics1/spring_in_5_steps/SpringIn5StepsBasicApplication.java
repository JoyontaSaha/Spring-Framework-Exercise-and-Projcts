package com.spring.basics1.spring_in_5_steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.basics1.spring_in_5_steps.basic.BinarySearchAlgorithm;

@Configuration
@ComponentScan
public class SpringIn5StepsBasicApplication {
	
	// Spring framework asks
	  // What are the beans? @Component
	 // What are the dependencies of a bean? @Autowired
	// Where to search for beans? @SpringBootApplication ..package and subpackages

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class);
		BinarySearchAlgorithm bs = applicationContext.getBean(BinarySearchAlgorithm.class);
		BinarySearchAlgorithm bs1 = applicationContext.getBean(BinarySearchAlgorithm.class);
		System.out.println(bs);
		System.out.println(bs1);
//		BinarySearchAlgorithm bs = new BinarySearchAlgorithm(new BubbleSortAlgorithm());
//		BinarySearchAlgorithm bs = new BinarySearchAlgorithm(new QuickSortAlgorithms());
		bs.sort();
		
		applicationContext.close();
	}

}
