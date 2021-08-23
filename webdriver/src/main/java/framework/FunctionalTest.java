package framework;

import io.github.bonigarcia.wdm.WebDriverManager;

import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.remote.CapabilityType.BROWSER_VERSION;

public class FunctionalTest {

    protected static FirefoxDriver driver;

    protected final static String browserVersion = System.getProperty(BROWSER_VERSION);

    @BeforeClass
    public static void setUp() {
        WebDriverManager.firefoxdriver().browserVersion(browserVersion).setup();
        driver =  new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void cleanUp() {
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public static void tearDown() {
        driver.close();
    }
}
