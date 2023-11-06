package com.remitOne.stepdefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef extends StepDefinitionInit{
	
	@When("^I launch the application$")
	public void i_launch_the_application() throws Throwable {
		loginpo.applicationLaunch();
	}

	@Then("^I verify Splash Screen display$")
	public void i_verify_splash_screen_display() throws Throwable {
		Assert.assertTrue(loginpo.VerifySplashScreen());
	}

	@When("^I click on signup button$")
	public void i_click_on_signup_button() throws Throwable {
		loginpo.clickSignUpButton();
	}
	
	@When("^I click on Login button$")
	public void i_click_on_login_button() throws Throwable {
		loginpo.clickLoginButton();
	}
	
	@Then("^I verify Login Screen display$")
	public void i_verify_login_screen_display() throws Throwable {
		Assert.assertTrue(loginpo.VerifyLoginScreen());
	}
	
	@When("^I enter valid email and password$")
	public void i_enter_valid_email_and_password() throws Throwable {
		loginpo.enterValidCreds();
	}
	
	@Then("^I verify User is logged in$")
	public void i_verify_user_is_logged_in() throws Throwable {
		Assert.assertTrue(loginpo.verifyLogin());
	}
	 

	 

	
}
