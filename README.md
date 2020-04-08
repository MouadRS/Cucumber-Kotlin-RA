# Cucumber-Kotlin-RA
Cucumber projet en utilisons le langage Kotlin. C'etait pour le but de decouvrir le frameWork Cucumber et Rest Assured ,Dans ce projet en réalise le test de l'api https://jsonplaceholder.typicode.com .

Cucumber n'est pas un outil d'automatisation d'API. C'est pour cela il faut choisit un outil d'automatisation D'API , qui fonctionne bien avec Cucumber. On trouve : -Rest assured -Karate https://cucumber.io/docs/guides/api-automation/

Pour ce essaie j'ai choisit Rest Assured; ( https://github.com/rest-assured/rest-assured )

Cucumber-java8
Junit
Rest Assured

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
import cucumber.api.java8.En
import io.restassured.specification.RequestSpecification
import io.restassured.response.ValidatableResponse
import org.hamcrest.Matchers.equalTo
import org.junit.Test
import io.restassured.RestAssured.*

class StepDefs2: En {

    init {
           fun RequestSpecification.When(): RequestSpecification {
              return this.`when`()
                }
		
		
           Given("^I have API$"){
               given().baseUri("https://jsonplaceholder.typicode.com")
   
           }
           When("^I Hit API with user id as (\\d+)$") { id : Int ->
              given().baseUri("https://jsonplaceholder.typicode.com").
              When().
              get("/users/" + id)
      
            }

            Then("^status code comes as (\\d+)$"){ Stcode : Int ->
	
	           given().baseUri("https://jsonplaceholder.typicode.com").
	           When().
	           get("/users/1").
	           then().
	           assertThat().statusCode(Stcode)
               }
           Then("^json body contain name as \"([^\"]*)\"$") { name: String ->
               given().baseUri("https://jsonplaceholder.typicode.com").
               When().
               get("/users/1").then().
               body("name",equalTo(name))
               }
	       }
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
