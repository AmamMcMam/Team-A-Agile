package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class JobRolePage extends PageObject {

    @FindBy(id = "roleName") private WebElement roleName;

    @FindBy(id = "bandName")
    private WebElement bandName;

    public JobRolePage(WebDriver driver) {
        super(driver);
    }

    public String getHeading() {
        return roleName.getText();
    }

    public String getBandName() {
        return bandName.getText();
    }
}
