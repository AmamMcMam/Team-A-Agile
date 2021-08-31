package integration;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;
import pages.JobRolePage;
import pages.JobRolesPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JobRoleStepDefinitions {
    WebDriver driver = RunCucumberTest.getDriver();
    private final String ROLES_PAGE = "http://localhost:6555/job-roles";

    @Given("as a Kainos employee I want to see each role")
    public void employeeViewsJobRolesPage() {
        driver.navigate().to(ROLES_PAGE);
    }

    @When("I select a role")
    public void selectJobRole() {
        JobRolesPage jobRolesPage = new JobRolesPage(driver);
        jobRolesPage.clickJobRole2();
    }

    @Then("I can view the role page")
    public void viewJobRole() {
        JobRolePage jobRolePage = new JobRolePage(driver);
        assertEquals(jobRolePage.getHeading(), "Solutions Architect");
        assertEquals(jobRolePage.getBandName(), "Apprentice");
    }

    @And("I can click on the sharepoint page")
    public void canClickOnSharepointLink(){
        JobRolePage jobRolePage = new JobRolePage(driver);
        assertEquals(jobRolePage.getSpecificationLink(), "https://kainossoftwareltd.sharepoint.com/people/Job%20Specifications/Forms/AllItems.aspx?id=%2Fpeople%2FJob%20Specifications%2FEngineering%2FJob%20Profile%20%2D%20Solution%20Architect%20%28Manager%29%2Epdf&parent=%2Fpeople%2FJob%20Specifications%2FEngineering&p=true&originalPath=aHR0cHM6Ly9rYWlub3Nzb2Z0d2FyZWx0ZC5zaGFyZXBvaW50LmNvbS86YjovZy9wZW9wbGUvRVNwcDU2Zlp5cmhLaTZ1Q3V3cHNoRHdCM25tbzFCTWtiUUtZRFhiTkhDaV9zdz9ydGltZT1tcHlFbzJSczJVZw");
        jobRolePage.clickSharepointLink();
    }
}
