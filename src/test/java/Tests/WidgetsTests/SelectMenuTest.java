package Tests.WidgetsTests;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SelectMenuTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(selectMenu.url);
    }


}
