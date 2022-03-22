import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import static org.testng.AssertJUnit.assertEquals;

public class ContextMenuTest extends Basetest{

    @Test
    public void contextMenu() {
        driver.get("http://the-internet.herokuapp.com/context_menu");
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(By.id("hot-spot"))).perform();
        Alert alert = driver.switchTo().alert();
        assertEquals(alert.getText(), "You selected a context menu");
        alert.accept();
        driver.switchTo().defaultContent();
    }
}
