package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class WizardScreen extends BaseScreen{
    public WizardScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/fragment_onboarding_skip_button']")
    MobileElement skipButton;
    //если нет перехода на новый экран
//    public WizardScreen skipWizard(){
//        skipButton.click();
//        return this;
//    }
    //если нет
    public SearchScreen skipWizard(){
        skipButton.click();
        return new SearchScreen(driver);
    }

}
