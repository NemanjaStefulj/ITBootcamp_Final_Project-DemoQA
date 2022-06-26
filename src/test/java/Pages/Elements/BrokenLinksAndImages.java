package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenLinksAndImages {

    public final String url = "https://demoqa.com/broken";
    public WebDriver driver;

    public BrokenLinksAndImages(WebDriver driver) {
        this.driver = driver;
    }

    public By validLink = By.linkText("Click Here for Valid Link");
    public By brokenLink = By.linkText("Click Here for Broken Link");

    public WebElement getValidLink() {
        return driver.findElement(validLink);
    }

    public WebElement getBrokenLink() {
        return driver.findElement(brokenLink);
    }
}
