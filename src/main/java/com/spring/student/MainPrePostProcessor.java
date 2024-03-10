package com.spring.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

@Configuration
@ComponentScan(basePackages = "com.spring.student")
public class MainPrePostProcessor {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MainPrePostProcessor.class);
		StuentPrePostProcessor student = context.getBean(StuentPrePostProcessor.class);
		((AbstractApplicationContext) context).close();
	}
}