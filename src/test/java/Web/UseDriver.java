package Web;

import Helper.DataReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
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

        DataReader data = new DataReader();
        String sauceUrl = "https://" + data.getSauceUser()+":"+data.getSauceKey()+"@ondemand.us-west-1.saucelabs.com:443/wd/hub";

        switch (data.getEnv().toLowerCase()) {
            case "local":
                switch (data.getBrowserName().toLowerCase()) {
                    case "chrome":
                        System.setProperty("webdriver.chrome.driver", data.getChromeDriverPath());
                        driver =  new ChromeDriver();
                        break;
                    case "firefox":
                        System.setProperty("", data.getFirefoxDriverPath());
                        driver =  new ChromeDriver();
                        break;
                }
                break;
            case "sauce":
                DesiredCapabilities capabilities = null;
                switch (data.getBrowserName().toLowerCase()) {
                    case "chrome":
                        capabilities = DesiredCapabilities.chrome();
                        break;
                    case "firefox":
                        capabilities = DesiredCapabilities.firefox();
                        break;
                }
                capabilities.setCapability("platform", data.getPlatform());
                capabilities.setCapability("version", data.getVersion());

                try {
                    driver = new RemoteWebDriver(new URL(sauceUrl), capabilities);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get (data.getUrl());
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
