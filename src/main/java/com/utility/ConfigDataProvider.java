package com.utility;

public class ConfigDataProvider extends PageObjectClass {

	public String BaseUrl = TestUtils.getConfigData("BaseUrl");
	public String Username = TestUtils.getConfigData("Username");
	public String Password = TestUtils.getConfigData("Password");
}
