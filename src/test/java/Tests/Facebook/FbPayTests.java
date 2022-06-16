package Tests.Facebook;

import Helper.Check;
import Helper.Misc;
import Pages.Facebook.FacebookPayPage;
import Pages.Facebook.LaunchPage;
import Web.UseDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class FbPayTests {


    @Test
    public void verifyFbPayTitle() {
        /*
        launch facebook.com
        click on facebook pay link
        verify new page with title "facebook pay: simple, secure, free payments
         */

        UseDriver.openUrl2("https://www.facebook.com");

        LaunchPage lp = new LaunchPage();
        lp.clickFacebookPay();
       //  Misc.sleep(2);
    // find handle associated with Driver (driver.getWindowHandle)
        String launchPageHandle = lp.getHandle();
        // find all handles
        Set<String> allHandles = lp.getAllHandles();

        for (String handle : allHandles) {
            if (!handle.equals(launchPageHandle)) {
                UseDriver.getDriver().switchTo().window(handle);
                break;
            }
        }

        FacebookPayPage fpPage = new FacebookPayPage();
        Check.checkEquals(fpPage.getPageTitle(), "Facebook Pay: Simple, Secure, Free Payments", "Facebook Pay page title is as expected" );
    }
    public String GetPageTitle() {
        return UseDriver.getDriver().getTitle();
    }

//    public boolean isHomeEnabled() {
//
//    }

}
