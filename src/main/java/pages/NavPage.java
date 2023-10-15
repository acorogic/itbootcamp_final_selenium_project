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


    public WebElement getHomeButton(){
        return driver.findElement(By.cssSelector("a[href=\"/home\"]>span>i"));
    }

    public WebElement getLogoutButton(){
        return driver.findElement(By.cssSelector("button.btnAdmin"));
    }


public void waitForHomeButtonToBeVisible(){
        wait
                .withMessage("User is not on the homepage")
                .until(ExpectedConditions.visibilityOf(getHomeButton()));
}



public void clickOnLogoutButton(){
        getLogoutButton().click();
}


public boolean elementExistLogoutButton () {
        return elementExist(By.cssSelector("button.btnAdmin"));

}}
