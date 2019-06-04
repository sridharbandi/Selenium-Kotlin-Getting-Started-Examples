package com.tech.selenium.pageobjects

import net.serenitybdd.core.annotations.findby.FindBy
import net.serenitybdd.core.pages.WebElementFacade
import net.thucydides.core.annotations.DefaultUrl
import net.thucydides.core.pages.PageObject
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver

/**
 * Created by Sridhar Bandi on 04/06/19.
 */
@DefaultUrl("https://www.google.com/")
class GoogleSearchPage : PageObject() {

    private val _driver: WebDriver? = null

    @FindBy(name = "q")
    internal var searchbox: WebElementFacade? = null

    fun searchFor(_searchTerm: String) {
        searchbox!!.waitUntilVisible<WebElementFacade>().sendKeys(_searchTerm + Keys.RETURN)
    }

}
