package chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowse {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BinalAmit\\Desktop\\eclipse\\Workspace\\ChromeBrowser\\lib\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://www.google.com");
		chrome.manage().window().maximize();

	}

}
