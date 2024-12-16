package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.Set;
public class Methods {
    public static void main(String[] args) throws Exception{
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        System.out.println("Facebook home page opened.");

        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
 
        String pageSource = driver.getPageSource();
        System.out.println("Page Source (first 500 characters): " + pageSource.substring(0, 500));
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);
        String windowHandle = driver.getWindowHandle();
        System.out.println("Current Window Handle: " + windowHandle);

        // 7. getWindowHandles() - Fetch and print all open window handles
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("All Window Handles: " + allWindowHandles);

        // 8. manage() - Maximize the window
        driver.manage().window().maximize();
        System.out.println("Browser window maximized.");

        // 9. navigate() - Navigate back, forward, refresh
        driver.navigate().to("https://www.google.com");
        System.out.println("Navigated to Google.");
        driver.navigate().back();
        System.out.println("Navigated back to Facebook.");
        driver.navigate().refresh();
        System.out.println("Facebook page refreshed.");

        // 10. quit() - Quit all browser windows
        System.out.println("Opening a new tab to demonstrate quit()...");
        WebDriver driver2 = new ChromeDriver(); // Opening another browser instance
        driver2.get("https://www.google.com");

        // 12. findElement() - Locate and interact with a single element
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("surriyaa@gmail.com");
        System.out.println("Entered email in the email field.");

        // 13. findElements() - Locate multiple elements (e.g., links, buttons, etc.)
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links on the page: " + links.size());
        for (WebElement link : links) {
            System.out.println("Link Text: " + link.getText());
        }

        // 1. close() - Close the current browser tab
        driver.close();
        System.out.println("Facebook tab closed.");

        // Quit the remaining open browsers
        driver2.quit();
        System.out.println("All browser windows closed.");
    }
}

