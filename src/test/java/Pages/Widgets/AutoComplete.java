package Pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AutoComplete {

    public final String url = "https://demoqa.com/auto-complete";
    public WebDriver driver;

    public AutoComplete(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> fields() {
        return driver.findElements(By.className("auto-complete__value-container"));
    }
}
