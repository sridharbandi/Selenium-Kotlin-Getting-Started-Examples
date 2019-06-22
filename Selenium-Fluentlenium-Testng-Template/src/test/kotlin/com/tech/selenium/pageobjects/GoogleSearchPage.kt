package com.tech.selenium.pageobjects

import org.fluentlenium.core.FluentPage
import org.fluentlenium.core.domain.FluentWebElement
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

/**
 * Created by Sridhar Bandi on 22/06/19.
 */
class GoogleSearchPage : FluentPage() {

    @FindBy(name = "q")
    internal var searchBox: FluentWebElement? = null

    fun openURL() {
        goTo("https://www.google.com/")
    }

    fun searchFor(searchTerm: String) {
        searchBox!!.fill().with(searchTerm)
        searchBox!!.submit()
    }
}