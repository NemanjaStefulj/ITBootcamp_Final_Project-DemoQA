package Tests.FormsTests;

import BasePage.BasePage;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class PracticeFormTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(practiceForm.url);
    }

    @Test
    public void fillForm() {
        actions.sendKeys(practiceForm.getFirstName(),practiceForm.myFirstName).build().perform();
        actions.sendKeys(practiceForm.getLastName(), practiceForm.myLastName).build().perform();
        actions.sendKeys(practiceForm.getEmail(), practiceForm.myEmail).build().perform();
        actions.click(practiceForm.getMale()).build().perform();
        actions.sendKeys(practiceForm.getPhoneNumber(), practiceForm.myPhoneNumber).build().perform();
        for (int i = 0; i < 10; i++) {
            actions.sendKeys(practiceForm.getDateOfBirth(), Keys.BACK_SPACE).build().perform();
        }
        actions.sendKeys(practiceForm.getDateOfBirth(), practiceForm.myDateOfBirth).build().perform();
        actions.sendKeys(practiceForm.getSubjects(), practiceForm.mySubject).sendKeys(Keys.ENTER).build().perform();
        actions.click(practiceForm.getMusic()).click(practiceForm.getReading()).build().perform();
        actions.sendKeys(practiceForm.getCurrentAddress(), practiceForm.myCurrentAddress).build().perform();
        actions.click(practiceForm.getState()).sendKeys(Keys.ENTER).build().perform();
        actions.click(practiceForm.getCity()).sendKeys(Keys.ENTER).build().perform();
        actions.click(practiceForm.getSubmit()).build().perform();
        assertTrue(practiceForm.getCloseLargeModal().isDisplayed());
    }
}
