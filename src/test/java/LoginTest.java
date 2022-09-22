import configuration.Config;
import models.User;
import org.testng.annotations.Test;
import screens.WizardScreen;

public class LoginTest extends Config {
    @Test
    public void loginSuccess(){
        new WizardScreen(driver)
                .skipWizard()
                .openCrateAccount()
                .openLoginForm()
                .fillUserName("child.valery")
                .fillPassword("BigBubbles@182")
                .submitLogin();

    }

    @Test
    public void loginScreenModel(){
        User user = User.builder()
                .userName("Child.valery")
                .password("BigBubbles@182")
                .build();
        new WizardScreen(driver)
                .skipWizard()
                .openCrateAccount()
                .openLoginForm()
                .submitLoginModel(user);


    }
}
