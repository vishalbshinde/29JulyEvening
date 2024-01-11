package TestNG_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample2 {
  @Test
  public void Display1() 
  {
	  Reporter.log("Hi good morning", true);
  }
}
