package com.remitOne.home.po;

import com.remitOne.automation.framework.TestSession;
import com.remitOne.pagefactory.Page;

public class VerifyLogoutPo extends Page{
	
	public VerifyLogoutPo(TestSession session) throws Exception {
		super(session, "Modules/VerifyLogout");
	}
	
	public void clickMoreOptions() throws InterruptedException
	{
		Thread.sleep(2000);
		element("moreOptions").click();
		Thread.sleep(2000);
	}
	
	public void ClickLogout() throws InterruptedException
	{
		element("Logout").click();
		Thread.sleep(200);
	}
	
	public boolean confirmationMsg()
	{
		return element("message").isDisplayed();
	}
	
	public void clickOK()
	{
		element("Ok").click();
	}
	
	public void clickIgnore()
	{
		element("dismissAppButton").click();
	}
	
	public boolean verifyLogout()
	{
		return element("LoginButton").isDisplayed();
	}

}
