import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DynamicXpath {
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new FirefoxDriver();
driver.get("http://yahoo.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.findElement(By.xpath("//*[@id='UHSearchBox']")).sendKeys("Selenium");
Thread.sleep(5000);
//List<WebElement> list = driver.findElements(By.xpath("//*[starts-with(@id,'yui_3_12_0_1_1430')]/a"));
List<WebElement> list = driver.findElements(By.xpath("//*[contains(@id,'ui_3_12_0_1_1430')]/a"));
System.out.println(list.size());
list.get(0).click();
}
}
