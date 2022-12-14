package configuration;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;

//{
//        "platformName": "Android",
//        "deviceName": "Nex",
//        "platformVersion": "9.0",
//        "appPackage": "org.wikipedia",
//        "appActivity": ".main.MainActivity"
//        }
public class Config {
    protected static AppiumDriver<MobileElement>driver;

    @BeforeSuite
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName","Nex");
        capabilities.setCapability("platformVersion","9.0");
        capabilities.setCapability("appPackage","org.wikipedia");
        capabilities.setCapability("appActivity",".main.MainActivity");
        capabilities.setCapability("app","/Users/valeriiastrakovskaya/Downloads/org.wikipedia.apk");
        capabilities.setCapability("automationName", "Appium");
        driver= new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }

}
