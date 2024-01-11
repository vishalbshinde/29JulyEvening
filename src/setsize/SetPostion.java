package setsize;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPostion {

	public static void main(String[] args) throws InterruptedException  
	{
	WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/search?q=nokari.com+login&rlz=1C1UEAD_enIN1071IN1071&oq=&gs_lcrp=EgZjaHJvbWUqBggBEEUYOzIGCAAQRRg5MgYIARBFGDsyEAgCEC4YxwEYsQMY0QMYgAQyCggDEAAYsQMYgAQyCggEEAAYsQMYgAQyBggFEEUYPDIGCAYQRRg9MgYIBxBFGDzSAQg1MzU3ajBqN6gCALACAA&sourceid=chrome&ie=UTF-8");
Thread.sleep(1000);
Point defaultposition = driver.manage().window().getPosition();
System.out.println(defaultposition);
Point p = new Point(100, 50);
Thread.sleep(2000);

driver.manage().window().setPosition(defaultposition);


	}

}
