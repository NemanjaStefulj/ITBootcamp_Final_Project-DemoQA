package Tests.AlertsFramesWindowsTests;

import BasePage.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;

import static org.testng.Assert.assertEquals;

public class BrowserWindowsTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(browserWindows.url);
    }

    @Test
    public void newTabTest() {
        browserWindows.getTabButton().click();
        Set<String> tabs = driver.getWindowHandles();
        ArrayList<String > openedTabs = new ArrayList<>(tabs);
        driver.switchTo().window(openedTabs.get(1));
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/sample");
    }

    @Test
    public void newWindowTest() {
        browserWindows.getWindowButton().click();
        Set<String> tabs = driver.getWindowHandles();
        ArrayList<String> openedTabs = new ArrayList<>(tabs);
        driver.switchTo().window(openedTabs.get(1));
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/sample");
    }

    @Test
    public void newWindowMessageTest() {
        browserWindows.getNewWindowMessage().click();
        Set<String> tabs = driver.getWindowHandles();
        ArrayList<String > openedTabs = new ArrayList<>(tabs);
        driver.switchTo().window(openedTabs.get(1));
        assertEquals(openedTabs.size(), 2);
    }
}
