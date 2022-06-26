package Pages.Forms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeForm {

    public final String url = "https://demoqa.com/automation-practice-form";
    public final String myFirstName = "Nemanja";
    public final String myLastName = "Stefulj";
    public final String myEmail = "nemanjaste21@gmail.com";
    public final String myPhoneNumber = "0616467146";
    public final String myDateOfBirth = "1 August 1994";
    public final String mySubject = "Math";
    public final String myCurrentAddress = "Partizanski blok 1";
    public WebDriver driver;
    public WebDriverWait wdwait;

    public PracticeForm(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public By firstName = By.id("firstName");
    public By lastName = By.id("lastName");
    public By email = By.id("userEmail");
    public By male = By.id("gender-radio-1");
    public By female = By.id("gender-radio-2");
    public By other = By.id("gender-radio-3");
    public By phoneNumber = By.id("userNumber");
    public By dateOfBirth = By.id("dateOfBirthInput");
    public By subjects = By.className("subjects-auto-complete__value-container");
    public By sport = By.id("hobbies-checkbox-1");
    public By reading = By.id("hobbies-checkbox-2");
    public By music = By.id("hobbies-checkbox-3");
    public By uploadPicture = By.id("uploadPicture");
    public By currentAddress = By.id("currentAddress");
    public By state = By.id("state");
    public By city = By.id("city");
    public By submit = By.id("submit");
    public By closeLargeModal = By.id("closeLargeModal");

    public WebElement getFirstName() {
        return driver.findElement(firstName);
    }

    public WebElement getLastName() {
        return driver.findElement(lastName);
    }

    public WebElement getEmail() {
        return driver.findElement(email);
    }

    public WebElement getMale() {
        return driver.findElement(male);
    }

    public WebElement getFemale() {
        return driver.findElement(female);
    }

    public WebElement getOther() {
        return driver.findElement(other);
    }

    public WebElement getPhoneNumber() {
        return driver.findElement(phoneNumber);
    }

    public WebElement getDateOfBirth() {
        return driver.findElement(dateOfBirth);
    }

    public WebElement getSubjects() {
        return driver.findElement(subjects);
    }

    public WebElement getSport() {
        return driver.findElement(sport);
    }

    public WebElement getReading() {
        return driver.findElement(reading);
    }

    public WebElement getMusic() {
        return driver.findElement(music);
    }

    public WebElement getUploadPicture() {
        return driver.findElement(uploadPicture);
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(currentAddress);
    }

    public WebElement getState() {
        return driver.findElement(state);
    }

    public WebElement getCity() {
        return driver.findElement(city);
    }

    public WebElement getSubmit() {
        return driver.findElement(submit);
    }

    public WebElement getCloseLargeModal() {
        return driver.findElement(closeLargeModal);
    }
}
