package com.duckduckgo.tests;

import com.basetest.*;
import com.duckduckgo.pages.*;
import org.testng.*;
import org.testng.annotations.*;

public class SearchTest extends BaseTest {
    @Test
    @Parameters({"keyword"})
    public void SearchPageTest(String searchText) {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.goTo();
        searchPage.enterSearchText(searchText);
        searchPage.clickSearch();

    }

    @Test(dependsOnMethods = ("SearchPageTest"))
    public void getSearchResult() throws InterruptedException {
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        System.out.println("Clicking link");

        searchResultPage.clickVideoLink();

        int searchcount= searchResultPage.getSearchcount();
        Assert.assertTrue(searchcount > 0);
    }

}
