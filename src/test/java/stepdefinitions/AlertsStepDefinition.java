package stepdefinitions;
    
import io.cucumber.java.en.*;
import workflows.SeleniumWorkFlow;
import common.*;

  @SuppressWarnings("all")
  public class AlertsStepDefinition
	 {
      SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
      
            @When("^I scroll and enter text Confirm password_tb in alerts register as '(.*)'$")			
            public void whenIScrollEnterTextConfirmPasswordtbInAlertsRegisterAsconfirmPasswordtb1(String  varconfirmPasswordtb1)
            {
                workFlow.scrollAndEnterText(varconfirmPasswordtb1, 0, "Alerts", "Alerts.Confirmpassword_tbTextBoxXPATH", "XPATH");
                
            }
             @Then("^verify placeholder first name_ta in alerts register as '(.*)'$")			
            public void thenVerifyPlaceholderFirstNametaInAlertsRegisterAsfirstNameta2(String  varfirstNameta2)
            {
                Assertion.isTrue(workFlow.verifyPlaceholder(varfirstNameta2, 0, "Alerts", "Alerts.firstname_taTextAreaXPATH", "XPATH"), "Then verify placeholder first name_ta in alerts register as '<first name_ta2>'");
      WebBrowserUtil.captureScreenshot();
                
            }
            @When("^I take screenshot tb test in alerts register as '(.*)'$")			
            public void whenITakeScreenshotTbTestInAlertsRegisterAstbTest3(String  vartbTest3)
            {
                workFlow.takeScreenshot(vartbTest3, 0, "Alerts", "Alerts.tbtestTextBoxXPATH", "XPATH");
                
            }
             @Then("^verify placeholder first name_tb in alerts register as '(.*)'$")			
            public void thenVerifyPlaceholderFirstNametbInAlertsRegisterAsfirstNametb4(String  varfirstNametb4)
            {
                Assertion.isTrue(workFlow.verifyPlaceholder(varfirstNametb4, 0, "Alerts", "Alerts.firstname_tbTextBoxXPATH", "XPATH"), "Then verify placeholder first name_tb in alerts register as '<first name_tb4>'");
      WebBrowserUtil.captureScreenshot();
                
            }
            @When("^I scroll and enter text first name_ta in alerts register as '(.*)'$")			
            public void whenIScrollEnterTextFirstNametaInAlertsRegisterAsfirstNameta5(String  varfirstNameta5)
            {
                workFlow.scrollAndEnterText(varfirstNameta5, 0, "Alerts", "Alerts.firstname_taTextAreaXPATH", "XPATH");
                
            }
            @When("^I scroll and clear enter text Confirm password_tb in alerts register as '(.*)'$")			
            public void whenIScrollClearEnterTextConfirmPasswordtbInAlertsRegisterAsconfirmPasswordtb6(String  varconfirmPasswordtb6)
            {
                workFlow.scrollAndClearEnterText(varconfirmPasswordtb6, 0, "Alerts", "Alerts.Confirmpassword_tbTextBoxXPATH", "XPATH");
                
            }
            @When("^I scroll and clear enter text first name_ta in alerts register as '(.*)'$")			
            public void whenIScrollClearEnterTextFirstNametaInAlertsRegisterAsfirstNameta7(String  varfirstNameta7)
            {
                workFlow.scrollAndClearEnterText(varfirstNameta7, 0, "Alerts", "Alerts.firstname_taTextAreaXPATH", "XPATH");
                
            }
            @When("^I scroll and click language button in alerts register$")			
            public void whenIScrollClickLanguageButtonInAlertsRegister()
            {
                workFlow.scrollAndClick(0, "Alerts", "Alerts.languagebuttonButtonXPATH", "XPATH");
                
            }
            @When("^I scroll and click last name_RB in alerts register$")			
            public void whenIScrollClickLastNamerbInAlertsRegister()
            {
                workFlow.scrollAndClick(0, "Alerts", "Alerts.lastname_RBRadioButtonXPATH", "XPATH");
                
            }
            @When("^I scroll and click refresh link in alerts register$")			
            public void whenIScrollClickRefreshLinkInAlertsRegister()
            {
                workFlow.scrollAndClick(0, "Alerts", "Alerts.refreshlinkLinkXPATH", "XPATH");
                
            }
            @When("^I scroll and click Address img in alerts register$")			
            public void whenIScrollClickAddressImgInAlertsRegister()
            {
                workFlow.scrollAndClick(0, "Alerts", "Alerts.AddressimgImageXPATH", "XPATH");
                
            }
            @When("^I scroll and click countries label in alerts register$")			
            public void whenIScrollClickCountriesLabelInAlertsRegister()
            {
                workFlow.scrollAndClick(0, "Alerts", "Alerts.countrieslabelLabelXPATH", "XPATH");
                
            }
            @When("^I scroll wait and click Address img in alerts register$")			
            public void whenIScrollWaitClickAddressImgInAlertsRegister()
            {
                workFlow.scrollWaitAndClick(0, "Alerts", "Alerts.AddressimgImageXPATH", "XPATH");
                
            }
            @When("^I scroll wait and click refresh link in alerts register$")			
            public void whenIScrollWaitClickRefreshLinkInAlertsRegister()
            {
                workFlow.scrollWaitAndClick(0, "Alerts", "Alerts.refreshlinkLinkXPATH", "XPATH");
                
            }
            @When("^I scroll wait and click language button in alerts register$")			
            public void whenIScrollWaitClickLanguageButtonInAlertsRegister()
            {
                workFlow.scrollWaitAndClick(0, "Alerts", "Alerts.languagebuttonButtonXPATH", "XPATH");
                
            }
            @When("^I scroll to the element Confirm password_tb in alerts register as '(.*)'$")			
            public void whenIScrollToTheElementConfirmPasswordtbInAlertsRegisterAsconfirmPasswordtb8(String  varconfirmPasswordtb8)
            {
                workFlow.scrollToTheElement(varconfirmPasswordtb8, 0, "Alerts", "Alerts.Confirmpassword_tbTextBoxXPATH", "XPATH");
                
            }
            @When("^I open new tab and navigate Opn nw tab and nav_tb in alerts register as '(.*)'$")			
            public void whenIOpenNewTabNavigateOpnNwTabAndNavtbInAlertsRegisterAsopnNwTabAndNavtb(String  varopnNwTabAndNavtb)
            {
                workFlow.openNewTabAndNavigate(varopnNwTabAndNavtb, 0, "Alerts", "Alerts.Opnnwtabandnav_tbTextBoxXPATH", "XPATH");
                
            }
            @When("^I open new tab and navigate Opn nw tab and nav_pg in alerts register as '(.*)'$")			
            public void whenIOpenNewTabNavigateOpnNwTabAndNavpgInAlertsRegisterAshttpstheinternetherokuappcominfinitescroll(String  varhttpstheinternetherokuappcominfinitescroll)
            {
                workFlow.openNewTabAndNavigate(varhttpstheinternetherokuappcominfinitescroll, 0, "Alerts", "Alerts.Opnnwtabandnav_pgPageXPATH", "XPATH");
                
            }
            @When("^I open new tab and navigate Opn nw tab and nav_nt in alerts register as '(.*)'$")			
            public void whenIOpenNewTabNavigateOpnNwTabAndNavntInAlertsRegisterAsopnNwTabAndNavnt(String  varopnNwTabAndNavnt)
            {
                workFlow.openNewTabAndNavigate(varopnNwTabAndNavnt, 0, "Alerts", "Alerts.Opnnwtabandnav_ntNewTabXPATH", "XPATH");
                
            }
            @When("^I open new browser browser_tb in alerts register as '(.*)'$")			
            public void whenIOpenNewBrowserBrowsertbInAlertsRegisterAsbrowsertb(String  varbrowsertb)
            {
                workFlow.openNewBrowser(varbrowsertb, 0, "Alerts", "Alerts.browser_tbTextBoxXPATH", "XPATH");
                
            }
            @When("^I open new browser browser_pg in alerts register as '(.*)'$")			
            public void whenIOpenNewBrowserBrowserpgInAlertsRegisterAshttpstheinternetherokuappcominfinitescroll(String  varhttpstheinternetherokuappcominfinitescroll)
            {
                workFlow.openNewBrowser(varhttpstheinternetherokuappcominfinitescroll, 0, "Alerts", "Alerts.browser_pgPageXPATH", "XPATH");
                
            }
    }