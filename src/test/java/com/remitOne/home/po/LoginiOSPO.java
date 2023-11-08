package com.remitOne.home.po;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.remitOne.automation.framework.TestSession;
import com.remitOne.pagefactory.Page;
import com.remitOne.utils.PropFileHandler;

import cucumber.api.DataTable;

public class LoginiOSPO extends Page {

	WebDriverWait wait = new WebDriverWait(session.driver, 60);

	public LoginiOSPO(TestSession session) throws Exception {
		super(session, "Modules/LoginiOS");
	}

	public void applicationLaunch() {
		System.out.println("application Lauunched!!");
	}

	public void ignorePopup() {
		element("dismissAppButton").click();
	}

	public void clickSignUpButton() throws InterruptedException {
		element("dismissAppButton").click();
		element("signUpButton").click();
		Thread.sleep(3000);
	}

	public void clickLoginButton() throws InterruptedException {
		try {
			element("loginButton").click();
			Thread.sleep(3000);
		} catch (Exception e) {
			element("key1").click();
			element("key2").click();
			element("key3").click();
			element("key4").click();
			Thread.sleep(3000);
		}
	}

	public boolean VerifyLoginScreen() {
		return element("loginScreen").isDisplayed();
	}

	public void enterValidCreds() {
		if (element("loginScreen").isDisplayed()) {
			WebElement email = element("emailField");
			email.click();
			email.sendKeys("dhawal@appzlogic.com");
			WebElement password = element("passwordField");
			password.click();
			password.sendKeys("Appzlogic@123");
			session.driver.navigate().back();
		}

	}

	public boolean verifyLogin() throws InterruptedException {
		Thread.sleep(3000);
		return element("walletOption").isDisplayed();
	}

	public void clikConfirmLoginButton() {
		element("confirmLogin").click();
	}

	public void clickMoreButton() {
		element("moreButton").click();
	}

	public void clickLogoutButton() {
		element("logoutButton").click();
	}

	public boolean verifyLogoutPopup() {
		return element("logoutPopup").isDisplayed();
	}

	public void clickOkButton() {
		element("okButton").click();
		ignorePopup();
		element("dismissAppButton").click();
	}

	public boolean verifyLoggedOut() {
		return element("loginButton").isDisplayed();
	}

	public boolean verifyButton(String button) {
		String x = "//*[contains(@name,'";
		String y = "')]";
		String xpath = x + button + y;
		WebDriverWait wait = new WebDriverWait(session.driver, 180);
		WebElement locate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		return locate.isEnabled();
	}

	public boolean verifyNavigationBar() {
		boolean status = false;
		WebElement home = element("homeButton");
		WebElement benificiary = element("beneficiaryButton");
		WebElement profile = element("profileButton");
		WebElement more = element("moreButton");

		if (home.isDisplayed() && benificiary.isDisplayed() && profile.isDisplayed() && more.isDisplayed()) {
			status = true;
		}
		return status;
	}

	public boolean verifyCountry() {
		return element("country").isDisplayed();
	}

}
