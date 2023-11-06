package com.remitOne.runner;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentProperties;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		plugin = { "pretty", "html:target/Cucumber", "json:target/cucumber-report.json",
				"html:target/cucumber-report.html", "junit:target/cucumber-report.xml" },

		monochrome = true, glue = { "com.remitOne.stepdefinitions" }

		, tags = "@remitOneEndToEnd", features = { "./src/test/resources/Features" }

)

public class CukeRunnerTest {
	@BeforeClass
	public static void setup() {
		ExtentProperties extentProperties = ExtentProperties.INSTANCE;
		String timeStamp = new SimpleDateFormat("dd.MM.yyyy.HH.mm.ss").format(new Date());
		String userDir = System.getProperty("user.dir");
		extentProperties.setReportPath(
				userDir + "/target/CucumberReportForEveryTestWithTimeStamp/Report_" + timeStamp + ".html");
	}

}