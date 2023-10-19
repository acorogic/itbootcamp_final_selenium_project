package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import retry.RetryMyAwersomeApp;

public class AdminCitiesTests extends BasicTest {


    @Test(priority = 1, retryAnalyzer = RetryMyAwersomeApp.class)

    public void VisitsTheAdminCitiesPageAndListCities() {

        loginPage.clickOnLoginButton();

        String email = "admin@admin.com";
        String password = "12345";
        loginPage.enterValidUsernameValidPassword(email, password);

        loginPage.clickLoginSubmit();
        navPage.clickOnAdminButton();
        navPage.waitForAdminDropDownListToBeVisible();
        navPage.clickOnCitesLink();

        Assert.assertEquals(navPage.getUrl(), baseUrl + "/admin/cities");


    }

    @Test(priority = 2, retryAnalyzer = RetryMyAwersomeApp.class)

    public void ChecksInputTypesForCreateEditNewCity() {

        navPage.clickOnAdminButton();
        navPage.waitForAdminDropDownListToBeVisible();
        navPage.clickOnCitesLink();
        citiesPage.clickOnNewItembutton();

        citiesPage.waitForNewItemDialogBoxToBeVisible();

        Assert.assertEquals(citiesPage.getNewItemInputFieldType(), "text");


    }

    @Test(priority = 3, retryAnalyzer = RetryMyAwersomeApp.class)

    public void CreateNewCity() {


        String usersCity = "Pozega";
        navPage.clickOnAdminButton();
        navPage.clickOnCitesLink();


        citiesPage.clickOnNewItembutton();

        citiesPage.waitForNewItemDialogBoxToBeVisible();
        citiesPage.enterNewItemInNewInputField(usersCity);
        citiesPage.clickOnSaveButton();

        messagePopUpPage.waitForSuccesPopUpDialogToBeVisible();
        Assert.assertTrue(messagePopUpPage
                .getTextFromPopUpMessageForSuccessfulAddAndEditCity(), "City is not saved");


    }

    @Test(priority = 4, retryAnalyzer = RetryMyAwersomeApp.class)
    public void EditCity() {
        String oldCityName = "Pozega";
        String newCityName = "Novi Sad";
        int numberOfRows = 1;
        int editRowNumber = 1;
        navPage.clickOnAdminButton();
        navPage.clickOnCitesLink();
        citiesPage.inputInSearchCitiesField(oldCityName);
        citiesPage.waitForSearchResultsToBeFilteredInRows(numberOfRows);
        citiesPage.clickOnEditButtonFromRow(editRowNumber);
        citiesPage.enterNewCityInEditField(newCityName);
        citiesPage.clickOnSaveButton();
        messagePopUpPage.waitForSuccesPopUpDialogToBeVisible();

        Assert.assertTrue(messagePopUpPage
                .getTextFromPopUpMessageForSuccessfulAddAndEditCity(), "City is not saved");


    }

    @Test(priority = 5, retryAnalyzer = RetryMyAwersomeApp.class)
    public void SearchCity() {

        String newCity = "Novi Sad";
        int numberOfRows = 1;
        int columnNumber = 2;
        int rowNumber = 1;
        navPage.clickOnAdminButton();
        navPage.clickOnCitesLink();
        citiesPage.inputInSearchCitiesField(newCity);
        citiesPage.waitForSearchResultsToBeFilteredInRows(numberOfRows);
        Assert.assertEquals(citiesPage
                .getTextFromOneCell(rowNumber, columnNumber), newCity, "Search result is not corrcect");


    }

    @Test(priority = 6, retryAnalyzer = RetryMyAwersomeApp.class)
    public void DeleteCity() {

        String newCity = "Novi Sad";
        int numberOfRows = 1;
        int deleteRowNumber = 1;
        navPage.clickOnAdminButton();
        navPage.clickOnCitesLink();
        citiesPage.inputInSearchCitiesField(newCity);
        citiesPage.waitForSearchResultsToBeFilteredInRows(numberOfRows);
        citiesPage.clickOnDeleteButtonFromRow(deleteRowNumber);
        messagePopUpPage.clikOnDelConformationButton();
        messagePopUpPage.waitForWarningDialog();
        Assert.assertTrue(messagePopUpPage.textWarningDialogIsTrue(), "item is not deleted");


    }
}

