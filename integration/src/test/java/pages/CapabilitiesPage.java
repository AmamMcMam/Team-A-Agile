package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CapabilitiesPage extends PageObject{

    @FindBy(id = "capability-title") private WebElement title;

    @FindBy(xpath = "//a[starts-with(@id, 'link-')]") private List<WebElement> capabilities;

    public CapabilitiesPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return title.getText(); }

    public boolean isCapability (String capability) {
        return capabilities.stream()
                .map(WebElement::getText)
                .anyMatch(capability::equals);
    }

    public String getCapabilityRolesLink(String capability) {
        return capabilities.stream()
                .filter(cap -> capability.equals(cap.getText()))
                .findAny()
                .map(cap -> cap.getAttribute("href"))
                .orElse("Not There");
    }
}
