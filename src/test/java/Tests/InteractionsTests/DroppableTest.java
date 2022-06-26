package Tests.InteractionsTests;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class DroppableTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(droppable.url);
    }

    @Test
    public void simpleDroppableTest() {
        String location1 = String.valueOf(droppable.getDraggable().getLocation());
        actions.dragAndDrop(droppable.getDraggable(), droppable.getDroppable()).build().perform();
        String location2 = String.valueOf(droppable.getDraggable().getLocation());
        assertNotEquals(location1, location2);
    }

    /* @Test
    public void acceptedTest() throws InterruptedException {
        droppable.getAcceptedTab().click();
        Thread.sleep(2000);
        String text1 = droppable.getDroppable().getText();
        actions.dragAndDrop(droppable.getAcceptable(), droppable.getDroppable()).build().perform();
        Thread.sleep(2000);
        String text2 = droppable.getDroppable().getText();
        assertNotEquals(text1, text2);
    } */

    /* @Test
    public void notAcceptedTest() throws InterruptedException {
        droppable.getAcceptedTab().click();
        Thread.sleep(2000);
        String text1 = droppable.getDroppable().getText();
        actions.dragAndDrop(droppable.getNotAcceptable(), droppable.getDroppable()).build().perform();
        Thread.sleep(2000);
        String text2 = droppable.getDroppable().getText();
        assertEquals(text1, text2);
    } */

    @Test
    public void propagationNotGreedyOuterTest() {
        droppable.getPropagationTab().click();
        String text1 = droppable.getNotGreedyOuter().getText();
        actions.dragAndDrop(droppable.getDragBox(), droppable.getNotGreedyOuter()).build().perform();
        String text2 = droppable.getNotGreedyOuter().getText();
        assertNotEquals(text1, text2);
    }

    @Test
    public void propagationNotGreedyInnerTest() {
        droppable.getPropagationTab().click();
        String text1 = droppable.getNotGreedyInner().getText();
        actions.dragAndDrop(droppable.getDragBox(), droppable.getNotGreedyInner()).build().perform();
        String text2 = droppable.getNotGreedyInner().getText();
        assertNotEquals(text1, text2);
    }

    @Test
    public void propagationGreedyOuterTest() {
        droppable.getPropagationTab().click();
        String text1 = droppable.getGreedyOuter().getText();
        actions.dragAndDrop(droppable.getDragBox(), droppable.getGreedyOuter()).build().perform();
        String text2 = droppable.getGreedyOuter().getText();
        assertNotEquals(text1, text2);
    }

    @Test
    public void propagationGreedyInnerTest() {
        droppable.getPropagationTab().click();
        String text1 = droppable.getGreedyInner().getText();
        actions.dragAndDrop(droppable.getDragBox(), droppable.getGreedyInner()).build().perform();
        String text2 = droppable.getGreedyInner().getText();
        assertNotEquals(text1, text2);
    }

    /* @Test
    public void revertibleTest() {
        droppable.getRevertTab().click();
        String location1 = String.valueOf(droppable.getRevertable().getLocation());
        actions.dragAndDrop(droppable.getRevertable(), droppable.getDroppable()).build().perform();
        String location2 = String.valueOf(droppable.getRevertable().getLocation());
        assertEquals(location1, location2);
    } */

    /* @Test
    public void notRevertibleTest() {
        droppable.getRevertTab().click();
        String location1 = String.valueOf(droppable.getNotRevertable().getLocation());
        actions.dragAndDrop(droppable.getNotRevertable(), droppable.getDroppable()).build().perform();
        String location2 = String.valueOf(droppable.getNotRevertable().getLocation());
        assertNotEquals(location1, location2);
    } */
}
