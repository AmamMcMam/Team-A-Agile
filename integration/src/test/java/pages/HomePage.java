package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject{

    @FindBy(id = "capability-link") private WebElement capLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getCapLink() {
        return capLink.getAttribute("href");
    }
}
