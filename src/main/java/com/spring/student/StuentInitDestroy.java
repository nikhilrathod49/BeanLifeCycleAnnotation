package com.spring.student;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class StuentInitDestroy implements InitializingBean, DisposableBean {

	public void destroy() throws Exception {
		 System.out.println("StuentInitDestroy destroy()");
	}

	public void afterPropertiesSet() throws Exception {
		 System.out.println("StuentInitDestroy afterPropertiesSet()");
	}

}
