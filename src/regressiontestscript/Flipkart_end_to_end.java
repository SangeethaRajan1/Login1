package regressiontestscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pom_flipkart.Addtocart_page3;
import pom_flipkart.Home_page2;
import pom_flipkart.Login_page;
import pom_flipkart.Removeelement_page4;
import GenericMethods.ExcelGeneric;
import GenericMethods.Generictest;

public class Flipkart_end_to_end extends Generictest{
	@Test
	public void validLoginlogout() throws InterruptedException
	{
		String uname = ExcelGeneric.Excelread("ValidLogin",1,0);
		String pswd=ExcelGeneric.Excelread("ValidLogin",1,1);
		
	Login_page lp =new Login_page(driver);
	 test = reports.createTest("validLoginlogout", "To validate user name and password");
	test.info("Test case has been started");
	 lp.sendusername(uname);
	test.pass("User name has been entered");
	lp.Sentpassword(pswd);
	test.pass("password has been entered");
	lp.clickelement();
	test.pass("Clicked on login button");
	Home_page2 hp = new Home_page2(driver);
	test.info("Switched to home page");
	//String hetitle=ExcelGeneric.Excelread("SelectedproductDetails", 1, 3);
	
	String ahtitle= hp.Searchelement("samsung galaxy");
	test.pass("Searched for Samsung galaxy");
	Thread.sleep(3000);
	//Assert.assertEquals(hetitle, ahtitle);
	hp.Selecttheproduct();
	test.pass("Selected the phone");
	Addtocart_page3 cart=new Addtocart_page3(driver);
	test.info("Switched to Addtocart page");
	//String acolor=cart.Selectcolor();
	//String ecolor=ExcelGeneric.Excelread("SelectedproductDetails", 1, 2);
	
	//Assert.assertEquals(ecolor, acolor);
	
	cart.Selectproduct();
	test.pass("Added to cart");
	Removeelement_page4 remove =new Removeelement_page4(driver);
	remove.Removeproduct();
	test.pass("Clicked on remove product button");
	remove.removeelementconfirm();
	test.pass("Confirm that user want t remove the producr");
	remove.emptycartvalidation();
	test.pass("Product has been removed");
	test.info("Test ended");
	
	}
	}
