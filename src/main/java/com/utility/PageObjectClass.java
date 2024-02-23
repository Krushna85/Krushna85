package com.utility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.log4testng.Logger;

import com.pages.AddCartPage;
import com.pages.AddToWishlist;
import com.pages.BillingAddressPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.OrderInformationPage;
import com.pages.SelectMultiCheckboxes;
import com.pages.ShippingAddressPage;
import com.pages.ShoppingCartPage;
import com.pages.UserRegistration;

public class PageObjectClass {
	public static WebDriver driver;
	public static Logger log;
	public UserRegistration userRegistration;
	public LoginPage loginPage;
	public HomePage homePage;
	public AddCartPage addCartPage;
	public ShoppingCartPage shoppingCartPage;
	public AddToWishlist addToWishlist;
	public BillingAddressPage billingAddressPage;
	public ShippingAddressPage shippingAddressPage;
	public OrderInformationPage orderInformationPage;
	public ExtentReport extentReport;
	public SelectMultiCheckboxes selectMultiCheckboxes;

	@BeforeMethod
	public void aagetPageClassObject() {
		userRegistration = new UserRegistration();
		loginPage = new LoginPage();
		homePage = new HomePage();
		addCartPage = new AddCartPage();
		shoppingCartPage = new ShoppingCartPage();
		addToWishlist = new AddToWishlist();
		billingAddressPage = new BillingAddressPage();
		shippingAddressPage = new ShippingAddressPage();
		orderInformationPage = new OrderInformationPage();
		extentReport = new ExtentReport();
		selectMultiCheckboxes = new SelectMultiCheckboxes();
	}
}
