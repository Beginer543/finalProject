package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

public class EmployeeSearchSteps extends CommonMethods {

    @When("user enters employee ID")
    public void user_enters_employee_id() {
        sendText("110360A", employeeSearchPage.empIdTextBox);
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        click(employeeSearchPage.searchButton);
        Assert.assertTrue("Search button is not displayed or clicked",
                employeeSearchPage.searchButton.isDisplayed());
    }

    @Then("user is able to see searched employee on screen")
    public void user_is_able_to_see_searched_employee_on_screen() {
        Assert.assertTrue("Searched employee is not displayed",
                employeeSearchPage.employeeLink.isDisplayed());

    }

    @When("user click on id number employee open personal details")
    public void user_click_on_id_number_employee_open_personal_details() {
        click(employeeSearchPage.employeeLink);
    }

    @Then("user click on membership and navigate Assigned Memberships")
    public void user_click_on_membership_and_navigate_assigned_memberships() {
        click(employeeSearchPage.membershipsLink);
        Assert.assertTrue("Membership tab is not clickable or visible",
                employeeSearchPage.membershipsLink.isDisplayed());
    }

    @Then("user click on add button")
    public void user_click_on_add_button() {
        click(employeeSearchPage.addButton);
    }

    @Then("user select membership")
    public void user_select_membership() {
        Select select = new Select(employeeSearchPage.membershipDropdown);
        select.selectByVisibleText("Elsayed Masoud");
        Assert.assertEquals("Elsayed Masoud", select.getFirstSelectedOption().getText());
    }

    @Then("user select Membership Subscription paid by")
    public void user_select_membership_subscription_paid_by() {
        Select select = new Select(employeeSearchPage.subscriptionPaidByDropdown);
        select.selectByVisibleText("Individual");
        Assert.assertEquals("Individual", select.getFirstSelectedOption().getText());
    }

    @Then("user enter Subscription Amount")
    public void user_enter_subscription_amount() {
        sendText("100", employeeSearchPage.subAmount);
        Assert.assertEquals("100", employeeSearchPage.subAmount.getAttribute("value"));

    }

    @Then("user select Currency")
    public void user_select_currency() {
        Select select = new Select(employeeSearchPage.currencyDropdown);
        select.selectByVisibleText("United States Dollar");
        Assert.assertEquals("United States Dollar", select.getFirstSelectedOption().getText());
    }

    @Then("user enters Subscription Commence and Renewal Dates")
    public void user_enters_subscription_commence_and_renewal_dates() {
        sendText("2025-11-27", employeeSearchPage.commenceDateInput);
        Assert.assertEquals("2025-11-27", employeeSearchPage.commenceDateInput.getAttribute("value"));

        sendText("2025-12-11", employeeSearchPage.renewalDateInput);
        Assert.assertEquals("2025-12-11", employeeSearchPage.renewalDateInput.getAttribute("value"));

    }

    @Then("user clicks on Save button")
    public void user_clicks_on_save_button() {
        click(employeeSearchPage.btnSaveMember);
    }
}
