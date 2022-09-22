package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateAccauntScreen extends BaseScreen{
    public CreateAccauntScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @FindBy(how = How.XPATH,using = "//*[@resource-id='org.wikipedia:id/create_account_login_button']")
    MobileElement loginButton;

    public LoginScreen openLoginForm(){
        loginButton.click();
        return new LoginScreen(driver);
    }
}
