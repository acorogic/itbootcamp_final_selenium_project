package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import retry.RetryMyAwersomeApp;

public class LoginTests extends BasicTest {

    @Test(priority = 1, retryAnalyzer = RetryMyAwersomeApp.class)

    public void VisitTheLoginPage() throws InterruptedException {
//        loginPage.selectEnFromDropDownMenu();
//        Thread.sleep(3000);
        loginPage.selectEnlishLanguge();
        loginPage.clickOnLoginButton();

        Assert
                .assertEquals(loginPage.getUrl(), "https://vue-demo.daniel-avellaneda.com/login"); //mozda moze baseUrl+ "/login"

//        Test #1: Visits the login page
//        Koraci:
//        Postaviti EN jezik stranice
//        Klik na login dugme iz navigacije
//        Verifikovati da se u url-u stranice javlja ruta /login

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


//    Test #2: Checks input types
//    Koraci:
//    Klik na login dugme iz navigacije
//    Verifikovati da polje za unos emaila za atribut type ima vrednost email
//    Verifikovati da polje za unos lozinke za atribut type ima vrednost password

    }

    @Test(priority = 3, retryAnalyzer = RetryMyAwersomeApp.class)

    public void DisplaysErrorsWhenUserDoesNotExist () {
        loginPage.clickOnLoginButton();
        loginPage.enterInvalidCredentials();
        loginPage.clickLoginSubmit();
        messagePopUpPage.waitForPopUpUserDNEtoBeVisible();
        Assert.assertEquals(messagePopUpPage
                .getPopUpMessage(), "User does not exists");

        Assert
                .assertEquals(loginPage.getUrl(), "https://vue-demo.daniel-avellaneda.com/login");

//
//    Test #3: Displays errors when user does not exist
//    Podaci:
//    email: non-existing-user@gmal.com
//    password: password123
//    Koraci:
//    Klik na login dugme iz navigacije
//    Popuniti login formu podacima za logovanje
//    Klik na login dugme
//    Sacekati da popu za prikaz greske bude vidljiv
//    Verifikovati da greska sadrzi poruku User does not exists
//    Verifikovati da se u url-u stranice javlja /login ruta

    }

    @Test (priority = 4, retryAnalyzer = RetryMyAwersomeApp.class)

    public void  DisplaysErrorsWhenPasswordIsWrong (){
        loginPage.clickOnLoginButton();
        loginPage.enterValidUsernameInvalidPassword();
        loginPage.clickLoginSubmit();
        messagePopUpPage.waitForPopUpUserDNEtoBeVisible();
        Assert.assertEquals(messagePopUpPage
                .getPopUpMessage(), "Wrong password");

        Assert
                .assertEquals(loginPage.getUrl(), "https://vue-demo.daniel-avellaneda.com/login");



//        Test #4: Displays errors when password is wrong
//        Podaci:
//        email: admin@admin.com
//        password: password123
//        Koraci:
//        Klik na login dugme iz navigacije
//        Popuniti login formu podacima za logovanje
//        Klik na login dugme
//        Sacekati da popu za prikaz poruke bude vidljiv
//        Verifikovati da greska sadrzi poruku Wrong password
//        Verifikovati da se u url-u stranice javlja /login ruta


    }

@Test(priority = 5, retryAnalyzer = RetryMyAwersomeApp.class)
    public void Login() throws InterruptedException {
    loginPage.clickOnLoginButton();
    loginPage.enterValidUsernameValidPassword();


    loginPage.clickLoginSubmit();
    navPage.waitForHomeButtonToBeVisible();

    Assert
            .assertEquals(loginPage.getUrl(), "https://vue-demo.daniel-avellaneda.com/home");



   // Test #5: Login
//    Podaci:
//    email: admin@admin.com
//    password: 12345
//    Koraci:
//    Klik na login dugme iz navigacije
//    Popuniti login formu podacima za logovanje
//    Verifikovati da se u url-u stranice javlja /home ruta


}


    @Test(priority = 6, retryAnalyzer = RetryMyAwersomeApp.class)

    public void Logout() {
        loginPage.clickOnLoginButton();
        loginPage.enterValidUsernameValidPassword();
        loginPage.clickLoginSubmit();

        Assert.assertTrue(navPage.elementExistLogoutButton(), "Logout button is not present");  //asert visible??
        navPage.clickOnLogoutButton();



//        Koraci:
//        Verifikovati da je dugme logout vidljivo na stranici
//        Kliknuti na logout dugme

    }





}