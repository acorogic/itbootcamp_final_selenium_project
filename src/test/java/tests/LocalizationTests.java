package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import retry.RetryMyAwersomeApp;

public class LocalizationTests extends BasicTest {


    @Test(priority = 1, retryAnalyzer = RetryMyAwersomeApp.class)
    public void SetLocaleToES() {

        navPage.clickOnLocalDropDown();
        navPage.clickOnLangugageES();
        Assert.assertEquals(navPage.getHederText(), "Página de aterrizaje");


    }

    @Test(priority = 2, retryAnalyzer = RetryMyAwersomeApp.class)
    public void SetLocaleToEN() {


        navPage.clickOnLocalDropDown();
        loginPage.clickOnLangugageEN();
        Assert.assertEquals(navPage.getHederText(), "Landing");


    }

    @Test(priority = 3, retryAnalyzer = RetryMyAwersomeApp.class)
    public void SetLocaleToCN() {


        navPage.clickOnLocalDropDown();
        navPage.clickOnLangugageCN();
        Assert.assertEquals(navPage.getHederText(), "首页");

    }

    @Test(priority = 4, retryAnalyzer = RetryMyAwersomeApp.class)
    public void SetLocaleToFR() {


        navPage.clickOnLocalDropDown();
        navPage.clickOnLangugageFR();
        Assert.assertEquals(navPage.getHederText(), "Page d'atterrissage");

    }

}
