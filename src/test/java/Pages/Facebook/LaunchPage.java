package Pages.Facebook;

import Helper.Misc;
import Web.WebCommands;
import Web.UseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class LaunchPage extends WebCommands {
    // Locators of elements on Launch Page
    By loginEmailLocator = By.id("email");
    By loginPasswordLocator = By.id("pass");
    By loginButtonLocator = By.xpath("//button[@name='login']");
    By messengerLocator = By.linkText("Messenger");
    By createNewAccLocator = By.linkText("Create new account");
    By allLinksLocator = By.tagName("a");
    By facebookPayLocator = By.linkText("Facebook Pay");
    By invalidLoginErrorLocator = By.xpath("//div[text()='The email or mobile number you entered isn’t connected to an account. ']");
    By userLoggedInLocator = By.xpath("//input[@placeholder='Search Facebook']");

    // Methods to interact with elements of Launch Page

    // type in login emailBox
    public void enterLoginEmail(String loginEmail) {
        UseDriver.getDriver().findElement(loginEmailLocator).sendKeys(loginEmail);
    }

    // if login emailBox is enabled
    public boolean isLoginEmailBoxEnabled() {
        return UseDriver.getDriver().findElement(loginEmailLocator).isEnabled();
    }

    // type in login passwordBox
    public void enterLoginPassword(String loginPwd) {
        UseDriver.getDriver().findElement(loginPasswordLocator).sendKeys(loginPwd);
    }
    // if login passwordBox is enabled

    // click login button
    public void clickLoginButton() {

        UseDriver.getDriver().findElement(loginButtonLocator).click();
        Misc.sleep(10);
    }

    // if login button is enabled

    // to click the Messenger link
    public void clickMessengerLink() {
        UseDriver.getDriver().findElement(messengerLocator).click();
    }

    // to get number of links
    public int getNumberOfLinks() {
        List<WebElement> allLinks = getElements(allLinksLocator);
        return allLinks.size();
    }


    public void clickFacebookPay() {
        clickThis(facebookPayLocator);
    }

    public boolean isInvalidLoginErrorDisplayed() {
        return isWebElementDisplayed(invalidLoginErrorLocator);
    }

    public void clickCreateNewAccountButton() {
        clickThis(createNewAccLocator);
    }

    public boolean isFindAcctLinkDisplayed(){
        return isWebElementDisplayed(By.xpath("//a[contains(text(), 'Find your account and log in.")
        );

    }
      public boolean isSearchFacebookDisplayed() {

        return isWebElementDisplayed(userLoggedInLocator);
    }
}
