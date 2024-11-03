package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class NewAccountSteps {
    DialogContent dc = new DialogContent();
    LeftNav ln= new LeftNav();
    Actions actions= new Actions(GWD.getDriver());

    @When("Click on the Element in leftNav")
    public void clickOnTheElementInLeftNav() {
        ln.myClick(ln.yeniHesap);
    }

    @And("select account checking")
    public void selectAccount() {
        dc.myClick(dc.select);
        dc.myClick(dc.checking);
        actions.click(dc.newAccountButton).build().perform();
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.LoginContainsText(dc.AccountSuccessfuly, "Congratulations");
    }

    @And("select account savings")
    public void selectAccountSavings() {
        dc.myClick(dc.select);
        dc.myClick(dc.saving);
        actions.click(dc.newAccountButton).build().perform();
    }
}
