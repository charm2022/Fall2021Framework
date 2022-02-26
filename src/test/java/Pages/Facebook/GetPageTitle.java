package Pages.Facebook;

import Web.UseDriver;

public class GetPageTitle {
    public String GetPageTitle() {
            return UseDriver.getDriver().getTitle();
        }
}
