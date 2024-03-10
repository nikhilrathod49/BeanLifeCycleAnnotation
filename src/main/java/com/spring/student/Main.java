package com.spring.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.student")
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
	//	Student student = context.getBean(Student.class);
	//	student.learnSomething();
		
		Student student1 = (Student) context.getBean("StudentByName");
		student1.learnSomething();
	}
}