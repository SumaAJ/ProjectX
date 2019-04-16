package detailsOfCommunication

import org.openqa.selenium.WebDriver

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.TestObjectXpath
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class CommunicationPage {


	WebDriver driver=DriverFactory.getWebDriver();

	@Keyword
	def clickOnCommunicationTab() {
		try{
			TestObject	myTestObject=new TestObject()
			myTestObject.addProperty("xpath", ConditionType.EQUALS, "//span[text()='Communications']")
			String communication=WebUI.getText(myTestObject);
			println ("text: "+communication);
			WebUI.click(myTestObject);
		}
		catch(Exception e) {
			e.printStackTrace()
			println "unable to click on communication tab"
		}
	}
}
