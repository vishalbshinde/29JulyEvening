package seleniumstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Method {

	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver()	;
		
driver.get("https://www.youtube.com/");

Thread.sleep(2000);

driver.manage().window().maximize();
Thread.sleep(2000);
//driver.manage().window().minimize();
//Thread.sleep(2000);
//Nevigation Method

    driver.get("https://www.scrum.org/resources/scrum-guide");
    Thread.sleep(2000);
driver.navigate().to("https://www.instagram.com/accounts/login/?hl=en");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	//	driver.close();
		
		
		
		
		
}
	}