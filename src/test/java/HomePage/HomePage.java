package HomePage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage {

    public final String url = "https://demoqa.com/";
    public WebDriver driver;
    public WebDriverWait wdwait;

    public HomePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public List<WebElement> allElements;
    public By bannerImage = By.className("banner-image");

    public WebElement getBannerImage() {
        return driver.findElement(bannerImage);
    }

    public List<WebElement> listOfElements() {
        allElements = driver.findElements(By.tagName("h5"));
        return allElements;
    }

    public WebElement getElement() {
        return listOfElements().get(0);
    }

    public WebElement getForms() {
        return listOfElements().get(1);
    }

    public WebElement getAlertsFramesWindows() {
        return listOfElements().get(2);
    }

    public WebElement getWidgets() {
        return listOfElements().get(3);
    }

    public WebElement getInteractions() {
        return listOfElements().get(4);
    }

    public WebElement getBookStoreApplication() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        return listOfElements().get(5);
    }
}
