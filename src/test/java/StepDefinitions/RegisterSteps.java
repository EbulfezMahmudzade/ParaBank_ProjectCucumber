package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class RegisterSteps {
    DialogContent dc =new DialogContent();
    @When("Fill out the registration form and click the register button")
    public void fillOutTheRegistrationFormAndClickTheRegisterButton() {
        String dataAlp= RandomStringUtils.randomAlphanumeric(8);
        String dataNum= RandomStringUtils.randomNumeric(4);
        dc.myClick(dc.registerLink);
        dc.mySendKeys(dc.firstNameRegister,dataAlp);
        dc.mySendKeys(dc.lastNameRegister,dataAlp);
        dc.mySendKeys(dc.adressRegister,dataAlp);
        dc.mySendKeys(dc.cityRegister,dataAlp);
        dc.mySendKeys(dc.stateRegister,dataAlp);
        dc.mySendKeys(dc.zipCodeRegister,dataNum);
        dc.mySendKeys(dc.phoneRegister,dataNum);
        dc.mySendKeys(dc.snnRegister,dataNum);
        dc.mySendKeys(dc.userNameRegister,dataAlp);
        dc.mySendKeys(dc.passwordRegister,dataNum);
        dc.mySendKeys(dc.repeatedPassword,dataNum);
        dc.myClick(dc.registerButton);
    }

    @Then("User should register successfully")
    public void userShouldRegisterSuccessfully() {
        dc.LoginContainsText(dc.successMessageRegister, "success");
    }
}
