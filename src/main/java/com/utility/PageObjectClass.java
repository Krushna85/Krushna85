package com.utility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.log4testng.Logger;

import com.pages.AddCart;
import com.pages.AddCartPage;
import com.pages.AddToWishlist;
import com.pages.AddressPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.ShoppingCartPage;
import com.pages.UserRegistration;

public class PageObjectClass {
	public static WebDriver driver;
	public static Logger log;
	public UserRegistration userRegistration;
	public LoginPage loginPage;
	public HomePage homePage;
	public AddCart addCart;
	public AddCartPage addCartPage;
	public ShoppingCartPage shoppingCartPage;
	public AddToWishlist addToWishlist;
	public AddressPage addressPage;
	public ExtentReport extentReport;

	@BeforeMethod
	public void aagetPageClassObject() {
		userRegistration = new UserRegistration();
		loginPage = new LoginPage();
		homePage = new HomePage();
		addCart = new AddCart();
		addCartPage = new AddCartPage();
		shoppingCartPage = new ShoppingCartPage();
		addToWishlist = new AddToWishlist();
		addressPage = new AddressPage();
		extentReport = new ExtentReport();
	}
}
