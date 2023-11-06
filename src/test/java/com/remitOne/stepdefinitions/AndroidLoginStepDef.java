package com.remitOne.stepdefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class AndroidLoginStepDef extends StepDefinitionInit{
	
	@When("^I click on Login button present on screen$")
	public void i_click_on_Login_button_present_on_screen() throws Throwable {
		androidloginpo.clickLoginButton();
		Thread.sleep(2000);
	}

	@Then("^I verify Login Screen display here$")
	public void i_verify_Login_Screen_display_here() throws Throwable {
		Assert.assertTrue(androidloginpo.verfiyLoginScreen());
	}


}
