package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Links {

    public final String url = "https://demoqa.com/links";
    public WebDriver driver;

    public Links(WebDriver driver) {
        this.driver = driver;
    }

    public By home = By.id("simpleLink");
    public By home2 = By.id("dynamicLink");
    public By created = By.id("created");
    public By noContent = By.id("no-content");
    public By moved = By.id("moved");
    public By badRequest = By.id("bad-request");
    public By unauthorized = By.id("unauthorized");
    public By forbidden = By.id("forbidden");
    public By notFound = By.id("invalid-url");
    public By linkResponse = By.id("linkResponse");

    public WebElement getHome() {
        return driver.findElement(home);
    }

    public WebElement getHome2() {
        return driver.findElement(home2);
    }

    public WebElement getCreated() {
        return driver.findElement(created);
    }

    public WebElement getNoContent() {
        return driver.findElement(noContent);
    }

    public WebElement getMoved() {
        return driver.findElement(moved);
    }

    public WebElement getBadRequest() {
        return driver.findElement(badRequest);
    }

    public WebElement getUnauthorized() {
        return driver.findElement(unauthorized);
    }

    public WebElement getForbidden() {
        return driver.findElement(forbidden);
    }

    public WebElement getNotFound() {
        return driver.findElement(notFound);
    }

    public WebElement getLinkResponse() {
        return driver.findElement(linkResponse);
    }
}
