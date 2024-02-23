package com.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utility.TestUtils;

public class OrderInformationPage extends BasePage {
	public OrderInformationPage() {
		super();
	}

	@FindBy(xpath = "//a[text()='Click here for order details.']")
	private WebElement CHECK_ORDER_DETAILS;

	@FindBy(xpath = "//div[@class='order-overview']")
	private WebElement GET_ORDER_DETAILS;

	public void clickOnCheckOrderDetails() throws InterruptedException {
		TestUtils.Custom_Click(CHECK_ORDER_DETAILS, "clickOnCheckOrderDetails");
		Thread.sleep(3000);
	}

	public void GetOrderDetails() {
		TestUtils.getText(GET_ORDER_DETAILS);
		TestUtils.Custom_ThreadSleep(2000);
	}

	public void downloadOrderDetailPDF() throws InterruptedException, AWTException {
		TestUtils.openPDFfileFromBrowser();
	}

}
