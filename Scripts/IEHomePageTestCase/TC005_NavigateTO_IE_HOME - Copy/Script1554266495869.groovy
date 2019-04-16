import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WebUI.callTestCase(findTestCase('CommonTestCase/TC001_OpenBrowserForStore'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('IE_Home_Page/HOT_Operation'), GlobalVariable.Timeout)

WebUI.click(findTestObject('IE_Home_Page/HOT_Operation'))

WebUI.waitForElementPresent(findTestObject('IE_Home_Page/TaskList'), GlobalVariable.Timeout)

WebUI.click(findTestObject('IE_Home_Page/TaskList'))

WebUI.scrollToElement(findTestObject('IE_Home_Page/CaseID'), 5)

String caseID = WebUI.getText(findTestObject('IE_Home_Page/CaseID'))

CustomKeywords.'getAllDetails_IE_HomePage.PrintStatement.getTextofElement'(caseID)

WebUI.waitForElementPresent(findTestObject('IE_Home_Page/Open'), GlobalVariable.Timeout)

WebUI.click(findTestObject('IE_Home_Page/Open'))

WebUI.switchToWindowIndex(1)

WebUI.verifyElementPresent(findTestObject('IE_Home_Page/IE_HomePage_Text'), GlobalVariable.Timeout)

def textOFWalmart = WebUI.getText(findTestObject('IE_Home_Page/IE_HomePage_Text'))

CustomKeywords.'getAllDetails_IE_HomePage.PrintStatement.getTextofElement'(textOFWalmart)

println('element')

