package com.spring.student;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class StuentPrePostProcessor {

	@PostConstruct
	public void init() {
		System.out.println("StuentPrePostProcessor init() method");
	}

	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("StuentPrePostProcessor destroy() method");
	}
}
