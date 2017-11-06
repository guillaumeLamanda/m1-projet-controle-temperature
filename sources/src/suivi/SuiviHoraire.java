package suivi;

public class SuiviHoraire {
	
	protected double temperatureMesuree = -50.0;
	
	public SuiviHoraire() {
	}
		
	public double LireTemperature() {
		return temperatureMesuree;
	}

	public void AjoutNouvelleMesure(double uneTemperature) {
		temperatureMesuree = uneTemperature;
	}
}
