package pom_flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericMethods.Base_page;

public class Removeelement_page4 extends Base_page
{
@FindBy(xpath="(//div[@class='gdUKd9'])[2]") private WebElement removeelementfromcart;
@FindBy(xpath="(//div[.='Remove'])[1]") private WebElement removeelementconfirm;
@FindBy(xpath="//div[contains(.,'Your cart is empty!')]") private WebElement emptycart;

	public Removeelement_page4(WebDriver driver)
	{
		super(driver);
	}
	public void Removeproduct()
	{
		Visiblityof(7, removeelementfromcart);
		removeelementfromcart.click();
		
	}
	public void removeelementconfirm()
	{
		Visiblityof(7, removeelementconfirm);
		removeelementconfirm.click();
		
	}
	public void emptycartvalidation()
	{
	
		Visiblityof(7, emptycart);
		boolean b=emptycart.isDisplayed();
		if(b)
		{
			System.out.println("Item has been removed from the cart");
		}
		else{
			System.out.println("Item has not removed from the cart");
		}
	}
}
