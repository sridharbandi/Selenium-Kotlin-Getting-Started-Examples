package com.tech.selenium.tests

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

/**
 * Created by Sridhar Bandi on 22/06/19.
 */
@RunWith(Cucumber::class)
@CucumberOptions(
    features = arrayOf("classpath:features/Google.feature"),
    glue = arrayOf("com.tech.selenium.stepdefinitions"),
    plugin = arrayOf("json:target/cucumber-report.json", "html:target/cucumber-html")
)
class TestRunner
