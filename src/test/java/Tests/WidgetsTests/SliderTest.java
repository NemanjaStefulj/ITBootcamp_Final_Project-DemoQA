package Tests.WidgetsTests;

import BasePage.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SliderTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(slider.url);
    }

    @Test
    public void sliderTest() {
        int xOffsetPre = slider.getSlider().getLocation().getX();
        int yOffset = slider.getSlider().getLocation().getY();
        actions.dragAndDropBy(slider.getSlider(), xOffsetPre + 1, yOffset).build().perform();
        int xOffsetPost = slider.getSlider().getLocation().getY();
        assertNotEquals(xOffsetPre, xOffsetPost);
    }
}
