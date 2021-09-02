package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BandsPage extends PageObject{

    @FindBy(xpath = "//a[starts-with(@id, 'bands-')]") private List<WebElement> bands;


    public BandsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isBand(String band) {
        return bands.stream()
                .map(WebElement::getText)
                .anyMatch(band::equals);
    }

    public String getCompetenciesLink(String band) {
        return bands.stream()
                .filter(b -> band.equals(b.getText()))
                .findAny()
                .map(b -> b.getAttribute("href"))
                .orElse("Not There");
    }

}
