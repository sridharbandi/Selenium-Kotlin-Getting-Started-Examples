package com.tech.selenium.pageobjects

import com.codeborne.selenide.Selectors.byName
import com.codeborne.selenide.Selenide.`$`
import com.codeborne.selenide.Selenide.open

/**
 * Created by Sridhar Bandi on 18/06/19.
 */
class GoogleSearchPage {
    private val searchBox = `$`(byName("q"))

    fun openURL() {
        open("https://www.google.com/")
    }

    fun searchFor(searchTerm: String) {
        searchBox.`val`(searchTerm).pressEnter()
    }
}