package com.utility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.log4testng.Logger;

import com.pages.AddCart;
import com.pages.AddToWishlist;
import com.pages.UserRegistration;

public class PageObjectClass {
	public static WebDriver driver;
	public static Logger log;
	public TestUtils ts;
	public UserRegistration ur;
	public AddCart ac;
	public AddToWishlist wish;

	@BeforeClass
	public void getPageClassObject() {
		ts = new TestUtils();
		ur = new UserRegistration();
		ac = new AddCart();
		wish = new AddToWishlist();

	}
}
