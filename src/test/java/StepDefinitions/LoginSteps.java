package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class LoginSteps {
    DialogContent dc = new DialogContent();
    @Given("Navigate to Para Bank")
    public void navigateToParaBank() {
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
    }
    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        dc.mySendKeys(dc.userName, "TeamNine");
        dc.mySendKeys(dc.password,"TeamTester");
        dc.myClick(dc.loginButton);
    }
    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.LoginContainsText(dc.successLoginMessage,"Welcome");
    }

    @When("Enter false username and false password and click login button")
    public void enterFalseUsernameAndFalsePasswordAndClickLoginButton() {
        String dataAlp= RandomStringUtils.randomAlphanumeric(8);
        String dataNum= RandomStringUtils.randomNumeric(4);

        dc.mySendKeys(dc.UsernameLogin, dataAlp);
        dc.mySendKeys(dc.PasswordLogin, dataNum);
        dc.myClick(dc.Login);

    }

    @When("Enter invalid username as {string} and invalid password as {string} and click login button")
    public void enterInvalidUsernameAsAndInvalidPasswordAsAndClickLoginButton(String userName, String password) {
        dc.mySendKeys(dc.UsernameLogin, userName);
        dc.mySendKeys(dc.PasswordLogin, password);
        dc.myClick(dc.Login);
    }

    @Then("User should Failed login")
    public void userShouldFailedLogin() {
        dc.LoginContainsText(dc.failedMessage,"Error");
    }
}
