package Tests.HomePageTest;

import BasePage.BasePage;
import HomePage.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;

import static org.testng.Assert.assertEquals;

public class HomePageTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(homePage.url);
    }

    @Test
    public void testGetBannerImage() {
        homePage.getBannerImage().click();
        Set<String> tabs = driver.getWindowHandles();
        ArrayList<String> openedTabs = new ArrayList<>(tabs);
        driver.switchTo().window(openedTabs.get(1));
        assertEquals(driver.getCurrentUrl(), "https://www.toolsqa.com/selenium-training/");
    }

    @Test
    public void elementTest() {
        homePage.getElement().click();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/elements");
    }

    @Test
    public void formsTest() {
        homePage.getForms().click();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/forms");
    }

    @Test
    public void alertsFramesWindowsTest() {
        homePage.getAlertsFramesWindows().click();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/alertsWindows");
    }

    @Test
    public void widgetsTest() {
        homePage.getWidgets().click();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/widgets");
    }

    @Test
    public void interactionsTest() {
        homePage.getInteractions().click();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/interaction");
    }

    @Test
    public void bookStoreApplicationTest() {
        homePage.getBookStoreApplication().click();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/books");
    }
}
