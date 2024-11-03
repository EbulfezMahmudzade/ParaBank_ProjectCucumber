package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends ParentPage {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    //US03 REGSITER
    @FindBy(xpath = "(//div[@id='loginPanel']//a)[2]")
    public WebElement registerLink;

    @FindBy(xpath = "//input[@id=\"customer.firstName\"]")
    public WebElement firstNameRegister;

    @FindBy(xpath = "//input[@id=\"customer.lastName\"]")
    public WebElement lastNameRegister;

    @FindBy(xpath = "//input[@id=\"customer.address.street\"]")
    public WebElement adressRegister;

    @FindBy(xpath = "//input[@id=\"customer.address.city\"]")
    public WebElement cityRegister;

    @FindBy(xpath = "//input[@id=\"customer.address.state\"]")
    public WebElement stateRegister;

    @FindBy(xpath = "//input[@id=\"customer.address.zipCode\"]")
    public WebElement zipCodeRegister;

    @FindBy(xpath = "//input[@id=\"customer.phoneNumber\"]")
    public WebElement phoneRegister;

    @FindBy(xpath = "//input[@id=\"customer.ssn\"]")
    public WebElement snnRegister;

    @FindBy(xpath = "//input[@id=\"customer.username\"]")
    public WebElement userNameRegister;

    @FindBy(xpath = "//input[@id=\"customer.password\"]")
    public WebElement passwordRegister;

    @FindBy(xpath = "//input[@id=\"repeatedPassword\"]")
    public WebElement repeatedPassword;

    @FindBy(xpath = "(//input[@class=\"button\"])[2]")
    public WebElement registerButton;

    @FindBy(xpath = "//div[@id='rightPanel']//p")
    public WebElement successMessageRegister;

    //US02 LOGIN
    @FindBy(xpath = "//input[@name='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@class='button']")
    public WebElement loginButton;

    @FindBy(xpath = "//p[@class='smallText']")
    public WebElement successLoginMessage;
    // US04 Elements
    @FindBy(xpath = "//select[@id='type']")
    public WebElement select;

    @FindBy(xpath = "(//select[@id='type']//option)[1]")
    public WebElement checking;

    @FindBy(xpath = "(//select[@id='type']//option)[2]")
    public WebElement saving;

    @FindBy(xpath = "//input[@type='button']")
    public WebElement newAccountButton;

    @FindBy(xpath = "(//div[@id='openAccountResult']//p)[1]")
    public WebElement AccountSuccessfuly;

    @FindBy(id = "customer.firFirst Name:stName")
    public WebElement FirstName;

    @FindBy(id = "customer.lastName")
    public WebElement LastName;

    @FindBy(id = "customer.address.street")
    public WebElement address;

    @FindBy(id = "customer.address.city")
    public WebElement city;

    @FindBy(id = "ustomer.address.state")
    public WebElement state;

    @FindBy(id = "customer.address.zipCode")
    public WebElement zipCode;

    @FindBy(id = "customer.phoneNumber")
    public WebElement phoneNumber;

    @FindBy(xpath = "//div[@id=\"rightPanel\"]/h1")
    public WebElement failedMessage;

    @FindBy(xpath = "//input[@value='Update Profile']")
    public WebElement updateProfilButton;

    @FindBy(linkText = "Profile Updated")
    public WebElement profileUpdated;

    @FindBy(linkText = "Address is required.")
    public WebElement missingInformation;

    //US05 TRANSFER FUNDS
    @FindBy(xpath = "input[@id=\"amount\"]")
    public WebElement amountBox;

    @FindBy(xpath = "//select[@id=\"fromAccountId\"]/option")
    public List<WebElement> fromAccounts;

    @FindBy(xpath = "//select[@id=\"toAccountId\"]/option")
    public List<WebElement>  toAccounts ;

    @FindBy(xpath = "//form[@id=\"transferForm\"]/div/input")
    public WebElement transferButton;

    @FindBy(xpath = "//div[@id=\"showResult\"]")
    public WebElement succesMessageTransfer;


    //US07 Elements
    public WebElement loanAmountBox;

    @FindBy(xpath = "//input[@id='downPayment']")
    public WebElement downPaymentBox;

    @FindBy(xpath = "//select[@id='fromAccountId']")
    public WebElement fromAccountDropDown;

    @FindBy(xpath = "//input[@value='Apply Now']")
    public WebElement applyNowButton;

    @FindBy(xpath = "//td[@id='loanProviderName']")
    public WebElement loanProvider;

    @FindBy(xpath = "//td[@id='loanStatus']")
    public WebElement loanStatus;

    @FindBy(xpath = "//a[@id='newAccountId']")
    public WebElement newAccountNumberLink;

    @FindBy(xpath = "//p[contains(text(),'approved')]")
    public WebElement approvalMessage;

    @FindBy(xpath = "//td[@id='accountId']")
    public WebElement accountNumber;

    @FindBy(xpath = "//td[@id='accountType']")
    public WebElement accountType;

    @FindBy(xpath = "//td[@id='balance']")
    public WebElement accountBalance;

    @FindBy(xpath = "//td[@id='availableBalance']")
    public WebElement accountAvailableBalance;

    @FindBy(xpath = "//b[.='No transactions found.']")
    public WebElement transactionsMessage;

    @FindBy(xpath = "//*[@name='username']")
    public WebElement UsernameLogin;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement PasswordLogin;

    @FindBy(xpath = "//*[@value='Log In']")
    public WebElement Login;
}
