package Tests.Hotels;

import Pages.Hotels.HotelsPage;
import Web.UseDriver;
import org.testng.annotations.Test;

public class SearchTests {
    @Test
    public void userCanSelectFromSuggestions() {
        UseDriver.openUrl2("https://www.hotels.com/");

        HotelsPage lp = new HotelsPage();
        lp.clickSearchTab();
        lp.enterSearchText("New");
        lp.selectFromSearchSuggestions("New Orleans");

    }
}
