package Tests.InteractionsTests;

import BasePage.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SortableTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(sortable.url);
    }

    @Test
    public void listTest() {
        String location1 = String.valueOf(sortable.listItems().get(0).getLocation());
        actions.dragAndDrop(sortable.listItems().get(0), sortable.listItems().get(3)).build().perform();
        sortable.listItems();
        String location2 = String.valueOf(sortable.listItems().get(3).getLocation());
        assertNotEquals(location1, location2);
    }

    @Test
    public void gridTest() {
        sortable.getGridTab().click();
        int yOffsetPre = sortable.gridItems().get(0).getLocation().getY();
        actions.dragAndDrop(sortable.gridItems().get(0), sortable.gridItems().get(5)).build().perform();
        sortable.gridItems();
        int yOffsetPost = sortable.gridItems().get(5).getLocation().getY();
        assertNotEquals(yOffsetPre, yOffsetPost);
    }
}
