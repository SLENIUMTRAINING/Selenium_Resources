package SeleniumExamples;  
import java.util.List; 
import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.firefox.FirefoxDriver;  
public class DropDowns {  
 public static void main(String[] args) {  
  WebDriver driver = new FirefoxDriver(); 
  driver.get("http://rediff.com/"); 
  driver.manage().window().maximize(); 
  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
   
  driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();  
 driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div/form/div/div[7]/a")).clic k(); 
   
  WebElement dropdown = driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[24]/td[3]/select[1]")); 
   
  List<WebElement> option = dropdown.findElements(By.tagName("option")); 
  System.out.println(option.size()); 
  //32 
   
  /*List<WebElement> option = driver.findElements(By.tagName("option")); 
  System.out.println(option.size()); 
  //475 
*/   
  String element; 
  for(int i=0; i<option.size();i++){ 
   element = option.get(i).getAttribute("value"); 
   if(element.equals("25")){ 
    option.get(i).click(); 
   } 
  } 
   
 }  
} 
