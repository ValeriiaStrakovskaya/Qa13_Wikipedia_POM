import configuration.Config;
import org.testng.annotations.Test;
import screens.WizardScreen;

public class TestLaunch extends Config {

    //    //*[@resource-id='']
    // //*[text()='SKIP']
    @Test
    public void launchTest(){
new WizardScreen(driver).skipWizard();
    }
}
