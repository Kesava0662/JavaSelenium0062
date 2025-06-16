package stepdefinitions;
    
import io.cucumber.java.en.*;
import workflows.SeleniumWorkFlow;
import common.*;

  @SuppressWarnings("all")
  public class Page3StepDefinition
	 {
      SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
      
             @Then("^verify text Intinite scroll_tb in alerts register$")			
            public void thenVerifyTextIntiniteScrolltbInAlertsRegister()
            {
                Assertion.isTrue(workFlow.verifyTextInTextBox(2, "Page 3", "Page 3.Intinitescroll_tbTextBoxXPATH", "XPATH"), "Then verify text Intinite scroll_tb in alerts register");
        WebBrowserUtil.captureScreenshot();
                
            }
             @Then("^verify text Infinite scroll button in alerts register$")			
            public void thenVerifyTextInfiniteScrollButtonInAlertsRegister()
            {
                Assertion.isTrue(workFlow.verifyTextInLink(2, "Page 3", "Page 3.InfinitescrollbuttonButtonXPATH", "XPATH"), "Then verify text Infinite scroll button in alerts register");
        WebBrowserUtil.captureScreenshot();
                
            }
    }