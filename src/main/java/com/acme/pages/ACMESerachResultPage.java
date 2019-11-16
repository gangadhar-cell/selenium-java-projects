package com.acme.pages;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.Annotations;

public class ACMESerachResultPage extends Annotations{
      public ACMESerachResultPage getResults() {
    	  List<WebElement> items = driver.findElementsByXPath("//table/tbody/tr/td[3]");
  		List<WebElement> ids = driver.findElementsByXPath("//table/tbody/tr/td[1]");
  		Map<Integer,String> tm=new TreeMap<Integer,String>();
  		for(int i=0;i<items.size();i++) {
  			String s=ids.get(i).getText();
  			tm.put(Integer.parseInt(s), items.get(i).getText());
  		}
  		for(Entry e:tm.entrySet()) {
  			if(e.getValue().equals("IT Support"))
  				System.out.println("The match result is: "+e.getKey());
  		}
       return this;
      }
}
