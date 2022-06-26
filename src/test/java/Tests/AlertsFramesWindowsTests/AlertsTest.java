package Tests.AlertsFramesWindowsTests;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AlertsTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(alerts.url);
    }

    @Test
    public void alertButtonTest() {
        alerts.getAlertButton().click();
        String alertText = driver.switchTo().alert().getText();
        assertTrue(alertText.contains(alerts.alertText));
    }

    @Test
    public void timerAlertTest() {
        alerts.getTimerAlert().click();
        wdwait.until(ExpectedConditions.alertIsPresent());
        String timerAlertText = driver.switchTo().alert().getText();
        assertTrue(timerAlertText.contains(alerts.timerText));
    }

    @Test
    public void confirmAlertTest() {
        alerts.getConfirmButton().click();
        driver.switchTo().alert().accept();
        assertTrue(driver.findElement(By.id("confirmResult")).isDisplayed());
    }

    @Test
    public void promptAlertTest() {
        alerts.getPromptButton().click();
        driver.switchTo().alert().sendKeys("Nemanja");
        driver.switchTo().alert().accept();
        assertTrue(driver.findElement(By.id("promptResult")).isDisplayed());
    }
}
