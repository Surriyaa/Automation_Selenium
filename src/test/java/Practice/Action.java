package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Action {
    public static void main(String[] args) throws InterruptedException, AWTException {
        // Set up the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to ISTQB website
        driver.get("http://www.istqb.in");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Initialize the Actions class
        Actions actions = new Actions(driver);

        // 1. Move to Element
        WebElement aboutUsMenu = driver.findElement(By.xpath("//li[@class='sp-menu-item sp-has-child']//a[@href='#!'][normalize-space()='ABOUT US']"));
        actions.moveToElement(aboutUsMenu).perform();
        System.out.println("Hovered over the About Us menu.");

        // 2. Click Action
        WebElement aboutUsSubMenu = driver.findElement(By.xpath("//li[contains(@class,'item-127 menu_item item-header')]//a[normalize-space()='ABOUT ITB']"));
        actions.click(aboutUsSubMenu).perform();
        System.out.println("Clicked on ISTQB® President submenu.");
        Thread.sleep(2000);
        driver.navigate().back();


        // 4. Context Click (Right Click) Action
        WebElement logo = driver.findElement(By.xpath("//div[@id='sp-logo']//a"));
        actions.contextClick(logo).perform();
        System.out.println("Performed right-click on the ISTQB logo.");

        //5 new class

        // 7. Key Down and Key Up Actions
        Robot r=new Robot();
        WebDriver driver2=new ChromeDriver();
        Actions actions2 = new Actions(driver2);
        driver2.get("https://www.facebook.com/");
        WebElement searchField=driver2.findElement(By.id("email"));
        actions2.keyDown(searchField, Keys.SHIFT).sendKeys("istqb testing").keyUp(Keys.SHIFT).sendKeys("Hello").perform();
        System.out.println("Entered uppercase text in the search field using SHIFT key.");

        // Close the browser
        driver.quit();
        driver2.quit();
    }
}
