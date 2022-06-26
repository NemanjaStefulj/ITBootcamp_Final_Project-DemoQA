package Tests.ElementsTests;

import BasePage.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BrokenLinksAndImagesTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(brokenLinksAndImages.url);
    }

    @Test
    public void validLinkTest() {
        brokenLinksAndImages.getValidLink().click();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/");
    }

    @Test
    public void brokenLinkTest() {
        brokenLinksAndImages.getBrokenLink().click();
        assertEquals(driver.getCurrentUrl(), "http://the-internet.herokuapp.com/status_codes/500");
    }
}
