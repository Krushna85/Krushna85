package com.utility;

public class ConfigDataProvider extends PageObjectClass {

	public String BaseUrl = ts.getConfigData("BaseUrl");
	public String Username = ts.getConfigData("Username");
	public String Password = ts.getConfigData("Password");
}
