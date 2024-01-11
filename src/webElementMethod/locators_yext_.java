package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators_yext_ {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vishal22.shinde@.com");
driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("7387132618");
driver.findElement(By.xpath("//button[text()='Log in']")).click();

Thread.sleep(2000);
	}

}
