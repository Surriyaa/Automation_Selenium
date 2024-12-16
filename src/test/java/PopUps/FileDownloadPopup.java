package PopUps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.HashMap;

public class FileDownloadPopup {
    @Test
    public static void main(String[] args) throws InterruptedException {
        String downloadFilePath = "C:\\Users\\ASUS\\Downloads";

        // Configure Chrome options to disable popup and set download folder
        HashMap<String, Object> chromePrefs = new HashMap<>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", downloadFilePath);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);

        WebDriver driver = new ChromeDriver(options);

        // Navigate to the file download page
        driver.get("https://www.videolan.org/vlc/download-windows.html");
        driver.findElement(By.xpath("//span[@class='downloadText']")).click();
        Thread.sleep(15000);
        // Perform additional actions if needed
        System.out.println("File download started.");
        //driver.quit();
    }
}
