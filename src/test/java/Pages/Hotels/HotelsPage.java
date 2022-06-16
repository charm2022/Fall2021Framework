package Pages.Hotels;

import Web.WebCommands;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Helper.DateUtil;
import Web.UseDriver;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HotelsPage extends WebCommands {
    By searchTabLocator = By.xpath("//button[contains(@data-stid, 'destination-menu')]");
    By searchBoxLocator = By.id("location-field-destination");
    By allSuggestionsLocator = By.xpath("//ul[contains(@data-stid, 'destination-results')]//strong");

    By Destinationtool = By.xpath("//input[@name='q-destination']");
    By Checkinselector = By.xpath("//span[text()='Check in']");
    By Checkoutselector = By.xpath("//*[@id='wizard-hotel-pwa-v2-1']/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/section/section/button[2]/span");
    By Searchbutton = By.xpath("//button[@type='submit']");
    By Pricesortdropdown = By.xpath("//button[@aria-label='Price']");
    By priceLowestBTN = By.xpath("//button[@value='PRICE']");
    By firstResult = By.xpath("(//span[contains(@aria-label,'Current price')])[1]");
    By CheckInCalendar = By.xpath("//*[@id='main']/div[1]/div[2]/div/form/div[2]/div[1]/div[2]/div[1]/div/div/ul/li[1]/div/table");
    By popFilterContainer = By.xpath("//*[text()='Popular filters']//parent::legend//parent::fieldset/ul");
    By ratingContainer = By.xpath("//*[text()='Star rating']//following-sibling::div");
    By Currentcal = By.xpath("//*[@id='main']/div[1]/div[2]/div/form/div[2]/div[1]/div[2]/div[1]/div/div/ul/li[2]/div/h2");
    By backbutton = By.xpath("//*[@aria-label='Previous']");
    By checkinmonthcal = By.xpath("(//table[@class='uitk-date-picker-weeks'])[1]/tbody");
    By Signinlocator = By.xpath("//*[text()='Sign in']");
    By Signuplocator = By.linkText("Sign up");


    By emaillocator = By.xpath("//*[@name='email']");
    By passlocator = By.name("password");
    By emailerror = By.id("email-error");
    By passerrormessage1 = By.xpath("//*[@id='password-error']");
    By enterfirstname = By.xpath("//*[@id='sign-up-first-name']");
    By enterlastname = By.xpath("//*[@id='sign-up-last-name']");
    By Falsefirstnameerror = By.xpath("//*[@id='firstName-error']");
    By lastnameerrormsg = By.xpath("//*[@id='lastName-error']");
    By Signupbutton = By.xpath("//*[@id='signup-button']");


    By Signinlocator1 = By.xpath("//*[@id='header']/div[1]/nav/div/ul/li[5]/a/span");
    By enteremail = By.xpath("//*[@id='sign-in-email']");
    By enterpass = By.xpath("//*[@id='sign-in-password']");
    By Signinlocator2 = By.xpath("//*[@id='sign-in-button']");
    By Verifywarningbox = By.xpath("(//*[@id='app'])[2]");


    By Terms_con = By.linkText("Terms and Conditions");
    By Privacy = By.linkText("Privacy Statement");


    By travelersclickbox = By.xpath("//*[@id='main']/div[1]/div[2]/div/form/div[2]/div[2]']");
    By guestbuttontag = By.xpath("//*[@id='main']/div[1]/div[2]/div/form/div[2]/div[2]/div/div/button/span[2]/span[1]");
    By adultcount = By.xpath("//*[@id='adult-input-0']");
    By totalchildrencount = By.xpath("//*[@id='child-input-0']");
    By adultincrementer = By.xpath("//*[@id='adult-input-0']//following-sibling::button");
    By childincrementer = By.xpath("//*[@id='child-input-0']//following-sibling::button");
    By firstchildage1 = By.xpath("//*[@id='main']/div[1]/div[2]/div/form/div[2]/input[2]");
    By secondchildage = By.xpath("//*[@id='main']/div[1]/div[2]/div/form/div[2]/input[2]");


    By changesdatesenableloc = By.xpath("//*[@id='main']/div[2]/div/div[2]/div[2]/section[2]/div/ul/li/button");



    //(SPRINT PLANNING 2 ) class1 git


    By Websitelocator = By.id("ftr-feedback-main");
    By submitbutton = By.xpath("//button[text()='Submit']");
    By displayeheadermsg = By.xpath("//p[text()='Please fill in the required information highlighted below.']");
    By spanreddot = By.id("required_box_page_rating");

    By whybooking = By.xpath("//*[@id='app-layer-base']/div[1]/div[2]/div[1]/div[2]/div");
    By freecancelationlocator = By.xpath("//*[text()='Free cancellation']");
    By onmostrecent = By.xpath("//*[@id='editorial-2']/div/div/div/p[2]");
    By Ourpricemessagelocator = By.xpath("//span[text()='Our price guarantee']");
    By findoutmorelink = By.xpath("//*[@id='editorial-3']/div/div/div/p[2]/a");
    By Ourpricgurantee = By.xpath("//h3[text()='Our price guarantee']");
    By priceguarantee = By.xpath("(//*[contains(text(),'Price Guarantee')])[1]");
    By tennightstandlocator = By.xpath("//*[@id='main']/div[2]/div/section[1]/ul/li[3]/a");
    By tennightyoustay = By.xpath("//*[@id='editorial-4']/div/div/div/p[2]/a");
    By displayerror = By.xpath("//h1[contains(text(),'Instant saving')]");


    By selectstar = By.xpath("//*[@id='required_box_page_rating']/div[1]/div[1]/label");
    By Commentlocator = By.name("verbatim");
    By returntoHotel = By.id("will-you-return");
    By unlikelyselect = By.xpath("//*[text()='Highly likely']");
    By firstno = By.xpath("(//*[text()='No'])[1]");
    By secondno = By.xpath("(//*[text()='No'])[2]");
    By clicksubmit = By.id("submit-button");
    By feedbackTy = By.xpath("//*[text()='THANK YOU FOR YOUR FEEDBACK.']");


    public void clickSearchTab() {
        clickThis(searchTabLocator);
    }

    public void enterSearchText(String searchText) {
        type(searchBoxLocator, searchText);
    }

    public void selectFromSearchSuggestions(String destinationName) {
        clickOneOfElementsUsingText(allSuggestionsLocator, destinationName);
    }

    public void enterDestination(String destination) {
        type(Destinationtool, destination);
    }

    public void checkindate() {
        clickThis(Checkinselector);
        String[] dateFields = DateUtil.getTomorrowDateFields();
        //String datesLocator = "//h2[text()='" + dateFields[1] + " " + dateFields[2] + "']/following-sibling::table//button";
        String MonCalendar = "//h2[text()='February 2022']/following-sibling::table//button";
        List<WebElement> allDates = UseDriver.getDriver().findElements(By.xpath(MonCalendar));

        for (WebElement date : allDates) {
            String dateValue = date.getText();

            String dateAttributeValue = date.getAttribute("name");
            //System.out.println(dateAttributeValue);
            if (dateAttributeValue.contains("Feb 10")) {
                date.click();
            }


        }
    }

    public void checkoutdate() {

        //String[] checkoutDateFields = DateUtil.adddaystoTomorrow(3);
        //System.out.println(checkoutDateFields[1]+" "+checkoutDateFields[2]);
        String[] dateFields = DateUtil.getTomorrowDateFields();
        //String checkoutDatesLocator  = "//h2[text()='"+checkoutDateFields[1]+" "+checkoutDateFields[2]+"']/following-sibling::table//button";
        String MonCalendar = "//h2[text()='February 2022']/following-sibling::table//button";
        List<WebElement> allCheckoutDates = UseDriver.getDriver().findElements(By.xpath(MonCalendar));

        for (WebElement date : allCheckoutDates) {
            //String dateValue = date.getText();
            String dateAttributeValue = date.getAttribute("name");

            if (dateAttributeValue.contains("Feb 20")) {
                date.click();
            }

        }

    }

    public void ClickOnSearch() {
        clickThis(Searchbutton);
    }

    public void sortPrice() {

        clickThis(Pricesortdropdown);
        clickThis(priceLowestBTN);
    }

    public void verifyPrice() {
        String LowestPrice = UseDriver.getDriver().findElement(firstResult).getText();

        String formatted = LowestPrice.replaceAll("\\D", "");
        int lowestprice_int = Integer.parseInt(formatted);

        boolean actual = false;

        if (lowestprice_int < 100) {
            actual = true;
        } else {
            actual = false;
        }

        Assert.assertEquals(true, actual);


    }

    public WebElement waitUntillEleemtIsVisiable(WebDriver driver, int waititme, By Locator) {

        WebDriverWait wait = new WebDriverWait(driver, waititme);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(UseDriver
                .getDriver().findElement(Locator)));

        return element;

    }

    public void checkPopularFilters() {

        WebElement container = (WebElement) getElement(popFilterContainer);
        List<WebElement> AllPopFilters = container.findElements(By.tagName("button"));
        for (WebElement filter : AllPopFilters) {

            //String FilterName = filter.getAttribute("value");
            //System.out.println(FilterName);

            boolean expected = false;
            Assert.assertEquals(false, expected);
        }
    }

    public void checkRating() throws InterruptedException {

        WebElement container = (WebElement) getElement(ratingContainer);
        List<WebElement> allRatings = container.findElements(By.tagName("input"));

        for (WebElement ratings : allRatings) {
            String ratingStar = ratings.getAttribute("data-value");
            int int_ratingStar = Integer.parseInt(ratingStar);
            System.out.println(ratingStar);
            Thread.sleep(3000);

            for (int a = 1; a < 6; a++) {

                Assert.assertEquals(a, int_ratingStar);
            }


        }
    }

    public void Verify_current_date() {
        clickThis(Checkinselector);

        Date Currentdate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM yyyy");
        String sdf1 = sdf.format(Currentdate);
        System.out.println(sdf1);

        WebElement calenderHeader = UseDriver.getDriver().findElement(Currentcal);


        while (calenderHeader.getText().equals(sdf1) == false) {
            clickThis(backbutton);
            break;
        }


    }

    public void is_Date_disabled() {

        WebElement monthcal = UseDriver.getDriver().findElement(checkinmonthcal);

        List<WebElement> AllDatesButton = monthcal.findElements(By.tagName("button"));


        boolean isdisabled = false;
        for (int a = 0; a < AllDatesButton.size(); a++) {
            String displayed = AllDatesButton.get(a).getAttribute("aria-label");
            if (displayed.contains("disabled")) {
                isdisabled = true;
            }

        }


    }

    public void clickonsignin() {
        clickThis(Signinlocator);

    }

    public void clickonsignup() {
        clickThis(Signuplocator);
    }

    public void enteremail() {
        type(emaillocator, "1235@hhh");
    }

    public void wrongpassword() {
        type(passlocator, ".2.23");
        clickThis(passlocator);
    }

    public void verifyemailerror() {
        String expectedmessage = "Please check your email address";
        String actualMSG = UseDriver.getDriver().findElement(emailerror).getText().trim();
        Assert.assertEquals(expectedmessage, actualMSG);


    }

    public void verifypassworderror() throws InterruptedException {
        String expectedmessage = "Please enter a password containing at least six characters";
        String expmsg2 = "Your password cannot be more than 20 characters long.";

        type(passlocator, "1355a");
        type(enterfirstname, "  ");
        miscWait();
        String actualmsg = UseDriver.getDriver().findElement(passerrormessage1).getText().trim();
        Assert.assertEquals(expectedmessage, actualmsg);

        type(passlocator, "12456454545454512655bhhhfkhj");
        miscWait();
        type(enterfirstname, "  ");
        String actmsg = UseDriver.getDriver().findElement(passerrormessage1).getText().trim();
        Assert.assertEquals(expmsg2, actmsg);


    }

    private void miscWait() {
    }

    public void enterfirstname() {

        type(enterfirstname, "1215..0");


    }

    public void enterlastname() {
        type(enterlastname, "12365");
        clickThis(Signuplocator);


    }

    public void clicksignupbutton() {

        clickThis(Signuplocator);
    }

    public void wrongnamecredentials() {

        String wrgfirstname = "Please check your first name";
        String expectedmsg = UseDriver.getDriver().findElement(Falsefirstnameerror).getText().trim();
        miscWait();
        Assert.assertEquals(wrgfirstname, expectedmsg);

        String wrglastname = "Please check your last name";
        String expctmsg = UseDriver.getDriver().findElement(lastnameerrormsg).getText().trim();
        miscWait();
        Assert.assertEquals(wrglastname, expctmsg);

    }

    public void Scr3signinlocator() {
        clickThis(Signinlocator1);
    }

    public void Enteremail() {
        type(enteremail, "min@gmail.com");

    }

    public void Enterpass() {
        type(enterpass, "moja");
    }

    public void verifywarningbox() {
        boolean expectedwarning = true;
        UseDriver.getDriver().switchTo().frame(0);
        miscWait();
        UseDriver.getDriver().switchTo().frame(0);
        miscWait();
        UseDriver.getDriver().switchTo().frame(0);
        miscWait();
        WebElement warningpopop = UseDriver.getDriver().findElement(Verifywarningbox);
        Assert.assertEquals(expectedwarning, warningpopop.isDisplayed());
    }

    public void clickonsigninbottom() {
        clickThis(Signinlocator2);
    }

    public void clickonTerms_conditions() {
        clickThis(Terms_con);
    }

    public void privacy() {
        clickThis(Privacy);
    }

    public void termsandcontiononNewtab() {
        String maintab = UseDriver.getDriver().getWindowHandle();
        Set<String> alltabs = UseDriver.getDriver().getWindowHandles();
        for (String tab : alltabs) {
            if (tab.equals(maintab) == false) {
                UseDriver.getDriver().switchTo().window(tab);
            }
        }

        String currenturl = UseDriver.getDriver().getCurrentUrl();
        Assert.assertTrue(currenturl.contains("terms_conditions"));

        UseDriver.getDriver().switchTo().window(maintab);

    }

    public void checkprivacy() {


        Set<String> alltabs = UseDriver.getDriver().getWindowHandles();
        for (String tab : alltabs) {
            if (UseDriver.getDriver().getCurrentUrl().contains("privacy")) {
                UseDriver.getDriver().switchTo().window(tab);
            }
        }
        String currenturl = UseDriver.getDriver().getCurrentUrl();
        Assert.assertTrue(currenturl.contains("privacy"));
    }

    public void travelersclickbutton() {
        //clickThis(travelersclickbox);
        clickThis(guestbuttontag);
    }

    public void setadult() {
        miscWait();
        WebElement totaladult;
        try {
            totaladult = UseDriver.getDriver().findElement(adultcount);
        } catch (Exception e) {
            totaladult = UseDriver.getDriver().findElement(By.xpath("//*[@name='q-room-0-adults']"));
        }


        WebElement adultinc;
        try {
            adultinc = UseDriver.getDriver().findElement(adultincrementer);
        } catch (Exception E) {
            adultinc = UseDriver.getDriver().findElement(By.xpath("//*[@name='q-room-0-adults']//following-sibling::button"));
        }

        for (int a = 0; a < 4; a++) {
            if (totaladult.getText().equals(4)) {
                break;
            } else {
                adultinc.click();
            }
        }

    }

    public void setchildrencount() {

        miscWait();
        WebElement totalchild = UseDriver.getDriver().findElement(totalchildrencount);
        JavascriptExecutor js = (JavascriptExecutor) UseDriver.getDriver();
        js.executeScript("arguments[0].value='4';", totalchild);

    }

    public void SearchDest2() {
        type(Destinationtool, "Bora Bora");
        clickThis(Destinationtool);

    }

    public void checkindate1() {
        clickThis(Checkinselector);
        String[] dateFields = DateUtil.getTomorrowDateFields();
        //String datesLocator = "//h2[text()='" + dateFields[1] + " " + dateFields[2] + "']/following-sibling::table//button";
        String MonCalendar = "//h2[text()='February 2022']/following-sibling::table//button";
        List<WebElement> allDates = UseDriver.getDriver().findElements(By.xpath(MonCalendar));

        for (WebElement date : allDates) {
            String dateValue = date.getText();

            String dateAttributeValue = date.getAttribute("name");
            //System.out.println(dateAttributeValue);
            if (dateAttributeValue.contains("Feb 10")) {
                date.click();
            }

        }
    }


    public void checkoutdate2() {

        //String[] checkoutDateFields = DateUtil.adddaystoTomorrow(3);
        //System.out.println(checkoutDateFields[1]+" "+checkoutDateFields[2]);
        String[] dateFields = DateUtil.getTomorrowDateFields();
        //String checkoutDatesLocator  = "//h2[text()='"+checkoutDateFields[1]+" "+checkoutDateFields[2]+"']/following-sibling::table//button";
        String MonCalendar = "//h2[text()='February 2022']/following-sibling::table//button";
        List<WebElement> allCheckoutDates = UseDriver.getDriver().findElements(By.xpath(MonCalendar));

        for (WebElement date : allCheckoutDates) {
            //String dateValue = date.getText();
            String dateAttributeValue = date.getAttribute("name");

            if (dateAttributeValue.contains("Feb 20")) {
                date.click();
            }

        }

    }

    public void Clickonsearchtag() {
        clickThis(Searchbutton);

    }

    public void verificationofchangedates() {
        JavascriptExecutor js = (JavascriptExecutor) UseDriver.getDriver();
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        WebElement changedateslocator = waitUntillEleemtIsVisiable(UseDriver.getDriver(), 120, changesdatesenableloc);


        Assert.assertTrue(changedateslocator.isDisplayed() && changedateslocator.isEnabled());
    }


    //Verify tickmark on Hotels page is displayed

    public void clickWFlocator() {


        clickThis(Websitelocator);

    }

    public void clicksubmitbutton() {

        clickThis(submitbutton);
    }

    public void displayederror() {
        String actualmsg = UseDriver.getDriver().findElement(displayeheadermsg).getText();
        String expectedmsg = "Please fill in the required information highlighted below.";
        Assert.assertEquals(actualmsg, expectedmsg);
        Assert.assertTrue(UseDriver.getDriver().findElement(displayeheadermsg).isDisplayed());


    }

    public void reddotdisplayed() {

        Assert.assertTrue(UseDriver.getDriver().findElement(spanreddot).isDisplayed());
    }

    public void getguarenteelink() {
        clickThis(Ourpricgurantee);
    }

    public void displaymsg() {

        Assert.assertTrue(UseDriver.getDriver().findElement(priceguarantee).isDisplayed());
    }

    public void goback() {
        UseDriver.getDriver().navigate().back();
    }

    public void clickongetstandnight() {

        clickThis(tennightstandlocator);
    }

    public void displayerror() {

        Assert.assertTrue(UseDriver.getDriver().findElement(displayerror).isDisplayed());


    }

    public WebElement waituntilwhybooking(WebDriver driver, int waititme, By Locator) {

        WebDriverWait wait = new WebDriverWait(driver, waititme);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(UseDriver
                .getDriver().findElement(Locator)));

        return element;


    }

    public void freecancellocator() {
        Assert.assertTrue(UseDriver.getDriver().findElement(freecancelationlocator)
                .isDisplayed() && UseDriver.getDriver().findElement(onmostrecent).isDisplayed());
    }

    public void ourpricelocator() {
        Assert.assertTrue(UseDriver.getDriver().findElement(Ourpricemessagelocator).isDisplayed()
                && UseDriver.getDriver().findElement(findoutmorelink).isEnabled());

    }

    public void tennightstand() {
        Assert.assertTrue(UseDriver.getDriver().findElement(tennightstandlocator).isDisplayed() &&
                UseDriver.getDriver().findElement(tennightyoustay).isEnabled());
    }


    public void onestarrating() {
        ArrayList<String> tabs = new ArrayList<>(UseDriver.getDriver().getWindowHandles());
        UseDriver.getDriver().switchTo().window(tabs.get(1));
        clickThis(selectstar);
    }

    public void leavecomment() {
        type(Commentlocator, "Your website sucks, poor designing");

    }

    public void willyoureturn() {


        //clickThis(returntoHotel);
        //By likelyselect = By.xpath("//*[text()='Highly likely']");
        WebElement verifyselect = UseDriver.getDriver().findElement(returntoHotel);
        Select sel = new Select(verifyselect);
        //sel.selectByVisibleText("Highly Likely");
        sel.selectByValue("Highly Likely");



    }

    public void selectno() {
        clickThis(firstno);
    }
    public void selectno2(){
        clickThis(secondno);
    }
    public void clickonsubmit(){
        clickThis(clicksubmit);
    }
    public void Thankyoudisplay(){
        Assert.assertTrue(UseDriver.getDriver().findElement(feedbackTy).isDisplayed());
    }

}
