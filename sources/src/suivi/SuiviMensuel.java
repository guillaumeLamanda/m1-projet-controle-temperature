package suivi;

import java.util.ArrayList;
import java.util.List;

public class SuiviMensuel {
	
	protected List<SuiviJournalier> lesJours;
	
	public SuiviMensuel() {
		lesJours = new ArrayList<SuiviJournalier>();
		lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());
		lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());
		lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());
		lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());
		lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());
		lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());
		lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());
		lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());
		lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());
		lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());
		lesJours.add(new SuiviJournalier());
	}

	public double LireTemperature(int jour, int heure) {
		return lesJours.get(jour).LireTemperature(heure);
	}

	public void AjoutNouvelleMesure(int jour, int heure, double uneTemperature) {
		lesJours.get(jour).AjoutNouvelleMesure(heure, uneTemperature);
	}
}
