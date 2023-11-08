package com.remitOne.stepdefinitions;

import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BeneficiaryiOSStepDef extends StepDefinitionInit {
	
	@When("^I click on Beneficiary button present on navigation bar$")
	public void i_click_on_beneficiary_button_present_on_navigation_bar() throws Throwable {
		beneficiaryiospo.clickBeneficiaryButton();
	}

	@When("^I click on Add Beneficiary button$")
	public void i_click_on_add_beneficiary_button() throws Throwable {
		beneficiaryiospo.clickAddBeneficiaryButton();
	}

	@When("^I enter all the valid details$")
	public void i_enter_all_the_valid_details(DataTable dataTable) throws Throwable {
        Map<String, String> details = dataTable.asMap(String.class, String.class);
        beneficiaryiospo.enterDetails(details);
	}

	@When("^I Save the details$")
	public void i_save_the_details() throws Throwable {
		beneficiaryiospo.scrolldown();
	}
	
	@When("^I scroll the screen downwards$")
	public void i_scroll_the_screen_downwards() throws Throwable {
		beneficiaryiospo.scrolldown();
	}

	@Then("^I verify benificiary has been added sucessfully$")
	public void i_verify_benificiary_has_been_added_sucessfully() throws Throwable {
		Assert.assertTrue(beneficiaryiospo.verifyAddedBeneficiary());
	}

	@When("^I click on added benificiary$")
	public void i_click_on_added_benificiary() throws Throwable {
		beneficiaryiospo.clickAdeddBeneficiary();
	}

	@When("^I click on edit button$")
	public void i_click_on_edit_button() throws Throwable {
		beneficiaryiospo.clickEditButton();
	}

	@Then("^I verify \"([^\"]*)\" Screen display$")
	public void i_verify_something_screen_appears(String Screen) throws Throwable {
		Assert.assertTrue(beneficiaryiospo.verifyScreen(Screen));
	}

	@When("^I enter \"([^\"]*)\" in search beneficiary box$")
	public void i_enter_something_in_search_beneficiary_box(String beneficiaryName) throws Throwable {
		beneficiaryiospo.enterBeneficiaryName(beneficiaryName);
	}

	@Then("^I verify able to search the beneficiary name$")
	public void i_verify_able_to_search_the_beneficiary_name() throws Throwable {
		Assert.assertTrue(beneficiaryiospo.verifySearchedBeneficiaryName());
	}

	@When("^I update the Contact Information$")
	public void i_update_the_contact_information(DataTable dataTable) throws Throwable {
        Map<String, String> details = dataTable.asMap(String.class, String.class);
        beneficiaryiospo.updateInfo(details);
	}

	@Then("^I verify sucessful message displayed$")
	public void i_verify_latest_address_is_diaplyed() throws Throwable {
		Assert.assertTrue(beneficiaryiospo.verifySucesfulMsg());
	}
	
	@When("^I click on \"([^\"]*)\" button$")
	public void i_click_on_something_button(String Button) throws Throwable {
		beneficiaryiospo.clickButton(Button);
	}
	
	@When("^I select \"([^\"]*)\" beneficiay from the list$")
	public void i_select_something_beneficiary_form_the_list(String beneficiaryName) throws Throwable {
		beneficiaryiospo.selectBeneficiary(beneficiaryName);
	}
	

	
}