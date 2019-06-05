package com.tech.selenium.driverutil

import io.github.bonigarcia.wdm.WebDriverManager
import net.thucydides.core.webdriver.DriverSource
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.edge.EdgeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.ie.InternetExplorerDriver
import org.openqa.selenium.opera.OperaDriver

/**
 * Created by Sridhar Bandi on 05/06/19.
 */
class DriverFactory : DriverSource {

    override fun newDriver(): WebDriver {
        var _driver: WebDriver? = null
        val _browserName = System.getProperty("browser", DriverType.CHROME.toString()).toUpperCase()
        val _driverType = DriverType.valueOf(_browserName)
        when (_driverType) {
            DriverType.CHROME -> {
                WebDriverManager.chromedriver().setup()
                _driver = ChromeDriver()
            }
            DriverType.FIREFOX -> {
                WebDriverManager.firefoxdriver().setup()
                _driver = FirefoxDriver()
            }
            DriverType.EDGE -> {
                WebDriverManager.edgedriver().setup()
                _driver = EdgeDriver()
            }
            DriverType.IE -> {
                WebDriverManager.iedriver().setup()
                _driver = InternetExplorerDriver()
            }
            DriverType.OPERA -> {
                WebDriverManager.operadriver().setup()
                _driver = OperaDriver()
            }
            else -> {
                WebDriverManager.chromedriver().setup()
                _driver = ChromeDriver()
            }
        }
        _driver!!.manage().window().maximize()
        return _driver

    }

    override fun takesScreenshots(): Boolean {
        return true
    }
}
