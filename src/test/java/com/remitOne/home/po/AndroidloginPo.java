package com.remitOne.home.po;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.remitOne.automation.framework.TestSession;
import com.remitOne.pagefactory.Page;

public class AndroidloginPo extends Page{
	
	WebDriverWait wait = new WebDriverWait(session.driver, 60);

	public AndroidloginPo(TestSession session) throws Exception {
		super(session, "Modules/AndroidLogin");
	}
	
	public void clickLoginButton() throws InterruptedException {
		System.out.println("application Lauunched!!");
		element("dismissAppButton").click();
		element("LoginButton").click();
		Thread.sleep(5000);
	}
	
	
	public boolean verfiyLoginScreen()
	{
		return element("loginScreen").isDisplayed();
		
	}

}
