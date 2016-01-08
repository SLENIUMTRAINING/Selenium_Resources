import java.util.List; 
import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.firefox.FirefoxDriver;   
public class datePicker {  
 static WebDriver driver;  
 public static void main(String[] args) throws InterruptedException {  
  driver = new FirefoxDriver(); 
  driver.get("http://www.tripadvisor.in/"); 
  driver.manage().window().maximize(); 
  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
  driver.findElement(By.xpath("//*[@id='rdoFlights']/img")).click(); 
  driver.findElement(By.xpath("//*[@id='metaFlightFrom']")).sendKeys("Mumbai"); 
  driver.findElement(By.xpath("//*[@id='metaFlightTo']")).sendKeys("Delhi"); 
  driver.findElement(By.xpath("//*[@id='checkIn']")).click();  
  String date = "10-July 2015"; 
  String splitter[] = date.split("-"); 
  String checkInmonth_year = splitter[1]; 
  String checkInday = splitter[0]; 
 
  selectDate(checkInmonth_year,checkInday);  
  driver.findElement(By.xpath("//*[@id='checkOut']")).click(); 
  date = "15-July 2015"; 
  splitter = date.split("-"); 
  String checkOutmonth_year = splitter[1]; 
  String checkOutday = splitter[0];  
  selectDate(checkOutmonth_year,checkOutday);  
  driver.findElement(By.xpath("//*[@id='SUBMIT_VRS']")).click(); 
 }    
 public static void selectDate(String month_year, String day) throws InterruptedException{  
  List<WebElement> elements = driver.findElements(By.xpath 
    ("//div[@class='calendar']/div[@class='month']/table/thead/tr/th[@class='caption']"));  
  for(int i=0; i<elements.size(); i++){ 
   System.out.println(elements.get(i).getText()); 
   //Selecting the month 
   if(elements.get(i).getText().equals(month_year)){ 
    //Selecting the date 
    System.out.println("-------------"); 
    List<WebElement> days= driver.findElements(By.xpath 
      ("//div[@class='calendar']/div[@class='month']["+(i+1)+"]/table/tbody/tr/td/a")); 
    for(WebElement d:days){ 
     System.out.println(d.getText()); 
     if(d.getText().equals(day)){ 
      d.click(); 
      return; 
     } 
    } 
   } 
  }  
  driver.findElement(By.xpath("//*[@id='overlayInnerDiv']/div/div[1]/span[2]/a")).click(); 
  driver.findElement(By.xpath("//*[@id='overlayInnerDiv']/div/div[1]/span[2]/a")).click(); 
  Thread.sleep(2000); 
  selectDate(month_year, day);  
 }  
} 
