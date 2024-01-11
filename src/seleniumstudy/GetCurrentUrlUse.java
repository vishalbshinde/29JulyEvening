package seleniumstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlUse {

	

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/watch?v=I39-EP9Kzuo/");
		Thread.sleep(2000);
		
	     String url =driver.getCurrentUrl();
	     System.out.println("url is-->"+url);
	}

}

