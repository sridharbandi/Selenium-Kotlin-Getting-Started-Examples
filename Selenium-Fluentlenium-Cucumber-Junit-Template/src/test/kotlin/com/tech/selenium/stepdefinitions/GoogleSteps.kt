package com.tech.selenium.stepdefinitions

import com.tech.selenium.driverutil.DriverFactory
import com.tech.selenium.pageobjects.GoogleSearchPage
import com.tech.selenium.pageobjects.SearchResultsPage
import cucumber.api.java8.En
import cucumber.api.java8.HookBody
import org.fluentlenium.adapter.cucumber.FluentCucumberTest
import org.fluentlenium.core.annotation.Page
import org.junit.Assert
import org.openqa.selenium.WebDriver

/**
 * Created by Sridhar Bandi on 22/05/19.
 */
class GoogleSteps : FluentCucumberTest(), En {

    @Page
    internal var googleSearchPage: GoogleSearchPage? = null

    @Page
    internal var searchResultsPage: SearchResultsPage? = null

    override fun newWebDriver(): WebDriver {
        return DriverFactory.browser
    }

    init {

        Before(HookBody { this.before(it) })

        Given("^User is on Google search page$") { googleSearchPage!!.openURL() }

        When("^User searches for Selenium$") { googleSearchPage!!.searchFor("Selenium") }

        Then("^User can see Selenium results$") { Assert.assertTrue(searchResultsPage!!.getLnkSelenium()!!.displayed()) }

        After(HookBody { this.after(it) })
    }
}
