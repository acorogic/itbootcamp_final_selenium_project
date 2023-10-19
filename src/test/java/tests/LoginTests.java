package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import retry.RetryMyAwersomeApp;

public class LoginTests extends BasicTest {

    @Test(priority = 1, retryAnalyzer = RetryMyAwersomeApp.class)

    public void VisitTheLoginPage() throws InterruptedException {

        loginPage.selectEnlishLanguge();
        loginPage.clickOnLoginButton();

        Assert
                .assertEquals(loginPage.getUrl(), baseUrl + "/login");


    }

    @Test(priority = 2, retryAnalyzer = RetryMyAwersomeApp.class)

    public void ChecksInputTypes() {
        loginPage.clickOnLoginButton();
        Assert
                .assertEquals(loginPage.getEmailFieldType(),
                        "email",
                        "Input type doesn't match");


        Assert.assertEquals(loginPage.getPasswordFieldType(),
                "password",
                "Input type doesn't match ");


    }

    @Test(priority = 3, retryAnalyzer = RetryMyAwersomeApp.class)

    public void DisplaysErrorsWhenUserDoesNotExist() {
        loginPage.clickOnLoginButton();

        String email = "non-existing-user@gmal.com";
        String password = "password123";
        loginPage.enterInvalidCredentials(email, password);
        loginPage.clickLoginSubmit();
        messagePopUpPage.waitForPopUpUserDNEtoBeVisible();
        Assert.assertEquals(messagePopUpPage
                .getPopUpMessage(), "User does not exists");

        Assert
                .assertEquals(loginPage.getUrl(), baseUrl + "/login");


    }

    @Test(priority = 4, retryAnalyzer = RetryMyAwersomeApp.class)

    public void DisplaysErrorsWhenPasswordIsWrong() {
        loginPage.clickOnLoginButton();
        String email = "admin@admin.com";
        String password = "password123";

        loginPage.enterValidUsernameInvalidPassword(email, password);
        loginPage.clickLoginSubmit();
        messagePopUpPage.waitForPopUpUserDNEtoBeVisible();
        Assert.assertEquals(messagePopUpPage
                .getPopUpMessage(), "Wrong password");

        Assert
                .assertEquals(loginPage.getUrl(), baseUrl + "/login");


    }

    @Test(priority = 5, retryAnalyzer = RetryMyAwersomeApp.class)

    public void Login() {
        loginPage.clickOnLoginButton();

        String email = "admin@admin.com";
        String password = "12345";
        loginPage.enterValidUsernameValidPassword(email, password);


        loginPage.clickLoginSubmit();
        navPage.waitForHomeButtonToBeVisible();

        Assert
                .assertEquals(loginPage.getUrl(), baseUrl + "/home");
    }


    @Test(priority = 6, retryAnalyzer = RetryMyAwersomeApp.class)

    public void Logout() {


        Assert.assertTrue(navPage.getLogoutButton().isDisplayed(),
                "Logout button is not visible");
        navPage.clickOnLogoutButton();


    }


}