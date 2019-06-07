package com.tech.selenium.steps

import com.tech.selenium.pageobjects.GoogleSearchPage
import com.tech.selenium.pageobjects.SearchResultsPage
import net.thucydides.core.annotations.Step
import net.thucydides.core.steps.ScenarioSteps

/**
 * Created by Sridhar Bandi on 07/06/19.
 */
open class SearchSteps : ScenarioSteps() {

    internal var googleSearchPage: GoogleSearchPage? = null
    internal var searchResultsPage: SearchResultsPage? = null

    @Step
    open fun openURL() {
        googleSearchPage!!.open()
    }

    @Step
    open fun searchFor(searchterm: String) {
        googleSearchPage!!.searchFor(searchterm)
    }

    @Step
    open fun seleniumLinkPresent(): Boolean {
        return searchResultsPage!!.seleniumResultPresent()
    }
}
