package Pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Accordion {

    public final String url = "https://demoqa.com/accordian";
    public WebDriver driver;

    public Accordion(WebDriver driver) {
        this.driver = driver;
    }

    public By section1 = By.id("section1Heading");
    public By section1Content = By.id("section1Content");
    public By section2 = By.id("section2Heading");
    public By section2Content = By.id("section2Content");
    public By section3 = By.id("section3Heading");
    public By section3Content = By.id("section3Content");

    public WebElement getSection1() {
        return driver.findElement(section1);
    }

    public WebElement getSection1Content() {
        return driver.findElement(section1Content);
    }

    public WebElement getSection2() {
        return driver.findElement(section2);
    }

    public WebElement getSection2Content() {
        return driver.findElement(section2Content);
    }

    public WebElement getSection3() {
        return driver.findElement(section3);
    }

    public WebElement getSection3Content() {
        return driver.findElement(section3Content);
    }
}
