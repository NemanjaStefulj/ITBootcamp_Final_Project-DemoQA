package Tests.ElementsTests;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class DynamicPropertiesTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(dynamicProperties.url);
    }

    @Test
    public void enabledAfterTest() {
        wdwait.until(ExpectedConditions.elementToBeClickable(dynamicProperties.getEnableAfter()));
        dynamicProperties.getEnableAfter().click();
        assertTrue(dynamicProperties.getEnableAfter().isEnabled());
    }

    @Test
    public void visibleAfterTest() {
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("visibleAfter")));
        dynamicProperties.getVisibleAfter().click();
        assertTrue(dynamicProperties.getVisibleAfter().isDisplayed());
    }
}
