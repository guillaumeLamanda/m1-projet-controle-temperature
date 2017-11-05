# Suivit et contrôle de température : Mise en oeuvre
## L'historique des températures mesurées

### E 3.1 : l'unité de température dépend du pays d'installation

#### Spécification fonctionnelle détaillée :

Les calculs et la sauvegarde de température se font en Kelvin.  
L'unité d'affichage est choisie à l'installation, c'est degré Celsius (°C) Fahrenheit (°F).  
On peut modifier l'unité d'affichage de Celsius <-> Fahrenheit.  
A l'installation, le système demande à choisir le pays d'installation dans une liste déroulante des pays. Tous les pays sont en degré Celsius (°C) sauf aux Etats-Unis, au Bélize et aux Îles caïman  Fahrenheit (°F).  

Auteur : Quentin lechat
Relecteur : Guillaume Lamanda

#### Spécification technique :

On ajoute la classe Configuration :
- Un attribut « userTemp » correspondant à l’unité de température en booléen. Le faux correspond au Celcius et le vrai correspond Fahrenheit (+ getter/setter),
Classe APISuivi : 
- Une méthode « LireTemperature », qui permet de récupérer la température en via la méthode existante « lireTempérature » de la classe SuiviChauffage puis la convertie via la méthode « conversion »,
- Une méthode AjoutNouvelleMesure qui reprend les paramètre de la classe SuiviTemperature.
- Une méthode « conversion » qui permet de convertir la valeur depuis le Kelvin à l’unité de destination choisi par l’utilisateur.  

Autheur : Guillaume Lamanda  
Relecteur : Serge Mel

#### Réalisation : 

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
*****************************************************************************************************************
public class Configuration {

	private boolean userTemp;
	public Configuration() {
		super();
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

Autheur : Zakaria BELGHAZAL
Relecteur : Guillaume LAMANDA


***************************************************************************************************************** 
##### Plan de test :
Test N°1 : 

ce test a pour but de laisser le choix à l’utilisateur de choisir dans la phase l’installation de choisir l’unité de température qui sera soit en Celsius ou Fahrenheit. Pour connaitre les états de la classe Configuration, une condition doit permettre de vérifier la valeur de l’attribut « userTemp».

T1: 

créer un objet de la classe Configuration, choisir Celsius comme valeur de l’attribut userTemp via des , puis comparer le type de la valeur de l’attribut  au booléen false.

T2:  
créer un objet de la classe Configuration, choisir Fahrenheit comme valeur de l’attribut userTemp via des , puis comparer le type de la valeur de l’attribut  au booléen true.

Test N°2 :

Le test consiste à récupérer la température via la classe APISuivi par appel de la méthode LireTemperature qui appelle la méthode LireTemperature de la classe SuiviChauffage. 
De même l’ajout de nouvelle mesure sur la classe APISuivi est faite par la méthode AjoutNouvelleMesure via la méthode AjoutNouvelleMesure de la classe SuiviChauffage.

T2-1 :

Créer un nouvel objet de la classe APISuivi, cette objet appelle sa méthode LireTemperature , puis les températures lues en Kelvin  seront  convertis en Fahrenheit par la méthode Conversion de la classe APISuivi. Vérifier le résultat de la conversion qui est en l’unité Fahrenheit.

T2-2 : 
Créer un nouvel objet de la classe APISuivi, qui appelle sa méthode LireTemperature , puis les températures lues en Kelvin  seront  convertis en Celsius par la méthode Conversion de la classe APISuivi. Vérifier le résultat de la conversion qui est en l’unité Celsius.

T2-3 :

Créer un nouvel objet de la classe APISuivi, qui appelle la méthode AjoutNouvelleMesure , puis faire l’appel de la méthode AjoutNouvelleMesure de la classe  SuiviChauffage. Ensuite il faudra faire  des méthodes LireTemperature  des classes  APISuivi & SuiviChauffage, puis les températures lues en Kelvin  seront  convertis en Celsius par la méthode Conversion de la classe APISuivi et enfin vérifier le résultat de la conversion qui est en l’unité Celsius.

T2-4 :

Créer un nouvel objet de la classe APISuivi, qui appelle la méthode AjoutNouvelleMesure , puis faire l’appel de la méthode AjoutNouvelleMesure de la classe  SuiviChauffage. Ensuite il faudra faire des méthodes LireTemperature  des classes  APISuivi & SuiviChauffage, puis les températures lues en Kelvin  seront  convertis en Fahrenheit par la méthode Conversion de la classe APISuivi et enfin vérifier le résultat de la conversion qui est en l’unité Celsius.

Auteur : Serge MEL
Relecteur : Guillaume LAMANDA

--------------------------

On fait quoi de ca : 

#### Plan de test : 

Test N°1 : 

ce test a pour but de laisser le choix à l’utilisateur de choisir dans la phase l’installation de choisir l’unité de température qui sera soit en Celsius ou Fahrenheit. Pour connaitre les états de la classe Configuration, une condition doit permettre de vérifier la valeur de l’attribut « userTemp».

Si cette valeur de l’attribut correspond au degré Celsius,
  Alors    résultat vaut « false»,
Sinon Si cette valeur de l’attribut correspond au Fahrenheit
  Alors   résultat vaut « vrai». 
  
T1:C=newConfiguration() ;C.Set(userTemperature=Celsius);AssertTrue(C.getuserTemperature==false).
T2:C=newConfiguration() ;C.Set(userTemperature=Fahrenheit);AssertTrue(C.getuserTemperature==true).

Test N°2 :

Le test consiste à récupérer la température via la classe APISuivi par appel de la méthode LireTemperature qui appelle la méthode LireTemperature de la classe SuiviChauffage. 

De même l’ajout de nouvelle mesure sur la classe APISuivi est faite par la méthode AjoutNouvelleMesure via la méthode AjoutNouvelleMesure de la classe SuiviChauffage.

T2-1 :ApiSuivi=new APISuivi() ; ApiSuivi.LireTempérature(temperatureKelvin) ; ApiSuivi.Conversion() ; AssertTrue(ApiSuivi.LireTempérature(temperatureFahrenheit)) ;

T2-2 :ApiSuivi=new APISuivi() ; ApiSuivi.LireTempérature(temperatureKelvin) ; ApiSuivi.Conversion() ; AssertTrue(ApiSuivi.LireTempérature(temperatureCelsius)) ;

T2-3 :
```
ApiSuivi=new APISuivi() ; 
ApiSuivi. AjoutNouvelleMesure (NouvelleMesure) ; ApiSuivi.LireTempérature(temperatureKelvin) ; ApiSuivi.Conversion() ; 
AssertTrue(ApiSuivi.LireTempérature(temperatureCelsius)) ;
```
Auteur : Serge MEL
Relecteur : Guillaume LAMANDA