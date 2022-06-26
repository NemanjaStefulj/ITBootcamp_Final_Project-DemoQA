package Tests.ElementsTests;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class ButtonsTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(buttons.url);
    }

    @Test
    public void doubleClickTest() {
        actions.doubleClick(buttons.getDoubleClick()).build().perform();
        assertTrue(buttons.getDoubleClickMessage().isDisplayed());
    }

    @Test
    public void rightClickTest() {
        actions.contextClick(buttons.getRightClick()).build().perform();
        assertTrue(buttons.getRightClickMessage().isDisplayed());
    }

    @Test
    public void clickTest() {
        for (WebElement we : buttons.allButtons()) {
            if (we.getText().contentEquals("Click Me")) {
                actions.click(we).build().perform();
                assertTrue(buttons.getDynamicClickMessage().isDisplayed());
            }
            else {
                assertFalse(false);
            }
        }
    }
}
