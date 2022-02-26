package StepDefinition;

import Pages.Hotels.HotelsPage;
import Web.WebCommands;
import Web.UseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.ArrayList;

public class HotelsSprint2_Steps extends HotelsPage {
    By emaillocator = By.xpath("//*[@name='email']");
    By passlocator = By.name("password");
    By enterfirstname = By.xpath("//*[@id='sign-up-first-name']");
    By enterlastname = By.xpath("//*[@id='sign-up-last-name']");


    @Then("I verify green tickmark is displayed")
    public void i_verify_green_tickmark_is_displayed() {
        By signUpTickMarkLocator=By.xpath("//div[@class='form-element valid']");
        Assert.assertTrue(UseDriver.getDriver().findElement(signUpTickMarkLocator).isDisplayed());

    }

    @Then("I enter my  email")
    public void i_enter_my_email() {

        WebCommands web = new WebCommands();
        web.type(emaillocator, "apon123@gmail.com");
    }

    @Then("I enter password")
    public void i_enter_password() {
        WebCommands web = new WebCommands();
        web.type(passlocator, "anovi143.");

    }

    @Then("I enter my first name")
    public void i_enter_my_first_name() {
        WebCommands web = new WebCommands();
        web.type(enterfirstname, "Md");
    }

    @Then("I enter my last name")
    public void i_enter_my_last_name() {
        WebCommands web = new WebCommands();
        web.type(enterlastname, "Charmaine");
    }


    @Then("I click on Website feedback")
    public void i_click_o_Website_feedback() {
        clickWFlocator();
    }

    @Then("I click on submit form")
    public void i_click_on_submit_form() {
        /*
        Set<String> alltabs = UseDriver.getDriver().getWindowHandles();
        for (String tab : alltabs) {
            if (UseDriver.getDriver().getCurrentUrl().contains("survey")) {
                UseDriver.getDriver().switchTo().window(tab);
            }
        }
         */
        ArrayList<String> tabs = new ArrayList<>(UseDriver.getDriver().getWindowHandles());
        UseDriver.getDriver().switchTo().window(tabs.get(1));
        clicksubmitbutton();
    }

    @Then("I verify please fill up the form message is displayed")
    public void i_verify_please_fill_up_the_form_message_is_displayed() {
        displayederror();


    }

    @Then("I verify red dotted box is displayed")
    public void i_verify_red_dotted_box_is_displayed() {
        reddotdisplayed();

    }




    @Then("I go to why book with hotels.com")
    public void i_go_to_why_book_with_hotels_com() {

        waituntilwhybooking(UseDriver.getDriver(),5,
                By.xpath("//*[text()='Free cancellation']"));
    }

    @Then("I verify free cancellation is displayed")
    public void I_Verify_canceletion_is_displayed(){

        freecancellocator();
    }

    @Then("I verify Our price guarantee is displayed")
    public void I_verify_Our_price_guarantee_is_displayed(){
        ourpricelocator();

    }

    @And("I verify ten night stand is displayed")
    public void I_verify_ten_night_stand_is_displayed(){
        tennightstand();


    }


    @Given("I click on price price guarentee")
    public void i_click_on_price_price_guarentee() {
        getguarenteelink();
    }

    @Then("I verify on price guarentee heading is dispalyed")
    public void i_verify_on_price_guarentee_heading_is_dispalyed() {
        displaymsg();
    }

    @Then("then i go back to hotels.com")
    public void then_i_go_back_to_hotels_com() {
        goback();
    }

    @Then("then i click on ten nights you stay link")
    public void then_i_click_on_nights_you_stay_link() {
        clickongetstandnight();
    }

    @Then("I verify saving rewards is displayed")
    public void i_verify_saving_rewards_is_displayed() {
        displayerror();


    }
    @Then("I leave a comment")
    public void  I_leave_a_comment(){
        leavecomment();
    }

    @Then("I select the star")
    public void i_select_the_star() {
        onestarrating();
    }

    @Then("I select a option from how likely to rate")
    public void i_select_a_option_from_how_likely_to_rate() {
        willyoureturn();
    }

    @Then("I clicked on the prior visit")
    public void i_clicked_on_the_prior_visit() {
        selectno();
        selectno2();
    }

    @Then("I click on submit button")
    public void i_click_on_submit_button() {
        clicksubmitbutton();
    }

    @Then("I verify for your feedback Thank you message")
    public void i_verify_for_your_feedback_Thank_you_message() {
        Thankyoudisplay();
    }
}
