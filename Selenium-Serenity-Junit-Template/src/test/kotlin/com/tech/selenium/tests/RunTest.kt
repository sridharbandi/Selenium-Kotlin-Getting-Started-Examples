package com.tech.selenium.tests

import com.tech.selenium.steps.SearchSteps
import net.serenitybdd.junit.runners.SerenityRunner
import net.thucydides.core.annotations.Managed
import net.thucydides.core.annotations.Steps
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.openqa.selenium.WebDriver

/**
 * Created by Sridhar Bandi on 04/06/19.
 */
@RunWith(SerenityRunner::class)
class RunTest {

    @Managed
    internal var driver: WebDriver? = null

    @Steps
    internal var searchSteps: SearchSteps? = null

    @Test
    fun testExample() {
        searchSteps!!.openURL()
        searchSteps!!.searchFor("Selenium")
        Assert.assertTrue(searchSteps!!.seleniumLinkPresent())
    }
}
