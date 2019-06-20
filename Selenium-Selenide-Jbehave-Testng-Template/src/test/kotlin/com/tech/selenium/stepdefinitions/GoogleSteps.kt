package com.tech.selenium.stepdefinitions

import com.tech.selenium.driverutil.DriverFactory
import com.tech.selenium.pageobjects.GoogleSearchPage
import com.tech.selenium.pageobjects.SearchResultsPage
import org.jbehave.core.annotations.*
import org.jbehave.core.steps.Steps
import org.junit.Assert
import org.openqa.selenium.WebDriver


/**
 * Created by Sridhar Bandi on 20/06/19.
 */
class GoogleSteps : Steps() {

    internal lateinit var googleSearchPage: GoogleSearchPage
    internal lateinit var searchResultsPage: SearchResultsPage

    @BeforeScenario
    fun setUp() {
        DriverFactory.setBrowser()
        googleSearchPage = GoogleSearchPage()
        searchResultsPage = SearchResultsPage()
    }

    @Given("User is on Google search page")
    fun userOnGooglePage() {
        googleSearchPage.openURL()
    }

    @When("User searches for Selenium")
    fun userSearches() {
        googleSearchPage.searchFor("Selenium")
    }

    @Then("User can see Selenium results")
    fun userSeesResults() {
        Assert.assertTrue(searchResultsPage.getLnkSelenium().isDisplayed)
    }

}
