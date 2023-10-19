package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import retry.RetryMyAwersomeApp;

public class SignupTests extends BasicTest {

    @Test(priority = 1, retryAnalyzer = RetryMyAwersomeApp.class)

    public void VisitsTheSignupPage() {


        navPage.clickOnSignUpButton();
        Assert
                .assertEquals(navPage.getUrl(),
                        "https://vue-demo.daniel-avellaneda.com/signup");


    }

    @Test(priority = 2, retryAnalyzer = RetryMyAwersomeApp.class)
    public void ChecksInputTypes() {


        navPage.clickOnSignUpButton();
        Assert.assertEquals(signupPage.getNameInputFieldType(),
                "text", "input type doesnt match");

        Assert.assertEquals(signupPage.getEmailInputFiledType(),
                "email", "input type doesnt match");

        Assert.assertEquals(signupPage.getPasswordInputFieldType(),
                "password", "input type doesnt match");

        Assert.assertEquals(signupPage.getConfirmPasswordInputFieldType(),
                "password", "input type doesnt match");

    }

}
