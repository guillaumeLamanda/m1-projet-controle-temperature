package suivi;

import java.util.ArrayList;
import java.util.List;

public class SuiviJournalier {
	
	protected List<SuiviHoraire> lesHeures;
	
	public SuiviJournalier() {
		lesHeures = new ArrayList<SuiviHoraire>();
		lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());
		lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());
		lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());
		lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());
		lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());
		lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());
		lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());
		lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());
	}

	public double LireTemperature(int heure) {
		return lesHeures.get(heure).LireTemperature();
	}

	public void AjoutNouvelleMesure(int heure, double uneTemperature) {
		lesHeures.get(heure).AjoutNouvelleMesure(uneTemperature);
	}
}
