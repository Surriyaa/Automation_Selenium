package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxes {
    public static void main(String[] args) {
        // Set up the WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to Facebook
            driver.get("https://www.facebook.com");

            // Example 1: Ancestor Axis
            WebElement ancestorExample = driver.findElement(By.xpath("//input[@id='pass']//ancestor::div"));
            System.out.println("Ancestor tag name: " + ancestorExample.getTagName());

            // Example 2: Descendant Axis
            WebElement descendantExample = driver.findElement(By.xpath("//form//descendant::input"));
            System.out.println("Descendant tag name: " + descendantExample.getTagName());

            // Example 3: Following Axis
            WebElement followingExample = driver.findElement(By.xpath("//a[text()='Forgotten password?']//following::a[1]"));
            System.out.println("Following element text: " + followingExample.getText());

            // Example 4: Preceding Axis
            WebElement precedingExample = driver.findElement(By.xpath("//a[text()='Create new account']//preceding::a[1]"));
            System.out.println("Preceding element text: " + precedingExample.getText());

            // Example 5: Parent Axis
            WebElement parentExample = driver.findElement(By.xpath("//input[@id='email']//parent::div"));
            System.out.println("Parent tag name: " + parentExample.getTagName());

            // Example 6: Child Axis
            WebElement childExample = driver.findElement(By.xpath("//form//child::input"));
            System.out.println("Child tag name: " + childExample.getTagName());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
