package pom_Shopclues;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericMethods.Base_page;

public class Clickproduct2_page extends Base_page{
	@FindBy(xpath="//img[@id='det_img_95220399']")private WebElement Prodclick;
	public Clickproduct2_page(WebDriver driver)
	{
		super(driver);
	}
	public void Clickonprodimg()
	{
		Prodclick.click();
	}

}
