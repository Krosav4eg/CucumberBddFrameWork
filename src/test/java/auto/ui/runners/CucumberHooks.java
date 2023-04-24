package auto.ui.runners;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import core.browserfactory.BrowserFactory;
import core.readconfigproperties.PropertiesReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import static core.browserfactory.BrowserFactory.closeBrowser;


public class CucumberHooks {

    @Before()
    public void setUp() {
        WebDriverRunner.setWebDriver(BrowserFactory.getInstance().createDriverInstance(PropertiesReader.load()
                .getProperty("base.browser")));
        Configuration.timeout = Integer.parseInt(PropertiesReader.load().getProperty("waitingTimeout"));
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