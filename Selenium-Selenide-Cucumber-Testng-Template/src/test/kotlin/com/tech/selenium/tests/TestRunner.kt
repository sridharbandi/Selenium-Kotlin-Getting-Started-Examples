package com.tech.selenium.tests

import cucumber.api.CucumberOptions
import cucumber.api.testng.AbstractTestNGCucumberTests


/**
 * Created by Sridhar Bandi on 18/06/19.
 */
@CucumberOptions(
    features = arrayOf("classpath:features/Google.feature"),
    glue = arrayOf("com.tech.selenium.stepdefinitions"),
    plugin = arrayOf("json:target/cucumber-report.json", "html:target/cucumber-html")
)
class TestRunner : AbstractTestNGCucumberTests()