import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class InputsTest extends Basetest {

    @Test
    public void inputs() {
        driver.get("http://the-internet.herokuapp.com/inputs");
        driver.findElement(By.tagName("input")).sendKeys("10");
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_UP);
        assertEquals(driver.findElement(By.tagName("input")).getAttribute("value"), "11");
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_DOWN);
        assertEquals(driver.findElement(By.tagName("input")).getAttribute("value"), "10");
        driver.findElement(By.tagName("input")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.tagName("input")).sendKeys("1");
        assertEquals(driver.findElement(By.tagName("input")).getAttribute("value"), "11");
        assertEquals(driver.findElement(By.tagName("input")).getAttribute("value"), "11");
        driver.findElement(By.tagName("input")).sendKeys("tvkjhgv");
        assertEquals(driver.findElement(By.tagName("input")).getAttribute("value"), "11");
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_LEFT);
        driver.findElement(By.tagName("input")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.tagName("input")).sendKeys("-");
        assertEquals(driver.findElement(By.tagName("input")).getAttribute("value"), "-1");
    }
}
