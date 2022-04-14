import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.File;
import java.util.HashMap;

public class FileDownloadTest extends Basetest{

    @Test
    public void fileDownload() throws InterruptedException {
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", System.getProperty("user.dir"));
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);

        driver.get("http://the-internet.herokuapp.com/download");
        String fileName = "file 1.txt";
        driver.findElement(By.linkText(fileName)).click();
        Thread.sleep(5000);

        File folder = new File(System.getProperty("user.dir"));
        File[] listOfFiles = folder.listFiles();
        boolean found = false;
        File f = null;
        for (File listOfFile : listOfFiles) {
            if (listOfFile.isFile()) {
                String file = listOfFile.getName();
                System.out.println("File " + listOfFile.getName());
                if (file.matches("file 1.txt")) {
                    f = new File(file);
                    found = true;
                }
            }
        }
        Assert.assertTrue(found, "Downloaded document is not found");
        f.deleteOnExit();
    }
}
