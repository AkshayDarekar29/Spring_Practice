package com;

import org.springframework.beans.factory.FactoryBean;

public class FactoryClass implements FactoryBean<Object>{
	private String carName;

	public void setCarName(String carName) {
		this.carName = carName;
	}
	@Override
	public Car getObject() throws Exception {
		if(carName.equals("Swift")){
			return new Swift();
		}
		return null;
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
	
}
