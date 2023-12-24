package com.juaracoding;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/main/resources/Features/Login.feature", "src/main/resources/Features/Cart.feature"},
                glue = "com.juaracoding",
                plugin = {"pretty", "html:target/cucumber-report.html","json:target/cucumber.json"})

public class RunTesting extends AbstractTestNGCucumberTests {


}