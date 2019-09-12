package com;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {

	@PreDestroy
	public void myDestroy() {
		System.out.println("ddestroying student bean");
	}
	@PostConstruct
	public void myInit() throws Exception {
		System.out.println("Initializing student bean");		
	}
	
}
