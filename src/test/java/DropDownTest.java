import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DropDownTest extends Basetest {

    @Test
    public void dropdown() {
        driver.get("http://the-internet.herokuapp.com/dropdown");
        Select select = new Select(driver.findElement(By.id("dropdown")));
        String firstOptions = select.getOptions().get(0).getText();
        assertEquals(firstOptions, "Please select an option");
        String secondOptions = select.getOptions().get(1).getText();
        assertEquals(secondOptions, "Option 1");
        String thirdOptions = select.getOptions().get(2).getText();
        assertEquals(thirdOptions, "Option 2");
        assertEquals(select.getOptions().size(), 3);
        assertFalse(select.getOptions().get(0).isEnabled());
        select.selectByVisibleText("Option 1");
        assertTrue(select.getOptions().get(1).isSelected());
        select.selectByVisibleText("Option 2");
        assertTrue(select.getOptions().get(2).isSelected());
    }

}
