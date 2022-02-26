package StepDefinition;

import Pages.Hotels.HotelsPage;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Web.UseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Hotels_Steps extends HotelsPage {
    @Given("I launch Hotel launchpage")
    public void i_launch_Hotel_launchpage() {
        UseDriver.openUrl2("https://www.hotels.com/");
        UseDriver.getDriver().manage().window().maximize();
        UseDriver.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    @Given("I enter my destination")
    public void i_enter_my_destination() {

        enterDestination("Tampa");
        // selectFromSearchSuggestions(Destinationtool,"Tampa");
    }

    @Given("I entered my check in date")
    public void i_entered_my_check_in_date() {


        checkindate();
    }

    @Given("I entered my check out date")
    public void i_entered_my_check_out_date() {
        checkoutdate();
    }

    @Then("I click on search button")
    public void i_click_on_search_button() {
        ClickOnSearch();
    }

    @Then("I sort search result from low to high")
    public void i_sort_search_result_from_low_to_high() {
        sortPrice();

    }

    @Then("I verify the lowest price is less or equal to One hundred")
    public void i_verify_the_lowest_price_is_less_or_equal_to_100() {
        verifyPrice();
    }

    @Then("I Close the Browser")
    public void I_Close_the_Browser() {
        UseDriver.getDriver().quit();
    }

    @And("Verify all popular filters checkbox arent selected")
    public void And_Verify_all_popular_filters_checkbox_arent_selected(){
        checkPopularFilters();

    }

    @And("Verify star rating buttons are in increasing order")
    public void Verify_star_rating_buttons_are_in_increasing_order() throws InterruptedException {
        checkRating();

    }


}
