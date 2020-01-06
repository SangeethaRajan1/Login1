package GenericMethods;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Generictest implements Auto_constant {
	protected WebDriver driver;
	public static ExtentHtmlReporter htmlReporter ;
	public static ExtentReports reports;
	public static ExtentTest test;
	@BeforeSuite
	public void setUP()
	{
	 htmlReporter = new ExtentHtmlReporter(new File("./Reports/"+System.currentTimeMillis()+".html"));
	    reports = new ExtentReports();
	   reports.attachReporter(htmlReporter);
	  
	}
	@BeforeMethod
		public void openapp()
	{
		System.setProperty(gecko_key,gecko_value);
		 driver=new FirefoxDriver();
		//driver.get("https://www.flipkart.com");
		 String url=Filemanager.getapplnurl();
		 driver.get(url);
		
	}
	
	@AfterMethod
	public void closeapp(ITestResult res) throws IOException
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			System.out.println(res.getName());//to get the name of the failed test case
			Screenshotgeneric.Screenshot(driver);
			try {
				ExcelGeneric.Excelwritegm("ValidLogin", 1, 3,"failed");
				MediaEntityBuilder media = MediaEntityBuilder.
				createScreenCaptureFromPath(Screenshotgeneric.Screenshot(driver));
				test.fail(" Failed testcase screenshot , generic test",media.build() );
			
			} catch (Exception e) {
				System.out.println("failed to write status to the excel");
			}
			
		}
		else if(ITestResult.SUCCESS==res.getStatus())
		{
			Screenshotgeneric.Screenshot(driver);
			//test.pass("dhfg",mediaEntitybuilder())
				
			try {
				ExcelGeneric.Excelwritegm("ValidLogin", 1, 3,"passed");
				MediaEntityBuilder mediaModel = 
						MediaEntityBuilder.createScreenCaptureFromPath
						(Screenshotgeneric.Screenshot(driver));
				test.pass("Screenshot of passed TC from generic test", mediaModel.build());
				//if we give fail instead of pass then in reports it will show failed status in log
			
			} catch ( Exception e) {
				System.out.println("failed to write status to the excel");
			}
		}
		driver.quit();
		
	}
	@AfterSuite
	public void Teardown()
	{
		reports.flush();
	}

}
