package Pages.Elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTables {

    public final String url = "https://demoqa.com/webtables";
    public final String emailCr = "nemanjaste21@gmail.com";
    public final String firstNameCr = "Nemanja";
    public final String lastNameCr = "Stefulj";
    public final String ageCr = "27";
    public final String salaryCr = "500";
    public final String departmentCr = "IT";
    public WebDriver driver;

    public WebTables(WebDriver driver) {
        this.driver = driver;
    }

    public By add = By.id("addNewRecordButton");
    public By searchBox = By.id("searchBox");
    public By pageJump = By.className("-pageJump");
    public By dropSelect = By.tagName("select");
    public By editFirst = By.id("edit-record-1");
    public By deleteFirst = By.id("delete-record-1");
    public By editSecond = By.id("edit-record-2");
    public By deleteSecond = By.id("delete-record-2");
    public By editThird = By.id("edit-record-3");
    public By deleteThird = By.id("delete-record-3");
    public By editFourth = By.id("edit-record-4");
    public By deleteFourth = By.id("delete-record-4");
    public By previous = By.className("-previous");
    public By next = By.className("-next");
    public By firstName = By.id("firstName");
    public By lastName = By.id("lastName");
    public By email = By.id("userEmail");
    public By age = By.id("age");
    public By salary = By.id("salary");
    public By department = By.id("department");
    public By submit = By.id("submit");

    public WebElement getAdd() {
        return driver.findElement(add);
    }

    public WebElement getSearchBox() {
        return driver.findElement(searchBox);
    }

    public WebElement getPageJump() {
        return driver.findElement(pageJump);
    }

    public WebElement getDropSelect() {
        return driver.findElement(dropSelect);
    }

    public WebElement getEditFirst() {
        return driver.findElement(editFirst);
    }

    public WebElement getDeleteFirst() {
        return driver.findElement(deleteFirst);
    }

    public WebElement getEditSecond() {
        return driver.findElement(editSecond);
    }

    public WebElement getDeleteSecond() {
        return driver.findElement(deleteSecond);
    }

    public WebElement getEditThird() {
        return driver.findElement(editThird);
    }

    public WebElement getDeleteThird() {
        return driver.findElement(deleteThird);
    }

    public WebElement getEditFourth() {
        return driver.findElement(editFourth);
    }

    public WebElement getDeleteFourth() {
        return driver.findElement(deleteFourth);
    }

    public WebElement getPrevious() {
        return driver.findElement(previous);
    }

    public WebElement getNext() {
        return driver.findElement(next);
    }

    public WebElement getFirstName() {
        return driver.findElement(firstName);
    }

    public WebElement getLastName() {
        return driver.findElement(lastName);
    }

    public WebElement getEmail() {
        return driver.findElement(email);
    }
    public WebElement getAge() {
        return driver.findElement(age);
    }

    public WebElement getSalary() {
        return driver.findElement(salary);
    }

    public WebElement getDepartment() {
        return driver.findElement(department);
    }

    public WebElement getSubmit() {
        return driver.findElement(submit);
    }
}
