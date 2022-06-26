package Tests.InteractionsTests;

import BasePage.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class DraggableTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(draggable.url);
    }

    @Test
    public void simpleDragTest() {
        String location1 = String.valueOf(draggable.getDragBox().getLocation());
        actions.dragAndDropBy(draggable.getDragBox(), 300, 150).build().perform();
        String location2 = String.valueOf(draggable.getDragBox().getLocation());
        assertNotEquals(location1, location2);
    }

    @Test
    public void axisTestX() {
        draggable.getAxisTab().click();
        int xOffsetX = draggable.getRestrictedX().getLocation().getX();
        int yOffsetX = draggable.getRestrictedX().getLocation().getY();
        String location1X = String.valueOf(draggable.getRestrictedX().getLocation());
        actions.dragAndDropBy(draggable.getRestrictedX(), xOffsetX + 1, yOffsetX).build().perform();
        String location2X = String.valueOf(draggable.getRestrictedX().getLocation());
        assertNotEquals(location1X, location2X);
    }

    @Test
    public void axisTestY(){
        draggable.getAxisTab().click();
        int xOffsetY = draggable.getRestrictedY().getLocation().getX();
        int yOffsetY = draggable.getRestrictedY().getLocation().getY();
        String location1Y = String.valueOf(draggable.getRestrictedY().getLocation());
        actions.dragAndDropBy(draggable.getRestrictedY(), xOffsetY, yOffsetY + 1).build().perform();
        String location2Y = String.valueOf(draggable.getRestrictedY().getLocation());
        assertNotEquals(location1Y, location2Y);
    }

    @Test
    public void containerTest1() {
        draggable.getContainerTab().click();
        int xOffset = draggable.getWithinBox().getLocation().getX();
        int yOffset = draggable.getWithinBox().getLocation().getY();
        String location1 = String.valueOf(draggable.getWithinBox().getLocation());
        actions.dragAndDropBy(draggable.getWithinBox(), xOffset - 1, yOffset - 1).build().perform();
        String location2 = String.valueOf(draggable.getWithinBox().getLocation());
        assertNotEquals(location1, location2);
    }

    /*@Test
    public void containerTest2() {
        draggable.getContainerTab().click();
        int xOffset = draggable.getWithinParent().getLocation().getX();
        int yOffset = draggable.getWithinParent().getLocation().getY();
        String location1 = String.valueOf(draggable.getWithinParent().getLocation());
        actions.dragAndDropBy(draggable.getWithinParent(), xOffset - 1, yOffset -1).build().perform();
        String location2 = String.valueOf(draggable.getWithinParent().getLocation());
        assertNotEquals(location1, location2);
    } */

    @Test
    public void cursorTest1Center() {
        draggable.getCursorTab().click();
        int xOffset = draggable.getCursorCenter().getLocation().getX();
        int yOffset = draggable.getCursorCenter().getLocation().getY();
        String location1 = String.valueOf(draggable.getCursorCenter().getLocation());
        actions.dragAndDropBy(draggable.getCursorCenter(), xOffset + 1, yOffset - 1).build().perform();
        String location2 = String.valueOf(draggable.getCursorCenter().getLocation());
        assertNotEquals(location1, location2);
    }

    @Test
    public void cursorTest2Top() {
        draggable.getCursorTab().click();
        int xOffset = draggable.getCursorTopLeft().getLocation().getX();
        int yOffset = draggable.getCursorTopLeft().getLocation().getY();
        String location1 = String.valueOf(draggable.getCursorTopLeft().getLocation());
        actions.dragAndDropBy(draggable.getCursorTopLeft(), xOffset + 1, yOffset - 1).build().perform();
        String location2 = String.valueOf(draggable.getCursorTopLeft().getLocation());
        assertNotEquals(location1, location2);
    }

    @Test
    public void cursorTest3Bottom() {
        draggable.getCursorTab().click();
        int xOffset = draggable.getCursorBottom().getLocation().getX();
        int yOffset = draggable.getCursorBottom().getLocation().getY();
        String location1 = String.valueOf(draggable.getCursorBottom().getLocation());
        actions.dragAndDropBy(draggable.getCursorBottom(), xOffset + 1, yOffset - 1).build().perform();
        String location2 = String.valueOf(draggable.getCursorBottom().getLocation());
        assertNotEquals(location1, location2);
    }
}
