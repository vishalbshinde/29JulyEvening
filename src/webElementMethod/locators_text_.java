package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators_text_ {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		Thread.sleep(1000);
		//boolean s = driver.findElement(By.xpath("//input[@value='2']")).isSelected();
	//	System.out.println(s);
		WebElement maleGender = driver.findElement(By.xpath("//input[@value='2']"));
		boolean s = maleGender.isSelected();
		System.out.println("gender is"+s);
		maleGender.click();
		boolean s1 = maleGender.isSelected();
		System.out.println("gender status"+s1);

	}

}
