package Pages.AlertsFramesWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserWindows {

    public final String url = "https://demoqa.com/browser-windows";
    public WebDriver driver;

    public BrowserWindows(WebDriver driver) {
        this.driver = driver;
    }

    public By tabButton = By.id("tabButton");
    public By windowButton = By.id("windowButton");
    public By newWindowMessage = By.id("messageWindowButton");

    public WebElement getTabButton() {
        return driver.findElement(tabButton);
    }

    public WebElement getWindowButton() {
        return driver.findElement(windowButton);
    }

    public WebElement getNewWindowMessage() {
        return driver.findElement(newWindowMessage);
    }
}
