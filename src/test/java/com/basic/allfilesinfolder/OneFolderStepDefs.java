package com.basic.allfilesinfolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OneFolderStepDefs 
{
	WebDriver driver;
	@Given("the user is in facebook login page")
	public void the_user_is_on_login_Page()
	{
		System.out.println("in set up");
		System.setProperty("webdriver.chrome.driver","E:\\RadicalSoftware\\chromedriver_win32_B45\\chromedriver.exe");	
		 driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@When("^he enter username$")
	public void he_enter_as_username()
	{
		driver.findElement(By.name("email")).sendKeys("adzv");
		
	    
	}

	@When("^he enter password$")
	public void he_enter_as_password() 
	{
		driver.findElement(By.name("pass")).sendKeys("password08");
	    
	}

	@Then("^check username is present in textbox$")
	public void check_username_is_present_in_textbox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^i am check facebook login page$")
	public void i_am_check_facebook_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}



}
