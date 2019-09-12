package com;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean{

	@Override
	public void destroy() throws Exception {
		System.out.println("ddestroying student bean");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing student bean");		
	}
	
}
