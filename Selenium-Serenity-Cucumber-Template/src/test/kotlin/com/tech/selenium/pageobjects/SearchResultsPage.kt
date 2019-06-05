package com.tech.selenium.pageobjects

import net.serenitybdd.core.annotations.findby.FindBy
import net.serenitybdd.core.pages.WebElementFacade
import net.thucydides.core.pages.PageObject
import org.openqa.selenium.WebDriver

/**
 * Created by Sridhar Bandi on 05/06/19.
 */
class SearchResultsPage : PageObject() {

    private val _driver: WebDriver? = null

    @FindBy(partialLinkText = "Selenium - Web Browser Automation")
    internal var lnkSelenium: WebElementFacade? = null

    fun seleniumResultPresent(): Boolean {
        return lnkSelenium!!.isDisplayed
    }
}
