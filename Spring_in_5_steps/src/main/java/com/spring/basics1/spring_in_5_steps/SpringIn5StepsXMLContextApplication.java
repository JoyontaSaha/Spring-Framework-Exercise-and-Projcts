package com.spring.basics1.spring_in_5_steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import xml.XmlPersonDAO;

public class SpringIn5StepsXMLContextApplication {
	
	// Spring framework asks
	  // What are the beans? @Component
	 // What are the dependencies of a bean? @Autowired
	// Where to search for beans? @SpringBootApplication ..package and subpackages
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXMLContextApplication.class);
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);
			
			LOGGER.info("Beans Loaded -> {}", (Object)applicationContext.getBeanDefinitionNames());
			// [xmlJdbcConnection, xmlPersonDAO]
			LOGGER.info("{}", xmlPersonDAO);
			LOGGER.info("{}", xmlPersonDAO.getXmlJdbcConnection());
			
		}
	}

}
