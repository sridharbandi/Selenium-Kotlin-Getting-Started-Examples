package com.tech.selenium.tests

import com.tech.selenium.driverutil.DriverFactory
import com.tech.selenium.pageobjects.GoogleSearchPage
import com.tech.selenium.pageobjects.SearchResultsPage
import org.fluentlenium.adapter.junit.FluentTest
import org.fluentlenium.core.annotation.Page
import org.junit.Assert
import org.junit.Test
import org.openqa.selenium.WebDriver

/**
 * Created by Sridhar Bandi on 21/06/19.
 */
class RunTest : FluentTest() {

    @Page
    internal var googleSearchPage: GoogleSearchPage? = null

    @Page
    internal var searchResultsPage: SearchResultsPage? = null

    override fun newWebDriver(): WebDriver {
        return DriverFactory.browser
    }

    @Test
    fun exampleTest() {
        //Write your test here
        googleSearchPage!!.openURL()
        googleSearchPage!!.searchFor("Selenium")
        Assert.assertTrue(searchResultsPage!!.getLnkSelenium()!!.displayed())
    }

}
