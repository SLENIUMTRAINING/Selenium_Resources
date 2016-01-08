import java.util.List; 
import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.interactions.Actions;   
public class Drag {  
 public static void main(String[] args) {  
  WebDriver driver = new FirefoxDriver(); 
  driver.get("https://jqueryui.com/draggable/"); 
  driver.manage().window().maximize(); 
  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
   
  List<WebElement> frames = driver.findElements(By.tagName("iframe")); 
  System.out.println(frames.size()); 
   
  driver.switchTo().frame(0); 
   
  WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']")); 
  System.out.println(drag.getText()); 
   
  Actions action = new Actions(driver); 
  action.moveToElement(drag).dragAndDropBy(drag, 50, 50).build().perform(); 
   
   
 }  
} 
