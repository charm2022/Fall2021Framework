package StepDefinition;

import Pages.Hotels.HotelsPage;
import Web.UseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HotelsSprint1_Steps extends HotelsPage {

    @Given("User verifies current date")
    public void User_verifies_current_date() {

        Verify_current_date();


    }


    @And("Users Verify past dates are disabled")
    public void Users_Verify_past_dates_are_disabled() {
        is_Date_disabled();


    }


    //Verifying error messages for email && password with incorrect credentials


    @Given("i click on Sign in")
    public void i_click_on_Sign_in1() {
        clickonsignin();
    }


    @Given("I click on Sign up")
    public void i_click_on_Sign_up1() {
        clickonsignup();
    }

    @Given("I enter my wrong email")
    public void i_enter_my_email1() {
        enteremail();
    }

    @Then("I enter my password with 4 letters")
    public void i_enter_my_password1() {
        wrongpassword();
    }

    @Then("I verify error message is displayed")
    public void i_verify_error_message_is_displayed1() throws InterruptedException {
        verifypassworderror();
    }

    @Then("I enter my invalid first name")
    public void i_enter_my_invalid_first_name1() {
        enterfirstname();
    }

    @Then("I enter my invalid last name")
    public void i_enter_my_invalid_last_name1() {
        enterlastname();
    }

    @Then("I verify error message is displayed after clicking sign up with invalid credentials")
    public void i_verify_invalid_name_error_message_is_displayed1() {


    }

    //Verify error msg for invalid sign in credentials

    @Given("I click on Sign in link")
    public void i_click_on_Sign_in_link() {
        Scr3signinlocator();


    }

    @Then("I enter invalid email address")
    public void i_enter_invalid_email_address() {
        Enteremail();
    }

    @Then("I enter invalid password")
    public void i_enter_invalid_password() {
        Enterpass();
    }

    @Then("I click on sign in button")
    public void i_click_on_sign_in_button() {
        clickonsigninbottom();

    }

    @Then("I verify error msg is displayed")
    public void i_verify_error_msg_is_displayed() {
        verifywarningbox();


    }

    //Verify terms && conditions are displayed

    @Then("I click on Terms and condition link")
    public void i_click_on_Terms_and_condition_link() {
        clickonTerms_conditions();
    }

    @Then("I verify Terms and condition link opens on a new tab")
    public void i_verify_Terms_and_condition_link_opens_on_a_new_tab() {
        termsandcontiononNewtab();
    }

    @Then("I click on Privacy Statement link")
    public void i_click_on_Privacy_Statement_link() {
        privacy();

    }

    @Then("I verify Privacy Statement link opens on a new tab")
    public void i_verify_Privacy_Statement_link_opens_on_a_new_tab() {
        checkprivacy();


    }


    //Verify user can update number of guests on Homepage

    @Given("I click on travelers")
    public void i_click_on_travelers() {
        travelersclickbutton();
    }


    @When("I select adults as four")
    public void i_select_adults_asfour (){
        setadult();
    }



    @When("I select children as two")
    public void i_select_children_as_two() {
        setchildrencount();
    }
    @When("first child as four")
    public void first_child_as_four() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("second child as one")
    public void second_child_as_one() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I verify rooms pop up number of adults and children as selected on step three and four")
    public void i_verify_rooms_pop_up_number_of_adults_and_children_as_selected_on_step_and_three_four(){
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click apply")
    public void i_click_apply() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I verify total number of adults and children as same as selected on step three and four")
    public void i_verify_total_number_of_adults_and_children_as_same_as_selected_on_step_and() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }





    @When("I Enter Bora Bora in destination")
    public void i_Enter_Bora_Bora_in_destination() {
        SearchDest2();
    }

    @Then("Select check in dates")
    public void select_check_in_dates() {
        checkindate1();
    }

    @Then("select check out date")
    public void select_check_out_date() {
        checkoutdate2();
    }



    @Then("I click on the search button")
    public void i_click_on_the_search_button() {
        Clickonsearchtag();
    }

    @Then("I Verify Change dates button is displayed at the end of search results")
    public void i_Verify_Change_dates_button_is_displayed_at_the_end_of_search_results() {
        verificationofchangedates();
    }


}
