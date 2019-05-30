package com.tech.selenium.tests

import com.tech.selenium.driverutil.DriverFactory
import com.tech.selenium.pageobjects.GoogleSearchPage
import com.tech.selenium.pageobjects.SearchResultsPage
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.openqa.selenium.WebDriver

class RunTest {

    private var driver: WebDriver? = null
    internal lateinit var googleSearchPage: GoogleSearchPage
    internal lateinit var searchResultsPage: SearchResultsPage

    @Before
    fun setUp() {
        driver = DriverFactory.browser
        googleSearchPage = GoogleSearchPage(driver!!)
        searchResultsPage = SearchResultsPage(driver!!)
    }

    @Test
    fun testGoogle() {
        //Write your test here
        googleSearchPage.openURL()
        googleSearchPage.searchFor("Selenium")
        Assert.assertTrue(searchResultsPage.seleniumLink())
    }

    @After
    fun tearDown() {
        driver!!.quit()
    }
}