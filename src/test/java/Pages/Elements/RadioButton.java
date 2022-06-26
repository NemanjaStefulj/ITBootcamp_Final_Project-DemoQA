package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButton {

    public final String url = "https://demoqa.com/radio-button";
    public WebDriver driver;

    public RadioButton(WebDriver driver) {
        this.driver = driver;
    }

    public By yesRadio = By.xpath("//label[contains(text(),'Yes')]");
    public By impressiveRadio = By.xpath("//label[contains(text(),'Impressive')]");
    public By noRadio = By.xpath("//label[contains(text(),'No')]");

    public By textSucces = By.className("text-success");

    public WebElement getYesRadio() {
        return driver.findElement(yesRadio);
    }

    public WebElement getImpressiveRadio() {
        return driver.findElement(impressiveRadio);
    }

    public WebElement getNoRadio() {
        return driver.findElement(noRadio);
    }

    public WebElement getTextSuccess() {
        return driver.findElement(textSucces);
    }
}
