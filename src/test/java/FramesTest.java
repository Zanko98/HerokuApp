import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTest extends Basetest{

    @Test
    public void iframes() {
        driver.get("http://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
        assertEquals(driver.findElement(By.tagName("p")).getText(), "Your content goes here.");
        driver.switchTo().defaultContent();
    }
}
