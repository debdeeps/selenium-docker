package com.duckduckgo.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.util.*;

public class SearchResultPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(css="a[data-zci-link='videos']")
    private WebElement videoLink;

    @FindBy(css="div[class*='tile--vid']")
    private List<WebElement> searchResult;



    public SearchResultPage(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);

    }

  public int getSearchcount(){
        By by=By.cssSelector("div[class*='tile--vid']");
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(by,0));
        return this.searchResult.size();

  }
    public void clickVideoLink(){
        wait.until(ExpectedConditions.visibilityOf(videoLink));
        this.videoLink.click();
    }
}

