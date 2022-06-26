package Tests.WidgetsTests;

import BasePage.BasePage;
import org.testng.annotations.BeforeMethod;

public class ToolTipsTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(toolTips.url);
    }
}
