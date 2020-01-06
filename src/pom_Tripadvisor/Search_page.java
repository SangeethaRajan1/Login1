package pom_Tripadvisor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericMethods.Base_page;

public class Search_page extends Base_page {
	@FindBy(xpath="//span[.='Search']")private WebElement searchbar;
	@FindBy(xpath="//span[.='Search']") private WebElement searchbyvalue;
	@FindBy(xpath="(//div[@class='inner'])[1]") private WebElement clicksearch ;
	@FindBy(xpath="(//span[.='Madikeri Fort'])")private WebElement Clickontheresult;
	
	public Search_page(WebDriver driver)
	{
		super(driver);
	}
	public void Searchbar()
	{
	searchbar.click();
	}
	public void Searchthedestination(String place)
	{
		searchbyvalue.sendKeys(place);
		}
public void Search()
{
clicksearch.click();
}
public void result()
{Clickontheresult.click();
	}

}
