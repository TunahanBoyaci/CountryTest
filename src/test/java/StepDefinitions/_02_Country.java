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
import org.testng.Assert;

public class _02_Country {
    DialogContent dialogContent = new DialogContent();
    LeftNavBar leftNavBar = new LeftNavBar();

    @Given("Navigate to Campus")
    public void navigateToCampus() {
        ParameterDriver.getDriver().get("http://www.tunahanboyaci.com/wp-login.php?redirect_to=http%3A%2F%2Fwww.tunahanboyaci.com%2Fwp-admin%2Fpost.php%3Fpost%3D406%26action%3Dedit&reauth=1");

    }

    @And("Enter username and password")
    public void enterUsernameAndPassword() {
        MyMethods2.myWait(3);
        dialogContent.sendKeysMethod(dialogContent.usernameInbox,"info@tunahanboyaci.com");
        dialogContent.sendKeysMethod(dialogContent.passwordInbox,"1256780Tuna.!");
    }

    @And("Click on login Button")
    public void clickOnLoginButton() {
        MyMethods2.myWait(3);
        dialogContent.loginButton.click();
    }

    @And("Navigate to Country page")
    public void navigateToCountryPage() {
        MyMethods2.myWait(3);
        leftNavBar.clickMethod(leftNavBar.messagingButon);
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

    @And("Verify login")
    public void verifyLogin() {
        MyMethods2.myWait(3);

        Assert.assertTrue(dialogContent.homePageIndicator.isDisplayed());
    }

    @And("Get all the page")
    public void getAllThePage() {
        MyMethods2.myWait(3);

        String pageSource = ParameterDriver.getDriver().getPageSource();

        System.out.println(pageSource);
    }

    @And("I change the title")
    public void iChangeTheTitle() {
        MyMethods2.myWait(3);

        dialogContent.sendKeysMethod(dialogContent.titleInbox,"qwe");
    }

    @And("I click on update")
    public void iClickOnUpdate() {
        MyMethods2.myWait(3);

        dialogContent.clickMethod(dialogContent.updateButton);
    }

    @And("I click on home")
    public void iClickOnHome() {
        MyMethods2.myWait(3);

        dialogContent.clickMethod(dialogContent.homePagebutt);

    }

    @And("Verify change")
    public void verifyChange() {
        MyMethods2.myWait(3);

        Assert.assertTrue(dialogContent.qwe.isDisplayed());

    }
}
