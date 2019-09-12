package beans;

public class Engine {
	private String model;
	public Engine(String model){
		System.out.println("instance of Engine created");
		this.model=model;
	}
	public String getModel(){
		return model;
	}
	public void setModel(String model){
		this.model=model;
	}

}
