package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	private WebElement siginin;
	
	@FindBy(id="newsletter-input")
	private WebElement emailtb;
	
	@FindBy(name="submitNewsletter")
	private WebElement go;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public HomePage validlogin(String email)
	{
		siginin.click();
		emailtb.sendKeys(email);
		go.click();
		return new HomePage(driver);
	}

}
