package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MessagePopUpPage extends BasicPage {
    public MessagePopUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getPopUp (){
        return driver.findElement(By.cssSelector("div.v-snack__content"));
    }
public void waitForPopUpUserDNEtoBeVisible(){
        wait.withMessage("Pop up is not visible")
                .until(ExpectedConditions.visibilityOf(getPopUp()));
}

public String getPopUpMessage(){

        return driver.findElement(By.cssSelector("div.v-snack__content>ul>li")).getText();
}

public WebElement closeButton() {
        return driver.findElement(By.cssSelector("div.v-snack__content>button"));
}

public WebElement getSuccessPopUpDialog(){
        return driver.findElement(By.cssSelector("div.success>div.v-snack__content"));

}
    public void waitForSuccesPopUpDialogToBeVisible(){
        wait
                .withMessage("pop up dialog is not visible")
                .until(ExpectedConditions.visibilityOf(getSuccessPopUpDialog()));}

public String getSuccesPopUpDialogMessage(){
        return getSuccessPopUpDialog().getText();
}
    public boolean getTextFromPopUpMessageForSuccessfulAddAndEditCity () {
        return getSuccesPopUpDialogMessage().contains("Saved successfully");

}

public WebElement delConformationButton(){
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div[2]/button[2]/span"));
}

public void clikOnDelConformationButton(){
        delConformationButton().click();
}



}

