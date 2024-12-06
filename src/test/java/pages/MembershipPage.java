package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class MembershipPage extends CommonMethods {

    @FindBy(id = "empsearch_id")
    public WebElement empIdTextBox;

    @FindBy(id = "searchBtn")
    public WebElement searchButton;

    @FindBy(linkText = "110360A")
    public WebElement employeeLink;

    @FindBy(linkText = "Memberships")
    public WebElement membershipsLink;

    @FindBy(id = "btnAddMembershipDetail")
    public WebElement addButton;

    @FindBy(id = "membership_membership")
    public WebElement membershipDropdown;

    @FindBy(id = "membership_subscriptionPaidBy")
    public WebElement subscriptionPaidByDropdown;

    @FindBy(id = "membership_subscriptionAmount")
    public WebElement subAmount;

    @FindBy(id = "membership_currency")
    public WebElement currencyDropdown;

    @FindBy(id = "membership_subscriptionCommenceDate")
    public WebElement commenceDateInput;

    @FindBy(id = "membership_subscriptionRenewalDate")
    public WebElement renewalDateInput;

    @FindBy(id = "btnSaveMembership")
    public WebElement btnSaveMember;

    public MembershipPage() {
        PageFactory.initElements(driver, this);
    }
}
