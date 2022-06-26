package Pages.AlertsFramesWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ModalDialogs {

    public final String url = "https://demoqa.com/modal-dialogs";
    public WebDriver driver;

    public ModalDialogs(WebDriver driver) {
        this.driver = driver;
    }

    public By smallModal = By.id("showSmallModal");
    public By largeModal = By.id("showLargeModal");
    public By closeSmallModal = By.id("closeSmallModal");
    public By closeLargeModal = By.id("closeLargeModal");

    public WebElement getSmallModal() {
        return driver.findElement(smallModal);
    }

    public WebElement getLargeModal() {
        return driver.findElement(largeModal);
    }

    public WebElement getCloseSmallModal() {
        return driver.findElement(closeSmallModal);
    }

    public WebElement getCloseLargeModal() {
        return driver.findElement(closeLargeModal);
    }
}
