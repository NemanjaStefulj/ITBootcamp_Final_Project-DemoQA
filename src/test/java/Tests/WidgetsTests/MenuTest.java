package Tests.WidgetsTests;

import BasePage.BasePage;
import org.testng.annotations.BeforeMethod;

public class MenuTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(menu.url);
    }
}
