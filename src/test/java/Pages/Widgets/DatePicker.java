package Pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePicker {

    public final String url = "https://demoqa.com/date-picker";
    public final String myDate = "08/21/1994";
    public WebDriver driver;

    public DatePicker(WebDriver driver) {
        this.driver = driver;
    }

    public By date = By.id("datePickerMonthYearInput");
    public By dateTime = By.id("dateAndTimePickerInput");

    public WebElement getDate() {
        return driver.findElement(date);
    }

    public WebElement getDateTime() {
        return driver.findElement(dateTime);
    }
}
