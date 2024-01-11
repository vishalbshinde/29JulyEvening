package TestNG_Study;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_Study {
  @Test
  public void ValidatePin() 
  {
	  Reporter.log("Pin Validation done", true);
  }
  @Test
  private void ValidateUserId() 
  {
	Reporter.log("UserId Validation done", true);
}
  @BeforeMethod
  public void EnterUserIdAndPasward() 
  {
	  Reporter.log("UserIdPaswardEntered Done---->@BeforeMethod", true);
  }

  @AfterMethod
  public void logout()
  {
	  Reporter.log("logout done", true);
  }
  @BeforeClass
  public void BrowserLaunch() 
  {
	  Reporter.log("Launch Browser-->@BeforeClass used", true);
  }
  @AfterClass
  public void CloseBrowser()
  {
	  Reporter.log("Closed Browser----> @AfterClass used", true);
  }
  
}
