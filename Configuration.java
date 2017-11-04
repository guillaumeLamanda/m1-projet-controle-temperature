package suivi;

public class Configuration {

	private boolean userTemp;
	
	
	
	public Configuration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Configuration(boolean userTemp) {
		super();
		this.userTemp = userTemp;
	}

	public String type() {
		if (getUserTemp()== true) return "Celsius";
		else return "Fahrenheit";
		
	}

	public boolean getUserTemp() {
		return userTemp;
	}

	public void setUserTemp(boolean userTemp) {
		this.userTemp = userTemp;
	}
	
}
