package stepdefinitions;
    
import io.cucumber.java.en.*;
import workflows.SeleniumWorkFlow;
import common.*;

  @SuppressWarnings("all")
  public class Page2StepDefinition
	 {
      SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
      
            @When("^I scroll down ui element_scroll in alerts register as '(.*)'$")			
            public void whenIScrollDownUiElementscrollInAlertsRegisterAs5(String  var5)
            {
                workFlow.scrollDown(var5, 1, "Page 2", "Page 2.uielement_scrollScrollXPATH", "XPATH");
                
            }
            @When("^I scroll down ui element_tb in alerts register as '(.*)'$")			
            public void whenIScrollDownUiElementtbInAlertsRegisterAsuiElementtb(String  varuiElementtb)
            {
                workFlow.scrollDown(varuiElementtb, 1, "Page 2", "Page 2.uielement_tbTextBoxXPATH", "XPATH");
                
            }
    }