package com.duckduckgo.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

public class SearchPage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(id="search_form_input_homepage")
    private WebElement searchBox;

    @FindBy(id="search_button_homepage")
    private WebElement searchIcon;

    public SearchPage(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);

    }

    public void goTo (){
        this.driver.get("https://duckduckgo.com/");
    }
    public void enterSearchText(String searchText){
        this.wait.until(ExpectedConditions.visibilityOf(this.searchBox));
        this.searchBox.sendKeys(searchText);
    }

    public void clickSearch(){
        this.searchIcon.click();
    }

}
