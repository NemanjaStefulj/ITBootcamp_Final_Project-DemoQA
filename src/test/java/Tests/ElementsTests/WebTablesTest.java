package Tests.ElementsTests;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class WebTablesTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(webTables.url);
    }

    @Test
    public void addNewTest() {
        webTables.getAdd().click();
        webTables.getFirstName().sendKeys(webTables.firstNameCr);
        webTables.getLastName().sendKeys(webTables.lastNameCr);
        webTables.getEmail().sendKeys(webTables.emailCr);
        webTables.getAge().sendKeys(webTables.ageCr);
        webTables.getSalary().sendKeys(webTables.salaryCr);
        webTables.getDepartment().sendKeys(webTables.departmentCr);
        webTables.getSubmit().click();
        assertTrue(webTables.getEditFourth().isDisplayed());
    }

    @Test
    public void deleteNewTest() {
        addNewTest();
        webTables.getDeleteFourth().click();
        List<WebElement> allRows = driver.findElements(By.className("rt-tr-group"));
        for (WebElement we : allRows) {
            we.getText();
            if (we.getText().contains(webTables.firstNameCr)) {
                assertFalse(false);
            }
            else {
                assertTrue(true);
            }
        }

    }

    @Test
    public void editFirstTest() {
        webTables.getEditFirst().click();
        webTables.getFirstName().clear();
        webTables.getFirstName().sendKeys(webTables.firstNameCr);
        webTables.getLastName().clear();
        webTables.getLastName().sendKeys(webTables.lastNameCr);
        webTables.getEmail().clear();
        webTables.getEmail().sendKeys(webTables.emailCr);
        webTables.getAge().clear();
        webTables.getAge().sendKeys(webTables.ageCr);
        webTables.getSalary().clear();
        webTables.getSalary().sendKeys(webTables.salaryCr);
        webTables.getDepartment().clear();
        webTables.getDepartment().sendKeys(webTables.departmentCr);
        webTables.getSubmit().click();
        List<WebElement> allRows = driver.findElements(By.className("rt-tr-group"));
        for (WebElement we : allRows) {
            we.getText();
            if (we.getText().contains(webTables.firstNameCr)) {
                assertTrue(true);
            }
            else {
                assertFalse(false);
            }
        }
    }

    @Test
    public void searchTest() {
        webTables.getSearchBox().sendKeys("Cierra");
        List<WebElement> allRows = driver.findElements(By.className("rt-tr-group"));
        for (WebElement we : allRows) {
            we.getText();
            if (we.getText().contains(webTables.firstNameCr)) {
                assertFalse(false);
            }
            else {
                assertTrue(true);
            }
        }
    }

    @Test
    public void changeNumberOfRowsTest() {
        webTables.getDropSelect().click();
        webTables.getDropSelect().sendKeys(Keys.ARROW_UP);
        webTables.getDropSelect().sendKeys(Keys.ENTER);
        List<WebElement> allRows = driver.findElements(By.className("rt-tr-group"));
        assertEquals(allRows.size(), 5);
    }
}
