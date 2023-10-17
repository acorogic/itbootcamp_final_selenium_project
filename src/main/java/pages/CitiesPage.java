package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

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
        getNewItemInputField().clear();
        getNewItemInputField().sendKeys(city);
    }

    public WebElement getSaveButton(){
        return driver.findElement(By.cssSelector("button.btnSave"));
    }

    public void clickOnSaveButton(){
        getSaveButton().click();
    }

public WebElement getDeleteButtonFirstCity(){
        return driver.findElement(By.cssSelector(".text-start>div> :nth-child(4)"));

}

public void clickOnDeleteButtonFirstCity(){
        getDeleteButtonFirstCity().click();

}

public WebElement getSearchCitiesField(){
        return driver.findElement(By.cssSelector("input#search"));
}

public void inputInSearchCitiesField(String cityName){
        getSearchCitiesField().clear();
        getSearchCitiesField().sendKeys(cityName);
}
//
//public List<WebElement> tableRows(){
//        return driver.findElements(By.cssSelector(".v-data-table__wrapper>table>:nth-child(3)>tr"));
//}

    public void waitForSearchResultsToBeFilteredInRows(int numberOfRows) {
        wait
                .withMessage("Search results doesnt match to expected number of rows")
                .until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(".v-data-table__wrapper tbody tr"),numberOfRows));
}
    public List<WebElement> getEditButtonsList() {
        return driver.findElements(By.cssSelector(".v-data-table__wrapper tbody tr td #edit"));
    }
    public WebElement getEditButtonFromRow(int rowNumber) {
        return getEditButtonsList().get(rowNumber - 1); //lista pocinje od nule
    }
    public void clickOnEditButtonFromRow(int rowNumber) {
        getEditButtonFromRow(rowNumber).click();

}
public WebElement getInputField(){
        return driver.findElement(By.cssSelector("input#name"));
}

public void enterNewCityInEditField(String newCity){
        getInputField().clear();
        getInputField().sendKeys(newCity);
}



}

