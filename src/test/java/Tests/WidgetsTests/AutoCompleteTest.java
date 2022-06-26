package Tests.WidgetsTests;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.List;

public class AutoCompleteTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(autoComplete.url);
    }

    @Test
    public void fieldsMultipleTest() {
        actions.sendKeys(autoComplete.fields().get(0), "green").sendKeys(Keys.ENTER).build().perform();
        actions.sendKeys(autoComplete.fields().get(0), "red").sendKeys(Keys.ENTER).build().perform();
        List<WebElement> colors = driver.findElements(By.className("css-12jo7m5"));
        assertEquals(colors.size(), 2);
    }

    @Test
    public void fieldsSingleTest() {
        actions.sendKeys(autoComplete.fields().get(1), "blue").sendKeys(Keys.ENTER).build().perform();
        List<WebElement> color = driver.findElements(By.className("css-1uccc91-singleValue"));
        assertEquals(color.get(0).getText(), "Blue");
    }
}
