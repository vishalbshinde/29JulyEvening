package webElementMethod;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsStudy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
driver.get("https://www.youtube.com/");

Thread.sleep(2000);

driver.manage().window().maximize();
Thread.sleep(2000);

driver.findElement(By.xpath("//img[@id='img']")).click();
Thread.sleep(2000);


	}

}
