package com.tech.selenium.driverutil

import com.codeborne.selenide.Configuration

/**
 * Created by Sridhar Bandi on 20/06/19.
 */
object DriverFactory {
    fun setBrowser() {
        val browserName = System.getProperty("browser", DriverType.CHROME.toString()).toUpperCase()
        val _driverType = DriverType.valueOf(browserName)

        when (_driverType) {
            DriverType.CHROME -> System.setProperty("selenide.browser", "chrome")
            DriverType.FIREFOX -> System.setProperty("selenide.browser", "firefox")
            DriverType.EDGE -> System.setProperty("selenide.browser", "edge")
            DriverType.IE -> System.setProperty("selenide.browser", "ie")
            DriverType.OPERA -> System.setProperty("selenide.browser", "opera")
            else -> System.setProperty("selenide.browser", "chrome")
        }
        Configuration.startMaximized = true
        Configuration.timeout = 60000
    }
}