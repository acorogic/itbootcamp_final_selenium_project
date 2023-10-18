package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import retry.RetryMyAwersomeApp;

public class AuthRoutesTests extends BasicTest {


    @Test(priority = 1, retryAnalyzer = RetryMyAwersomeApp.class)

    public void ForbidsVisitsToHomeUrlIfNotAuthenticated() {

        driver.navigate().to(baseUrl + "/home");

        Assert.assertEquals(navPage.getUrl(), baseUrl + "/login");


//    Test #1: Forbids visits to home url if not authenticated
//    Koraci:
//    Ucitati /home stranu
//    Verifikovati da se u url-u stranice javlja ruta /login

}
    @Test(priority = 2, retryAnalyzer = RetryMyAwersomeApp.class)

public void ForbidsVisitsToProfileUrlifNotAuthenticated(){

    driver.navigate().to(baseUrl+ "/profile");
        Assert.assertEquals(navPage.getUrl(), baseUrl + "/login");

//    Test #2: Forbids visits to profile url if not authenticated
//    Koraci:
//    Ucitati /profile stranu
//    Verifikovati da se u url-u stranice javlja ruta /login

}
    @Test(priority = 3, retryAnalyzer = RetryMyAwersomeApp.class)

    public void ForbidsVisitsToAdminCitiesUrlifNotAuthenticated () {
driver.navigate().to(baseUrl+"/admin/cities");
        Assert.assertEquals(navPage.getUrl(), baseUrl + "/login");


//    Test #3: Forbids visits to admin cities url if not authenticated
//    Koraci:
//    Ucitati /admin/cities stranu
//    Verifikovati da se u url-u stranice javlja ruta /login

    }

    @Test(priority = 3, retryAnalyzer = RetryMyAwersomeApp.class)

    public void ForbidsVisitsToAdminUsersUrlIfNotAuthenticated(){

        driver.navigate().to(baseUrl+"/admin/users");
        Assert.assertEquals(navPage.getUrl(), baseUrl + "/login");

//    Test #4: Forbids visits to admin users url if not authenticated
//    Koraci:
//    Ucitati /admin/users stranu
//    Verifikovati da se u url-u stranice javlja ruta /login



}}
