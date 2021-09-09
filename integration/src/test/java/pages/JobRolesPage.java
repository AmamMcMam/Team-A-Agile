package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class JobRolesPage extends PageObject {

    @FindBy(id = "resultsHeader") private WebElement resultsHeader;

    @FindBy(className = "section")
    private List<WebElement> amountOfJobs;

    @FindBy(id = "date-1")
    private WebElement date;

    @FindBy(id = "location-1")
    private WebElement location;

    @FindBy(id = "role-1")
    private WebElement roleName;

    @FindBy(id = "role-2")
    private WebElement roleName2;

    @FindBy(id = "lead-name")
    private WebElement leadName;

    @FindBy(id = "lead-photo")
    private WebElement leadPhoto;

    @FindBy(id = "lead-message")
    private WebElement leadMessage;

    public JobRolesPage(WebDriver driver) {
        super(driver);
    }

    public int getResults() {
        return Integer.parseInt(resultsHeader.getText());
    }

    public String getRoleName() {
        return roleName.getText();
    }

    public String getLocation() {
        return location.getText();
    }

    public String getDate() {
        return date.getText();
    }

    public String getLeadName() {
        return leadName.getText();
    }

    public String getLeadPhoto() {
        return leadPhoto.getAttribute("src");
    }

    public String getLeadMessage() {
        return leadMessage.getText();
    }

    public int getTotalJobRoles() {
        return amountOfJobs.size();
    }

    public void clickJobRole() {
        roleName.click();
    }

    public void clickSecondRoleOnPage() {
        roleName2.click();
    }
}
