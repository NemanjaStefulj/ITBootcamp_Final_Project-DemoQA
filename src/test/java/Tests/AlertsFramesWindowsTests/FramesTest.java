package Tests.AlertsFramesWindowsTests;

import BasePage.BasePage;
import org.testng.annotations.BeforeMethod;

public class FramesTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(frames.url);
    }
}
