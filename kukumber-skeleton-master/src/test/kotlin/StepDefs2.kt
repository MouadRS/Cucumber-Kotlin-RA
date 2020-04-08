import cucumber.api.java8.En
import io.restassured.specification.RequestSpecification
import io.restassured.response.ValidatableResponse
import org.hamcrest.Matchers.equalTo
import org.junit.Test
import io.restassured.RestAssured.*
import io.restassured.response.Response
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


