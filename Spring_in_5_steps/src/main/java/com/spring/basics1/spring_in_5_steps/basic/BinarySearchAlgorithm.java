package com.spring.basics1.spring_in_5_steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchAlgorithm {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

@Autowired 
@Qualifier("quickSort")
private SortAlgorithm quickSortAlgorithm;

@PostConstruct
public void postConstruct() {
	logger.info("PostConstruct");
}

@PreDestroy
public void preDestroy() {
	logger.info("PreDestroy");
}
	
		


	




	public void setSortAlgorithms(SortAlgorithm sortAlgorithms) {
	this.quickSortAlgorithm = sortAlgorithms;
}




	public void sort() {
		quickSortAlgorithm.execute();
	}
}
