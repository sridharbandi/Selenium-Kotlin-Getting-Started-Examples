package com.tech.selenium.pageobjects

import org.junit.Assert
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class SearchResultsPage(driver: WebDriver) {

    private var driver: WebDriver? = null

    @FindBy(partialLinkText = "Selenium - Web Browser Automation")
    internal var lnkSelenium: WebElement? = null

    init {
        this.driver = driver
        PageFactory.initElements(driver, this)
    }

    fun assertSeleniumPresent() {
        Assert.assertTrue(lnkSelenium!!.isDisplayed)
    }
}