package seleniumwebdriver.seletestng.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	
	@FindBy(how = How.CSS, using = "a.login")
	 private WebElement link_Login;

	 
	@Override
	String GetPageDirectroyURI()
	{
		return "http://automationpractice.com";
	}
	public HomePage(WebDriver webDriver)
	{
		super(webDriver);
		
	}
	
	public void ClickLoginLink()
	{
		link_Login.click();
	}
	
	

}
