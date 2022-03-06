import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SortableDataTablesTest extends Basetest {

    @Test
    public void sortableData() {
        driver.get("http://the-internet.herokuapp.com/tables");
        assertEquals(driver.findElement(By.xpath("//table//tr[1]//td[1]")).getText(), "Smith");
        assertEquals(driver.findElement(By.xpath("//table[2]//tr[3]//td[2]")).getText(), "Jason");
    }
}
