package beans;

public class Car {
	 
	private String carName;
	private Engine engine;
	
	public Car(){}
	public Car(Engine engine){
		System.out.println("constructor");
		this.engine=engine;
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
	
	//comment setEngine method while using autowire by constructor
	public void setEngine(Engine engine) {
		System.out.println("setter");
		this.engine = engine;
	}
	
	public void printData(){
		System.out.println("carName= "+ carName);
		System.out.println("carModel= "+engine.getModel());
	}
}
