package swaglabs;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage
{
	//1.Variable--> WebElements
	@FindBy(name="user-name")private WebElement userNaeFiled;
	@FindBy(id="password")private WebElement paswardField;
	@FindBy(xpath ="//input[@class='submit-button btn_action']" ) private WebElement loginButton;
	
	//2.Constructor
	public SwagLabLoginPage(WebDriver driver)
	
	{
		PageFactory.initElements(driver,this);
	}
	//3.Methods
	public void enterUserName()
	{
		userNaeFiled.sendKeys("standard_user");
	}
	public void enterPasward() 
	{
		paswardField.sendKeys("secret_sauce");
	}
	public void clickonloginButton() 
	{
		loginButton.click();
	}
	
}
