package com.spring.student;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	// Get Bean by Type
//	@Bean
//	public Student getStuent() {
//		return new Student();
//	}

	@Bean(name = "StudentByName")
	public Student getStuentByName() {
		return new Student();
	}
}
