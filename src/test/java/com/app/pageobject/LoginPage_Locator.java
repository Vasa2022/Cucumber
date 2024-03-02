package com.app.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.base.BaseClass;

public class LoginPage_Locator extends BaseClass {
	
	public static WebElement getLoginId(String data) {
		return driver.findElement(By.id(""+data+""));	
	}

}
