package seleniumstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettiteluse {

	private static final String Titel = null;

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		 
		String Title = driver.getTitle();
		System.out.println("Titel is"+Titel);
		
		
	}

}
