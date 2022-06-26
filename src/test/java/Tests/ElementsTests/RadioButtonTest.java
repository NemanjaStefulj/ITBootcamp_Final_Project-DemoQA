package Tests.ElementsTests;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class RadioButtonTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(radioButton.url);
    }

    @Test
    public void yesRadioButtonTest() {
        radioButton.getYesRadio().click();
        assertTrue(radioButton.getTextSuccess().isDisplayed());
    }

    @Test
    public void impressiveRadioButtonTest() {
        radioButton.getImpressiveRadio().click();
        assertTrue(radioButton.getTextSuccess().isDisplayed());
    }

    @Test
    public void noRadioButtonTest() {
        radioButton.getNoRadio().click();
        assertFalse(radioButton.getNoRadio().isSelected());
    }
}
