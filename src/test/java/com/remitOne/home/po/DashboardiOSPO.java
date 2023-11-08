package com.remitOne.home.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.remitOne.automation.framework.TestSession;
import com.remitOne.pagefactory.Page;

public class DashboardiOSPO extends Page {

	WebDriverWait wait = new WebDriverWait(session.driver, 60);

	public DashboardiOSPO(TestSession session) throws Exception {
		super(session, "Modules/DashboardiOS");
	}

	public void clickCountryDropdown() {
		element("countryDropdown").click();
	}

	public boolean verifyText(String text) {
		String x = "//*[contains(@name,'";
		String y = "')]";
		String xpath = x + text + y;
		WebDriverWait wait = new WebDriverWait(session.driver, 180);
		WebElement locate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		return locate.isEnabled();
	}

	public void selectCurrency(String currency) throws InterruptedException {
		element("currencyDropdown").click();
		Thread.sleep(3000);
		session.driver.findElement(By.xpath("(//*[contains(@name,'"+currency+"')])")).click();
	}

	public void enterAmount(String amount) {
		element("loadAmountField").sendKeys(amount);
	}

	public void selectPaymentMethod(String paymentMethod) throws InterruptedException {
		element("paymentDropdown").click();
		paymentMethod.toLowerCase();
		session.driver.findElement(By.xpath("(//*[contains(@name,'"+paymentMethod+"')])")).click();
	}

	public void selectCurrencyFromDropdown(String currency1, String currency2) throws InterruptedException {
		element("fromDropdown").click();
		Thread.sleep(1000);
		session.driver.findElement(By.xpath("(//*[contains(@name,'"+currency1+"')])")).click();
		Thread.sleep(1000);
		element("toDropdown").click();
		Thread.sleep(1000);
		session.driver.findElement(By.xpath("(//*[contains(@name,'"+currency2+"')])")).click();
	}
	
	public void selectCountry() {
		element("country").click();
	}
	
	public void enterAmt(String amount) {
		element("moveAmtField").sendKeys(amount);
	}

}
