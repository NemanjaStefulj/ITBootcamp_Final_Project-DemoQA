package Pages.AlertsFramesWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

    public final String url = "https://demoqa.com/alerts";
    public final String alertText = "You clicked a button";
    public final String timerText = "This alert appeared after 5 seconds";
    public WebDriver driver;
    public WebDriverWait wdwait;

    public Alerts(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public By alertButton = By.id("alertButton");
    public By timerAlert = By.id("timerAlertButton");
    public By confirmButton = By.id("confirmButton");
    public By promptButton = By.id("promtButton");

    public WebElement getAlertButton() {
        return driver.findElement(alertButton);
    }

    public WebElement getTimerAlert() {
        return driver.findElement(timerAlert);
    }

    public WebElement getConfirmButton() {
        return driver.findElement(confirmButton);
    }

    public WebElement getPromptButton() {
        return driver.findElement(promptButton);
    }
}
