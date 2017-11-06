package suivi;

public class APISuivi {
	
	
	
	public double lireTemperature(int annee, int mois, int jour, int heure,String unite) {
		
		double Temperature=new SuiviChauffage().LireTemperature(annee, mois, jour, heure);
		return conversion(Temperature,unite);
	}
	
	public double conversion(double temp,String unite) {
		double conv=temp;
		if(unite=="Celius")
			conv+=273.15;
		else if (unite=="Fahrenheit")
			conv= conv * 9/5 - 459.67;
		
		return conv;
	}
	
	public void AjoutNouvelleMesure(int annee, int mois, int jour, int heure,double uneTemperature) {
		
		
	}

}
