package pom_Tripadvisor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericMethods.Base_page;

public class Selecteddestination_page extends Base_page
{
@FindBy(xpath="(//span[@class='reviewCount'])[1]") private WebElement reviewclick;
@FindBy(xpath="//a[.='Write a review']")private WebElement Writereviewclick;
 public Selecteddestination_page(WebDriver driver)
 {
	 super(driver);
 }
 public void reviewicon()
 {
	 reviewclick.click(); 
 }
 public void writereview()
 {
	 Writereviewclick.click(); 
 }
}
