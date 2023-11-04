package com.remitOne.stepdefinitions;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import javax.imageio.ImageIO;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseSteps extends StepDefinitionInit {

	@Before
	public void setUp() throws Exception {

		System.out.println("STARTING TEST..... ");
		session = getTestSession();
		Thread.sleep(5000);
	}

	@After
	public void tearDown(Scenario scenario) throws Exception {
		if (scenario.isFailed()) {
			
			final byte[] screenshot = ((TakesScreenshot) session.driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png"); // ... and embed it in the report.

			InputStream in = new ByteArrayInputStream(screenshot);
			BufferedImage bImageFromConvert = ImageIO.read(in);

			ImageIO.write(bImageFromConvert, "png",
					new File("./Failed-Screenshots/"+ scenario.getName().replaceAll(" ", "") + ".png"));
			
		} else {
			
			System.out.println("The Test Case is Passed");
		}
		System.out.println("I am in the tear function...");
		try {
			session.quit();
			
		} finally {
			session = null;
		}
	}

}