package Tests.AlertsFramesWindowsTests;

import BasePage.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ModalDialogsTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(modalDialogs.url);
    }

    @Test
    public void smallModalTest() {
        modalDialogs.getSmallModal().click();
        assertTrue(modalDialogs.getCloseSmallModal().isDisplayed());
    }

    @Test
    public void bigModalTest() {
        modalDialogs.getLargeModal().click();
        assertTrue(modalDialogs.getCloseLargeModal().isDisplayed());
    }
}
