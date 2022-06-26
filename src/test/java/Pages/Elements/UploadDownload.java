package Pages.Elements;

import org.openqa.selenium.WebDriver;

public class UploadDownload {

    public final String url = "https://demoqa.com/upload-download";
    public WebDriver driver;

    public UploadDownload(WebDriver driver) {
        this.driver = driver;
    }
}
