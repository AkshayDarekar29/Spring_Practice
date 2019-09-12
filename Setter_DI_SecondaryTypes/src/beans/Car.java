package beans;

public class Car {
	private String carName;
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
