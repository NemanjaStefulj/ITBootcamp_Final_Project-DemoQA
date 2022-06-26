package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Buttons {

    public final String url = "https://demoqa.com/buttons";
    public WebDriver driver;

    public Buttons(WebDriver driver) {
        this.driver = driver;
    }

    public By doubleClick = By.id("doubleClickBtn");
    public By doubleClickMessage = By.id("doubleClickMessage");
    public By rightClick = By.id("rightClickBtn");
    public By rightClickMessage = By.id("rightClickMessage");
    public By dynamicClickMessage = By.id("dynamicClickMessage");


    public WebElement getDoubleClick() {
        return driver.findElement(doubleClick);
    }

    public WebElement getDoubleClickMessage() {
        return driver.findElement(doubleClickMessage);
    }

    public WebElement getRightClick() {
        return driver.findElement(rightClick);
    }

    public WebElement getRightClickMessage() {
        return driver.findElement(rightClickMessage);
    }

    public WebElement getDynamicClickMessage() {
        return driver.findElement(dynamicClickMessage);
    }

    public List<WebElement> allButtons() {
        return driver.findElements(By.tagName("button"));
    }
}
