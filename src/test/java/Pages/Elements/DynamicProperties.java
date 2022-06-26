package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicProperties {

    public final String url = "https://demoqa.com/dynamic-properties";
    public WebDriver driver;
    public WebDriverWait wdwait;

    public DynamicProperties(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public By enableAfter = By.id("enableAfter");
    public By colorChange = By.id("colorChange");
    public By visibleAfter = By.id("visibleAfter");

    public WebElement getEnableAfter() {
        return driver.findElement(enableAfter);
    }

    public WebElement getColorChange() {
        return driver.findElement(colorChange);
    }

    public WebElement getVisibleAfter() {
        return driver.findElement(visibleAfter);
    }
}
