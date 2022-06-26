package Pages.Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Droppable {

    public final String url = "https://demoqa.com/droppable";
    public WebDriver driver;

    public Droppable(WebDriver driver) {
        this.driver = driver;
    }

    public By draggable = By.id("draggable");
    public By droppable = By.id("droppable");
    public By acceptTab = By.id("droppableExample-tab-accept");
    public By acceptable = By.id("acceptable");
    public By notAcceptable = By.id("notAcceptable");
    public By propagationTab = By.id("droppableExample-tab-preventPropogation");
    public By dragBox = By.id("dragBox");
    public By notGreedyOuter = By.id("notGreedyDropBox");
    public By notGreedyInner = By.id("notGreedyInnerDropBox");
    public By greedyOuter = By.id("greedyDropBox");
    public By greedyInner = By.id("greedyDropBoxInner");
    public By revertTab = By.id("droppableExample-tab-revertable");
    public By revertable = By.id("revertable");
    public By notRevertable = By.id("notRevertable");

    public WebElement getDraggable() {
        return driver.findElement(draggable);
    }

    public WebElement getDroppable() {
        return driver.findElement(droppable);
    }

    public WebElement getAcceptedTab() {
        return driver.findElement(acceptTab);
    }

    public WebElement getAcceptable() {
        return driver.findElement(acceptable);
    }

    public WebElement getNotAcceptable() {
        return driver.findElement(notAcceptable);
    }

    public WebElement getPropagationTab() {
        return driver.findElement(propagationTab);
    }

    public WebElement getDragBox() {
        return driver.findElement(dragBox);
    }

    public WebElement getNotGreedyOuter() {
        return driver.findElement(notGreedyOuter);
    }

    public WebElement getNotGreedyInner() {
        return driver.findElement(notGreedyInner);
    }

    public WebElement getGreedyOuter() {
        return driver.findElement(greedyOuter);
    }

    public WebElement getGreedyInner() {
        return driver.findElement(greedyInner);
    }

    public WebElement getRevertTab() {
        return driver.findElement(revertTab);
    }

    public WebElement getRevertable() {
        return driver.findElement(revertable);
    }

    public WebElement getNotRevertable() {
        return driver.findElement(notRevertable);
    }
}
