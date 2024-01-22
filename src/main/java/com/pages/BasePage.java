package com.pages;

import org.openqa.selenium.support.PageFactory;

import com.utility.BaseClass;

public class BasePage extends BaseClass {

	public BasePage() {

		PageFactory.initElements(driver, this);
	}
}
