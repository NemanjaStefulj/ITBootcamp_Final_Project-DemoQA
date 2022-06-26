package Pages.Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Resizable {

    public final String url = "https://demoqa.com/resizable";
    public WebDriver driver;

    public Resizable(WebDriver driver) {
        this.driver = driver;
    }

    public By resizableHandle1 = By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/span[1]");
    public By resizableHandle2 = By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/span[1]");

    public WebElement getResizableHandle1() {
        return driver.findElement(resizableHandle1);
    }

    public WebElement getResizableHandle2() {
        return driver.findElement(resizableHandle2);
    }
}
