package com.remitOne.home.po;

import com.remitOne.automation.framework.TestSession;
import com.remitOne.pagefactory.Page;

public class AddBeneficiaryPo extends Page{
	
	public AddBeneficiaryPo(TestSession session) throws Exception {
		super(session, "Modules/AddBeneficiary");
	}
	
	public void clickBeneficiary() throws InterruptedException
	{
		Thread.sleep(3000);
		element("Beneficiary").click();
	}
	
	public void clickAddBeneficiary() throws InterruptedException
	{
		element("AddBeneficiary").click();
		Thread.sleep(3000);
	}
	
	public void enterData() throws InterruptedException
	{
		element("FirstName").click();
		element("FirstName").sendKeys("Williams");
		Thread.sleep(2000);
		element("MiddleName").click();
		element("MiddleName").sendKeys("Sam");
		Thread.sleep(2000);
		element("LastName").click();
		element("LastName").sendKeys("Harry");
		Thread.sleep(2000);
		//element("MobileNumber").click();
		//element("MobileNumber").sendKeys("7876749083");
		//Thread.sleep(2000);
		//element("Address1").click();
		//element("Address1").sendKeys("Pallod farms, 4");
		//Thread.sleep(2000);
		//element("City").click();
		//element("City").sendKeys("Kabul");
		//Thread.sleep(2000);
		//element("State").sendKeys("kabul");
		//Thread.sleep(2000);
		//element("PostCode").click();
		//element("PostCode").sendKeys("2496300");
		//Thread.sleep(2000);
		//element("IDDetails").click();
		//Thread.sleep(2000);
	}
	
	public void clickSave() throws InterruptedException
	{
		element("Save").click();
		Thread.sleep(3000);
	}
	
	public boolean verifyAddedBeneficiary()
	{
		return element("DuplicateEntry").isDisplayed();
		
	}

}
