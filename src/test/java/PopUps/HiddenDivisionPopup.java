package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.event.KeyEvent;

public class HiddenDivisionPopup {
    @Test
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
        Thread.sleep(500);
        driver.findElement(By.id("src")).sendKeys("Bangalore");
        driver.findElement(By.id("src")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("dest")).sendKeys("Erode");
        driver.findElement(By.id("dest")).sendKeys(Keys.ENTER);

        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div/span")).click();
        driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div[2]/div/div/div[3]/div[5]/span/div[5]/span")).click();
        Thread.sleep(500);
        driver.findElement(By.id("search_button")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
