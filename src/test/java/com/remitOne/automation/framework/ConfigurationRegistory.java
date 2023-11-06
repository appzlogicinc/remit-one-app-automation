package com.remitOne.automation.framework;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.remitOne.utils.InitData;
import com.remitOne.utils.PropFileHandler;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class ConfigurationRegistory {
	Map<String, Object> registry;
	public static String browserStackUsername = System.getProperty("browserStackUsername");
	public static String browserStackAccesskey = System.getProperty("browserStackAccesskey");
	public static String androidAppURL = System.getProperty("androidAppURL");
	public static String iOSAppURL = System.getProperty("iOSAppURL");
	public static String iOSdeviceName = System.getProperty("iOSdeviceName");
	public static String iosplatformVersion = System.getProperty("iosplatformVersion");
	public static String androidDeviceName = System.getProperty("androidDeviceName");
	public static String androidPlatformVersion = System.getProperty("androidPlatformVersion");

	public WebDriver getDriver(Map<String, Object> config) throws Exception {
		Map<String, Object> options = new HashMap<String, Object>();
		return getDriver(config, options);
	}

	public WebDriver getDriver(Map<String, Object> config, Map<String, Object> options) throws Exception {

		AppiumDriver driver = null;
		String username = "shadabanwar_NVDCFc";
		String accessKey = "dsGZVqqWryMwx9asSy1K";

		if (browserStackUsername == null) {
			browserStackUsername = username;
		}
		if (browserStackAccesskey == null) {
			browserStackAccesskey = accessKey;
		}
		if (androidAppURL == null) {
			androidAppURL = "bs://4305455750a3ad9b6f3097d2f014400b1ba3db42";
		}
		if (iOSAppURL == null) {
			iOSAppURL = "bs://8ea86fc904a8865803a18f905636cc6007a6dc69";
		}
		if (iOSdeviceName == null) {
			iOSdeviceName = "iPhone 11 Pro";
		}
		if (iosplatformVersion == null) {
			iosplatformVersion = "16.0";
		}
		if (androidDeviceName == null) {
			androidDeviceName = "Samsung*";
		}
		if (androidPlatformVersion == null) {
			androidPlatformVersion = "11";
		}
		switch (InitData.platformName) {

		case ("browserStack-iOS"):
			System.out.println("In browserStack iOS configuration");

			DesiredCapabilities iOSCap = new DesiredCapabilities();
			HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
			iOSCap.setCapability("bstack:options", browserstackOptions);
			iOSCap.setCapability("name", "Remote File Upload Test");
			System.out.println("*** appURL  " + iOSAppURL);
			iOSCap.setCapability("app", iOSAppURL);
			System.out.println("*** scenrioName  " + PropFileHandler.readProperty("scenarioName"));
			iOSCap.setCapability("name", PropFileHandler.readProperty("scenarioName"));
			// iOSCap.setCapability("deviceName", "iPhone 11 Pro");
			iOSCap.setCapability("deviceName", iOSdeviceName);
			System.out.println("*** deviceName  " + iOSdeviceName);
			iOSCap.setCapability("iosplatformVersion", iosplatformVersion);
			System.out.println("*** iosplatformVersion  " + iosplatformVersion);
			iOSCap.setCapability("platformName", "ios");
			// iOSCap.setCapability("automationName", "flutter");
			iOSCap.setCapability("autoDismissAlerts", "true");
			System.out.println("*** URL  " + "http://" + browserStackUsername + ":" + browserStackAccesskey
					+ "@hub-cloud.browserstack.com/wd/hub");
			driver = new AppiumDriver(new URL("http://" + browserStackUsername + ":" + browserStackAccesskey
					+ "@hub-cloud.browserstack.com/wd/hub"), iOSCap);

			break;
		case ("browserStack-Android"):
			System.out.println("In browserStack Android configuration");
			DesiredCapabilities androidCap = new DesiredCapabilities();
			System.out.println("*** appURL  " + androidAppURL);
			androidCap.setCapability("app", androidAppURL);
			androidCap.setCapability("platform", "android");
			androidCap.setCapability("name", PropFileHandler.readProperty("scenarioName"));
			System.out.println("*** deviceName  " + androidDeviceName);
			androidCap.setCapability("deviceName", androidDeviceName);
			System.out.println("*** URL  " + "http://" + browserStackUsername + ":" + browserStackAccesskey
					+ "@hub-cloud.browserstack.com/wd/hub");
			driver = new AndroidDriver(new URL("http://" + browserStackUsername + ":" + browserStackAccesskey
					+ "@hub-cloud.browserstack.com/wd/hub"), androidCap);

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
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

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
