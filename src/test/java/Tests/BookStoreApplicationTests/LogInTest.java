package Tests.BookStoreApplicationTests;

import BasePage.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class LogInTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(logIn.url);
    }

    @Test
    public void logInTest() {
        logIn.getUsername().sendKeys(logIn.user);
        logIn.getPassword().sendKeys(logIn.pass);
        logIn.getLogin().click();
        wdwait.until(ExpectedConditions.urlToBe(logIn.url));
        assertEquals(driver.getCurrentUrl(), profile.url);
    }
}
