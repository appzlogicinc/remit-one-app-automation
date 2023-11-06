package com.remitOne.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddBeneficiaryStepDef extends StepDefinitionInit{
	
	@Given("^user logs in with valid credentials$")
    public void user_logs_in_with_valid_credentials() throws InterruptedException
    {
		verifyloginpo.clickOnLoginButton();
		Thread.sleep(2000);
		verifyloginpo.enterValidDetails();
		Thread.sleep(2000);
    }
	
	@When("^user clicks on the add beneficiary button$")
    public void user_clicks_on_the_add_beneficiary_button() throws InterruptedException
    {
		Thread.sleep(3000);
		addbeneficiarypo.clickBeneficiary();
		Thread.sleep(5000);
		addbeneficiarypo.clickAddBeneficiary();
    }
	
	@When("^user enters the required data to add beneficiary$")
    public void user_enters_the_required_data_to_add_beneficiary() throws InterruptedException
    {
		Thread.sleep(3000);
		addbeneficiarypo.enterData();
		Thread.sleep(3000);
		addbeneficiarypo.clickSave();
		Thread.sleep(3000);
    }
	
	@Then("^user can see the beneficiary added$")
    public void user_can_see_the_beneficiary_added()
    {
		addbeneficiarypo.verifyAddedBeneficiary();
    }

}
