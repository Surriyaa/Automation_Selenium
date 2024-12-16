package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ChildWindowPopup {
    @Test
    public void chileWindowPopupTest() throws InterruptedException {
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to Flipkart website
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Close the login popup (if present)
        try {
            WebElement closePopup = driver.findElement(By.xpath("//button[contains(text(),'✕')]"));
            closePopup.click();
        } catch (Exception e) {
            System.out.println("Login popup not displayed.");
        }

        // Search for 'Laptops'
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Laptops");
        searchBox.submit();
        Thread.sleep(2000);

        // Click on the first product in the list
        WebElement firstProduct = driver.findElement(By.xpath("//*[contains(text(),'Free delivery')]"));
        firstProduct.click();
        Thread.sleep(2000);

        // Switch control to the new tab
        Set<String> tabs = new HashSet<>(driver.getWindowHandles());
        for (String tab:tabs) {
            driver.switchTo().window(tab); // Switch to the last tab
            System.out.println("Switched to product tab.");
        }
        // Click on the 'Buy Now' button
        WebElement buyNowButton = driver.findElement(By.xpath("//button[@type='button']"));
        buyNowButton.click();
        System.out.println("Clicked on 'Buy Now'.");

        // Close the browser


    }
}
