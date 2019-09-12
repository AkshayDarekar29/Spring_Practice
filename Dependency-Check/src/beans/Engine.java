package beans;

public class Engine {
	private String model;
	public Engine(){
		System.out.println("instance of Engine created");
	}
	public String getModel(){
		return model;
	}
	public void setModel(String model){
		this.model=model;
	}

}
