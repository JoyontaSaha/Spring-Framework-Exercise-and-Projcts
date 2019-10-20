package com.spring.basics1.spring_in_5_steps.scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class PersonDAO {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	JdbcConnection jdcbConnection;

	public JdbcConnection getJdcbConnection() {
		return jdcbConnection;
	}

	public void setJdcbConnection(JdbcConnection jdcbConnection) {
		this.jdcbConnection = jdcbConnection;
	}
	@PostConstruct
	public void postDestroy() {
		logger.info("PostDestroy");
	}

	@PreDestroy
	public void preDestroy() {
		logger.info("PreDestroy");
	}

}
