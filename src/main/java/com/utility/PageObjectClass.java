package com.utility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.log4testng.Logger;

import com.pages.AddCart;
import com.pages.AddToWishlist;
import com.pages.LoginPage;
import com.pages.UserRegistration;

public class PageObjectClass {
	public static WebDriver driver;
	public static Logger log;
	public UserRegistration userRegistration;
	public AddCart addCart;
	public AddToWishlist addToWishlist;
	public LoginPage loginPage;

	@BeforeMethod
	public void aagetPageClassObject() {
		System.out.println("************ aagetPageClassObject************************");

		userRegistration = new UserRegistration();
		addCart = new AddCart();
		addToWishlist = new AddToWishlist();
		loginPage = new LoginPage();
	}
}
