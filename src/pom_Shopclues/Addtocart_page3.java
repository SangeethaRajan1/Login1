package pom_Shopclues;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericMethods.Base_page;
import GenericMethods.GMaction;

public class Addtocart_page3 extends Base_page {
	@FindBy(xpath="//span[@id='4172016']")private WebElement color;
	@FindBy(xpath="//button[@id='add_cart']")private WebElement Addtocart;
	@FindBy(xpath="//a[@class='cart_ic']")private WebElement viewcart;
	public Addtocart_page3(WebDriver driver)
	{
		super(driver);
	}
	public void Selectcolor()
	{
		color.click();
	}
	public void Addtocart()
	{
	Addtocart.click();	
	}
	public void Viewthecart()
	{
		GMaction g=new GMaction();
		g.Click(driver, viewcart);
	}

}
