package Tests.InteractionsTests;

import BasePage.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ResizableTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(resizable.url);
    }

    @Test
    public void resizableTest1() {
        String location1 = String.valueOf(resizable.getResizableHandle1().getLocation());
        int xOffset = resizable.getResizableHandle1().getLocation().getX();
        int yOffset = resizable.getResizableHandle1().getLocation().getY();
        actions.dragAndDropBy(resizable.getResizableHandle1(), xOffset -1, yOffset -1).build().perform();
        String location2 = String.valueOf(resizable.getResizableHandle1().getLocation());
        assertNotEquals(location1, location2);
    }
}
