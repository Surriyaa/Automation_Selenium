package PopUps;

import Practice.Action;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptPopup {
    public WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/alerts");

    }
    @Test
    public void alertPopupTest(){
        driver.findElement(By.id("alertButton")).click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
    }
    @Test
    public void confirmationPopupTest(){
        driver.findElement(By.id("confirmButton")).click();
        Alert alert=driver.switchTo().alert();
        alert.dismiss();
    }
    @Test
    public void promptPopupTest() throws InterruptedException {
        WebElement prompt=driver.findElement(By.xpath("//button[@id='promtButton']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(prompt).click().perform();
        Alert alert=driver.switchTo().alert();
        Thread.sleep(2000);
        alert.sendKeys("Surriyaa");
        alert.accept();
        WebElement result = driver.findElement(By.id("result"));
        System.out.println("Result message: " + result.getText());
    }
    @AfterMethod
    public void end(){
        driver.quit();
    }
}
