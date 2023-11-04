package com.remitOne.automation.framework;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.remitOne.utils.InitData;
import com.remitOne.utils.PropFileHandler;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfigurationRegistory {
	Map<String, Object> registry;

	public WebDriver getDriver(Map<String, Object> config) throws Exception {
		Map<String, Object> options = new HashMap<String, Object>();
		return getDriver(config, options);
	}

	public WebDriver getDriver(Map<String, Object> config, Map<String, Object> options) throws Exception {

		AppiumDriver driver = null;
		String username = "swastisharma_bOqEof";
		String accessKey = "umFtD4LxsYpCKKdxpxf7";
		switch (InitData.platformName) {

		case ("browserStack-iOS"):
			System.out.println("In browserStack iOS configuration");

		 //iOSCap.setCapability("app", "bs://e5bc3fcb297e927e710dd7e823eea8cd71a9b7fb");
			DesiredCapabilities iOSCap = new DesiredCapabilities();
			HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
			iOSCap.setCapability("bstack:options", browserstackOptions);
			iOSCap.setCapability("name", "Remote File Upload Test");
			iOSCap.setCapability("app", "bs://b78abba68f1652da58d45d9ce668f5f675bcc82b");
			iOSCap.setCapability("name", "Remote File Upload Test");
			iOSCap.setCapability("deviceName", "iPhone 11 Pro");
			iOSCap.setCapability("platformName", "ios");
			// iOSCap.setCapability("automationName", "flutter");
			iOSCap.setCapability("autoDismissAlerts", "true");
			driver = new AppiumDriver(
					new URL("http://" + username + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub"), iOSCap);

			break;
		case ("browserStack-Android"):
			System.out.println("In browserStack Android configuration");
			DesiredCapabilities androidCap = new DesiredCapabilities();
			androidCap.setCapability("app", "bs://4305455750a3ad9b6f3097d2f014400b1ba3db42");
			androidCap.setCapability("platform", "android");
			androidCap.setCapability("name", "Remote File Upload Test");
			androidCap.setCapability("deviceName", "Samsung*");
			driver = new AndroidDriver(
					new URL("http://" + username + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub"), androidCap);

			break;
		case "android-local":
			System.out.println("In the android-local configuration");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("app", "appPath");
			capabilities.setCapability("appPackage", "com.abc");
			capabilities.setCapability("newCommandTimeout", 60000);
			capabilities.setCapability("deviceName", "Android");
			capabilities.setCapability("unicodeKeyboard", true);
			// capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
			capabilities.setCapability("noReset", "false");
			capabilities.setCapability("fullReset", "true");
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

			break;

		case "iOS-local":
			System.out.println("In the iOS-local configuration");
			DesiredCapabilities capabilitiess = new DesiredCapabilities();
			capabilitiess.setCapability("platformVersion", "14.4");
			capabilitiess.setCapability("deviceName", "iPhone 11 Pro");
			capabilitiess.setCapability("automationName", "XCUITest");
			capabilitiess.setCapability("platformName", "iOS");
			capabilitiess.setCapability("waitForQuiescence", false);
			capabilitiess.setCapability("app", "appPath");
			capabilitiess.setCapability("clearSystemFiles", true);
			capabilitiess.setCapability("showXcodeLog", true);
			capabilitiess.setCapability("unicodeKeyboard", true);
			capabilitiess.setCapability("waitForAppScript", "$.delay(5000);$.acceptAlert(); true;");
			@SuppressWarnings("rawtypes")
			IOSDriver iosDriver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilitiess);
			driver = iosDriver;
			break;

		}

		return driver;
	}

}
