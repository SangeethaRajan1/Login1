package pom_flipkart;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericMethods.Base_page;

public class Addtocart_page3 extends Base_page{
	
	//@FindBy(xpath="(//div[@class='_2fXpRR'])[1]") private WebElement productcolor;
	
		//@FindBy(xpath="//button[contains(.,'ADD TO CART')]") 
		@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")private WebElement Addtocart;
	
	public Addtocart_page3(WebDriver driver)
	{
		super(driver);
	}
	/*public String Selectcolor()
	{
		String color=productcolor.getText();
		productcolor.click();
		return color;
			
	}*/
	
	public void Selectproduct()
	{

		elementtobeclickable(7,Addtocart);
		Addtocart.click();
	
	}


}
