package com.spring.basics1.spring_in_5_steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.basics1.spring_in_5_steps.scope.PersonDAO;

@Configuration
@ComponentScan
public class SpringIn5StepsScopeApplication {
	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext =  new AnnotationConfigApplicationContext(SpringIn5StepsScopeApplication.class);
		PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
		
		
		LOGGER.info("{}", personDAO1);
		LOGGER.info("{}", personDAO1.getJdcbConnection());
		
		LOGGER.info("{}", personDAO2);
		LOGGER.info("{}", personDAO1.getJdcbConnection());
		
		
		applicationContext.close();
	}

}
