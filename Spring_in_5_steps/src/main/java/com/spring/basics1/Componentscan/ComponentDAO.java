package com.spring.basics1.Componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.spring.basics1.spring_in_5_steps.scope.JdbcConnection;

@Repository
public class ComponentDAO {
	@Autowired
	ComponentJdbcConnection componentJdbcConnection;

	public ComponentJdbcConnection getJdcbConnection() {
		return componentJdbcConnection;
	}

	public void setJdcbConnection(ComponentJdbcConnection componentJdbcConnection) {
		this.componentJdbcConnection = componentJdbcConnection;
	}

}
