package com.app.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "C:\\Users\\HP\\eclipse-workspace\\Develop\\new\\Cucumber_Jan\\src\\test\\java\\com\\app\\feature",
glue = "com.app.stepdefinition",
dryRun = true,
monochrome = true,
tags = "@tag1")
public class Runner_Test extends AbstractTestNGCucumberTests {

	
}
