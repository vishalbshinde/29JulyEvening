package TestNG_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTestClass {
  
//use  invocationCount key word
	@Test(invocationCount = 5)
  public void validateEmailId()
  {
	  Reporter.log("validate EmailId done ", true);
	  
  }
  //Use priority key word
	@Test(priority = -1)
  public void validatePasward()
  {
	 Reporter.log("validate Pasward done", true); 
  }
  
}
