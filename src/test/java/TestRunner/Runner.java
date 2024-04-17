package TestRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
 

@RunWith(Cucumber.class)    
@CucumberOptions(features="C:\\SPRINT 2\\Rent\\src\\test\\resource\\Features\\Rent.feature", 
glue="StepDefinition",
tags="@Scenario4",
monochrome=true,

plugin={"pretty","html:target/HTMLReports/RentReports.html",
		"json:target/JSONReports/RentReports.json",
		"junit:target/JUNITReports/RentReports.xml",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class Runner extends AbstractTestNGCucumberTests{
	
}

