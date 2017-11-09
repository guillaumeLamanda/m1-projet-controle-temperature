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

#### Plan de test :
Test N°1 : 

Intention de test : Ce test va permettre la bonne configuration de l'unité de température après la configuration du boitier. Pour cela on vérifie l'attribut booleen "userTemp". 

Procédure :
T1.1: 
- créer un objet de la classe Configuration, 
- choisir Celsius comme valeur de l’attribut userTemp, 
- puis comparer le type de la valeur de l’attribut au booléen false.

- On génère également des setters et des getters puis on passe aux cas de test suivants.

#### Scénario nominal de Configuration:
- C=newConfiguration();C.Set(userTemperature=Celsius);AssertTrue(C.getuserTemperature==false);

Test             Valeur Attendu           Valeur Observé           Validation  

Celsius           False                     False                       ok

Celsius           False                     False                       ok

Fahrenheit        True                      True                        ok

Celsius           False                     False                        ok

Cas alternatif:Par défaut le champ userTemp affiche Celsius ce qui fait qu'on aura pas de de Scénario d'erreur.



T1.2:  
- créer un objet de la classe Configuration, 
- choisir Fahrenheit comme valeur de l’attribut userTemp, 
- puis comparer le type de la valeur de l’attribut au booléen true.

#### Scénario nominal de Configuration:
- C=newConfiguration();C.Set(userTemperature=Fahrenheit);AssertTrue(C.getuserTemperature==True);

Test        Valeur Attendu  Valeur Observé   Validation  

Fahrenheit  True            True             ok

Celsius     False           False            ok

Fahrenheit  True            True             ok

Fahrenheit  True            True             ok

Fahrenheit  True            True             ok

Cas alternatif:Par défaut le champ userTemp affiche Celsius ce qui fait qu'on aura pas de de Scénario d'erreur.


Test N°2 :

Le test consiste à récupérer la température via la classe APISuivi par appel de la méthode LireTemperature. La classe APISuivi aura préalablement été peuplée.

T2.1 :

- Créer un nouvel objet de la classe APISuivi,
- Peupler cet objet par la méthode AjoutNouvelleTemperature
- Lire une température par la méthode LireTemperature, 
- La valeur retournée doit correspondre à la valeur précédemment ajoutée,
- L'unité de la température doit correspondre à l'unité choisi par l'utilisateur

Test N°3 :

Le test consiste à ajouter une nouvelle mesure via la classe APISuivi par appel à la méthode "AjoutNouvelleMesure". 

T3.1 :

- Créer un nouvel objet de la classe APISuivi, 
- Appeler la méthode AjoutNouvelleMesure avec des valeurs possibles, 
- La valeur retournée doit être "true".

T3.2 :

- Créer un nouvel objet de la classe APISuivi, 
- Appeler la méthode AjoutNouvelleMesure avec des valeurs impossibles (ex: Int mois=13), 
- La valeur retournée doit être "false".

Auteur : Serge MEL  
Relecteur : Guillaume LAMANDA

--------------------------

#### Réalisation : 

```
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
```
*****************************************************************************************************************
```
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
```

Autheur : Zakaria BELGHAZAL  
Relecteur : Guillaume LAMANDA


***************************************************************************************************************** 

On fait quoi de ca : 

#### Plan de test : 

Test N°1 : 

ce test a pour but de laisser le choix à l’utilisateur de choisir dans la phase l’installation de choisir l’unité de température qui sera soit en Celsius ou Fahrenheit. Pour connaitre les états de la classe Configuration, une condition doit permettre de vérifier la valeur de l’attribut « userTemp».

Si cette valeur de l’attribut correspond au degré Celsius,
  Alors    résultat vaut « false»,
Sinon Si cette valeur de l’attribut correspond au Fahrenheit
  Alors   résultat vaut « vrai». 
  
T1:
``` 
C=newConfiguration() ;
C.Set(userTemperature=Celsius);
AssertTrue(C.getuserTemperature==false);
``` 

