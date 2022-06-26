package Pages.Widgets;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProgressBar {

    public final String url = "https://demoqa.com/progress-bar";
    public WebDriver driver;
    public WebDriverWait wdwait;

    public ProgressBar(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public By startStop = By.id("startStopButton");
    public By resetButton = By.id("resetButton");
    public By progressBar = By.id("progressBar");

    public WebElement getStartStop() {
        return driver.findElement(startStop);
    }

    public WebElement getResetButton() {
        return driver.findElement(resetButton);
    }

    public WebElement getProgressBar() {
        return driver.findElement(progressBar);
    }
}
