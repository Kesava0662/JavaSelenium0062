package stepdefinitions;
    
import io.cucumber.java.en.*;
import workflows.SeleniumWorkFlow;
import common.*;

  @SuppressWarnings("all")
  public class FormAuthenticationStepDefinition
	 {
      SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
      
            @When("^I close tab close page in form authentication$")			
            public void whenICloseTabClosePageInFormAuthentication()
            {
                workFlow.closeTab(0, "Form Authentication", "Form Authentication.closepagePageXPATH", "XPATH");
                
            }
             @Then("^'(.*)' is displayed with '(.*)'$")			
            public void thenpageIsDisplayedWithcontent(String  varpage, String varcontent)
            {
                Assertion.isTrue(workFlow.verifyDefaultpageIsdisplayed(varpage), "Then '<page>' is displayed with '<content>'");
                Assertion.isTrue(workFlow.verifymessageIsDisplayed(varcontent), "");
                
            }
    }