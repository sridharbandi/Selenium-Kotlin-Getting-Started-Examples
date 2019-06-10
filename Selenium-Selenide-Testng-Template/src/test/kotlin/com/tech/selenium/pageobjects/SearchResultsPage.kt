package com.tech.selenium.pageobjects

import com.codeborne.selenide.Condition
import com.codeborne.selenide.SelenideElement

import com.codeborne.selenide.Selectors.byPartialLinkText
import com.codeborne.selenide.Selenide.`$`

/**
 * Created by Sridhar Bandi on 08/06/19.
 */
class SearchResultsPage {
    private val lnkSelenium = `$`(byPartialLinkText("Selenium - Web Browser Automation"))

    fun getLnkSelenium(): SelenideElement {
        return lnkSelenium.waitUntil(Condition.appear, 60000)
    }
}
