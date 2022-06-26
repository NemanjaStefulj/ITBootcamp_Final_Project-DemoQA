package Tests.ElementsTests;

import BasePage.BasePage;
import org.testng.annotations.BeforeMethod;

public class UploadDownloadTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(uploadDownload.url);
    }
}
