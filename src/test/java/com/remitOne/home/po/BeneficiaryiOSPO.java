package com.remitOne.home.po;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.remitOne.automation.framework.TestSession;
import com.remitOne.pagefactory.Page;

import cucumber.api.DataTable;

public class BeneficiaryiOSPO extends Page{
	WebDriverWait wait = new WebDriverWait(session.driver, 60);

	static String firstName;
	static String lastName;

	public BeneficiaryiOSPO(TestSession session) throws Exception {
		super(session, "Modules/BeneficiaryiOS");
	}
	
	public void clickBeneficiaryButton() {
		element("beneficiaryButton").click();
	}

	public void clickAddBeneficiaryButton() {
		element("addBeneficiaryBtn").click();
	}

	public void scrolldown() {
		JavascriptExecutor js = (JavascriptExecutor) session.driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		js.executeScript("mobile: scroll", scrollObject);
	}

	public void enterDetails(Map<String, String> details) {
		
		 firstName = details.get("FirstName");
		 lastName = details.get("LastName");
		String mobileNo = details.get("MobileNumber");
		String telephponeNo = details.get("TelephoneNumber");
		String address = details.get("Address");
		String city = details.get("City");
		String state = details.get("State");
		String postcode = details.get("Postcode");

		element("firstName").sendKeys(firstName);
		element("middleName").sendKeys(lastName);
		element("lastName").sendKeys(mobileNo);
		element("nextButton").click();
		scrolldown();
		element("moblieNo").click();
		element("telephoneNo").sendKeys(telephponeNo);
		element("address").sendKeys(address);
		element("city").sendKeys(city);
		element("state").sendKeys(state);
		element("nextButton").click();
		element("pincode").sendKeys(postcode);
		element("nextButton").click();
		element("selectIdentificationType").click();
		element("passportOption").click();
	}

	public void saveDetails() {
		element("saveButton").click();
	}

	public boolean verifyAddedBeneficiary() {
	    
		return session.driver.findElement(By.xpath("(//*[contains(name(),'"+firstName+" "+lastName+"')])")).isDisplayed();
	}

	public void clickAdeddBeneficiary() {
		element("addedBeneficiary").click();
	}

	public void clickEditButton() {
		element("editButton").click();
	}

	public boolean verifyScreen(String Screen) {
		String x = "//*[contains(@name,'";
		String y = "')]";
		String xpath = x + Screen + y;
		WebDriverWait wait = new WebDriverWait(session.driver, 180);
		WebElement locate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		return locate.isEnabled();
	}

	public void enterBeneficiaryName(String beneficiaryName) {
		element("searchBox").click();
		element("searchBox").sendKeys(beneficiaryName);
	}

	public boolean verifySearchedBeneficiaryName() {
		boolean status = false;
		String str1 = element("searchBox").getAttribute("value");
		String str2 = element("searchedResult").getAttribute("value");
		if (str1.equalsIgnoreCase(str2)) {
			status = true;
		}
		System.out.print("Able to search beneficiary name");
		return status;
	}

	public void updateInfo(Map<String, String> details) {
		String address = details.get("Address");
		String city = details.get("City");
		String state = details.get("State");
		
		scrolldown();
		element("address").clear();
		element("address").sendKeys(address);
		element("city").clear();
		element("city").sendKeys(city);
		element("state").clear();
		element("state").sendKeys(state);
	}

	public boolean verifySucesfulMsg() {
		
		return element("sucessfulMsg").isDisplayed();
	}
	
}
