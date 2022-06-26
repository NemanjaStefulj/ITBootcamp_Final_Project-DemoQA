package Tests.WidgetsTests;

import BasePage.BasePage;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DatePickerTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(datePicker.url);
    }

    @Test
    public void datePickTest() {
        for (int i = 0; i <= 10; i++) {
            actions.sendKeys(datePicker.getDate(), Keys.BACK_SPACE).build().perform();
        }
        actions.sendKeys(datePicker.getDate(), datePicker.myDate).sendKeys(Keys.ENTER).build().perform();
    }
}
