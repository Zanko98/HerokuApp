import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.*;

public class DynamicControlsTest extends Basetest{

    @Test
    public void dynamicControls() {
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");

        By checkboxLocalor = By.cssSelector("input[type=checkbox]");
        driver.findElement(checkboxLocalor).click();
        assertTrue(driver.findElement(checkboxLocalor).isSelected());
        driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loading")));
        assertEquals(driver.findElement(By.id("loading")).getText(), "Wait for it...");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        assertEquals(driver.findElements(checkboxLocalor).size(), 0);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement element = driver.findElement(By.cssSelector("input[type=text]"));
        assertFalse(element.isEnabled());
        driver.findElement(By.xpath("//button[@onclick='swapInput()']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        assertTrue(element.isEnabled());
    }
}
