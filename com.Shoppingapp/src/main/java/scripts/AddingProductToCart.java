package scripts;

import org.testng.annotations.Test;

import genericlibs.BaseTest;
import genericlibs.PropertyFile;
import genericlibs.Utilies;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class AddingProductToCart extends BaseTest{
	@Test
	public void addingtocart() throws InterruptedException
	{
		LoginPage l=new LoginPage(driver);
//		Thread.sleep(3000);
//				l.signinbtn();
//				
//				l.emailaddresstxtbox(PropertyFile.getproperty("Email"));
//				l.gobtn();
//				
				Thread.sleep(3000);
				
				HomePage h=new HomePage(driver);
				h.serachtxtbox(PropertyFile.getproperty("product"));
				h.serachbutton();
				
				ProductPage p1=new ProductPage(driver);
				Utilies u=new Utilies();
				u.dropdown(p1.getDropdown(),PropertyFile.getproperty("dd"));
				Thread.sleep(3000);
				p1.selecteddress();
				
				CartPage c=new CartPage(driver);
				for(int i=1;i<=3;i++)
				{
				c.plusbtn();
				}
				u.dropdown(c.getSize(),PropertyFile.getproperty("Size"));
				c.colorbtn();
				c.cartbtn();
				c.proceedtocheckout();
				
				
				
	}
	

}
