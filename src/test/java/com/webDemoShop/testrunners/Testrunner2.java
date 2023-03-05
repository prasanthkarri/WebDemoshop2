package com.webDemoShop.testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"json:target/cucumber-test-reports/Cucumber.json",
		"rerun:reports/rerun.txt"}, features = {"C:\\Users\\prasanth\\git\\WebDemoshop2\\src\\test\\resource\\features"}, 
				glue = {"stepDefinations"},dryRun =false, tags = "@P0" )

public class Testrunner2 extends AbstractTestNGCucumberTests{
	

}
