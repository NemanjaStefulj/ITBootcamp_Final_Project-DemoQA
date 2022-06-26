package Pages.Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Selectable {

    public final String url = "https://demoqa.com/selectable";
    public WebDriver driver;

    public Selectable(WebDriver driver) {
        this.driver = driver;
    }

    public By firstText = By.xpath("//li[contains(text(),'Cras justo odio')]");
    public By secondText = By.xpath("//li[contains(text(),'Dapibus ac facilisis in')]");
    public By thirdText = By.xpath("//li[contains(text(),'Morbi leo risus')]");
    public By fourthText = By.xpath("//li[contains(text(),'Porta ac consectetur ac')]");
    public By gridTab = By.id("demo-tab-grid");
    public By one = By.xpath("//li[contains(text(),'One')]");
    public By two = By.xpath("//li[contains(text(),'Two')]");
    public By three = By.xpath("//li[contains(text(),'Three')]");
    public By four = By.xpath("//li[contains(text(),'Four')]");
    public By five = By.xpath("//li[contains(text(),'Five')]");
    public By six = By.xpath("//li[contains(text(),'Six')]");
    public By seven = By.xpath("//li[contains(text(),'Seven')]");
    public By eight = By.xpath("//li[contains(text(),'Eight')]");
    public By nine = By.xpath("//li[contains(text(),'Nine')]");

    public WebElement getFirstText() {
        return driver.findElement(firstText);
    }

    public WebElement getSecondText() {
        return driver.findElement(secondText);
    }

    public WebElement getThirdText() {
        return driver.findElement(thirdText);
    }

    public WebElement getFourthText() {
        return driver.findElement(fourthText);
    }

    public WebElement getGridTab() {
        return driver.findElement(gridTab);
    }

    public WebElement getOne() {
        return driver.findElement(one);
    }

    public WebElement getTwo() {
        return driver.findElement(two);
    }

    public WebElement getThree() {
        return driver.findElement(three);
    }

    public WebElement getFour() {
        return driver.findElement(four);
    }

    public WebElement getFive() {
        return driver.findElement(five);
    }

    public WebElement getSix() {
        return driver.findElement(six);
    }

    public WebElement getSeven() {
        return driver.findElement(seven);
    }

    public WebElement getEight() {
        return driver.findElement(eight);
    }

    public WebElement getNine() {
        return driver.findElement(nine);
    }
}
