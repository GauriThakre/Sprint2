package com.runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions; 

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/resources/orangehrm"}
		, glue = {"Stepdefination"},plugin = {"json:target/reports/report.json","junit:target/reports/report.xml"}
,monochrome=true)

public class Testrunner {

	

}
