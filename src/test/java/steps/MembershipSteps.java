package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

public class MembershipSteps extends CommonMethods {

    @When("user enters employee ID")
    public void user_enters_employee_id() {
        sendText("110360A", membershipPage.empIdTextBox);
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        click(membershipPage.searchButton);
        Assert.assertTrue("Search button is not displayed or clicked",
                membershipPage.searchButton.isDisplayed());
    }

    @Then("user is able to see searched employee on screen")
    public void user_is_able_to_see_searched_employee_on_screen() {
        Assert.assertTrue("Searched employee is not displayed",
                membershipPage.employeeLink.isDisplayed());

    }

    @When("user click on id number employee open personal details")
    public void user_click_on_id_number_employee_open_personal_details() {
        click(membershipPage.employeeLink);
    }

    @Then("user click on membership and navigate Assigned Memberships")
    public void user_click_on_membership_and_navigate_assigned_memberships() {
        click(membershipPage.membershipsLink);
        Assert.assertTrue("Membership tab is not clickable or visible",
                membershipPage.membershipsLink.isDisplayed());
    }

    @Then("user click on add button")
    public void user_click_on_add_button() {
        click(membershipPage.addButton);
    }

    @Then("user select membership")
    public void user_select_membership() {
        Select select = new Select(membershipPage.membershipDropdown);
        select.selectByVisibleText("Elsayed Masoud");
        Assert.assertEquals("Elsayed Masoud", select.getFirstSelectedOption().getText());
    }

    @Then("user select Membership Subscription paid by")
    public void user_select_membership_subscription_paid_by() {
        Select select = new Select(membershipPage.subscriptionPaidByDropdown);
        select.selectByVisibleText("Individual");
        Assert.assertEquals("Individual", select.getFirstSelectedOption().getText());
    }

    @Then("user enter Subscription Amount")
    public void user_enter_subscription_amount() {
        sendText("100", membershipPage.subAmount);
        Assert.assertEquals("100", membershipPage.subAmount.getAttribute("value"));

    }

    @Then("user select Currency")
    public void user_select_currency() {
        Select select = new Select(membershipPage.currencyDropdown);
        select.selectByVisibleText("United States Dollar");
        Assert.assertEquals("United States Dollar", select.getFirstSelectedOption().getText());
    }

    @Then("user enters Subscription Commence and Renewal Dates")
    public void user_enters_subscription_commence_and_renewal_dates() {
        sendText("2025-11-27", membershipPage.commenceDateInput);
        Assert.assertEquals("2025-11-27", membershipPage.commenceDateInput.getAttribute("value"));

        sendText("2025-12-11", membershipPage.renewalDateInput);
        Assert.assertEquals("2025-12-11", membershipPage.renewalDateInput.getAttribute("value"));

    }

    @Then("user clicks on Save button")
    public void user_clicks_on_save_button() {
        click(membershipPage.btnSaveMember);
    }
}
