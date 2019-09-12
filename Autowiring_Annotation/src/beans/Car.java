package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	 
	//private String carName;

	private Engine engine2;
	
	//public Car(){}
	@Autowired
	//@Qualifier("engine")  not allowed
	public Car(Engine engine){
		System.out.println("constructor");
		this.engine2=engine;
	}
	/*public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}*/
	public Engine getEngine() {
		return engine2;
	}
	
	//comment setEngine method while using autowire by constructor
	@Autowired
	@Qualifier("engine")
	public void setEngine(Engine engine2) {
		System.out.println("setter");
		this.engine2 = engine2;
	}
	
	public void printData(){
		//System.out.println("carName= "+ carName);
		System.out.println("carModel= "+engine2.getModel());
	}
}