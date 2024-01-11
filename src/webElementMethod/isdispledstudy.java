package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdispledstudy {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	Thread.sleep(2000);
	//driver.findElement(By.id("hide-textbox")).click();
	//Thread.sleep(2000);
	boolean result = driver.findElement(By.name("show-hide")).isDisplayed();
	System.out.println("displayed status is"+result);
	Thread.sleep(2000);
	driver.findElement(By.name("show-hide")).sendKeys("Good Morning");

	}

}
