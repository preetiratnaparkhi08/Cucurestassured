package com.basic.B17googletest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
//import junit.framework.Assert;
//import junit.framework.Assert;

public class OneStepDefs
{
	Response res;
	@Given("^I want to open google$")
	public void I_want_to_open_google()
	{
		System.out.println("Hitting google.com");
		res=RestAssured.given().get("http://www.google.com/");
		
	}
	/*@Then("^I want to check status code$")
	public void I_want_to_check_status_code()
	{
		
		System.out.println("validating status code");
		int stCode=res.getStatusCode();
		Assert.assertEquals(200,  stCode);    
	}*/
	@Then("^I want to check \"([^\"]*)\" status code$")
	public void i_want_to_check_status_code(String statusCode) 
	{
		System.out.println("validating status code");
		int stCode=res.getStatusCode();
		String ssStCode=Integer.toString( stCode);
		Assert.assertEquals(ssStCode, statusCode); 
		
	   
	   
	}

}
