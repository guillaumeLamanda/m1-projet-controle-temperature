package suivi;

import java.util.HashMap;
import java.util.Map;

public class SuiviChauffage {
	
	protected Map<Integer, SuiviAnnuel> lesAnnees = new HashMap<>();
	
	public SuiviChauffage() {
	}

	public double LireTemperature(int annee, int mois, int jour, int heure) {
		return lesAnnees.get(annee).LireTemperature(mois,jour,heure);
	}

	public void AjoutNouvelleMesure(int annee, int mois, int jour, int heure,double uneTemperature) {
		if (lesAnnees.get(annee)==null) {
			SuiviAnnuel unSuiviAnnuel = new SuiviAnnuel();
			lesAnnees.put(annee, unSuiviAnnuel);
		}
		lesAnnees.get(annee).AjoutNouvelleMesure(mois, jour, heure, uneTemperature);
	}
}
