package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utility.TestUtils;

public class SelectMultiCheckboxes extends BasePage {
	public SelectMultiCheckboxes() {
		super();
	}

	@FindBy(id = "small-searchterms")
	private WebElement SEARCH_BAR;

	@FindBy(xpath = "//button[text()='Search']")
	private WebElement SEARCH_BUTTON;

	@FindBy(xpath = "(//a[text()='Build your own computer'])")
	private WebElement COMPUTER;

	@FindBy(id = "product_attribute_input_5")
	private WebElement CHECKBOXES;

	@FindBy(xpath = "((//ul[@class='option-list'])[3])//li")
	private List<WebElement> checkboxList;

	@FindBy(xpath = "//label[text()='Microsoft Office [+$50.00]']")
	private WebElement singleCheckbox;

	// List<WebElement> checkboxList =
	// driver.findElements(By.xpath("(//ul[@class='option-list'])[3]"));

	public void enterValueInSearchBar(String value) {
		TestUtils.Custom_SendKeys(SEARCH_BAR, value, "searchValue");
	}

	public void clickOnSearch() {
		TestUtils.Custom_Click(SEARCH_BUTTON, "clickOnSearch");
	}

	public void clickOnComputer() throws InterruptedException {
		TestUtils.Custom_Click(COMPUTER, "clickOnComputer");
		Thread.sleep(3000);
	}

//	public void selectAllSoftware() throws InterruptedException {
//		TestUtils.clickAllCheckboxes(checkboxList);
//	}

	public void deselectCheckbox() {
		if (singleCheckbox.isSelected()) {
			// If selected, uncheck it by clicking
			singleCheckbox.click();
			log.info("deselected single checkbox");
		}
	}

	public void selectmulticheckbox() {
		for (WebElement checkbox : checkboxList) {
			checkbox.click();
			System.out.println(checkbox.getText());
			System.out.println(checkboxList.size());
			log.info("selected on checkbox");
			TestUtils.Custom_ThreadSleep(3000);
		}
	}

}
