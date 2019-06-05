package com.tech.selenium.stepdefinitions

import com.tech.selenium.steps.SearchSteps
import cucumber.api.Scenario
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import net.thucydides.core.annotations.Managed
import net.thucydides.core.annotations.Steps
import org.junit.Assert
import org.openqa.selenium.WebDriver

/**
 * Created by Sridhar Bandi on 05/06/19.
 */
class GoogleSteps {

    @Managed
    internal var driver: WebDriver? = null

    @Steps
    internal var searchSteps: SearchSteps? = null

    @Given("^User is on Google search page$")
    fun onGooglePage() {
        searchSteps!!.openURL()
    }

    @When("^User searches for Selenium$")
    fun searchFor() {
        searchSteps!!.searchFor("Selenium")
    }

    @Then("^User can see Selenium results$")
    fun results() {
        Assert.assertTrue(searchSteps!!.seleniumLinkPresent())
    }
}
