package integration;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
        jobRolesPage.clickJobRole();
    }

    @Then("I can view the role page")
    public void viewJobRole() {
        JobRolePage jobRolePage = new JobRolePage(driver);
        assertEquals(jobRolePage.getRespTitle(), "Role Responsibilities");
        assertTrue(jobRolePage.getResponsibility() > 1);
    }
}
