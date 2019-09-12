package beans;

import org.springframework.beans.factory.annotation.Required;

public class Car {
	private String carName;
	private String carName1;
	
	
	public String getCarName1() {
		return carName1;
	}
	@Required
	public void setCarName1(String carName1) {
		this.carName1 = carName1;
	}

	private Engine engine;
	
	public Car(){
		System.out.println("instance of Car created");
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void printCarDetails(){
		System.out.println("car name="+ carName);
		System.out.println("car model="+ engine.getModel());

	}
}
