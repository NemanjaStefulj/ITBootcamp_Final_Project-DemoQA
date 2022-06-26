package Pages.BookStoreApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BookStore {

    public final String url = "https://demoqa.com/books";
    public WebDriver driver;
    public WebDriverWait wdwait;

    public BookStore(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public By addToCollection = By.id("addNewRecordButton");
    public By closeSmallModal = By.id("closeSmallModal-ok");

    public WebElement getAddToCollection() {
        return driver.findElement(addToCollection);
    }

    public List<WebElement> books() {
        return driver.findElements(By.className("mr-2"));
    }

    public List<WebElement> deleteBook() {
        return driver.findElements(By.id("delete-record-undefined"));
    }
}
