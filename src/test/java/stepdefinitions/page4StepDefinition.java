package stepdefinitions;
    
import io.cucumber.java.en.*;
import workflows.SeleniumWorkFlow;
import common.*;

  @SuppressWarnings("all")
  public class page4StepDefinition
	 {
      SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
      
             @Then("^verify text Infinite scroll link in alerts register$")			
            public void thenVerifyTextInfiniteScrollLinkInAlertsRegister()
            {
                Assertion.isTrue(workFlow.verifyTextInLink(3, "page 4", "page 4.InfinitescrolllinkLinkXPATH", "XPATH"), "Then verify text Infinite scroll link in alerts register");
        WebBrowserUtil.captureScreenshot();
                
            }
             @Then("^verify text Infinite scroll label in alerts register$")			
            public void thenVerifyTextInfiniteScrollLabelInAlertsRegister()
            {
                Assertion.isTrue(workFlow.verifyTextInLink(3, "page 4", "page 4.InfinitescrolllabelLabelXPATH", "XPATH"), "Then verify text Infinite scroll label in alerts register");
        WebBrowserUtil.captureScreenshot();
                
            }
    }