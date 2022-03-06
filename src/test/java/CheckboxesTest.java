import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckboxesTest extends Basetest {


    @Test
    public void checkboxes() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        driver.findElement(By.xpath("//form/input")).click();
        assertTrue(driver.findElement(By.xpath("//form/input")).isSelected());
        assertTrue(driver.findElement(By.xpath("//form/input[2]")).isSelected());
        driver.findElement(By.xpath("//form/input[2]")).click();
        assertFalse(driver.findElement(By.xpath("//form/input[2]")).isSelected());
    }
}
