package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.acme.pages.ACMELoginPage;
import com.leafBot.testng.api.base.Annotations;

public class TC_ACME_Result extends Annotations{
	@BeforeTest
	public void setData() {
		//excelFileName="TC001";
		testcaseName="verify_Result_ACME";
		testcaseDec = "ACME Verification task";
		author="ganadhar";
		category="no category";
	}
	@Test
	public void acme_TC() {
		new ACMELoginPage()
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.mouserOverOn()
		.clickSearch()
		.enterVendorTaxId()
		.clickSearchACMEInvoicePage()
		.getResults();
}
}