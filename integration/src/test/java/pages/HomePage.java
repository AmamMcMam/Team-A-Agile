package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject{

    public HomePage(WebDriver driver){super(driver);}

    @FindBy(id = "band-link") private WebElement bandLink;
    @FindBy(id = "capability-link") private WebElement capLink;

    public String getBandLink(){
        return bandLink.getAttribute("href");
    }
   
    public String getCapLink() {
        return capLink.getAttribute("href");
    }
}
