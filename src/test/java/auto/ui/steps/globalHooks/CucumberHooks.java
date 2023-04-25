package auto.ui.steps.globalHooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import core.browserfactory.BrowserFactory;
import core.utils.propReader.PropsConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import static core.browserfactory.BrowserFactory.closeBrowser;


public class CucumberHooks {

    public static final PropsConfig PROPS_CONFIG = ConfigFactory.create(PropsConfig.class);

    @Before
    public void setUp() {
        WebDriverRunner.setWebDriver(BrowserFactory.getInstance().createDriverInstance(PROPS_CONFIG.BASE_BROWSER()));
        Configuration.timeout = Integer.parseInt(PROPS_CONFIG.WAITING_TIMEOUT());
        Configuration.pollingInterval = 500;
    }

    @After
    public void afterScenario(Scenario scenario) {
        takeScreenShot(scenario);
        closeBrowser();
    }

    private void takeScreenShot(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
    }
}