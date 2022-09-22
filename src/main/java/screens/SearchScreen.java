package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class SearchScreen extends BaseScreen{
    public SearchScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/menu_icon']")
    MobileElement menuButton;
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/main_drawer_login_button']")
    MobileElement joinWiki;

    public CreateAccauntScreen openCrateAccount() {
        menuButton.click();
        joinWiki.click();

        return new CreateAccauntScreen(driver);
    }

}
