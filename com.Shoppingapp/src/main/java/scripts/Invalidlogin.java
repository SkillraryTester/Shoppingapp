package scripts;

import org.testng.annotations.Test;

import genericlibs.BaseTest;
import pages.LoginPage;

public class Invalidlogin extends BaseTest{
	@Test
	public void login()
	{
		LoginPage l=new LoginPage(driver);
		l.validlogin("vgagggjca");
	}

}
