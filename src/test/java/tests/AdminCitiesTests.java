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


//    Test #1: Visits the admin cities page and list cities
//    Podaci:
//    admin email: admin@admin.com
//    admin password: 12345
//    Koraci:
//    Klik na sign up dugme iz navigacije
//    Prijaviti se na sistem admin kredencijalima
//    Klik na admin dugme iz navigacije
//    Klik na Cities dugme iz padajuceg Admin menija
//    Verifikovati da se u url-u stranice javlja /admin/cities ruta


    }

    @Test(priority = 2, retryAnalyzer = RetryMyAwersomeApp.class)

    public void ChecksInputTypesForCreateEditNewCity() {
//        loginPage.clickOnLoginButton();
//
//        String email= "admin@admin.com";
//        String password="12345";
//        loginPage.enterValidUsernameValidPassword(email, password);
//
//        loginPage.clickLoginSubmit();
        navPage.clickOnAdminButton();
        navPage.waitForAdminDropDownListToBeVisible();
        navPage.clickOnCitesLink();
        citiesPage.clickOnNewItembutton();

        citiesPage.waitForNewItemDialogBoxToBeVisible();

        Assert.assertEquals(citiesPage.getNewItemInputFieldType(), "text");


//    Test #2: Checks input types for create/edit new city
//    Koraci:
//    Klik na admin dugme iz navigacije
//    Klik na Cities dugme iz padajuceg Admin menija

//    Kliknuti na New Item dugme
//    Sacekati da se dijalog za kreiranje i editovanje grada pojavi
//    Verifikovati da polje za unos grada za atribut type ima tekst text
    }

    @Test(priority = 3, retryAnalyzer = RetryMyAwersomeApp.class)

    public void CreateNewCity() throws InterruptedException {


        String usersCity = "Pozega";
        navPage.clickOnAdminButton();
        navPage.clickOnCitesLink();


        citiesPage.clickOnNewItembutton();

        citiesPage.waitForNewItemDialogBoxToBeVisible();
        citiesPage.enterNewItemInNewInputField(usersCity);
        citiesPage.clickOnSaveButton();

        messagePopUpPage.waitForSuccesPopUpDialogToBeVisible();
        //Assert.assertEquals(messagePopUpPage.getSuccesPopUpDialogMessage(), "Saved successfully", "City is not saved");
        Assert.assertTrue(messagePopUpPage.getTextFromPopUpMessageForSuccessfulAddAndEditCity(), "City is not saved");


//    Test #3: Create new city
//    Podaci:
//    city: [Ime i prezime polaznika]’s city
//    Koraci:

//    Klik na admin dugme iz navigacije
//    Klik na Cities dugme iz padajuceg Admin menija
//    Kliknuti na New Item dugme
//    Sacekati da se dijalog za kreiranje i editovanje grada pojavi
//    Uneti ime grada u polje
//    Kliknuti na Save dugme
//    Sacekati da popu za prikaz poruke bude vidljiv
//    Verifikovati da poruka sadrzi tekst Saved successfully


    }

    @Test(priority = 4, retryAnalyzer = RetryMyAwersomeApp.class)
    public void EditCity() {
String oldCityName= "Pozega";
String newCityName="Novi Sad";
int numberOfRows= 1;
int editRowNumber=1;
        navPage.clickOnAdminButton();
        navPage.clickOnCitesLink();
        citiesPage.inputInSearchCitiesField(oldCityName);
        citiesPage.waitForSearchResultsToBeFilteredInRows(numberOfRows);
citiesPage.clickOnEditButtonFromRow(numberOfRows);
citiesPage.enterNewCityInEditField(newCityName);
citiesPage.clickOnSaveButton();
        messagePopUpPage.waitForSuccesPopUpDialogToBeVisible();
//        Assert.assertEquals(messagePopUpPage.getSuccesPopUpDialogMessage(),
//                "Saved successfully",
//                "City is not successfully edited");
        Assert.assertTrue(messagePopUpPage.getTextFromPopUpMessageForSuccessfulAddAndEditCity(), "City is not saved");

//
//    Test #4: Edit city
//    Podaci:
//    old city name: [Ime i prezime polaznika]’s city
//new city name: [Ime i prezime polaznika]’s city Edited
//    Koraci:
//    Klik na admin dugme iz navigacije
//    Klik na Cities dugme iz padajuceg Admin menija
//    U polje za pretragu uneti staro ime grada
//    Sacekati da broj redova u tabeli bude 1
//    Kliknuti na dugme Edit iz prvog reda
//    Uneti novo ime za grad
//    Kliknuti na dugme Save
//    Sacekati da popu za prikaz poruke bude vidljiv
//    Verifikovati da poruka sadrzi tekst Saved successfully

    }
}

