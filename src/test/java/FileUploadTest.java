import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FileUploadTest extends Basetest{

    @Test
    public void fileUpload() {
        driver.get("http://the-internet.herokuapp.com/upload");
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("/Users/user/IdeaProjects/HerokuApp/src/test/resources/img.png");
        driver.findElement(By.id("file-submit")).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h3")));
        assertEquals(driver.findElement(By.id("uploaded-files")).getText(), "img.png");
    }
}
