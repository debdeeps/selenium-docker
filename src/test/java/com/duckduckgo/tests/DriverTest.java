package com.duckduckgo.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.*;

public class DriverTest {

    private WebDriver driver;

    @Test
    public void driverTest() {
        this.driver= new FirefoxDriver();
//        this.driver = new ChromeDriver();
//        System.setProperty("webdriver.chrome.driver", "C:\\Software\\ChromeDriver1\\chromedriver.exe");
        driver.get("https://www.guru99.com/install-testng-in-eclipse.html");
        System.out.println(driver.getTitle());


    }

}
