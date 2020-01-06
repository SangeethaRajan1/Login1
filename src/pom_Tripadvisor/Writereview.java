package pom_Tripadvisor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericMethods.Base_page;
import GenericMethods.SelectGM;

public class Writereview extends Base_page{
	@FindBy(xpath="//select[@id='trip_date_month_year']")private WebElement element;
	@FindBy(xpath="//input[@id='qid511']")private WebElement var1;
	@FindBy(xpath="//input[@id='qid510']")private WebElement var2;
	@FindBy(xpath="//input[@value='< 1 hour']")private WebElement field4;
	@FindBy(xpath="(//div[@class='wartag-ModestDressRecommended  answersYesNo jfy_cloud'])[3]")private WebElement var3;
	@FindBy(xpath="(//div[@class='wartag-Familyyoungchildren  answersYesNo jfy_cloud'])[1]")private WebElement var4;
	@FindBy(xpath="(//div[@class='wartag-History  answersYesNo jfy_cloud'])[1]")private WebElement var5;
	@FindBy(xpath="(//div[@class='wartag-Goodforsmallgroups  answersYesNo jfy_cloud')[1]")private WebElement var6;
	@FindBy(xpath="(//div[@class='wartag-ThriftyTraveler  answersYesNo jfy_cloud'])[1]")private WebElement var7;
	@FindBy(xpath="(//div[@class='wartag-Free  answersYesNo jfy_cloud'])[3]")private WebElement var8;
	@FindBy(xpath="//div[@class='ui_button primary']")private WebElement var9;
	@FindBy(xpath="//div[@class='ui_button primary addPhotoBtn']")private WebElement var10;
	@FindBy(xpath="//input[@id='noFraud']")private WebElement var11;
	@FindBy(xpath="//span[@class='hvrIE6 preview taLnk']")private WebElement var12;
	
	public Writereview(WebDriver driver)
	{
		super(driver);
	}
	public void Field1()
	{
		//Select drp = new Select(element);
		  //drp.selectByIndex(3);
		SelectGM sel = new SelectGM();
		sel.Selectbyindex(element, 3);
	}
	public void Field2(String text)
	{
		var1.sendKeys(text);
	}
	public void Field3(String text)
	{
	var2.sendKeys(text);
	}
	public void Field4()
	{
	field4.click();
	}
	public void Field5()
	{
	var3.click();
	}
	public void Field6()
	{
	var4.click();
	}
	public void Field7()
	{
	var5.click();
	}
	public void Field8()
	{
	var6.click();
	}
	public void Field9()
	{
	var7.click();
	}
	public void Field10()
	{
	var8.click();
	}
	public void Field11()
	{
	var9.click();
	}
	public void Field12(String path)
	{
	var10.sendKeys(path);
	}
	public void Field13()
	{
	var11.click();
	}
	public void Field14()
	{
	var12.click();
	}

}
