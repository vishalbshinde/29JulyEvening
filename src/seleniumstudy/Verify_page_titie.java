package seleniumstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_page_titie {

	public static void main(String[] args) throws InterruptedException
	{
		String expectedResult = "Velocity | Best Software Training Center";
		
WebDriver driver = new ChromeDriver();
driver.get("https://vctcpune.com/");

Thread.sleep(2000);

String actualresult = driver.getTitle();

if(expectedResult.equals(actualresult))
{
	System.out.println("titel is matching and TC is passed");
}
else {
	System.out.println("titel is not matching and TC is failed");
	
}

	}

}
