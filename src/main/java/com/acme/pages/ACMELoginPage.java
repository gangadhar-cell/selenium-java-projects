package com.acme.pages;

import com.leafBot.testng.api.base.Annotations;

public class ACMELoginPage extends Annotations{
	public ACMELoginPage enterUserName() {
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		return this;
	}
	public ACMELoginPage enterPassword() {
		driver.findElementById("password").sendKeys("leaf@12");
		return this;
	}
	public ACMEHomePage clickLogin() {
		driver.findElementById("buttonLogin").click();
		return new ACMEHomePage();
	}

}
