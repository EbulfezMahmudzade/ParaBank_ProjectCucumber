package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class LoanApplicationSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @When("User clicks on the loan request link")
    public void userClicksOnRequestLoanLink() {
        ln.myClick(ln.requestLoan);
    }

    @Then("User applies for loan")
    public void userAppliesForLoan() {
        dc.mySendKeys(dc.loanAmountBox, "1000");
        dc.mySendKeys(dc.downPaymentBox,"300");
        dc.myClick(dc.fromAccountDropDown);
        dc.myClick(dc.applyNowButton);
    }

    @Then("User confirms that the loan request has been processed")
    public void userValidatesLoanRequestProcessedFields() {
        Assert.assertEquals(dc.loanProvider.getText(),"ParaBank");
        Assert.assertEquals(dc.loanStatus.getText(),"Approved");
    }

    @Then("User validates approval message")
    public void userValidatesApprovalMessage() {
        Assert.assertTrue(dc.approvalMessage.getText().toLowerCase().contains("approved"));
    }

    @Then("User clicks on the credit account number link")
    public void userClicksOnTheCreditAccountNumberLink() {
        dc.myClick(dc.newAccountNumberLink);
    }

    @Then("Verifies information in user account details")
    public void userValidatesInformationUnderAccountDetails() {
        Assert.assertEquals(dc.accountType.getText(),"LOAN");
        Assert.assertTrue(dc.accountNumber.isDisplayed());
        Assert.assertTrue(dc.accountBalance.isDisplayed());
        Assert.assertTrue(dc.accountAvailableBalance.isDisplayed());
    }

    @And("User confirms message below account activity")
    public void userValidatesMessageUnderAccountActivity() {
        Assert.assertEquals(dc.transactionsMessage.getText(),"No transactions found.");
    }
}
