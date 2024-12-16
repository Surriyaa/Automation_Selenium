package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@id='nav-signin-tooltip']")).click();


//        driver.findElement(By.id("email")).sendKeys("surriyaapps@gmail.com");
//        driver.findElement(By.name("pass")).sendKeys("SURRIYAApp@123");
//        driver.findElement(By.name("login")).click();

    }
}
