package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class JobRolePage extends PageObject {

    @FindBy(id = "responsibilityTitle") private WebElement responsibilityTitle;

    @FindBy(xpath = "//li") private List<WebElement> listItem;

    public JobRolePage(WebDriver driver) {
        super(driver);
    }

    public String getRespTitle() { return responsibilityTitle.getText();}

    public int getResponsibility() {
        return listItem.size();
    }
}
