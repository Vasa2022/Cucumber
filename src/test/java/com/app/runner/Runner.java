package com.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\HP\\eclipse-workspace\\Develop\\new\\Cucumber_Jan\\src\\test\\java\\com\\app\\feature",
glue = "com.app.stepdefinition",
dryRun = false,
monochrome = true,
tags = "@tag_Smoke",
publish = true)
public class Runner {

}
