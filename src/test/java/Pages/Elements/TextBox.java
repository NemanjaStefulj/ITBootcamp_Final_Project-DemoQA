package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBox {

    public final String url = "https://demoqa.com/text-box";
    public final String myFullName = "Nemanja Stefulj";
    public final String myEmail = "nemanjaste21@gmail.com";
    public final String myCurrentAddress = "Partizanski blok 1";
    public final String myPermanentAddress = "Trscanska 1";
    public WebDriver driver;

    public TextBox(WebDriver driver) {
        this.driver = driver;
    }

    public By fullName = By.id("userName");
    public By email = By.id("userEmail");
    public By currentAddress = By.id("currentAddress");
    public By permanentAddress = By.id("permanentAddress");
    public By submit = By.id("submit");
    public By output = By.id("output");

    public WebElement getFullName() {
        return driver.findElement(fullName);
    }

    public WebElement getEmail() {
        return driver.findElement(email);
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(currentAddress);
    }

    public WebElement getPermanentAddress() {
        return driver.findElement(permanentAddress);
    }

    public WebElement getSubmit() {
        return driver.findElement(submit);
    }

    public WebElement getOutput() {
        return driver.findElement(output);
    }
}
