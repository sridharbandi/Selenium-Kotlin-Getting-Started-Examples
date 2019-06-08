package com.tech.selenium.tests

import com.tech.selenium.driverutil.DriverFactory
import com.tech.selenium.pageobjects.GoogleSearchPage
import com.tech.selenium.pageobjects.SearchResultsPage
import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * Created by Sridhar Bandi on 08/06/19.
 */
class RunTest {

    internal lateinit var googleSearchPage: GoogleSearchPage
    internal lateinit var searchResultsPage: SearchResultsPage

    @Before
    fun setUp() {
        DriverFactory.setBrowser()
        googleSearchPage = GoogleSearchPage()
        searchResultsPage = SearchResultsPage()
    }

    @Test
    fun exampleTest() {
        //Write your test here
        googleSearchPage.openURL()
        googleSearchPage.searchFor("Selenium")
        Assert.assertTrue(searchResultsPage.getLnkSelenium().isDisplayed)
    }

}