package TestPackage;

import org.apache.log4j.Logger;// download log4j apache jar file.
import org.openqa.selenium.WebDriver;
import org. openqa.selenium.firefox.FirefoxBinary;
import org. openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestingLog4j {

  Logger logger;
  
  @Test
  public void testLogs(){
  logger = Logger.getLogger("ThisisLogger");
  
  logger.debug("Start Selenium testing");
  WebDriver driver = new FirefoxDriver();
    logger.debug("Mozzila browser");
  driver.get("http://www.google.com");
    logger.debug("Google opens");
  driver.window().manage().maximize();
    logger.debug("Maximizes browser");
  
  }


}
