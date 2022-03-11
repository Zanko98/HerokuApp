import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class NotificationMessagesTest extends Basetest{

    @Test
    public void notificationMessage() {
        driver.get("http://the-internet.herokuapp.com/notification_message_rendered");
        driver.findElement(By.linkText("Click here")).click();
        WebElement message = driver.findElement(By.id("flash"));
        assertTrue(message.isDisplayed());
        assertTrue(message.getText().startsWith("Action successful"));
    }
}
