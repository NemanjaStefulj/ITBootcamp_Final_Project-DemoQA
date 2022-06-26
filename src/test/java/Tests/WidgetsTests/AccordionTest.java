package Tests.WidgetsTests;

import BasePage.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class AccordionTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(accordion.url);
    }

    @Test
    public void section1Test() {
        accordion.getSection1().click();
        assertFalse(accordion.getSection1Content().isDisplayed());
    }

    @Test
    public void section2Test() {
        accordion.getSection2().click();
        assertTrue(accordion.getSection2Content().isDisplayed());
    }

    @Test
    public void section3Test() {
        accordion.getSection3().click();
        assertTrue(accordion.getSection3Content().isDisplayed());
    }
}
