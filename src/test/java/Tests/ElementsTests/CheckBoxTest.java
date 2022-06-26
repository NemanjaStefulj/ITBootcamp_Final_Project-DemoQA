package Tests.ElementsTests;

import BasePage.BasePage;
import org.testng.annotations.BeforeMethod;

public class CheckBoxTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(checkBox.url);
    }
}
