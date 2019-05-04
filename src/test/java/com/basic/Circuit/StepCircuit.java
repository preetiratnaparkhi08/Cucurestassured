package com.basic.Circuit;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
//import junit.framework.Assert;
import static org.hamcrest.Matchers.*;

public class StepCircuit 
{
	Response resp;
	@Given("^user start the rest asured test$")
	public void user_start_the_rest_asured_test() 
	{
		System.out.println("Hitting google.com");
		resp=RestAssured.given().get("https://ergast.com/api/f1/2017/circuits.json");
	  
	   
	}

	@When("^user hit the get request$")
	public void user_hit_the_get_request() 
	{
		
	   
	}

	@Then("^user check the count or size$")
	public void user_check_the_count_or_size()
	{
		String limitValue=resp.getBody().jsonPath().getString("MRData.limit");
		Assert.assertEquals("30", limitValue);
		//verify the size
		resp.then().assertThat().body("MRData.CircuitTable.Circuits.circuitID", hasSize(20));
		 
	   
	    
	}

	@Then("^user check at path \"([^\"]*)\"$")
	public void user_check_at_path(String arg1) {
	    
	}



}
