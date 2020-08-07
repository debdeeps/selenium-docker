package com.basetest;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.*;

public class BaseTest {
    protected WebDriver driver;
    @BeforeTest
    public void setup(){
        this.driver= new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver.exe");

    }
    @AfterTest
    public void teardown(){
        this.driver.close();
    }
}
