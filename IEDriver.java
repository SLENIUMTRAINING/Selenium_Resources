package iebrowse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIE {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\lib\\IEDriverServer.exe");	
		WebDriver iEdriver = new InternetExplorerDriver();
		iEdriver.get("https://google.com");
		iEdriver.manage().window().maximize();
		
		//iEdriver.close();
	}

}
