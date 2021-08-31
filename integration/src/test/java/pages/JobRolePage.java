package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class JobRolePage extends PageObject {

    @FindBy(id = "roleName")
    private WebElement roleName;

    @FindBy(id = "bandName")
    private WebElement bandName;

    @FindBy(id = "roleDatePosted")
    private WebElement roleDatePosted;

    @FindBy(id = "roleHours")
    private WebElement roleHours;

    @FindBy(id = "roleLocation")
    private WebElement roleLocation;

    @FindBy(id = "specificationLink")
    private WebElement specificationLink;

    public JobRolePage(WebDriver driver) {
        super(driver);
    }

    public String getHeading() {
        return roleName.getText();
    }

    public String getBandName() {
        return bandName.getText();
    }

    public String getRoleName() {
        return roleName.getText();
    }

    public WebElement getRoleDatePosted() {
        return roleDatePosted;
    }

    public WebElement getRoleHours() {
        return roleHours;
    }

    public WebElement getRoleLocation() {
        return roleLocation;
    }

    public String getSpecificationLink() {
        return specificationLink.getAttribute("href");
    }

    public void clickSharepointLink() {
        specificationLink.click();
    }
}
