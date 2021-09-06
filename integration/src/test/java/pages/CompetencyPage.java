package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompetencyPage extends PageObject{
    @FindBy(id = "compTitle") private WebElement title;


    public CompetencyPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle(){
        return title.getText();
    }

}
