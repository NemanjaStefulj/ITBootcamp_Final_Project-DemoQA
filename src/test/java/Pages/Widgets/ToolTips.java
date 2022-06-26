package Pages.Widgets;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolTips {

    public final String url = "https://demoqa.com/tool-tips";
    public WebDriver driver;
    public WebDriverWait wdwait;

    public ToolTips(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public By toolTipButton = By.id("toolTipButton");
    public By toolTipText = By.id("toolTipTextField");
    public By contrary = By.linkText("Contrary");
    public By numbers = By.linkText("1.10.32");

    public WebElement getToolTipButton() {
        return driver.findElement(toolTipButton);
    }

    public WebElement getToolTipText() {
        return driver.findElement(toolTipText);
    }

    public WebElement getContrary() {
        return driver.findElement(contrary);
    }

    public WebElement getNumbers() {
        return driver.findElement(numbers);
    }
}
