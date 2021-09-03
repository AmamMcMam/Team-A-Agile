package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class JobRolePage extends PageObject {

    @FindBy(id = "roleName")
    private WebElement roleName;

    @FindBy(id = "responsibilityTitle") private WebElement responsibilityTitle;

    @FindBy(xpath = "//li") private List<WebElement> listItem;

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

    public String getRespTitle() { return responsibilityTitle.getText();}

    public int getResponsibility() {
        return listItem.size();
    }

    public String getRoleName() {
        return roleName.getText();
    }

    public String getRoleDatePosted() {
        return roleDatePosted.getText();
    }

    public String getRoleHours() {
        return roleHours.getText();
    }

    public String getRoleLocation() {
        return roleLocation.getText();
    }

    public String getSpecificationLink() {
        return specificationLink.getAttribute("href");
    }

    public void clickSharepointLink() {
        specificationLink.click();
    }

}
