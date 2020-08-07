package com.duckduckgo.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.*;

public class SearchResultTest {

    private WebDriver driver;

    @BeforeTest
    public void setup() {
        this.driver=new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver.exe");

    }




}
    




