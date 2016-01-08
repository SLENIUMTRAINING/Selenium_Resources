import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.interactions.Actions;   
public class ReSize {  
 public static void main(String[] args) {  
  WebDriver driver = new FirefoxDriver(); 
  driver.get("https://jqueryui.com/resizable/"); 
  driver.manage().window().maximize(); 
  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); 
   
  System.out.println(driver.findElements(By.tagName("iframe")).size()); 
   
  driver.switchTo().frame(0); 
   
  WebElement resize = driver.findElement(By.xpath("//*[@id='resizable']/div[3]")); 
   
  Actions action = new Actions(driver); 
   
  action.moveToElement(resize).dragAndDropBy(resize, 100, 100).build().perform(); 
   
   
   
 }  
} 
