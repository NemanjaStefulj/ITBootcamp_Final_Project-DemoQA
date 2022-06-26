package Pages.Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Draggable {

    public final String url = "https://demoqa.com/dragabble";
    public WebDriver driver;

    public Draggable(WebDriver driver) {
        this.driver = driver;
    }

    public By dragBox = By.id("dragBox");
    public By axisTab = By.id("draggableExample-tab-axisRestriction");
    public By restrictedX = By.id("restrictedX");
    public By restrictedY = By.id("restrictedY");
    public By containerTab = By.id("draggableExample-tab-containerRestriction");
    public By withinBox = By.xpath("//div[contains(text(),\"I'm contained within the box\")]");
    public By withinParent = By.xpath("//span[contains(text(),\"I'm contained within my parent\")]");
    public By cursorTab = By.id("draggableExample-tab-cursorStyle");
    public By cursorCenter = By.id("cursorCenter");
    public By cursorTopLeft = By.id("cursorTopLeft");
    public By cursorBottom = By.id("cursorBottom");

    public WebElement getDragBox() {
        return driver.findElement(dragBox);
    }

    public WebElement getAxisTab() {
        return driver.findElement(axisTab);
    }

    public WebElement getRestrictedX() {
        return driver.findElement(restrictedX);
    }

    public WebElement getRestrictedY() {
        return driver.findElement(restrictedY);
    }

    public WebElement getContainerTab() {
        return driver.findElement(containerTab);
    }

    public WebElement getWithinBox() {
        return driver.findElement(withinBox);
    }

    public WebElement getWithinParent() {
        return driver.findElement(withinParent);
    }

    public WebElement getCursorTab() {
        return driver.findElement(cursorTab);
    }

    public WebElement getCursorCenter() {
        return driver.findElement(cursorCenter);
    }

    public WebElement getCursorTopLeft() {
        return driver.findElement(cursorTopLeft);
    }

    public WebElement getCursorBottom() {
        return driver.findElement(cursorBottom);
    }
}
