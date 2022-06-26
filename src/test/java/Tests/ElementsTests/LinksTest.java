package Tests.ElementsTests;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LinksTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(links.url);
    }

    @Test(priority = 8)
    public void newTabOpenedLinkTest() {
        links.getHome().click();
        Set<String> tabs = driver.getWindowHandles();
        ArrayList<String> openedTabs = new ArrayList<>(tabs);
        driver.switchTo().window(openedTabs.get(1));
        assertEquals(driver.getCurrentUrl(), homePage.url);
        assertEquals(openedTabs.size(), 2);
    }

    @Test (priority = 9)
    public void newOpenedTabLink2Test() {
        if (driver.getWindowHandles().size() == 1) {
            links.getHome2().click();
            Set<String> tabs = driver.getWindowHandles();
            ArrayList<String > openedTabs = new ArrayList<>(tabs);
            driver.switchTo().window(openedTabs.get(1));
            assertEquals(driver.getCurrentUrl(), homePage.url);
            assertEquals(openedTabs.size(), 2);
        }
        else if (driver.getWindowHandles().size() == 2) {
            Set<String> tabs = driver.getWindowHandles();
            ArrayList<String > openedTabs = new ArrayList<>(tabs);
            driver.switchTo().window(openedTabs.get(1));
            links.getHome2().click();
            assertEquals(openedTabs.size(), 2);
        }
    }

    @Test (priority = 1)
    public void createdLinkTest() {
        links.getCreated().click();
        assertTrue(links.getLinkResponse().isDisplayed());
    }

    @Test (priority = 2)
    public void noContentLinkTest() {
        links.getNoContent().click();
        assertTrue(links.getLinkResponse().isDisplayed());
    }

    @Test (priority = 3)
    public void movedLinkTest() {
        links.getMoved().click();
        assertTrue(links.getLinkResponse().isDisplayed());
    }

    @Test (priority = 4)
    public void badRequestLinkTest() {
        links.getBadRequest().click();
        assertTrue(links.getLinkResponse().isDisplayed());
    }

    @Test (priority = 5)
    public void unauthorizedLinkTest() {
        links.getUnauthorized().click();
        assertTrue(links.getLinkResponse().isDisplayed());
    }

    @Test (priority = 6)
    public void forbiddenLinkTest() {
        links.getForbidden().click();
        assertTrue(links.getLinkResponse().isDisplayed());
    }

    @Test (priority = 7)
    public void notFoundLinkTest() {
        links.getNotFound().click();
        assertTrue(links.getLinkResponse().isDisplayed());
    }
}
