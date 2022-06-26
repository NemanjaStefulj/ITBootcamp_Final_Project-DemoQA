package Tests.WidgetsTests;

import BasePage.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TabsTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(tabsT.url);
    }

    @Test
    public void originTabTest() {
        tabsT.getTabOrigin().click();
        assertTrue(tabsT.getOriginText().isDisplayed());
    }

    @Test
    public void whatTabTest() {
        tabsT.getTabOrigin().click();
        tabsT.getTabWhat().click();
        assertTrue(tabsT.getWhatText().isDisplayed());
    }

    @Test
    public void useTabTest() {
        tabsT.getTabUse().click();
        assertTrue(tabsT.getUseText().isDisplayed());
    }
}
