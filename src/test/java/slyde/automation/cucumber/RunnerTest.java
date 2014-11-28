package slyde.automation.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import slyde.automation.utils.RestHelper;
import slyde.automation.utils.SettingsHelper;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by srikanthvejendla on 9/12/14.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/html-report", "json:target/cucumber.json"},
        features = {"src/test/java/slyde/automation/resources"}
)
public class RunnerTest {

    public static WebDriver driver;

    public static Integer TestRunID;

    public static String AppURL;

    @BeforeClass
    public static void setEnv() throws MalformedURLException {
        SauceLabsSetUp();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(AppURL);
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearEnv(){
        driver.quit();
    }

    public static void SauceLabsSetUp() throws MalformedURLException{
        String browserVersion,osPlatform;
        browserVersion=System.getProperty("browserVersion");
        osPlatform=System.getProperty("osPlatform");
        TestRunID = RestHelper.createTestRun();
//        System.setProperty("browserType","Firefox");
//        System.setProperty("qaEnvironment","Dev02");
        String browser = System.getProperty("browserType");
        if (browser.equals("Firefox")) {
            //driver = new FirefoxDriver();
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            capabilities.setCapability("version", browserVersion);
            capabilities.setCapability("name",RestHelper.generateTestRunName());
            if(osPlatform.equals("Windows7"))
                capabilities.setCapability("platform", "Windows 7");
            if(osPlatform.equals("Windows8"))
                capabilities.setCapability("platform", Platform.WIN8);
            if(osPlatform.equals("Windows8.1"))
                capabilities.setCapability("platform", Platform.WIN8_1);
            if(osPlatform.equals("WindowsXP"))
                capabilities.setCapability("platform", Platform.XP);
            if(osPlatform.equals("OSXMavericks"))
                capabilities.setCapability("platform", "OS X 10.9");
            driver = new RemoteWebDriver(
                    new URL(SettingsHelper.SauceLabs),
                    capabilities);
        } else if (browser.equals("Chrome")) {
            //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/supportDrivers/chromedriver");
            //driver = new ChromeDriver();
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.setCapability("version", browserVersion);
            capabilities.setCapability("name",RestHelper.generateTestRunName());
            if(osPlatform.equals("Windows7"))
                capabilities.setCapability("platform", "Windows 7");
            if(osPlatform.equals("Windows8"))
                capabilities.setCapability("platform", Platform.WIN8);
            if(osPlatform.equals("Windows8.1"))
                capabilities.setCapability("platform", Platform.WIN8_1);
            if(osPlatform.equals("WindowsXP"))
                capabilities.setCapability("platform", Platform.XP);
            if(osPlatform.equals("OSXMavericks"))
                capabilities.setCapability("platform", "OS X 10.9");
            driver = new RemoteWebDriver(
                    new URL(SettingsHelper.SauceLabs),
                    capabilities);

        } else if (browser.equals("Safari")) {
            //driver = new SafariDriver();
            DesiredCapabilities capabilities = DesiredCapabilities.safari();
            capabilities.setCapability("version", browserVersion);
            capabilities.setCapability("name",RestHelper.generateTestRunName());
            if(osPlatform.equals("Windows7"))
                capabilities.setCapability("platform", "Windows 7");
            if(osPlatform.equals("Windows8"))
                capabilities.setCapability("platform", Platform.WIN8);
            if(osPlatform.equals("Windows8.1"))
                capabilities.setCapability("platform", Platform.WIN8_1);
            if(osPlatform.equals("WindowsXP"))
                capabilities.setCapability("platform", Platform.XP);
            if(osPlatform.equals("OSXMavericks"))
                capabilities.setCapability("platform", "OS X 10.9");
            driver = new RemoteWebDriver(
                    new URL(SettingsHelper.SauceLabs),
                    capabilities);

        } else if(browser.equals("IE")){
            DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
            capabilities.setCapability("version", browserVersion);
            capabilities.setCapability("name",RestHelper.generateTestRunName());
            if(osPlatform.equals("Windows7"))
                capabilities.setCapability("platform", "Windows 7");
            if(osPlatform.equals("Windows8"))
                capabilities.setCapability("platform", Platform.WIN8);
            if(osPlatform.equals("Windows8.1"))
                capabilities.setCapability("platform", Platform.WIN8_1);
            if(osPlatform.equals("WindowsXP"))
                capabilities.setCapability("platform", Platform.XP);
            if(osPlatform.equals("OSXMavericks"))
                capabilities.setCapability("platform", "OS X 10.9");
            driver = new RemoteWebDriver(
                    new URL(SettingsHelper.SauceLabs),
                    capabilities);
        }
        String env = System.getProperty("qaEnvironment");
        if (env.equals("Dev01")) {
            AppURL = SettingsHelper.Dev01+"/#/login";
        } else if (env.equals("Dev02")) {
            AppURL = SettingsHelper.Dev02+"/#/login";

        } else if (env.equals("Staging")) {
            AppURL = SettingsHelper.Staging+"/#/login";

        } else if (env.equals("Prod")) {
            AppURL = SettingsHelper.Prod+"/#/login";

        } else {
            AppURL = SettingsHelper.Dev02+"/#/login";

        }
    }
}
