package workflows;
import common.*;
import java.util.stream.Collectors;
import java.util.*;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import java.text.SimpleDateFormat;
import java.io.BufferedWriter;
import java.text.DateFormat;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.http.Headers;
import io.restassured.specification.RequestSpecification;
import java.io.File;
import org.openqa.selenium.interactions.Actions;
import java.nio.file.Path;
import org.openqa.selenium.Keys;
import java.nio.file.Paths;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.Assert;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogEntries;
import java.io.IOException;
import java.awt.Color;
import io.percy.selenium.Percy;
import java.io.ByteArrayInputStream;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
    
@SuppressWarnings("all")
public class SeleniumWorkFlow
{
  public static WebDriver browser;
	private static Percy percy;
	private static String percyFlag = CommonUtil.getXMLData(Constants.APPLICATION_SETTING_PATH, "Percy");
	private static String language = CommonUtil.getXMLData(Constants.APPLICATION_SETTING_PATH, "Language");
	private static String yes = "Yes";
	static final Logger log = Logger.getLogger(SeleniumWorkFlow.class);

 		 
  public void accessToPage()
  {
    WebBrowser.LaunchApplication(true);
    log.info("Method accessToPage completed.");
  }
  public void scrollAndCheck(int index,String page,String xpathKey, String identifier)
  {
    try
    {
      WebBrowser.setCurrentBrowser(index);
      browser=WebBrowser.getBrowser();
      WebBrowserUtil.attachPage(page);
      String xpath=YMLUtil.getYMLObjectRepositoryData(xpathKey);
      WebBrowserUtil.scrollAndCheck(WebBrowserUtil.findElement(xpath,identifier));
    }
    catch(Exception e)
    {
      throw new CustomException(e.getMessage(), e);
    }
  }
  public void scrollAndUncheck(int index,String page,String xpathKey, String identifier)
  {
    try
    {
      WebBrowser.setCurrentBrowser(index);
      browser=WebBrowser.getBrowser();
      WebBrowserUtil.attachPage(page);
      String xpath=YMLUtil.getYMLObjectRepositoryData(xpathKey);
      WebBrowserUtil.scrollAndUncheck(WebBrowserUtil.findElement(xpath,identifier));
    }
    catch(Exception e)
    {
      throw new CustomException(e.getMessage(), e);
    }
  }
  public void scrollAndEnterText(String param,int index,String page,String xpathKey, String identifier)
  {
    try
    {
      WebBrowser.setCurrentBrowser(index);
      browser=WebBrowser.getBrowser();
      WebBrowserUtil.attachPage(page);
      param = CommonUtil.getData(param);
      param = param.replace("_space_"," ");
      String xpath=YMLUtil.getYMLObjectRepositoryData(xpathKey);
      WebBrowserUtil.scrollAndEnterText(WebBrowserUtil.findElement(xpath,identifier),param);
    }
    catch(Exception e)
    {
      throw new CustomException(e.getMessage(), e);
    }
  }
  public boolean verifyPlaceholder(String param,int index,String page,String xpathKey, String identifier)
  {
    param=CommonUtil.getData(param);
    String placeholdervalue = "";
    boolean isVerified=false;
    WebBrowser.setCurrentBrowser(index);
    browser=WebBrowser.getBrowser();
    try
    {
      WebBrowserUtil.attachPage(page);
      String xpath=YMLUtil.getYMLObjectRepositoryData(xpathKey);
      placeholdervalue = WebBrowserUtil.findElement(xpath,identifier).getAttribute("placeholder");
      if(placeholdervalue.contains(param))
      {
        isVerified= true;
      }
      else
      {
        isVerified= false;
      }
    }
    catch (Exception ex)
    {
      System.out.println("No data found");
    }
    ExtentCucumberAdapter.addTestStepLog("Actual value: "+placeholdervalue+", Expected value: "+param);
    log.info("Method verifyPlaceholder completed.");
    return isVerified;
  }
  public void takeScreenshot(String param,int index,String page,String xpathKey, String identifier)
  {
    param=CommonUtil.getData(param);
    if(param.contains(","))
    {
      String[] content =param.split(",");
      WebDriver browser1;
      int setbrowser=Integer.parseInt(content[1]);
      WebBrowser.setCurrentBrowser(setbrowser);
      browser1=WebBrowser.getBrowser();
      try{
        //Allure.addAttachment(content[0], new ByteArrayInputStream(((TakesScreenshot)browser1).getScreenshotAs(OutputType.BYTES)));
        WebBrowserUtil.captureScreenshot();
      }
      catch(Exception ex)
      {
      ExtentCucumberAdapter.addTestStepLog("Error : "+ex);
      }
    }
    else {
      WebBrowser.setCurrentBrowser(index);
      browser=WebBrowser.getBrowser();
      WebBrowserUtil.attachPage(page);
      browser=WebBrowser.getBrowser();
      try{
      WebBrowserUtil.captureScreenshot();
      log.info("Method takeScreenshot completed.");
      }
      catch(Exception ex)
      {
        log.error("Method takeScreenshot not completed."+ex);
        ExtentCucumberAdapter.addTestStepLog("Error : "+ex);
      }
    }
  }
  public void scrollAndClearEnterText(String param,int index,String page,String xpathKey, String identifier)
  {
    try
    {
      WebBrowser.setCurrentBrowser(index);
      browser=WebBrowser.getBrowser();
      WebBrowserUtil.attachPage(page);
      param = CommonUtil.getData(param);
      param = param.replace("_space_"," ");
      String xpath=YMLUtil.getYMLObjectRepositoryData(xpathKey);
      WebBrowserUtil.scrollAndClearEnterText(WebBrowserUtil.findElement(xpath,identifier),param);
    }
    catch(Exception e)
    {
      throw new CustomException(e.getMessage(), e);
    }
  }
  public void scrollAndClick(int index,String page,String xpathKey, String identifier)
  {
    try
    {
      WebBrowser.setCurrentBrowser(index);
      browser=WebBrowser.getBrowser();
      WebBrowserUtil.attachPage(page);
      String xpath=YMLUtil.getYMLObjectRepositoryData(xpathKey);
      WebBrowserUtil.scrollAndClickUsingJS(xpath,identifier);
    }
    catch(Exception e)
    {
      throw new CustomException(e.getMessage(), e);
    }
  }
  public void scrollWaitAndClick(int index,String page,String xpathKey, String identifier)
  {
    try
    {
      WebBrowser.setCurrentBrowser(index);
      browser=WebBrowser.getBrowser();
      WebBrowserUtil.attachPage(page);
      WebBrowserUtil.scrollAndWait();
      String xpath=YMLUtil.getYMLObjectRepositoryData(xpathKey);
      WebBrowserUtil.scrollAndClickUsingJS(WebBrowserUtil.findElement(xpath,identifier));
    }
    catch(Exception e)
    {
      throw new CustomException(e.getMessage(), e);
    }
  }
  public void scrollToTheElement(String param, int index,String page,String xpathKey, String identifier)
  {
    try
    {
      WebBrowser.setCurrentBrowser(index);
      browser=WebBrowser.getBrowser();
      WebBrowserUtil.attachPage(page);
      param=CommonUtil.getData(param);
      String xpath=YMLUtil.getYMLObjectRepositoryData(xpathKey);
      WebBrowserUtil.scrollToTheElement(Integer.parseInt(param),WebBrowserUtil.findElement(xpath,identifier));
    }
    catch(Exception e)
    {
      throw new CustomException(e.getMessage(), e);
    }
  }
  public void openNewTabAndNavigate(String param,int index,String page,String xpathKey, String identifier)
  {
    param = CommonUtil.getData(param);
    WebBrowser.openNewTab(true,param);
    WebBrowser.setCurrentBrowser(1);
    log.info("Method OpenNewTabAndNavigate completed.");
  }
  public void openNewBrowser(String param,int index,String page,String xpathKey, String identifier)
  {
    param = CommonUtil.getData(param);
    WebBrowser.LaunchNewInstance(true,param);
    WebBrowser.setCurrentBrowser(1);
    log.info("Method openNewBrowser completed.");
  }
  public void scrollDown(String param,int index,String page,String xpathKey, String identifier)
  {
    try
    {
      WebBrowser.setCurrentBrowser(index);
      browser=WebBrowser.getBrowser();
      WebBrowserUtil.attachPage(page);
      param = CommonUtil.getData(param);
      WebBrowserUtil.scrollDown(param);
      log.info(xpathKey + identifier);
    }
    catch(Exception e)
    {
      throw new CustomException(e.getMessage(), e);
    }
  }
  public boolean verifyTextInTextBox(int index,String page,String xpathKey, String identifier)
  {
    WebBrowser.setCurrentBrowser(index);
    browser=WebBrowser.getBrowser();
    WebBrowserUtil.attachPage(page);
    boolean isVerified = false;
    try
    {
      WebBrowserUtil.turnOffImplicitWaits();
      String xpath=YMLUtil.getYMLObjectRepositoryData(xpathKey);
      WebElement element = WebBrowserUtil.findElement(xpath,identifier);
      String textboxValue = element.getAttribute("value");
      if (textboxValue == null || textboxValue.isEmpty()) {
          textboxValue = element.getAttribute("placeholder"); // Fallback to placeholder
      }
      if (textboxValue == null || textboxValue.isEmpty()) {
          textboxValue = element.getAttribute("data-value"); // Fallback to custom attributes
      }
      if (textboxValue == null || textboxValue.isEmpty()) {
          textboxValue = element.getText();
      }
      isVerified = (textboxValue != null && !textboxValue.isEmpty());
    }
    catch(Exception ex)
    {
      isVerified = false;
    }
    WebBrowserUtil.turnOnImplicitWaits();
    return isVerified;
  }
  public boolean verifyTextInLink(int index,String page,String xpathKey, String identifier)
  {
    WebBrowser.setCurrentBrowser(index);
    browser=WebBrowser.getBrowser();
    WebBrowserUtil.attachPage(page);
    boolean staleElement = false;
    try {
      String xpath=YMLUtil.getYMLObjectRepositoryData(xpathKey);
      WebElement element = WebBrowserUtil.findElement(xpath,identifier);
      staleElement = WebBrowserUtil.verifyLabelDisplayed(element);
      ExtentCucumberAdapter.addTestStepLog(element.getText() + " is Dispalyed");
    }  catch(Exception ex) {
      staleElement = false;
    }
    return staleElement;
  }
  public void closeTab(int index,String page,String xpathKey, String identifier)
  {
    //Sleep is required here so that previous action(example clicking on cart icon/Wishilist etc..) will be completed before closing the tab.
    try {
      Thread.sleep(5000);
    }
    catch (InterruptedException e) {}
    WebBrowser.closetab(index);
  }
  public boolean verifyDefaultpageIsdisplayed(String defaultpage)
  {
    boolean isVerified = false;
    for (int i = 0; i <= 2; i++)
    {
      WebBrowser.setCurrentBrowser(0);
      browser=WebBrowser.getBrowser();
      try{
        browser = WebBrowserUtil.attachPage(defaultpage);
      }
      catch(Exception ex){
      log.error(ex.getMessage());
      }
      if (defaultpage != null && !defaultpage.isEmpty()  && !defaultpage.toUpperCase().equals("NA".toUpperCase()) && !defaultpage.toUpperCase().equals("Page1".toUpperCase()) && !defaultpage.toUpperCase().equals("Page2".toUpperCase()) && !defaultpage.toUpperCase().equals("Page3".toUpperCase())&& !defaultpage.toUpperCase().equals("Page4".toUpperCase()))
      {
        isVerified = browser.getTitle().toUpperCase().contains(defaultpage.toUpperCase());
      }
      else
      {
        isVerified = true;
      }
      if (isVerified)
      {
        break;
      }
    }
      try
      {
        ExtentCucumberAdapter.addTestStepLog("Actual Page Name: "+browser.getTitle()+", Expected Page Name: "+defaultpage);
        log.info("Method VerifyDefaultpageIsdisplayed completed.");
      }
      catch(Exception e)
      {
        log.error("Method VerifyDefaultpageIsdisplayed not completed."+e);
      }
    return isVerified;
  }
  public boolean verifymessageIsDisplayed(String message)
  {
   boolean isVerified = false;
		String[] messages;
		String[] messages1;
		List<String> boolvalues = new ArrayList<>();

		if (message.contains("verifyalert_")) {
			String[] msgs = message.split("_");
			return WebBrowserUtil.verifyAlertText(msgs[1]);
		}

		if ((message.contains("frameid_")) && (message.contains("&or&"))) {
			String[] msgs = message.split("_");
			StringBuilder frameID = new StringBuilder();

			for (int i = 0; i < msgs.length - 1; i++) {
				if (i != 0) {
					frameID.append(msgs[i]).append("_");
				}
			}
			String frameIDStr = frameID.toString().replaceAll("_$", "");
			WebBrowserUtil.getFrame(frameIDStr);

			String[] multiplemessages = msgs[msgs.length - 1].split("&or&");
			for (String multiplemessage : multiplemessages) {
				if (WebBrowserUtil.isElementPresent(multiplemessage)) {
					isVerified = true;
				}
			}
			return isVerified;
		}

		if (message.contains("frameid_")) {
			String[] msgs = message.split("_");
			StringBuilder frameID = new StringBuilder();

			for (int i = 0; i < msgs.length - 1; i++) {
				if (i != 0) {
					frameID.append(msgs[i]).append("_");
				}
			}
			String frameIDStr = frameID.toString().replaceAll("_$", "");
			WebBrowserUtil.getFrame(frameIDStr);

			isVerified = WebBrowserUtil.isElementPresent(msgs[msgs.length - 1]);
			return isVerified;
		}

		if (message.contains(")_or_(")) {
			messages = message.split(")_or_(");
			for (String msg : messages) {
				if (msg.equalsIgnoreCase("NA")) {
					return true;
				}
				messages1 = msg.split("_and_");
				boolvalues.clear();

				for (String msg1 : messages1) {
					String messagetocheck = msg1.replace("(", "").replace(")", "");
					isVerified = WebBrowserUtil.isElementPresent(messagetocheck);
					if (isVerified) {
						boolvalues.add(Boolean.toString(isVerified));
					}
				}

				if (messages1.length == boolvalues.size()) {
					Assert.assertTrue(isVerified);
					return isVerified;
				}
			}
			return isVerified;
		}

		if (message.contains("_and_")) {
			messages = message.split("_and_");
			for (String msg : messages) {
				isVerified = WebBrowserUtil.isElementPresent(msg);
				if (!isVerified) {
					return false;
				}
			}
			return true;
		}

		if (message.contains("_or_")) {
			messages = message.split("_or_");
			for (String msg : messages) {
				if (msg.equals("NA")) {
					Assert.assertTrue(isVerified);
					return true;
				}
				isVerified = WebBrowserUtil.isElementPresent(msg);
				if (isVerified) {
					Assert.assertTrue(isVerified);
					return true;
				}
			}
			return false;
		}

		if (!message.equals("NA")) {
			for (int i = 0; i <= 2; i++) {
				isVerified = WebBrowserUtil.isElementPresent(message);
				String content = WebBrowserUtil.getContent(message);
				if (isVerified) {
					Assert.assertTrue(isVerified);
					if (content != null && !content.isEmpty()) {
						ExtentCucumberAdapter
								.addTestStepLog("Actual content: " + content + ", Expected content: " + message);
						log.info("Method verifymessageIsDisplayed completed.");
					}
					return true;
				}
			}
			return false;
		}
		return true;
  }
		 
    }