package com.bwin.IVY.stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/feature",
		glue={"com.bwin.IVY.stepdefinitions"},
		plugin = { "pretty", "html:target/cucumber-reports.html" },
		monochrome = true


		)

		
public class TestRunner {

}
