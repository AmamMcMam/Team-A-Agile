package integration;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.CapabilitiesPage;
import pages.HomePage;

import static org.junit.Assert.assertEquals;

public class HomepageToStepDefinitions {
    WebDriver driver = RunCucumberTest.getDriver();
    private final String HOMEPAGE = "http://localhost:6555";


    @Given("as a Kainos employee who wants to view the capabilities page")
    public void viewTheCapabilitiesPage() {
        driver.navigate().to(HOMEPAGE);
        HomePage home = new HomePage(driver);
        driver.navigate().to(home.getCapLink());
        CapabilitiesPage capsPage = new CapabilitiesPage(driver);
        assertEquals(capsPage.getTitle(), "Capabilities");
    }

}
