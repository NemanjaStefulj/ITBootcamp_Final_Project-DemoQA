package Tests.WidgetsTests;

import BasePage.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ProgressBarTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(progressBar.url);
    }

    @Test
    public void progressTest() {
        progressBar.getStartStop().click();
        wdwait.until(ExpectedConditions.textToBePresentInElement(progressBar.getProgressBar(), "100%"));
        assertTrue(progressBar.getResetButton().isDisplayed());
    }
}
