package com.basic.getWithTagsOfCucuSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(
			
			//dryRun=true,
		//	tags={"@Important"}, //All scenario executed if this is tag for feature file
			// tags={"@Smoke"}, //only tag with @smoke
			//tags={"@Smoke","@Regression"}, //AND condition
			 tags={"@Smoke,@Regression"} , // OR condiction 
			//tags={"~@Smoke",@Regression"},
			monochrome=true,//we are using any other langauage than perl
			dryRun=false,//indication something is missing like step defination file without executing code(default is false)
			features= {"src/test/resources/com/basic/getWithTagsOfCucuFF/"},
			glue={"com/basic/getWithTagsOfCucuSD/"},
			plugin={"pretty",
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report6.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
			}
		)
		

public class RunGetWithTagsTest {


}
