package com;

public abstract class AbstractCar {
	public Engine print() {
		Engine e = new Engine();
		e.setName("abstractNormal");
		return e;
	}
}
