package com.remitOne.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepDef extends StepDefinitionInit{
	
	@Given("^the user is logged in with valid details$")
    public void the_user_is_logged_in_with_valid_details() throws InterruptedException
    {
		verifyloginpo.clickOnLoginButton();
		 Thread.sleep(2000);
		 verifyloginpo.enterValidDetails();
		 Thread.sleep(2000); 
		 
    }
	
	 @When("^the user clicks on the logout button$")
	 public void the_user_clicks_on_the_logout_button() throws InterruptedException 
	 {
		 Thread.sleep(5000);
		 verifylogoutpo.clickMoreOptions();
		 Thread.sleep(2000);
		 verifylogoutpo.ClickLogout();
		 Thread.sleep(2000);
	 }
	 
	 @Then("^a confirmation message should be displayed$")
	 public void a_confirmation_message_should_be_displayed() throws InterruptedException 
	 {
		 Thread.sleep(3000);
		 verifylogoutpo.confirmationMsg();
		 System.out.println("Confirmation message displayed");
		 Thread.sleep(3000);
		 verifylogoutpo.clickOK();
		 Thread.sleep(5000);
		 verifylogoutpo.clickIgnore();
		 Thread.sleep(2000);
	 }
	 
	 @Then("^the user is able to logout$")
	 public void the_user_is_able_to_logout() throws InterruptedException
	 {
		 
		 verifylogoutpo.verifyLogout();
		 Thread.sleep(2000);
		 System.out.println("Logout successful!");
	 }

}
