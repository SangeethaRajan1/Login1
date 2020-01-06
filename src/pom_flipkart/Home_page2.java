package pom_flipkart;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;



import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericMethods.Base_page;

public class Home_page2 extends Base_page {
	@FindBy(xpath="//input[@class='LM6RPg']") private WebElement searchbox;
	@FindBy(xpath="(//div[@class='_3wU53n'])[1]") private WebElement Selectproduct;
	public Home_page2(WebDriver driver)
	{
		super(driver);
	}
	
	public String Searchelement(String product_name)
	{
	String	ahtitle=driver.getTitle();
	Visiblityof(5,searchbox);
		searchbox.sendKeys(product_name);
		Robot r;
		try {
			r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} 
		catch (AWTException e) {
			System.out.println("Could'nt click on enter key from virtual keyboard");
		}
		return ahtitle;
		}

	public void Selecttheproduct() throws InterruptedException {
		
		Visiblityof(7,Selectproduct);
		Selectproduct.click();
		Set<String> childbrowser = driver.getWindowHandles();
		for(String child:childbrowser)
		{
			driver.switchTo().window(child);
			Thread.sleep(3000);
		}
	}

}
