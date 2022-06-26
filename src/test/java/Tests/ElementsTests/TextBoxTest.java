package Tests.ElementsTests;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TextBoxTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(textBox.url);
    }

    @Test
    public void fillFormAndSubmit() {
        textBox.getFullName().sendKeys(textBox.myFullName);
        textBox.getEmail().sendKeys(textBox.myEmail);
        textBox.getCurrentAddress().sendKeys(textBox.myCurrentAddress);
        textBox.getPermanentAddress().sendKeys(textBox.myPermanentAddress);
        textBox.getSubmit().click();
        assertTrue(textBox.getOutput().isDisplayed());
    }
}
