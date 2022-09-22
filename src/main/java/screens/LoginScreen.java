package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import models.User;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginScreen extends BaseScreen{
    public LoginScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/login_username_text']//android.widget.EditText")
    MobileElement userName;
    @FindBy (how = How.XPATH,using = "//*[@resource-id='org.wikipedia:id/login_password_input']//android.widget.EditText")
    MobileElement password;
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/login_button']")
    MobileElement submitLogin;


    public LoginScreen fillUserName(String username){
        type(userName,username);
        return this;
    }

    public LoginScreen fillPassword(String pass){
        type(password,pass);
        return this;
    }

    public SearchScreen submitLogin(){
        submitLogin.click();
        return new SearchScreen(driver);
    }

    public SearchScreen submitLoginModel(User user){
        type(userName, user.getUserName());
        type(password, user.getPassword());
        submitLogin.click();
        return new SearchScreen(driver);

    }
}
