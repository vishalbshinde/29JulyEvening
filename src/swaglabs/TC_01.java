package swaglabs;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01 {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement user_name = driver.findElement(By.name("user-name"));
		WebElement pasward = driver.findElement(By.name("password"));
		WebElement login_butten = driver.findElement(By.name("login-button"));
		
		
		user_name.sendKeys("standard_user");
		pasward.sendKeys("secret_sauce");
		login_butten.click();
		
		WebElement Backpack = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		 WebElement Jacket = driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket"));
		WebElement cart_butten = driver.findElement(By.id("shopping_cart_container"));
		Backpack.click();
		Jacket.click();
		
		cart_butten.click();
		List<WebElement> cartItems = driver.findElements(By.className("inventory_item_name"));
				System.out.println("Number of items are "+cartItems.size());
				for(WebElement ci:cartItems)
				{
				System.out.println("items are "+ci.getText());
				}
				//validate item is same as what we want
				 Iterator<WebElement> it = cartItems.iterator();
				WebElement itemNum1 = it.next();
				if(itemNum1.getText().equals("Sauce Labs Backpack"))
				{
				System.out.println("Selected item is correct as ==> Sauce LabsBackpack");
				driver.findElement(By.name("checkout")).click();
				}
				else {
				System.out.println("Selected item is not correct");
				
				}
		
	}

}
