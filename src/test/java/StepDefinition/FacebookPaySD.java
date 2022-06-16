package StepDefinition;

import Pages.Facebook.LaunchPage;
import Web.UseDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static Web.UseDriver.openUrl;

public class FacebookPaySD {

    @Given("^I launch facebook website$")
    public void launchFacebook() {
        openUrl();
    }

    @When("^I click on Facebook Pay$")
    public void clickFbPay() {
        LaunchPage lp = new LaunchPage();
        lp.clickFacebookPay();
    }


}
