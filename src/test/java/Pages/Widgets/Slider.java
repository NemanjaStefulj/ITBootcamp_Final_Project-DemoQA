package Pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Slider {

    public final String url = "https://demoqa.com/slider";
    public WebDriver driver;

    public Slider(WebDriver driver) {
        this.driver = driver;
    }

    public By slider = By.className("range-slider--primary");

    public WebElement getSlider() {
        return driver.findElement(slider);
    }
}
