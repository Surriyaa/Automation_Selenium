package Facebook;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExec {
    public static void main(String[] args) throws Exception{
        WebDriver driver=new ChromeDriver();
        driver.get("http://seleniumhq.org/download");
        JavascriptExecutor jse= (JavascriptExecutor)driver;
        //scrolling up to down
        for (int i=0;i<2;i++){
           // jse.executeScript("window.scrollBY(0,1000)");
            jse.executeScript("window.scrollBy(0, 500)");
            Thread.sleep(3000);

        }
        //scrolling down to up
        for (int i=0;i<2;i++){
            jse.executeScript("window.scrollBy(0, -500)");
            Thread.sleep(3000);

        }
    driver.close();

    }
}
