package Pages.Widgets;

import org.openqa.selenium.WebDriver;

public class Menu {

    public final String url = "https://demoqa.com/menu";
    public WebDriver driver;

    public Menu(WebDriver driver) {
        this.driver = driver;
    }
}
