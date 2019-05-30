package com.tech.selenium.pageobjects

import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

/**
 * Created by Sridhar Bandi on 30/05/19.
 */
class GoogleSearchPage(driver: WebDriver) {

    private var driver: WebDriver? = null

    @FindBy(name = "q")
    internal var searchBox: WebElement? = null

    init {
        this.driver = driver
        PageFactory.initElements(driver, this)
    }

    fun openURL() {
        driver!!.get("https://www.google.com/")
    }

    fun searchFor(_searchTerm: String) {
        searchBox!!.sendKeys(_searchTerm + Keys.RETURN)
    }
}