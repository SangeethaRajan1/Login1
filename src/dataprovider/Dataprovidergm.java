package dataprovider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericMethods.Auto_constant;

public class Dataprovidergm implements Auto_constant{
	
public static Object[][] getdata( String sheet)
{
	FileInputStream fin = null;
	try {
		fin = new FileInputStream(Excel_path);
	} catch (FileNotFoundException e) {
		
		Reporter.log("Excel not found",true);
	}
	Workbook wb = null;
	try {
		wb = WorkbookFactory.create(fin);
	} catch (EncryptedDocumentException | InvalidFormatException | IOException e) {
		Reporter.log("Excel encrypted",true);
	}
	Sheet sh = wb.getSheet(sheet);
	int rc = sh.getLastRowNum();
	Row rw = sh.getRow(0);
	short cc = rw.getLastCellNum();
	Object data[][]=new Object[rc+1][cc];
			for(int i=0;i<rc+1;i++)
			{
				Row row=sh.getRow(i);
			
	for(int j=0;j<=cc;j++)
	{
	 Cell cell=row.getCell(j);
	 data[i][j]=cell.getStringCellValue();
	}}
	return data;
	
}
public class readdata
{
	public WebDriver driver;
	@DataProvider(name="Authentification")
	public Object[][] logindata()
	{
		Object[][] arrobj=DataProvider.getData();
		return arrobj;
	}
	@BeforeMethod
	public void openapp(String url)
{
	System.setProperty(gecko_key,gecko_value);
	WebDriver driver=new ChromeDriver();
	driver.get(url);
}
@Test(dataProvider="Authentification")
public void login(String xpath)
{
	driver.findElement(By.xpath(xpath));
}
@AfterMethod
public void closeapp()
{
	driver.quit();
}
	}
}
