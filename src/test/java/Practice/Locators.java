package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws Exception{
        // Set up the WebDriver
        WebDriver driver = new ChromeDriver();

        // Open Facebook
        driver.get("https://www.facebook.com");

        // 1. Locate element by ID
        WebElement emailFieldById = driver.findElement(By.id("email"));
        emailFieldById.sendKeys("test@gmail.com");

        // 2. Locate element by Name
        WebElement passwordFieldByName = driver.findElement(By.name("pass"));
        passwordFieldByName.sendKeys("password");

        // 3. Locate element by Tag Name
        WebElement formElementByTagName = driver.findElement(By.tagName("form"));
        System.out.println("Form found: " + formElementByTagName.isDisplayed());

        // 4. Locate element by Class Name
        WebElement loginButtonByClassName = driver.findElement(By.className("_6ltg"));
        loginButtonByClassName.click();
        Thread.sleep(1000);
        driver.navigate().to("https://www.facebook.com");

        // 5. Locate element by Link Text
        WebElement forgotPasswordByLinkText = driver.findElement(By.linkText("Forgotten password?"));
        forgotPasswordByLinkText.click();
        Thread.sleep(1000);
        driver.navigate().back();

        // 6. Locate element by Partial Link Text
        WebElement signupByPartialLinkText = driver.findElement(By.partialLinkText("Create"));
        signupByPartialLinkText.click();
        Thread.sleep(1000);
        driver.navigate().back();

        // 7. Locate element by XPath
        WebElement messengerLinkByXPath = driver.findElement(By.xpath("//a[@class='_8esh']"));
        messengerLinkByXPath.click();
        Thread.sleep(1000);
        driver.navigate().back();

        // 8. Locate element by CSS Selector
        WebElement footerByCssSelector = driver.findElement(By.cssSelector("#pageFooter a"));
        System.out.println("Footer link text: " + footerByCssSelector.getText());

        // Close the browser
        driver.quit();
    }
}
