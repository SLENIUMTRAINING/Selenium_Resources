# Selenium_Resources
This will have codes for initial selenium practice
# Selenium_Resources_list
This Repository is to be used with initial Selenium Getting started class

Mozzila Firefox Download - Addons : Firebug, FirePath

Selenium website - Download IDE : http://docs.seleniumhq.org/download/

#Verify Java version - Command prompt Type:  java -version
#Download latest version of Java: http://www.oracle.com/technetwork/java/javase/downloads/index.html
#Verify JDK and JRE on C:> Program Files >java
#System PRoperties - Advance system settings - Environment variables - Edit system variable
# Paste JDK  bin path after a semicolon. 
#Get Eclipse Luna package for your computer - 32 or 64 bit - be mindful of Java version on your device
#Create Eclipse work space. 
#Get a GIT account to share this repository. 
#TestNG, Maven, Jenkins, ANT, GIT 
seleniumhq.github.io/selenium/docs/api/java/index.html
****Download Java Library and add them to package. Java 2.48.2 2015-10-09  
Project - Properties - Java Build Path - Libraries Add External Jar (Dont Include SRCS)
#Selenium First Program with Firefox : 
package TestScripts; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class NavigateToGoogle {
     public static void  main(String[] args){
          WebDriver driver = new FirefoxDriver();
          driver.get("http://www.google.com"); //Dont Forget to type http://
          driver.manage().window().maximize();
       }
   }
#Selenium with Chrome : 
**** Create a New Folder - Go to : chromedriver.storage.googleapis.com/index.html - copy under new folder
package TestScripts; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.FirefoxDriver;
public class NavigateToGoogle {
     public static void  main(String[] args){
         System.getProperty("webDriver.chrome.driver","LOCATION OF CHROME DRIVER" OR System.getProperty("user.dir")+\lib\\chromedriver.exe");
          WebDriver chromeDriver = new ChromeDriver();
          chromeDriver.get("http://www.google.com"); //Dont Forget to type http://
       }
   }
#Selenium with Internet Explorer : 
**** selenium-release.storage.googleapis.com/index.html - for IE Driver - COpy Paste under Lib
package TestScripts; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class NavigateToGoogle {
     public static void  main(String[] args){
          System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//Lib//IEDriverServer.exe");
          WebDriver ieDriver = new InternetExplorerDriver();
          driver.get("http://www.google.com"); //Dont Forget to type http://
       }
   }
Selenium WebDriver - Javadoc eclipse - 
Include Jar File, Source code, Java Docs - Selenium Java Files
#Eclipse - Build a first project
Link Jar files -except for SRCS file add all of them. 
#Create a first Class - TestJar
---Type in same program as Firefox Driver. and show the error issue. as it doesn't show Java Driver. 
Ctrl + Alt = click on driver. or webdriver. Attach Source - External Location-External File - select SRCS source code. 
Or - Test Project RightClick- Properties - Selenium JAR - Find Attach source - click on edit - External Jar and give path to SRCS

#Review JavaDocs - for all classes and all  packages review. 

C#ore Java Tutorial : http://www.dineshonjava.com/2013/01/core-java-baby-step-to-be-best-java-ian.html#.Vi5Yhyu79SA

#How to Use Firebug and FirePath. 

Finding Elements

#public class FindingElements {
   public static void main (String[] args) {
     WebDriver driver = new FirefoxDriver();
     driver.get("http://www.w3schools.com/");
     driver.findElement(By.classname("btn")).click();
     driver.findElement(By.id("gsc-i-id1")).sendKeys("study java");
     driver.findElement(By.linkText("Learn Bootstrap")).click();
     driver.findElement(By.name("search")).sendKeys("Search java");
     driver.findElement(By.partialLinkText("Bootstrap")).click();
     
     List<WebElement> list = driver.findElement(By.tagName("a"));
     System.out.println(list.size());
     
     for (int i =0;i<list.size();i++)
   {  
   System.out.println(list.get(i).getText());
     if(list.get(i).getText().equals("Learn CSS")) {
     list.get(i).click();
     }
   }
     
      List<WebElement> list = driver.findElements(By.className("btn"));
     
     for (int i =0;i<list.size();i++)
   {  
   System.out.println(list.get(i).getText());
     if(list.get(i).getText().equals("JQuery Tutorial")) {
     list.get(i).click();
     }
   }
     
     }
 }
 
#----------Xpath Examples-------------
Absolute Xpath : 
html/body/div[4]/div[1]/div[1]/a[1]
Relative Xpath : 
.//a[@href='/html/default.asp']

driver.findElement(By.xpath("//*[@id='sidemenu']/a[2]")).click();
driver.findElement(By.xpath("//*[@id='sidemenu']/a[text()='Learn HTML']")).click();
driver.findElement(By.xpath("//*[@id='sidemenu']/a[text()='Learn HTML']/preceding-sibling::a")).click();
driver.findElement(By.xpath("//*[@id='sidemenu']/a[text()='Learn HTML']/following-sibling::a")).click();
driver.findElement(By.xpath("//*[@id='sidemenu']/a[text()='Learn CSS']/preceding-sibling::a[2]")).click();
driver.findElement(By.xpath("//*[@id='sidemenu']/a[text()='Learn HTML']/parent::div/parent::div/div[2]/div[2]/a")).click();
//*[@id='sidemenu']/a[text()='Learn HTML']/parent::nav/preceding-sibling::nav[5]/div/div/a[text()='Learn HTML']

#------------Element by Locators----------------------
By.className()
By.id()
By.linkText()
By.name()
By.partialLinkText()
By.tagName()

#---------xpath for dynamic examples -------

driver.findElement(By.xpath("//*[@id='sidemenu']/a[text()='Learn AngularJS']")).click();
driver.findElement(By.xpath("//a[@id='gb_70'])).click();
driver.findElement(By.xpath("//a[starts-with(@id,'gb_7')]")).click();
driver.findElement(By.xpath("//a[contains(@id,'b_7')]")).click();
driver.findElement(By.xpath("//div[@id='sidemenu']/a[starts-with(text(),'Learn Boots')]")).click();
driver.findElement(By.xpath("//div[@id='sidemenu']/a[contains(text(),'rn Boots')]")).click();

driver.findElement(By.xpath("(//XPATH)[last()]")).click();
driver.findElement(By.xpath("(//XPATH)[last()-1]")).click();
driver.findElement(By.xpath("(//XPATH)[position()='1']")).click();

#---------------CSS Selectors----------------
//CSS Selector may be faster then Xpath. 
//Coding is little faster - easy to identify
//Xpaths are easy to create, traverse and track
//CSS selector is top to bottom only
//xpath=//input[@id='email']
//css - input[id=email]
By.cssSelector()
css - (input[id=email] [class=inputtext])
#email  - Shortcut for id
input[id^='ema']
input[id*='ail']
body[class='homepage'] div div form div input[id='q'] = seleniumhq search. 

# -------Dynamic Xpath Example------------------
//*[starts-with(@id,'yui_3_12_0_1_1430')]/a
//*[contains(@id,'ui_3_12_0_1_1430')]/a
