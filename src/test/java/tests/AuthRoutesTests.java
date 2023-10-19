package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import retry.RetryMyAwersomeApp;

public class AuthRoutesTests extends BasicTest {


    @Test(priority = 1, retryAnalyzer = RetryMyAwersomeApp.class)

    public void ForbidsVisitsToHomeUrlIfNotAuthenticated() {

        driver.navigate().to(baseUrl + "/home");

        Assert.assertEquals(navPage.getUrl(), baseUrl + "/login");


    }

    @Test(priority = 2, retryAnalyzer = RetryMyAwersomeApp.class)

    public void ForbidsVisitsToProfileUrlifNotAuthenticated() {

        driver.navigate().to(baseUrl + "/profile");
        Assert.assertEquals(navPage.getUrl(), baseUrl + "/login");


    }

    @Test(priority = 3, retryAnalyzer = RetryMyAwersomeApp.class)

    public void ForbidsVisitsToAdminCitiesUrlifNotAuthenticated() {
        driver.navigate().to(baseUrl + "/admin/cities");
        Assert.assertEquals(navPage.getUrl(), baseUrl + "/login");


    }

    @Test(priority = 4, retryAnalyzer = RetryMyAwersomeApp.class)

    public void ForbidsVisitsToAdminUsersUrlIfNotAuthenticated() {

        driver.navigate().to(baseUrl + "/admin/users");
        Assert.assertEquals(navPage.getUrl(), baseUrl + "/login");


    }
}
