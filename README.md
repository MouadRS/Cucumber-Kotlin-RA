# Cucumber-Kotlin-RA
# Feature file

 ```	
@testthis
 Scenario: Test API
 Given I have API
 When I Hit API with user id as 1
 Then status code comes as 200
 And json body contain name as "Leanne Graham"
 ```
 
# Step Definitions

En cas d'utilisation de Rest Assured avec kotlin, nous devons échapper à la fonction when car when est un mot-clé réservé dans Kotlin.
Donc,il faut ajouter une fonction d'extension (When) 
 ```	
fun RequestSpecification.When(): RequestSpecification {
              return this.`when`()
                }
 ```
# Ressources 

Cucumber avec Kotlin
```
https://medium.com/@mlvandijk/kukumber-getting-started-with-cucumber-in-kotlin-e55112e7309b
```

Rest Assured Avec Kotlin 
```
https://github.com/rest-assured/rest-assured/wiki/Usage#kotlin
http://code.haleby.se/2015/11/06/rest-assured-with-kotlin/
```
