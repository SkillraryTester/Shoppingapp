package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
WebDriver driver;	
	
	@FindBy(id="selectProductSort")
	private WebElement dropdown;
	
	@FindBy(xpath="(//a[@title='Printed Dress'])[2]")
	private WebElement dress;
	
	
	@FindBy(xpath="//span[.='Products']")
	private WebElement product;
	
	@FindBy(xpath="//a[@title='remove this product from my cart']")
	private WebElement delete;
	
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public CartPage productselection()
	{
		dress.click();
		return new  CartPage(driver) ;
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	
	}


