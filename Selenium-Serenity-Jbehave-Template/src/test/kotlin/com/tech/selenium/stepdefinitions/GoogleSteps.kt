package com.tech.selenium.stepdefinitions

import com.tech.selenium.steps.SearchSteps
import net.thucydides.core.annotations.Managed
import net.thucydides.core.annotations.Steps
import org.jbehave.core.annotations.Given
import org.jbehave.core.annotations.Then
import org.jbehave.core.annotations.When
import org.junit.Assert
import org.openqa.selenium.WebDriver

/**
 * Created by Sridhar Bandi on 07/06/19.
 */
class GoogleSteps {

    @Managed
    internal var driver: WebDriver? = null

    @Steps
    internal var searchSteps: SearchSteps? = null

    @Given("User is on Google search page")
    fun onGooglePage() {
        searchSteps!!.openURL()
    }

    @When("User searches for Selenium")
    fun searchFor() {
        searchSteps!!.searchFor("Selenium")
    }

    @Then("User can see Selenium results")
    fun results() {
        Assert.assertTrue(searchSteps!!.seleniumLinkPresent())
    }
}
