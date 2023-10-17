package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasicPage {
    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public WebElement getLangButton() {
        return driver.findElement(By.cssSelector("i[class=\"v-icon notranslate mdi mdi-earth theme--light\"]"));

    }

    public WebElement getLoginPageButton() {
        return driver.findElement(By.cssSelector("a[href=\"/login\"] span.v-btn__content"));
    }

    public WebElement getEmailField() {
        return driver.findElement(By.id("email"));
    }

    public String getEmailFieldType() {
        return getEmailField().getAttribute("type");
    }


    public WebElement getPasswordField() {
        return driver.findElement(By.id("password"));
    }

    public String getPasswordFieldType() {
        return getPasswordField().getAttribute("type");
    }

    public void clickOnLoginButton() {
        getLoginPageButton().click();
    }

    public WebElement getLanguageSelectMenu() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]"));
    }

    public void selectEnFromDropDownMenu() {
        getLangButton().click();
        Select select = new Select(getLanguageSelectMenu());

        select.selectByValue("EN");
    }

    public WebElement getEnglishLangSelectButton() {
        return driver.findElement(By.xpath("//span[@class='flag f-gb small-flag']"));
    }

    public void selectEnlishLanguge() {
        getLangButton().click();
        wait
                .withMessage("en language option not visible")
                .until(ExpectedConditions.visibilityOf(getEnglishLangSelectButton()));
        getEnglishLangSelectButton().click();

    }

    public String getUrl (){
        return driver.getCurrentUrl();

    }

    public void enterInvalidCredentials(String email, String password){
getEmailField()
        .sendKeys(email);

getPasswordField()
        .sendKeys(password);
    }


    public WebElement getLoginSubmitButon(){
        return driver.findElement(By.cssSelector("button[type=\"submit\"]"));
    }
    public void clickLoginSubmit(){
        getLoginSubmitButon().click();
    }



    public void enterValidUsernameInvalidPassword(String email, String password){
        getEmailField()
                .sendKeys(email);

        getPasswordField()
                .sendKeys(password);
    }

    public void enterValidUsernameValidPassword(String email, String password){
        getEmailField().clear();
        getEmailField()

                .sendKeys(email);

        getPasswordField().clear();
        getPasswordField()
                .sendKeys(password);
    }

}
