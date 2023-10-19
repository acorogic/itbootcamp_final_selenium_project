package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavPage extends BasicPage {
    public NavPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public WebElement getHomeButton() {

        return driver.findElement(By
                .cssSelector("a[href=\"/home\"]>span>i"));
    }

    public WebElement getLogoutButton() {

        return driver.findElement(By.cssSelector("button.btnAdmin"));
    }


    public void waitForHomeButtonToBeVisible() {
        wait
                .withMessage("User is not on the homepage")
                .until(ExpectedConditions.visibilityOf(getHomeButton()));
    }


    public void clickOnLogoutButton() {

        getLogoutButton().click();
    }


    public boolean elementExistLogoutButton() {
        return elementExist(By
                .cssSelector("button.btnAdmin"));

    }

    public WebElement getSignUpButton() {
        return driver.findElement(By
                .cssSelector("div.v-toolbar__items a[href=\"/signup\"]"));
    }

    public void clickOnSignUpButton() {
        getSignUpButton().click();
    }

    public WebElement getAdminButton() {

        return driver.findElement(By.cssSelector("button.btnAdmin"));
    }

    public void clickOnAdminButton() {
        getAdminButton().click();
    }

    public WebElement getAdminDropDownList() {

        return driver.findElement(By.cssSelector("div[role=\"menu\"]"));
    }

    public void waitForAdminDropDownListToBeVisible() {
        wait.withMessage("admin dropdown meny is not visible")
                .until(ExpectedConditions.visibilityOf(getAdminDropDownList()));
    }

    public WebElement getCitiesLink() {

        return driver.findElement(By.cssSelector("a.btnAdminCities"));
    }

    public void clickOnCitesLink() {
        getCitiesLink().click();
    }

    public WebElement getHomePageButton() {

        return driver.findElement(By.cssSelector(".v-toolbar__items a[href=\"/\"] "));
    }

    public void clickOnHomePageButoon() {
        getHomePageButton().click();
    }


    public WebElement getLocalDropDown() {
        return driver.findElement(By.cssSelector(".btnLocaleActivation"));
    }

    public void clickOnLocalDropDown() {
        getLocalDropDown().click();
    }

    public String getHederText() {
        return driver.findElement(By.cssSelector(".text-xs-center>h1")).getText();
    }


    public WebElement getLaguageButtonES() {

        return driver.findElement(By.cssSelector("span.f-es"));
    }

    public WebElement getLaguageButtonCN() {

        return driver.findElement(By.cssSelector("span.f-cn"));
    }

    public WebElement getLaguageButtonFR() {

        return driver.findElement(By.cssSelector("span.f-fr"));
    }

    public void clickOnLangugageES() {
        getLaguageButtonES().click();
    }

    public void clickOnLangugageFR() {
        getLaguageButtonFR().click();
    }

    public void clickOnLangugageCN() {
        getLaguageButtonCN().click();

    }

    public WebElement getMyProfileButton() {

        return driver.findElement(By.cssSelector(".btnProfile>span>i"));
    }

    public void waitForMyProfileButtonToBeVisible() {
        wait.withMessage("my profile button is not visible")
                .until(ExpectedConditions.visibilityOf(getMyProfileButton()));
    }

    public void clickOnMyProfileButton() {

        getMyProfileButton().click();
    }
}
