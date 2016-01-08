import java.util.List; 
import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.firefox.FirefoxDriver;   
public class iFrames {  
 public static void main(String[] args) {  
  WebDriver driver = new FirefoxDriver(); 
  driver.get("https://jqueryui.com/draggable/"); 
  driver.manage().window().maximize(); 
  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
  
  List<WebElement> list = driver.findElements(By.tagName("iframe")); 
  System.out.println(list.size()); 
   
   
  //1st method 
  /*driver.switchTo().frame(0); 
  WebElement element = driver.findElement(By.xpath("//*[@id='draggable']")); 
  System.out.println(element.getText()); 
   
  driver.switchTo().defaultContent(); 
   
  WebElement PageElement = driver.findElement(By.xpath("//*[@id='content']/h1")); 
  System.out.println(PageElement.getText());*/ 
   
  //2nd Method 
 /* WebElement frame = driver.findElement(By.xpath("//*[@id='content']/iframe")); 
  driver.switchTo().frame(frame); 
   
   
  WebElement element = driver.findElement(By.xpath("//*[@id='draggable']")); 
  System.out.println(element.getText()); 
   
  driver.switchTo().defaultContent(); 
   
  WebElement PageElement = driver.findElement(By.xpath("//*[@id='content']/h1")); 
  System.out.println(PageElement.getText()); 
  */ 
   
  //3rd Method 
  //driver.switchTo().frame(arg0); 
  
 }  
} 