T2:
``` 
C=newConfiguration() ;
C.Set(userTemperature=Fahrenheit);
AssertTrue(C.getuserTemperature==true);
```

Test N°2 :

Le test consiste à récupérer la température via la classe APISuivi par appel de la méthode LireTemperature qui appelle la méthode LireTemperature de la classe SuiviChauffage. 

De même l’ajout de nouvelle mesure sur la classe APISuivi est faite par la méthode AjoutNouvelleMesure via la méthode AjoutNouvelleMesure de la classe SuiviChauffage.

T2-1 :
```
ApiSuivi=new APISuivi() ; 
ApiSuivi.LireTempérature(temperatureKelvin) ; ApiSuivi.Conversion() ; 
AssertTrue(ApiSuivi.LireTempérature(temperatureFahrenheit)) ;
```

T2-2 :
```
ApiSuivi=new APISuivi() ; 
ApiSuivi.LireTempérature(temperatureKelvin) ; ApiSuivi.Conversion() ; 
AssertTrue(ApiSuivi.LireTempérature(temperatureCelsius)) ;
```

T2-3 :
```
ApiSuivi=new APISuivi() ; 
ApiSuivi. AjoutNouvelleMesure (NouvelleMesure) ; ApiSuivi.LireTempérature(temperatureKelvin) ; ApiSuivi.Conversion() ; 
AssertTrue(ApiSuivi.LireTempérature(temperatureCelsius)) ;
```
Auteur : Serge MEL
Relecteur : Guillaume LAMANDA

### E 3.2 : les donnees de suivi doivent etre serialisees

#### Spécification fonctionnelle
A l’arrêt de système, les états des données seront sauvegardés.  
Au démarrage de système on restaure l’état des données.

#### Spécification technique
On modifie la classe APISuivi pour qu'elle implémente la classe Serializable. Par héritage, la classe obtiendra un attribut privé serialVersionUID.  
On modifie le programme principale pour qu'au démarrage, il restaure l'objet APISuivi depuis le ficher "APISuivi.ser". Si le fichier n'existe pas, on creer une nouvelle instance de la classe APISuivi.  
A la fermeture du programme, le l'objet est écrit dans le fichier "APISuivi.ser".  

Autheur : Guillaume LAMANDA	 
Relecteur : Quentin LE CHAT

### E 3.3 : On doit pouvoir faire un suivi à la minute

#### Spécification fonctionnelle
Une heure contient 60 minutes.  
La température stockée est en Kelvin.  
On peut lire une mesure de température.  
On peut ajouter une nouvelle mesure pour une minute donnée.  
Une minute stocke une seule valeur.  
Il n'es pas possible de modifier une valeur précédemment ajouté.

Autheur : Guillaume LAMANDA  
Relecteur : Quentin LE CHAT

### E 3.4 : On doit pouvoir faire migrer des données enregistrées par heure, dans des données à la minute

#### Spécification fonctionnelle

#### Spécification technique
- On crée une classe MigrationDonnees avec une méthode migrationDonnees et prend en paramètre un double « heureMigration ».la classe possède un attribut « heure ».

Autheur   :Serge MEL

Relecteur :Quentin LE CHAT

### E 3.5 : On veut récuperer les températures moyennes par heure, par jour et par mois.

#### Spécification fonctionnelle

- Spécification fonctionnelle températues moyennes par heure :
  Il s'agit de récuperer les différentes valeurs mesurées par minute durant 60 minutes pour calculer la moyenne de température en 1 heure.
  
  
- Spécification fonctionnelle températues moyennes par jour  :
  Récupérer les différentes valeurs de températures mesurées chaque heure pendant 24 heures et faire la moyenne de mesures.
  
  
- Spécification fonctionnelle températues moyennes par mois  :
  Extraire les différentes valeurs de températures mesusées de chaque jour sur une période 30 jours et faire la moyenne.
  
Autheur   :Serge MEL

Relecteur :Guillaume LAMANDA

#### Spécification technique
