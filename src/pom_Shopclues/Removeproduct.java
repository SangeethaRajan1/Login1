package pom_Shopclues;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericMethods.Base_page;

public class Removeproduct extends Base_page {
	@FindBy(xpath="(//a[@class='remove'])[1]")private WebElement remove;
	@FindBy(xpath="//a[@class='prod-remove']")private WebElement removeconfirmation;
	@FindBy(xpath="//img[@alt='Empty cart']")private WebElement Emptycart;
	public Removeproduct(WebDriver driver)
	{
		super(driver);
	}
	public void Clickremove()
	{
		remove.click();
	}
	public void Clickremoveconfirm()
	{
		removeconfirmation.click();
	}
	public void emptycart()
	{
		Visiblityof(5, Emptycart);
	}
}
