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
			element("loginWithPassword").click();
		}
	}

	public boolean VerifyLoginScreen() {
		return element("loginScreen").isDisplayed();
	}

	public void enterValidCreds() {
		try {
			if (element("loginScreen").isDisplayed()) {
				WebElement email = element("emailField");
				email.click();
				email.sendKeys("dhawal@appzlogic.com");
				WebElement password = element("passwordField");
				password.click();
				password.sendKeys("Appzlogic@123");
				session.driver.navigate().back();
			}
		} catch (Exception e) {
			// element("loginWithPassword").click();
			element("passwordField").sendKeys("Appzlogic@123");
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

}
