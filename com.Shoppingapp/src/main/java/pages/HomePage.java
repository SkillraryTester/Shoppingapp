package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	@FindBy(id="search_query_top")
	private WebElement serach;
	
	@FindBy(name="submit_search")
	private WebElement serachbtn;
	
	@FindBy(xpath="//a[.='Women']")
	private WebElement women;
	
	
	@FindBy(xpath="(//a[.='Evening Dresses'])[1]")
	private WebElement eveningdress;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
		
	}
	
	
	public ProductPage dress(String dress)
	{
		serach.sendKeys(dress);
		serachbtn.click();
		return new ProductPage(driver);
		
	}
	

}
