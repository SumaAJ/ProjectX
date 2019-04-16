import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'getAllDetails_IE_HomePage.CommonTestcaseToOpenBrowser.lunchApplication'()

WebUI.waitForElementPresent(findTestObject('IE_Home_Page/HOT_Operation'), GlobalVariable.Timeout)

WebUI.click(findTestObject('IE_Home_Page/HOT_Operation'))

WebUI.waitForElementPresent(findTestObject('IE_Home_Page/TaskList'), GlobalVariable.Timeout)

WebUI.click(findTestObject('IE_Home_Page/TaskList'))

WebUI.waitForElementVisible(findTestObject('IE_HOME_HandlingDynamic_CaseID/TaskDueDate_Filter'), GlobalVariable.Timeout)

WebUI.click(findTestObject('IE_HOME_HandlingDynamic_CaseID/TaskDueDate_Filter'))

//WebUI.waitForElementPresent(findTestObject('IE_HOME_HandlingDynamic_CaseID/clear_Button'), 3)
//WebUI.click(findTestObject('IE_HOME_HandlingDynamic_CaseID/clear_Button'))
//WebUI.waitForElementPresent(findTestObject('IE_HOME_HandlingDynamic_CaseID/TaskDueDate_Filter'), 3)
//WebUI.click(findTestObject('IE_HOME_HandlingDynamic_CaseID/TaskDueDate_Filter'))
WebUI.waitForElementVisible(findTestObject('IE_HOME_HandlingDynamic_CaseID/AdvanceLink'), GlobalVariable.Timeout)

WebUI.click(findTestObject('IE_HOME_HandlingDynamic_CaseID/AdvanceLink'))

WebUI.delay(3)

CustomKeywords.'handlingDynamicCaseID_IE_HomePage.getDynamicDueDateofInvoice.getInvoicedueDate'()

WebUI.delay(2)

try {
	WebUI.click(findTestObject('IE_HOME_HandlingDynamic_CaseID/AdvanceLink'))
	
	WebUI.delay(3)
	
}
finally { 
}

