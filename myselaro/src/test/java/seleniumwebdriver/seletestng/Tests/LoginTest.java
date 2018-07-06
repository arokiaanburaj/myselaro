package seleniumwebdriver.seletestng.Tests;

import org.testng.annotations.Test;

import seleniumwebdriver.seletestng.Pages.HomePage;

public class LoginTest extends BaseTest {
	@Test
	  public void test() {
	 
	      HomePage homePage = new HomePage(super.driver);
	      homePage.ClickLoginLink();
	      
	}

}
