package beans;

public class Student {
	private String[] hobbies;
	private Girlfriend[] gf;
	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	
	public void displayHobbies(){
		for (String string : hobbies) {
			System.out.println(string);
		}
	}
		public Girlfriend[] getGf() {
		return gf;
	}

	public void setGf(Girlfriend[] gf) {
		this.gf = gf;
	}

	public void displayGFList(){
		for (Girlfriend string : gf) {
			System.out.println(string.getGfName());
		}
	}
}
