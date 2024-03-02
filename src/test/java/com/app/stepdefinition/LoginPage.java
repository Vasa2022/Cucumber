package com.app.stepdefinition;

import java.util.Map;

import com.app.pageexe.LoginPageExe;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends LoginPageExe {

	
	@When("Enter the username {string}")
	public void enter_the_username(String user) {
		username(user);
	}

	@When("Enter the password {string}")
	public void enter_the_password(String pass) {
		password(pass);
	}

	@When("Click the LoginButton")
	public void click_the_login_button() {
		loginbutton ();
	}

	@Then("Validate the pageTitle")
	public void validate_the_page_title() {

	}
	/*
	 * @When("Enter the user") public void enter_the_user(DataTable data) {
	 * List<String> asList = data.asList(); System.out.println(asList.get(0)); }
	 */

	// lists
	/*
	 * @When("Enter the user") public void enter_the_user(DataTable data) {
	 * List<List<String>> asLists = data.asLists();
	 * System.out.println(asLists.get(0).get(0)); }
	 */
     //map
	@When("Enter the user")
	public void enter_the_user(DataTable data) {
		Map<String, String> asMap = data.asMap();
	//	username("username",asMap.get("username"));
		
	}
}
