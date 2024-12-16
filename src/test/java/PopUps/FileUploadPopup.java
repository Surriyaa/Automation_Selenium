package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class FileUploadPopup {
    @Test
    public void fileUploadTest() throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://smallpdf.com/pdf-converter");
        WebElement chooseFile=driver.findElement(By.xpath("//span[@class='sc-8s01yt-4 dNifye']"));
        chooseFile.click();
        Thread.sleep(5000);
        //Same for window popup
        Runtime.getRuntime().exec("C:\\Users\\ASUS\\Downloads\\File_Autoit.exe");
                System.out.println("File upload completed.");
        Thread.sleep(5000);


    }
}
