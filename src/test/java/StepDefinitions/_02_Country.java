package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavBar;
import Utilities.BaseDriver;
import Utilities.MyMethods2;
import Utilities.ParameterDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_Country {
    DialogContent dialogContent = new DialogContent();
    LeftNavBar leftNavBar = new LeftNavBar();

    @Given("Navigate to Campus")
    public void navigateToCampus() {
        ParameterDriver.getDriver().get("https://test.mersys.io/");

    }

    @And("Enter username and password")
    public void enterUsernameAndPassword() {
        MyMethods2.myWait(3);
        dialogContent.sendKeysMethod(dialogContent.usernameInbox,"turkeyts");
        dialogContent.sendKeysMethod(dialogContent.passwordInbox,"TechnoStudy123");
    }

    @And("Click on login Button")
    public void clickOnLoginButton() {
        MyMethods2.myWait(3);
        dialogContent.loginButton.click();
    }

    @And("Navigate to Country page")
    public void navigateToCountryPage() {
        MyMethods2.myWait(3);
        leftNavBar.setupButton.click();
        MyMethods2.myWait(3);
        leftNavBar.clickMethod(leftNavBar.parametersButton);
        MyMethods2.myWait(3);
        leftNavBar.clickMethod(leftNavBar.countriesButton);
    }

    @When("Create a new country")
    public void createANewCountry() {
        MyMethods2.myWait(3);
        dialogContent.clickMethod(dialogContent.addButton);
        dialogContent.sendKeysMethod(dialogContent.nameInbox,"7ryf");
        dialogContent.sendKeysMethod(dialogContent.codeInbox,"9yr7");
        dialogContent.clickMethod(dialogContent.saveButton);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dialogContent.assertText(dialogContent.successMessage,"successfully");
    }

    @And("Search for a country")
    public void searchForACountry() {
        MyMethods2.myWait(3);
        dialogContent.sendKeysMethod(dialogContent.codeInboxSearchInboxSearch,"9yr7");
        dialogContent.clickMethod(dialogContent.searchButton);
    }

    @When("Click on Delete and Confirm")
    public void clickOnDeleteAndConfirm() {
        MyMethods2.myWait(3);

        dialogContent.clickMethod(dialogContent.deleteButton);
        dialogContent.clickMethod(dialogContent.deleteConfirmButton);
    }

    @And("Click on add Button")
    public void clickOnAddButton() {
        MyMethods2.myWait(3);
        dialogContent.clickMethod(dialogContent.addButton);
    }

    @And("Enter {string} as country name and {string} as country code")
    public void enterAsCountryNameAndAsCountryCode(String countryName, String countryCode) {
        MyMethods2.myWait(3);
        dialogContent.sendKeysMethod(dialogContent.nameInbox,countryName);
        dialogContent.sendKeysMethod(dialogContent.codeInbox,countryCode);
    }

    @When("Click on save button")
    public void clickOnSaveButton() {
        MyMethods2.myWait(3);
        dialogContent.clickMethod(dialogContent.saveButton);

    }

    @And("Search for {string} as code")
    public void searchForAsCountryNameAndAsCode(String codeInbox) {
        MyMethods2.myWait(3);
        dialogContent.sendKeysMethod(dialogContent.codeInboxNew,codeInbox);
        dialogContent.clickMethod(dialogContent.searchButton);
    }
}
