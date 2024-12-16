package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames
    {
        public static void main(String[] args) {
            WebDriver driver=new ChromeDriver();
            driver.get("https://ui.vision/demo/webtest/frames/");
            WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
            driver.switchTo().frame(frame1);
            driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
            driver.switchTo().defaultContent();

            //frame 3
            WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
            driver.switchTo().frame(frame3);
            driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Welcome");
            // open iframe--innerframe

           // WebElement framei= driver.findElement(By.xpath("//div[@class='ahS2Le']"));
            driver.switchTo().frame(0);
            driver.findElement(By.xpath("//span[normalize-space()='I am a human']")).click();
            driver.findElement(By.xpath("//div[@id='i24']//div[@class='uHMk6b fsHoPb']")).click();

        }
    }
