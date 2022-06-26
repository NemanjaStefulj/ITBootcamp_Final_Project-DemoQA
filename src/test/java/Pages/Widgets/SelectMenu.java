package Pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectMenu {

    public final String url = "https://demoqa.com/select-menu";
    public WebDriver driver;

    public SelectMenu(WebDriver driver) {
        this.driver = driver;
    }

    public By oldSelectMenu = By.id("oldSelectMenu");
    public By standardMultiSelect = By.id("cars");

    public WebElement getOldSelectMenu() {
        return driver.findElement(oldSelectMenu);
    }

    public WebElement getStandardMultiSelect() {
        return driver.findElement(standardMultiSelect);
    }

}
