
package com.remitOne.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(plugin = { "progress", "html:target/Cucumber", "json:target/cucumber-report.json",
		"html:target/cucumber-report.html", "junit:target/cucumber-report.xml" }, 
         monochrome = true, 
         glue = {"com.remitOne.stepdefinitions" }, 
         features = { "./src/test/resources/Features" } ,
         tags = { "@remitOneEndToEnd" }
         )
public class CukeRunnerTest {

}
