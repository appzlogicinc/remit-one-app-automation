package com.remitOne.home.po;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.remitOne.automation.framework.TestSession;
import com.remitOne.pagefactory.Page;
import com.remitOne.utils.PropFileHandler;

public class LoginPO extends Page {
	
	WebDriverWait wait = new WebDriverWait(session.driver, 60);

	public LoginPO(TestSession session) throws Exception {
		super(session, "Modules/Login");
	}
	
	public void applicationLaunch() {
		System.out.println("application Lauunched!!");
	}
	
	public boolean VerifySplashScreen() {
		return element("splashScreen").isDisplayed();
	}

	public void clickSignUpButton() throws InterruptedException
	{
		element("dismissAppButton").click();
		element("signUpButton").click();
		Thread.sleep(3000);
	}
	
	public void clickLoginButton() throws InterruptedException
	{
		element("LoginButton").click();
		Thread.sleep(3000);
	}
	
	public boolean VerifyLoginScreen() {
		return element("LoginScreen").isDisplayed();
	}
	
	public void enterValidCreds() {
		element("emailField").sendKeys("dhawal@appzlogic.com");
		element("passwordField").sendKeys("Appzlogic@123");
	}
	
	public boolean verifyLogin() {
		return element("WalletOption").isDisplayed();
	}
	

}
