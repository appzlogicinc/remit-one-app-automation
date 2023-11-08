package com.remitOne.stepdefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboaediOSStepDef extends StepDefinitionInit {

	@Then("^I verify text \"([^\"]*)\" present$")
	public void i_verify_text_something_present(String text) throws Throwable {
		Assert.assertTrue(dashboardiospo.verifyText(text));
	}

	@When("^I select the \"([^\"]*)\" currency$")
	public void i_select_the_something_currency(String currency) throws Throwable {
		dashboardiospo.selectCurrency(currency);
	}

	@When("^I enter \"([^\"]*)\" amount in load amount field$")
	public void i_enter_something_amount_in_load_amount_field(String amount) throws Throwable {
		dashboardiospo.enterAmount(amount);
	}

	@When("^I select payment method to \"([^\"]*)\"$")
	public void i_select_payment_method_to_something(String paymentMethod) throws Throwable {
		dashboardiospo.selectPaymentMethod(paymentMethod);
	}

	@When("^I select \"([^\"]*)\" and \"([^\"]*)\" from dropdown$")
	public void i_select_something_and_something_from_dropdown(String currency1, String currency2) throws Throwable {
		dashboardiospo.selectCurrencyFromDropdown(currency1, currency2);
	}

	@When("^I enter \"([^\"]*)\" in amount field$")
	public void i_enter_something_in_amount_field(String amount) throws Throwable {
		dashboardiospo.enterAmt(amount);
	}
}
