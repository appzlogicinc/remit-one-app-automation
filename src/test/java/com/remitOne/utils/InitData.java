package com.remitOne.utils;

public class InitData {
	public static String empDataFile = EmpDataFile();
	public static String platformName = PlatformName();

	public static String EmpDataFile() {
		if (System.getProperty("empDataFile") == null)
			return empDataFile = "QA";
		else
			return empDataFile = System.getProperty("empDataFile");
	}

	public static String PlatformName() {
		String pfName = System.getProperty("platformValue");
		if (System.getProperty("platformName") == null)
			return platformName = "browserStack-iOS";

		else
			return platformName = System.getProperty("platformName");
	}
}