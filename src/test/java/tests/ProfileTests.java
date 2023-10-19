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


    }


}
