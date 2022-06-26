package Tests.BookStoreApplicationTests;

import BasePage.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class BookStoreTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(logIn.url);
    }

    @Test
    public void addBookToCollection() {
        logIn.getUsername().sendKeys(logIn.user);
        logIn.getPassword().sendKeys(logIn.pass);
        logIn.getLogin().click();
        wdwait.until(ExpectedConditions.urlToBe(profile.url));
        profile.getGoToBookStoreButton().click();
        bookStore.books();
        bookStore.books().get(2).click();
        bookStore.getAddToCollection().click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        driver.navigate().to(profile.url);
        bookStore.deleteBook();
        assertEquals(bookStore.deleteBook().size(), 1);
    }
}
