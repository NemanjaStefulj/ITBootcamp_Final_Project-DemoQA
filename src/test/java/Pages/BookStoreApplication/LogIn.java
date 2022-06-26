package Pages.BookStoreApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogIn {

    public final String url = "https://demoqa.com/login";
    public final String user = "NathanCrane";
    public final String pass = "Nathaniel21!";
    public WebDriver driver;
    public WebDriverWait wdwait;

    public LogIn(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public By username = By.id("userName");
    public By password = By.id("password");
    public By login = By.id("login");
    public By newUser = By.id("newUser");

    public WebElement getUsername() {
        return driver.findElement(username);
    }

    public WebElement getPassword() {
        return driver.findElement(password);
    }

    public WebElement getLogin() {
        return driver.findElement(login);
    }

    public WebElement getNewUser() {
        return driver.findElement(newUser);
    }
}
