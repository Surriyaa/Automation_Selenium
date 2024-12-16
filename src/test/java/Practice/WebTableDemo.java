package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTableDemo {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("//C:/Users/ASUS/Documents/WebTable.html");
        List<WebElement> row=driver.findElements(By.xpath("//tr"));

        System.out.println("Total rows= "+row.size());

        List<WebElement> col=driver.findElements(By.xpath("//th"));

        System.out.println("Total columns= "+col.size());

        List<WebElement> allCells = driver.findElements(By.xpath("//th|//td"));

        System.out.println("Total cells= "+allCells.size());
    }
}
