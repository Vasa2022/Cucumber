package com.app.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver = null;


	public static void inputdata(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void clickData(WebElement element) {
		element.click();
	}

}
