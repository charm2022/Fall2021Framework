package StepDefinition;

import Helper.Check;
import Helper.DateUtil;
import Pages.Facebook.LaunchPage;
import Pages.Facebook.SignUpPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SignUpSD {

    @When("^I click on Create New Account button$")
    public void clickCreateNewAccount() {
        LaunchPage lp = new LaunchPage();
        lp.clickCreateNewAccountButton();
    }

    @Then("^I verify current Date is displayed in Birthday$")
    public void verifyDefaultBirthdayDropdown() {
        SignUpPage suPage = new SignUpPage();
        String actualMonthName = suPage.getSelectedMonth();         // get the mon-name displayed on web <- actualMonthName
        String expectedMonthName = DateUtil.getDateInFormat("MMM"); // using Date Lib, get the current MonthName <- expectedMonthName
        Check.checkEquals(actualMonthName, expectedMonthName, "Month in dropdown is not as expected");  // Assert equals ( actualMonthName , expectedMonthName )

        // get the date displayed on web <- actualDate
        // using Date Lib, get the current date <- expectedDate
        // Assert equals ( actualDateName , expectedDateName )

        // get the year displayed on web <- actualYearName
        // using Date Lib, get the current year <- expectedYearName
        // Assert equals ( actualYearName , expectedYearName )

    }



}
