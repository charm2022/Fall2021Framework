package StepDefinition;

import Pages.Darksky.Dark_Sky;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import Web.UseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DarkSky_Steps extends Dark_Sky {

    @Given("User navigate to darksky homepage")
    public void User_navigate_to_darksky_homepage(){
        UseDriver.openUrl2("https://darksky.net/forecast/40.7127,-74.0059/us12/en");


    }

    @Then("User Collects the High Temp")
    public String User_Collects_the_High_Temp(){
        String Hightemp = UseDriver.getDriver().findElement(HighTemp).getText();
        System.out.println(Hightemp);
        return Hightemp;}


    @And("User Collects the Low temp")
    public String User_Collects_the_Low_temp(){
        String lowtemp = UseDriver.getDriver().findElement(lowTemp).getText();
        return lowtemp;}


    @And("User Collects the feels like Temp")
    public String User_Collects_the_feels_like_Temp(){
        String Feelsliketemp = UseDriver.getDriver().findElement(feelslikeTemp).getText();

        return Feelsliketemp; }


    @Then("User verifies feels like temp is between high and low temp")
    public void User_verifies_feels_like_temp_is_between_high_and_low_temp(){


        String feelisliketemp_str = User_Collects_the_feels_like_Temp().substring(0,2);
        String lowtemp = User_Collects_the_Low_temp().substring(0,2);
        String str_hightemp = User_Collects_the_High_Temp().substring(0,2);
        System.out.println(str_hightemp);

        // Parse these srting into Int
        // How to make assertion with 3 variables
        /*
        if( (feelisliketemp_str>lowtemp&&feelisliketemp_str<str_hightemp){
        System.out.println("conditions expected");
        }else{
            System.out.println("condition failed");
        }
        */

    }

    @When("User navigates to Darksky Blog")
    public void User_navigates_to_Dark_Sky_BLOG(){
        UseDriver.openUrl2("https://blog.darksky.net/");
    }

    @Then("Verify all the post dates are present")
    public void Verify_all_the_post_dates_are_present(){

        List<WebElement> BlogList = UseDriver.getDriver().findElements(By.tagName("time"));
        System.out.println("Available blog: "+BlogList.size());
        for(int a=0;a<BlogList.size();a++){

            WebElement ele = BlogList.get(a);
            Assert.assertEquals(true,ele.isDisplayed());

        }

    }


}
