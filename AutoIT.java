import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class UploaderTest {
public static void main(String[] args) throws IOException, InterruptedException {
WebDriver driver = new FirefoxDriver();
driver.get("http://tinypic.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//driver.findElement(By.xpath("//*[@id='the_file']")).sendKeys
//("C:\\Users\\SPA\\Desktop\\resume.txt");
//AutoIt
driver.findElement(By.xpath("//*[@id='the_file']")).click();
Thread.sleep(5000);
Runtime.getRuntime().exec("C:\\Users\\SPA\\Desktop\\AutoItScript.exe");
}
}
