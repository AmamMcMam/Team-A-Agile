package integration;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.CapabilitiesPage;
import pages.JobRolesPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CapabilitiesPageStepDefinitions {
    WebDriver  driver = RunCucumberTest.getDriver();
    private final String CAPABILITIES_PAGE = "http://localhost:6555/capabilities";

    @Given("The Kainos employee is on the capabilities page")
    public CapabilitiesPageStepDefinitions employeeViewsCapabilitiesPage() {
        driver.navigate().to(CAPABILITIES_PAGE);
        CapabilitiesPage capsPage= new CapabilitiesPage(driver);
        assertEquals(capsPage.getTitle(), "Capabilities");
        return this;
    }


    @Then("The client clicks on the {} capability")
    public CapabilitiesPageStepDefinitions TheClientClicksOn(String capName) {
        CapabilitiesPage capsPage = new CapabilitiesPage(driver);
        assertTrue(capsPage.isCapability(capName));
        driver.navigate().to(capsPage.getCapabilityRolesLink(capName));
        return this;
    }

    @And("capability has {int} jobs")
    public CapabilitiesPageStepDefinitions capabilityHasResults(int results) {
        JobRolesPage jobRolesPage = new JobRolesPage(driver);
        assertEquals(jobRolesPage.getResults(), results);
        return this;
    }


}
