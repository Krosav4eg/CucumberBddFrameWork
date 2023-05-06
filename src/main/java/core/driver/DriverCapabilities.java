package core.driver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverCapabilities {

    protected DriverCapabilities() {
    }

    public static ChromeOptions chromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--disable-notifications");
        options.addArguments("disable-infobars");
        options.addArguments("--disable-extensions");
        return options;
    }

    public static FirefoxOptions firefoxOptions() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("start-maximized");
        DesiredCapabilities capability = DesiredCapabilities.firefox();
        FirefoxProfile profile = new FirefoxProfile();
        profile.setAcceptUntrustedCertificates(true);
        profile.setAssumeUntrustedCertificateIssuer(true);
        capability.setCapability(FirefoxDriver.PROFILE, profile);
        capability.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
        return options;
    }
}