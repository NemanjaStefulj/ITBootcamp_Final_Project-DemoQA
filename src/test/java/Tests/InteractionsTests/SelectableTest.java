package Tests.InteractionsTests;

import BasePage.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SelectableTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(selectable.url);
    }

}
