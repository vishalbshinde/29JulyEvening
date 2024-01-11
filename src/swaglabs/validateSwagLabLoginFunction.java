package swaglabs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validateSwagLabLoginFunction {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		//create object of POM class
		SwagLabLoginPage login=new SwagLabLoginPage(driver);
		
login.enterUserName();
login.enterPasward();
login.clickonloginButton();

SwagLabInventoryPage inventory=new SwagLabInventoryPage(driver);
inventory.jacketAddToCart();
inventory.addTshirtToCart();
inventory.clickOnCartButton();

	}

}
