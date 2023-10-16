package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import retry.RetryMyAwersomeApp;

public class SignupTests extends BasicTest {

    @Test(priority = 1, retryAnalyzer = RetryMyAwersomeApp.class)

    public void VisitsTheSignupPage(){


navPage.clickOnSignUpButton();
        Assert
                .assertEquals(navPage.getUrl(), "https://vue-demo.daniel-avellaneda.com/signup");

//    Test #1: Visits the signup page
//    Koraci:
//    Klik na sign up dugme iz navigacije
//    Verifikovati da se u url-u stranice javlja /signup ruta

}

@Test (priority = 2, retryAnalyzer = RetryMyAwersomeApp.class)
    public void ChecksInputTypes() {


        navPage.clickOnSignUpButton();
Assert.assertEquals(signupPage.getNameInputFieldType(), "text", "input type doesnt match");

Assert.assertEquals(signupPage.getEmailInputFiledType(), "email", "input type doesnt match");

Assert.assertEquals(signupPage.getPasswordInputFieldType(), "password", "input type doesnt match");

Assert.assertEquals(signupPage.getConfirmPasswordInputFieldType(), "password", "input type doesnt match");
//    Test #2: Checks input types
//    Koraci:
//    Klik na sign up dugme iz navigacije
//    Verifikovati da polje za unos emaila za atribut type ima vrednost email
//    Verifikovati da polje za unos lozinke za atribut type ima vrednost password
//    Verifikovati da polje za unos lozinke za potvrdu za atribut type ima vrednost password
}

}
