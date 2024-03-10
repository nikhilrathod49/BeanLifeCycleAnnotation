package com.spring.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

@Configuration
@ComponentScan(basePackages = "com.spring.student")
public class MainInitDestroy {
	public static void main(String[] args) {
		
		// init
		ApplicationContext context = new AnnotationConfigApplicationContext(MainInitDestroy.class);
	
		// Business functionality
		Student student = context.getBean(Student.class);
		student.learnSomething();
		
		// destroy
		((AbstractApplicationContext) context).close();
	}
}