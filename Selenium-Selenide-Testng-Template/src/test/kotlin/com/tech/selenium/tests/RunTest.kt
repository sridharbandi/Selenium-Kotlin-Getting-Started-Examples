package com.tech.selenium.tests

import com.tech.selenium.driverutil.DriverFactory
import com.tech.selenium.pageobjects.GoogleSearchPage
import com.tech.selenium.pageobjects.SearchResultsPage
import org.testng.Assert
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test

/**
 * Created by Sridhar Bandi on 10/06/19.
 */
class RunTest {

    internal lateinit var googleSearchPage: GoogleSearchPage
    internal lateinit var searchResultsPage: SearchResultsPage

    @BeforeTest
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