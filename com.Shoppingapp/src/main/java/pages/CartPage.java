package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement plus;
	
	@FindBy(id="group_1")
	private WebElement size;
	
	@FindBy(name="Orange")
	private WebElement color;
	
	@FindBy(xpath="//span[.='Add to cart']")
	private WebElement cart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement checkout;
	
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void productdetails()
	{
		plus.click();
	//	color.click();
		cart.click();
		checkout.click();
	}

	public WebElement getSize() {
		return size;
	}
	
	

}
