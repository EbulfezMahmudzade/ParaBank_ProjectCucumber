package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.Tools;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class TransferFundsSteps {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();
    @Given("Click on the Transfer Funds link")
    public void clickOnTheTransferFundsLink() {
        ln.myClick(ln.TransferFundsLink);
    }

    @When("Select amount and click Transfer button")
    public void selectAmountAndClickTransferButton() {
        String dataNum= RandomStringUtils.randomNumeric(4);

        int rndFrom=Tools.randomGenerator(dc.fromAccounts.size());
        dc.fromAccounts.get(rndFrom).click();

        int rndTo=Tools.randomGenerator(dc.toAccounts.size());
        dc.toAccounts.get(rndTo).click();

        dc.myClick(dc.transferButton);
    }

    @Then("User should Transfer Funds successfully")
    public void userShouldTransferFundsSuccessfully() {
        dc.LoginContainsText(dc.succesMessageTransfer,"complete");
    }
}
