package com.spring.basics1.spring_in_5_steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.spring.basics1.spring_in_5_steps.basic.BinarySearchAlgorithm;
import com.spring.basics1.spring_in_5_steps.properties.SomeExternalService;

@Configuration
@ComponentScan
//
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

	// Spring framework asks
	// What are the beans? @Component
	// What are the dependencies of a bean? @Autowired
	// Where to search for beans? @SpringBootApplication ..package and subpackages

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsPropertiesApplication.class)) {
			SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
			
			System.out.println(service.returnServiceURL());

		}
	}

}
