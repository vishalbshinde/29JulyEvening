package swaglabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabInventoryPage
{
     //variables
	@FindBy(id="shopping_cart_container")private WebElement cartButten;
	@FindBy(name="add-to-cart-sauce-labs-bolt-t-shirt")private WebElement tShirtsAddToCartButton;
	@FindBy(name="add-to-cart-sauce-labs-fleece-jacket")private WebElement jacketAddToCartButton;

	//constructor
	public SwagLabInventoryPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
		//method
	public void addTshirtToCart() 
	{
		tShirtsAddToCartButton.click();
	}
	public void jacketAddToCart()
	{
	jacketAddToCartButton.click();
	}
	public void clickOnCartButton()
	{
		cartButten.click();
	}

}
