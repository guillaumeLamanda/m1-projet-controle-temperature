# Suivi et controle de température

Plan de test :

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

T2-3 :ApiSuivi=new APISuivi() ; ApiSuivi. AjoutNouvelleMesure (NouvelleMesure) ; ApiSuivi.LireTempérature(temperatureKelvin) ; ApiSuivi.Conversion() ; AssertTrue(ApiSuivi.LireTempérature(temperatureCelsius)) ;

Auteur : Serge MEL
Relecteur : ?????????
