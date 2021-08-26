package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class JobRolesPage extends PageObject {

    @FindBy(id = "resultsHeader") private WebElement resultsHeader;

    @FindBy(id = "roleName")
    private List<WebElement> amountOfJobs;

    @FindBy(id = "roleInfo")
    private WebElement roleInfo;

    public JobRolesPage(WebDriver driver) {
        super(driver);
    }

    public int getResults() {
        return Integer.parseInt(resultsHeader.getText());
    }

    public int getTotalJobRoles() {
        System.out.println(amountOfJobs.size());
        return amountOfJobs.size();
    }
}
