package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

public class HomePage extends SeleniumBase{
	public HomePage clickLogout() {
		click(locateElement("class","decorativeSubmit"));
		System.out.println();
		return new HomePage();
	}

}
