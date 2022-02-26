package Pages.Facebook;

import org.openqa.selenium.By;
import Web.WebCommands;


public class SignUpPage extends WebCommands {

    By selectedMonthLocator = By.xpath("//select[@id='month'//option[@Selected='1']");

    public String getSelectedMonth(){
        return getElement(selectedMonthLocator).getText();
    }
}
