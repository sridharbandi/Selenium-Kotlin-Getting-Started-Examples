package com.tech.selenium.tests

import cucumber.api.CucumberOptions
import net.serenitybdd.cucumber.CucumberWithSerenity
import org.junit.runner.RunWith

/**
 * Created by Sridhar Bandi on 05/06/19.
 */
@RunWith(CucumberWithSerenity::class)
@CucumberOptions(
    features = arrayOf("classpath:features/Google.feature"),
    glue = arrayOf("com.tech.selenium.stepdefinitions")
)
class TestRunner