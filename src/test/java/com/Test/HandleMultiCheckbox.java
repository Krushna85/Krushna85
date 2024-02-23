package com.Test;

import org.testng.annotations.Test;

import com.utility.BaseClass;

public class HandleMultiCheckbox extends BaseClass {
	@Test
	public void selectingMultiCheckbox() throws InterruptedException {
		selectMultiCheckboxes.enterValueInSearchBar("Build your own computer");
		selectMultiCheckboxes.clickOnSearch();
		selectMultiCheckboxes.clickOnComputer();
		selectMultiCheckboxes.deselectCheckbox();
		selectMultiCheckboxes.selectmulticheckbox();
	}
}
