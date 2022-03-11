import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class InputsTest extends Basetest {

    @Test
    public void inputs() {
        driver.get("http://the-internet.herokuapp.com/inputs");
        WebElement input = driver.findElement(By.tagName("input"));
        input.sendKeys("10");
        input.sendKeys(Keys.ARROW_UP);
        assertEquals(input.getAttribute("value"), "11");
        input.sendKeys(Keys.ARROW_DOWN);
        assertEquals(input.getAttribute("value"), "10");
        input.sendKeys(Keys.BACK_SPACE);
        input.sendKeys("1");
        assertEquals(input.getAttribute("value"), "11");
        assertEquals(input.getAttribute("value"), "11");
        input.sendKeys("tvkjhgv");
        assertEquals(input.getAttribute("value"), "11");
        input.sendKeys(Keys.ARROW_LEFT);
        input.sendKeys(Keys.BACK_SPACE);
        input.sendKeys("-");
        assertEquals(input.getAttribute("value"), "-1");
    }
}
