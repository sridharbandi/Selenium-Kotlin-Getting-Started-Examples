package com.tech.selenium.stepdefinitions

import com.tech.selenium.driverutil.DriverFactory
import com.tech.selenium.pageobjects.GoogleSearchPage
import com.tech.selenium.pageobjects.SearchResultsPage
import cucumber.api.Scenario
import cucumber.api.java8.En
import org.junit.Assert

/**
 * Created by Sridhar Bandi on 11/06/19.
 */
class GoogleSteps : En {

    private lateinit var googleSearchPage: GoogleSearchPage
    private lateinit var searchResultsPage: SearchResultsPage

    init {

        Before { scenario: Scenario ->
            DriverFactory.setBrowser()
            googleSearchPage = GoogleSearchPage()
            searchResultsPage = SearchResultsPage()
        }

        Given("^User is on Google search page$") { googleSearchPage.openURL() }

        When("^User searches for Selenium$") { googleSearchPage.searchFor("Selenium") }

        Then("^User can see Selenium results$") { Assert.assertTrue(searchResultsPage.getLnkSelenium().isDisplayed) }
    }
}
