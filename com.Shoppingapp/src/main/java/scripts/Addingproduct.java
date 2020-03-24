package scripts;

import org.testng.annotations.Test;

import genericlibs.BaseTest;
import genericlibs.PropertyFile;
import genericlibs.Utilies;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class Addingproduct extends BaseTest{
	@Test
	public void addtocart()
	{
		LoginPage l=new LoginPage(driver);
		Utilies u=new Utilies();
		u.waitforelementtobeloaded(driver);
		HomePage h = l.validlogin(PropertyFile.getproperty("Email"));
		ProductPage p = h.dress(PropertyFile.getproperty("product"));
		CartPage c =
				p.productselection();
		c.productdetails();
	}
	

}
