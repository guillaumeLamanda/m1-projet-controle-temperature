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
- Une méthode AjoutNouvelleMesure
- Une méthode « conversion » qui permet de convertir la valeur depuis le Kelvin à l’unité de destination choisi par l’utilisateur.  

Autheur : Guillaume Lamanda  
Relecteur : Serge Mel

#### Plan de test : 

Message pour serge : Les tests doivent être défini de la manière suivante : 

- On essaie de récupérer la température sur la classe APISuivi via la méthode LireTempérature. 
- etc ... 



A ce titre, le plan de test décrit les éléments clés ci-dessous : 
•	Organisation du test : nécessite une équipe et un environnement. En effet l’organisation du test recouvre d’une part l’aspect humain c’est-à-dire « une ou deux personne(s) » pour constituer de : 
	L’équipe de validation :  Quentin lechat, Guillaume Lamanda, Serge MEL, ZaKARIA Belghza. 
 Rôle : procéder à la validation de la classe Configuration. D’abord l’interaction du développement se fera par échange de communication écrite et orale, de plus on utilisera comme outil de gestion de version : GitHub pour rendre le travail plus collaboratif. Ensuite nous solliciterons M Jean Philipe BABAU pour son expertise afin de répondre nos questions liées à la qualité du travail produit.  Enfin nous proposerons une première version du travail en présentiel au client M BABAU pour répondre au besoin de celui-ci et une dernière version sera produite pour fournir le livrable final. 
Le deuxième aspect de l’organisation répond à la question du comment : c’est-à-dire le côté 
	Technique, autrement dit il s’agit de l’implémentation.
Nous utiliserons l’IDE Eclipse pour la phase de codage ainsi que JUNIT pour effectuer des cas de test.
Nous joindrons aux différents cas de test des captures d’écran pour la réussite/l’échec des tests.
Auteur : Serge MEL
Relecteur : ???????????S

#### Réalisation : 
A faire par Zak

