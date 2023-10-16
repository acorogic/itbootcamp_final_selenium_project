package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CitiesPage extends BasicPage{
    public CitiesPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public WebElement getnewItemButton(){
        return driver.findElement(By.cssSelector("button.btnNewItem"));
    }

    public void clickOnNewItembutton() {
        getnewItemButton().click();
    }

    public WebElement getNewItemDialogBox() {
        return driver.findElement(By.cssSelector("div.dlgNewEditItem "));
    }

    public void waitForNewItemDialogBoxToBeVisible() {
        wait.withMessage("New item dialog box is not visible")
                .until(ExpectedConditions.visibilityOf(getNewItemDialogBox()));
    }

    public WebElement getNewItemInputField() {
        return driver.findElement(By.cssSelector("input#name"));
    }

    public String getNewItemInputFieldType (){
        return getNewItemInputField().getAttribute("type");
    }

    public void enterNewItemInNewInputField(String city){
        getNewItemInputField().sendKeys(city);
    }

    public WebElement getSaveButton(){
        return driver.findElement(By.cssSelector("button.btnSave"));
    }

    public void clickOnSaveButton(){
        getSaveButton().click();
    }



}
