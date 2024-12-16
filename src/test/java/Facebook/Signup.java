package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signup {
    public static void main(String[] args) throws Exception{
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/r.php");
        driver.manage().window().maximize();
        driver.findElement(By.name("firstname")).sendKeys("Surriyaa");
        driver.findElement(By.name("lastname")).sendKeys("Automation");
        driver.findElement(By.id("day")).sendKeys("13");
        driver.findElement(By.id("month")).sendKeys("Nov");
        driver.findElement(By.id("year")).sendKeys("2000");
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.name("reg_email__")).sendKeys("surriyaasy21@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("SURRIYAApp@123");
        driver.findElement(By.name("websubmit")).click();
    }
}
