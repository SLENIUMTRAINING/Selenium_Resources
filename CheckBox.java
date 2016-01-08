package SeleniumPackage; 
import java.util.List; 
import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.firefox.FirefoxDriver;  
public class Checkbox {  
 public static void main(String[] args) {  
  WebDriver driver = new FirefoxDriver(); 
  driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php"); 
  driver.manage().window().maximize(); 
  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
   
   
  List<WebElement> checkbox = driver.findElements(By.xpath("//div[@class='display'][1]//input[@name='sports']")); 
   
  System.out.println(checkbox.size()); 
   
  for(WebElement e: checkbox){ 
   System.out.println(e.isSelected()); 
   System.out.println(e.getAttribute("value")); 
    
   if(e.getAttribute("value").equals("football") || 
    e.getAttribute("value").equals("baseball")){ 
    e.click(); 
   } 
  } 
   
   
  System.out.println("---------------------------"); 
  for(WebElement e: checkbox){ 
   System.out.println(e.isSelected()); 
   
  } 
       
 }  
} 
