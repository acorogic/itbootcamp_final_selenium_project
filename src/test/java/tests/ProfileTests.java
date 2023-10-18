package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import retry.RetryMyAwersomeApp;

public class ProfileTests extends BasicTest {

    @Test(priority = 1, retryAnalyzer = RetryMyAwersomeApp.class)
    public void VisitsTheProfilePage() {

        loginPage.clickOnLoginButton();

        String email = "admin@admin.com";
        String password = "12345";
        loginPage.enterValidUsernameValidPassword(email, password);
        loginPage.clickLoginSubmit();



        navPage.waitForMyProfileButtonToBeVisible();
        navPage.clickOnMyProfileButton();

        Assert.assertEquals(navPage.getUrl(), baseUrl + "/profile");
        navPage.clickOnLogoutButton();
//    Test #1: Visits the profile page
//    Podaci:
//    email: admin@admin.com
//    password: 12345
//    Koraci:
//    Klik na login dugme iz navigacije
//    Prijavljivanje na sistem sa admin kredencijalima
//    Ucitati /profile stranicu
//    Verifikovati da se u url-u stranice javlja ruta /profile
//    Verifikovati da email polje za atribut value ima vrednost admin@admin.com
//    Klik na logout dugme

    }
}
