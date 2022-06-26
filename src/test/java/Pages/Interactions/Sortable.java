package Pages.Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Sortable {

    public final String url = "https://demoqa.com/sortable";
    public WebDriver driver;

    public Sortable(WebDriver driver) {
        this.driver = driver;
    }

    public By gridTab = By.id("demo-tab-grid");

    public List<WebElement> listItems() {
        return driver.findElements(By.className("list-group-item"));
    }

    public List<WebElement> gridItems() {
        return driver.findElements(By.className("list-group-item"));
    }

    public WebElement getGridTab() {
        return driver.findElement(gridTab);
    }
}
