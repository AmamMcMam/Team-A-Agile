package integration;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.BandsPage;
import pages.CompetencyPage;
import pages.HomePage;
import pages.JobRolesPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomePageToCompetency {
    WebDriver driver = RunCucumberTest.getDriver();
    private final String HOME_PAGE = "http://localhost:6555/#";


    @Given("as a kainos employee I want to get to the competencies per band page from the home page")
    public HomePageToCompetency employeeGoesToHomePage(){
        driver.navigate().to(HOME_PAGE);
        return this;
    }

    @When("I click on the bands button")
    public HomePageToCompetency selectBandsButton() {
        HomePage homePage = new HomePage(driver);
        driver.navigate().to(homePage.getBandLink());
        return this;
    }

    @When("I click on the {} heading")
    public HomePageToCompetency selectAHeading(String band) {
        BandsPage bandsPage = new BandsPage(driver);
        assertTrue(bandsPage.isBand(band));
        driver.navigate().to(bandsPage.getCompetenciesLink(band));
        return this;
    }

    @Then("I should be on the competencies page for that band")
    public HomePageToCompetency checkCapabilitiesPageTitle(){
        CompetencyPage competencyPage = new CompetencyPage(driver);
        String expectedTitle = "Competencies";
        assertEquals(expectedTitle, competencyPage.getTitle());
        return this;
    }




}
