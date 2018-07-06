package seleniumwebdriver.seletestng.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker.Virtual;

public abstract class BasePage {
	
	protected final WebDriver driver;
	protected BasePage(WebDriver webDriver)
	
	{
		driver = webDriver;
		if (GetPageDirectroyURI().length()>0) {NavigateToPage();}
		PageFactory.initElements(driver, this);
	}
	private void NavigateToPage()
	{
		driver.navigate().to(GetPageDirectroyURI());
	}
	String GetPageDirectroyURI() {
		// TODO Auto-generated method stub
		return "http://automationpractice.com";
	}

}
