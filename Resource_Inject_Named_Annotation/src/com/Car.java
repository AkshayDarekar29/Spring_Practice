package com;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class Car {
	
	//@Resource
	@Inject
	private Engine engine;
	public void printCarDetails(){
		System.out.println("car model="+ engine.getModel());

	}
}
