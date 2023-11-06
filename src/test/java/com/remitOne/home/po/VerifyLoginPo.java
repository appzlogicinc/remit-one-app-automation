package com.remitOne.home.po;

import com.remitOne.automation.framework.TestSession;
import com.remitOne.pagefactory.Page;



public class VerifyLoginPo extends Page{
	
	public VerifyLoginPo(TestSession session) throws Exception {
		super(session, "Modules/VerifyLogin");
	}
	
	public void clickOnLoginButton() throws InterruptedException
	{
		System.out.println("application Lauunched!!");
		element("dismissAppButton").click();
		element("LoginButton").click();
		Thread.sleep(5000);
	}
	
	public void enterValidDetails() throws InterruptedException
	{
		Thread.sleep(2000);
		element("emailAddress").click();
		Thread.sleep(2000);
		element("emailAddress").sendKeys("dhawal@appzlogic.com");
		Thread.sleep(2000);
		element("password").click();
		Thread.sleep(2000);
		element("password").sendKeys("Appzlogic@123");
		element("login").click();
		Thread.sleep(2000);
	}
	
	public boolean verifyLogin() throws InterruptedException
	{
		Thread.sleep(2000);
		return element("remmitOneImage").isDisplayed();
	}

}
