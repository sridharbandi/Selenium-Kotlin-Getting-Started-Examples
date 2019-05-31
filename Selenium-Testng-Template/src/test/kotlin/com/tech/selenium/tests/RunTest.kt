package com.tech.selenium.tests

import com.tech.selenium.driverutil.DriverFactory
import com.tech.selenium.pageobjects.GoogleSearchPage
import com.tech.selenium.pageobjects.SearchResultsPage
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test

/**
 * Created by Sridhar Bandi on 31/05/19.
 */
class RunTest {

    private var driver: WebDriver? = null
    internal lateinit var googleSearchPage: GoogleSearchPage
    internal lateinit var searchResultsPage: SearchResultsPage

    @BeforeTest
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

    @AfterTest
    fun tearDown() {
        driver!!.quit()
    }
}