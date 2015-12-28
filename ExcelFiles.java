package readExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadExcel {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String excelPath = "C:\\Users\\Amit\\Desktop\\ECLIPSEWS\\TestData.xls";
		File src = new File(excelPath);//"C:\\Users\\Amit\\Desktop\\ECLIPSEWS\\TestData.xls"
		
		FileInputStream fis = new FileInputStream(src);
		
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		
		HSSFSheet sht1 = wb.getSheetAt(0);	
	
	int rowcount = sht1.getLastRowNum();
	System.out.println("Total Rows are"+(rowcount+1));
	
	for(int i =0;i<(rowcount+1);i++)
	{
		String data0=sht1.getRow(i).getCell(0).getStringCellValue();
		String data1=sht1.getRow(i).getCell(1).getStringCellValue();
		System.out.println("Tester Name at "+i+" is " +data0+"Expertise is "+data1);
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys(data0);
		driver.close();
	}
	

	wb.close();
	
	}

}
------------------------------------------------------------------------------------------------
package lib;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelDataCfg {
	HSSFWorkbook wb;
	HSSFSheet sht1;
	
	
	public ExcelDataCfg(String excelPath){
		try{
		File src = new File(excelPath);//"C:\\Users\\Amit\\Desktop\\ECLIPSEWS\\TestData.xls"
		
		FileInputStream fis = new FileInputStream(src);
		
		wb = new HSSFWorkbook(fis);
		
		sht1 = wb.getSheetAt(0);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}

	}


public String getData(int i, int row, int column)

{
	String data = sht1.getRow(row).getCell(column).getStringCellValue();
	
	return data;
}

}
----------------------------------------------------------------------------------------------------
package readExcelData;
import lib.ExcelDataCfg;
public class ReadExcelData {

	public static void main(String[] args) {

		ExcelDataCfg excel = new ExcelDataCfg("C:\\Users\\Amit\\Desktop\\ECLIPSEWS\\TestData.xls");
		
		
		System.out.println(excel.getData(0,0,0));

	}

}
-------------------------------------------------------------------------------------------------------
package writeExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteExcelSheet {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File src = new File("C:\\Users\\Amit\\Desktop\\ECLIPSEWS\\TestData.xls");

		FileInputStream fis = new FileInputStream(src);
		
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		
		HSSFSheet sht1 = wb.getSheetAt(0);
		
		sht1.getRow(0).createCell(2).setCellValue("Pass");
		sht1.getRow(1).createCell(2).setCellValue("Fail");
		FileOutputStream fout = new FileOutputStream(src);
		
		wb.write(fout);
		wb.close();
	}

}
-------------------------------------Data Driven-----------------------------------------

public class CLLogin
{
	@Test(dataProvider ="wordpressData")
	public void loginToWordpress(String username, String password) throws InterruptedException
	{
		WebDriver.driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://washingtondc.craigslist.org");
		driver.findElement(By.id(LoginRelated)).sendKeys(username);
		driver.findElement(By.id(Pass)).sendKeys(password);
		driver.findElement(By.xpath(submitIt)).click();
		Thread.sleep(5000);
		Assert.assertTrue(driver.getTitle().contains("somethn"),"Invalid");
		System.out.println("Page Title Checked");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
