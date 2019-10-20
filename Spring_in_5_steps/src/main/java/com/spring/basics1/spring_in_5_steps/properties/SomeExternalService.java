package com.spring.basics1.spring_in_5_steps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class SomeExternalService {
	@Value("${external.service.url}")
	private String url;
	
	public String returnServiceURL() {
		return url;
	}

}
