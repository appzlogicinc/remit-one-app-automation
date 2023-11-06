package com.remitOne.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyLoginStepDef extends StepDefinitionInit{
	
	 @When("^the user clicks on the login button$")
	 public void the_user_clicks_on_the_login_button() throws InterruptedException
	 {
		 verifyloginpo.clickOnLoginButton();
		 Thread.sleep(2000);
	 }
	 
	 @When("^the user enters valid credentials$")
	 public void the_user_enters_valid_credentials() throws InterruptedException 
	 {
		 verifyloginpo.enterValidDetails();
		 Thread.sleep(2000); 
	 }
	 
	 @Then("^the user can access the application$")
	 public void the_user_can_access_the_application() throws InterruptedException
	 {
		 verifyloginpo.verifyLogin();
		 System.out.println("logo is present");
		 Thread.sleep(4000);
	 }

}
