package com.acme.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.leafBot.testng.api.base.Annotations;

public class ACMEHomePage extends Annotations{
	public ACMEHomePage mouserOverOn() {
		WebElement e1 = driver.findElementByXPath("//button[text()[normalize-space()='Invoices']]");
		Actions builder=new Actions(driver);
		builder.moveToElement(e1).perform();
		return this;
	}
	public ACMEInvoiceSearchPage clickSearch() {
		driver.findElementByLinkText("Search for Invoice").click();
		return new ACMEInvoiceSearchPage();
	}

}
