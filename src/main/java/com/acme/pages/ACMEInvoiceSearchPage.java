package com.acme.pages;

import com.leafBot.testng.api.base.Annotations;

public class ACMEInvoiceSearchPage extends Annotations{
	public ACMEInvoiceSearchPage enterVendorTaxId() {
		driver.findElementById("vendorTaxID").sendKeys("DE763212");
		return this;
	}
	public ACMESerachResultPage clickSearchACMEInvoicePage() {
		driver.findElementById("buttonSearch").click();
		return new ACMESerachResultPage();
	}

}
