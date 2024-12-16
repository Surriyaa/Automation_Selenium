package Practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

public class SelectDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("C:\\Users\\ASUS\\Documents\\select.html");
        WebElement list = driver.findElement(By.id("mtr"));
        Select s=new Select(list);
        List<WebElement> l=s.getOptions();
        System.out.println(l.size());
        s.selectByIndex(0);
        s.selectByValue("v");
        s.selectByContainsVisibleText("Poori");
        List<WebElement> l2=s.getAllSelectedOptions();
        System.out.println(l2.size());
for (WebElement lists:l2){
    System.out.println(lists.getText());

}
        System.out.println(s.isMultiple());
if(s.isMultiple()){
//Print the first selected option in the list box
        WebElement firstSelectedOption = s.getFirstSelectedOption();
        System.out.println(firstSelectedOption.getText()+" is the first selected item in the list box");
//deselect the item present in 0th index.
                s.deselectByIndex(0);
//Print the first selected option in the list box
        WebElement firstSelectedOption1 = s.getFirstSelectedOption();
        System.out.println(firstSelectedOption1.getText()+" is the first selected item");
//deselect an item which has an attribute called value and its value is "v"
    s.deselectByValue("v");
//Print the first selected option in the list box
    WebElement firstSelectedOption2 = s.getFirstSelectedOption();
    System.out.println(firstSelectedOption2.getText()+" is the first selected item");
    s.deselectByVisibleText("Poori");
}
Thread.sleep(3000);
driver.quit();
}}
