package integration;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.JobRolesPage;

import static org.junit.Assert.*;

public class JobRolesStepDefinitions {
    WebDriver driver = RunCucumberTest.getDriver();
    private final String ROLES_PAGE = "http://localhost:6555/job-roles";

    @Given("as a Kainos employee who wants to view the job roles")
    public void employeeViewsJobRolesPage() {
        driver.navigate().to(ROLES_PAGE);
    }

    @Then("there are {int} results")
    public void numberOfJobRoleResults(int results) {
        JobRolesPage jobRolesPage = new JobRolesPage(driver);
        // Test "x results" heading
        int totalResults = jobRolesPage.getResults();
        assertTrue(String.format("Number of results does not match expected amount", totalResults),
                totalResults == results);
        // Test number of rows
        int amountOfJobs = jobRolesPage.getTotalJobRoles();
        assertTrue(String.format("Results do not match the current amount of job roles", totalResults),
                totalResults == amountOfJobs);

        assertEquals(jobRolesPage.getRoleName(), "Product Principal");
        assertEquals(jobRolesPage.getDate(), "13-07-2021");
        assertEquals(jobRolesPage.getLocation(), "Birmingham");

    }
}
