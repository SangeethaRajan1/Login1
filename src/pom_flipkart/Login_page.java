package pom_flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericMethods.Base_page;

public class Login_page extends Base_page {
	@FindBy(xpath = "//input[@class='_2zrpKA _1dBPDZ']")
	private WebElement username;
	@FindBy(xpath = "//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	private WebElement password;
	@FindBy(xpath = "(//span[.='Login'])[3]")
	private WebElement login;

	public Login_page(WebDriver driver) {
		super(driver);
	}

	public void sendusername(String uname) {
		Visiblityof(5,username);
		username.sendKeys(uname);
	}

	public void Sentpassword(String pswd) {
		Visiblityof(5,password);
		password.sendKeys(pswd);
	}

	public void clickelement() {
		login.click();
	}
}
