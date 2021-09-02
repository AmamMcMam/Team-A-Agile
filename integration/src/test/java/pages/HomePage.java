package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject{

    public HomePage(WebDriver driver){super(driver);}

    @FindBy(id = "bandLink") private WebElement bandLink;

    public String getBandLink(){
        return bandLink.getAttribute("href");
    }


}
