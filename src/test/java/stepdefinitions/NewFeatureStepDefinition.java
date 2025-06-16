package stepdefinitions;
    
import io.cucumber.java.en.*;
import workflows.SeleniumWorkFlow;
import common.*;

  @SuppressWarnings("all")
  public class NewFeatureStepDefinition
	 {
      SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
      
            @When("^I scroll and check Hockey_CB in alerts register$")			
            public void whenIScrollCheckHockeycbInAlertsRegister()
            {
                workFlow.scrollAndCheck(0, "New Feature", "New Feature.Hockey_CBCheckBoxXPATH", "XPATH");
                
            }
            @When("^I scroll and uncheck Hockey_CB in alerts register$")			
            public void whenIScrollUncheckHockeycbInAlertsRegister()
            {
                workFlow.scrollAndUncheck(0, "New Feature", "New Feature.Hockey_CBCheckBoxXPATH", "XPATH");
                
            }
    }