package suivi;

import java.util.ArrayList;
import java.util.List;

public class SuiviAnnuel {
	
	protected List<SuiviMensuel> lesMois;
	
	public SuiviAnnuel() {
		lesMois = new ArrayList<SuiviMensuel>();
		lesMois.add(new SuiviMensuel());lesMois.add(new SuiviMensuel());lesMois.add(new SuiviMensuel());
		lesMois.add(new SuiviMensuel());lesMois.add(new SuiviMensuel());lesMois.add(new SuiviMensuel());
		lesMois.add(new SuiviMensuel());lesMois.add(new SuiviMensuel());lesMois.add(new SuiviMensuel());
		lesMois.add(new SuiviMensuel());lesMois.add(new SuiviMensuel());lesMois.add(new SuiviMensuel());
	}

	public double LireTemperature(int mois, int jour, int heure) {
		return lesMois.get(mois).LireTemperature(jour,heure);
	}

	public void AjoutNouvelleMesure(int mois, int jour, int heure,double uneTemperature) {
		lesMois.get(mois).AjoutNouvelleMesure(jour, heure, uneTemperature);
	}
}
