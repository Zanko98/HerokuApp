import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HoversTest extends Basetest {

    @Test
    public void hoversUser1() {
        driver.get("http://the-internet.herokuapp.com/hovers");
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//body/div[2]/div/div/div/img"))).perform();
        By locator = By.xpath("//body/div[2]/div/div/div/div/a");
        driver.findElement(locator).click();
        assertEquals(driver.findElement(By.tagName("h1")).getText(), "Not Found");
    }

    @Test
    public void hoversUser2() {
        driver.get("http://the-internet.herokuapp.com/hovers");
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//body/div[2]/div/div/div[2]/img"))).perform();
        By locator = By.xpath("//body/div[2]/div/div/div[2]/div/a");
        driver.findElement(locator).click();
        assertEquals(driver.findElement(By.tagName("h1")).getText(), "Not Found");
    }

    @Test
    public void hoversUser3() {
        driver.get("http://the-internet.herokuapp.com/hovers");
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//body/div[2]/div/div/div[3]/img"))).perform();
        By locator = By.xpath("//body/div[2]/div/div/div[3]/div/a");
        driver.findElement(locator).click();
        assertEquals(driver.findElement(By.tagName("h1")).getText(), "Not Found");
    }
}
