package Web;

import Helper.Misc;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UseDriver {

    // create driver as field variable, so driver can store chromedriver object
    static WebDriver driver;
    //if you want user use className Driver.openUrl, put static


    public static void openUrl2(String url){
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        driver =  new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get (url);
        // Misc.sleep(2);
    }
    /*
     if you work for one website, shall create a method to open url automatically without entering the
     website before working on a test case. So you do not even Write Background/Given.
     */
   // @Before
    public static void openUrl(){
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        driver =  new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get ("https://www.facebook.com/");
        // Misc.sleep(2);

    }
    public static WebDriver getDriver(){

        return driver;
    }

    /*if you work for one website, shall add Before and After to launch url or quit url. So in my Facebook
    * Login feature, I do not have to launch the website nor quit it. These two methods shall kick off
    * automatically . In summary, any method with  @Before or @After annotation will execute before every scenario.*/
    //@After
    public static void quitWebPages(){

        driver.quit();
    }
    public static void quitWebPages2(){ driver.quit();}
    //for example: then in Selenium_2 class, I can use this method
    public static int add(){
        return 2;
    }


}
