package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CapabilitiesPage extends PageObject{

    @FindBy(id = "capTitle") private WebElement Title;

    @FindBy(id = "capName") private List<WebElement> capabilities;

    public CapabilitiesPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        System.out.println(Title.getText());
        return Title.getText(); }

    public boolean isCapability (String capability) {
        for (WebElement cap : capabilities)
        {
            if (cap.getText().equals(capability)) {
                return true;
            }
        }
        return false;
    }

    public String getCapabilityRolesLink(String capability) {

        for (WebElement cap : capabilities)
        {
            if (cap.getText().equals(capability)) {
                return cap.getAttribute("href");
            }
        }
        return "Not There";
    }
}
