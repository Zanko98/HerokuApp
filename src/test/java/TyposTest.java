import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TyposTest extends Basetest {

    @Test
    public void typos() {
        driver.get("http://the-internet.herokuapp.com/typos");
        assertEquals(driver.findElement(By.xpath("//body/div[2]/div/div/p[2]")).getText(), "Sometimes you'll see a typo, other times you won't.", "First update");
        driver.navigate().refresh();
        assertEquals(driver.findElement(By.xpath("//body/div[2]/div/div/p[2]")).getText(), "Sometimes you'll see a typo, other times you won't.", "Second update");
        driver.navigate().refresh();
        assertEquals(driver.findElement(By.xpath("//body/div[2]/div/div/p[2]")).getText(), "Sometimes you'll see a typo, other times you won't.", "Third update");
    }
}
