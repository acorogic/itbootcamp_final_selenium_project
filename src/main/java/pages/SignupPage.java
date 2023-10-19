package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage extends BasicPage {
    public SignupPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public WebElement getNameInputField() {
        return driver.findElement(By.id("name"));
    }

    public String getNameInputFieldType() {
        return getNameInputField().getAttribute("type");
    }

    public WebElement getEmailInputFiled() {
        return driver.findElement(By.id("email"));

    }

    public String getEmailInputFiledType() {
        return getEmailInputFiled().getAttribute("type");
    }


    public WebElement getPasswordInputField() {
        return driver.findElement(By.id("password"));
    }

    public String getPasswordInputFieldType() {
        return getPasswordInputField().getAttribute("type");
    }

    public WebElement getConfirmPasswordInputField() {
        return driver.findElement(By.id("confirmPassword"));
    }

    public String getConfirmPasswordInputFieldType() {
        return getConfirmPasswordInputField().getAttribute("type");
    }

    public WebElement getSignMeUpButton() {
        return driver.findElement(By.cssSelector("button[type=\"submit\"]"));
    }

    public void clickOnsignMeUpButton() {
        getSignMeUpButton().click();

    }
}
