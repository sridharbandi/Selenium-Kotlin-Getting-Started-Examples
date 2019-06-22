package com.tech.selenium.pageobjects

import org.fluentlenium.core.FluentPage
import org.fluentlenium.core.domain.FluentWebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

/**
 * Created by Sridhar Bandi on 22/06/19.
 */
class SearchResultsPage : FluentPage() {

    @FindBy(partialLinkText = "Selenium - Web Browser Automation")
    internal var lnkSelenium: FluentWebElement? = null

    fun getLnkSelenium(): FluentWebElement? {
        await().untilPage().isLoaded
        return lnkSelenium!!
    }
}