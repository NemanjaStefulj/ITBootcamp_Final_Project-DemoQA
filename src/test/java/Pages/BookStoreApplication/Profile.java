package Pages.BookStoreApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Profile {

    public final String url = "https://demoqa.com/profile";
    public WebDriver driver;
    public WebDriverWait wdwait;

    public Profile(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public By goToBookStoreButton = By.id("gotoStore");

    public WebElement getGoToBookStoreButton() {
        return driver.findElement(goToBookStoreButton);
    }
}
