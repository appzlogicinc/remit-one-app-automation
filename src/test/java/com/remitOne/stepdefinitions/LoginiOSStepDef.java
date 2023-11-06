package com.remitOne.stepdefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginiOSStepDef extends StepDefinitionInit {

	@When("^I launch the application$")
	public void i_launch_the_application() throws Throwable {
		loginiospo.applicationLaunch();
	}

	@Then("^I ignore the poup$")
	public void i_ignore_the_poup() throws Throwable {
		loginiospo.ignorePopup();
	}

	@When("^I click on signup button$")
	public void i_click_on_signup_button() throws Throwable {
		loginiospo.clickSignUpButton();
	}

	@When("^I click on Login button$")
	public void i_click_on_login_button() throws Throwable {
		loginiospo.clickLoginButton();
	}

	@Then("^I verify Login Screen display$")
	public void i_verify_login_screen_display() throws Throwable {
		Assert.assertTrue(loginiospo.VerifyLoginScreen());
	}

	@When("^I enter valid email and password$")
	public void i_enter_valid_email_and_password() throws Throwable {
		loginiospo.enterValidCreds();
	}

	@Then("^I verify User is logged in$")
	public void i_verify_user_is_logged_in() throws Throwable {
		Assert.assertTrue(loginiospo.verifyLogin());
	}

	@When("^I click on confirm Login button$")
	public void i_click_on_confirm_login_button() throws Throwable {
		loginiospo.clikConfirmLoginButton();
	}

	@When("^I click on More button$")
	public void i_click_on_more_button() throws Throwable {
		loginiospo.clickMoreButton();
	}

	@When("^I click on Logout button$")
	public void i_click_on_logout_button() throws Throwable {
		loginiospo.clickLogoutButton();
	}

	@Then("^I verify Logout popup display$")
	public void i_verify_logout_popup_display() throws Throwable {
		Assert.assertTrue(loginiospo.verifyLogoutPopup());
	}

	@When("^I click OK to confirm$")
	public void i_click_ok_to_confirm() throws Throwable {
		loginiospo.clickOkButton();
	}

	@Then("^I verify user is able to logged out from app$")
	public void i_verify_user_is_able_to_logged_out_from_app() throws Throwable {
		Assert.assertTrue(loginiospo.verifyLoggedOut());
	}

}
