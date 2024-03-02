package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.pageobject.LoginPage_Locator;

public class LoginPageExe extends LoginPage_Locator{
	
	public static void username (String data) {
		BaseClass.inputdata(LoginPage_Locator.getLoginId("username"), data);
	}
	
	public static void password (String data) {
		BaseClass.inputdata(LoginPage_Locator.getLoginId("password"), data);
	}

	public static void loginbutton () {
		BaseClass.clickData(LoginPage_Locator.getLoginId("login"));
	}

}
