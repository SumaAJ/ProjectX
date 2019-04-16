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

WebUI.callTestCase(findTestCase('IEHomePageTestCase/TC003_ValidateSwitchBetweenTabOnIEHOME'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('IE_Home_MatchAndReconcile_Page/SearchForReceiver'), GlobalVariable.Timeout_MinDelay)

WebUI.click(findTestObject('IE_Home_MatchAndReconcile_Page/SearchForReceiver'))

WebUI.delay(GlobalVariable.Timeout_MinDelay)

int indexOfRecommended = WebUI.getWindowIndex(FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'getAllDetails_IE_HomePage.PrintStatement.getTextofElement'(indexOfRecommended.toString())

String titleOfRecommended = WebUI.getWindowTitle()

CustomKeywords.'getAllDetails_IE_HomePage.PrintStatement.getTextofElement'(titleOfRecommended)

WebUI.delay(GlobalVariable.Timeout_MinDelay)

WebUI.switchToFrame(findTestObject('SearchForReceiver_Page/SearchforReceiver_Frame'), GlobalVariable.Timeout_MinDelay)

WebUI.waitForElementPresent(findTestObject('SearchForReceiver_Page/Missing_UPC'), GlobalVariable.Timeout_MinDelay)

WebUI.click(findTestObject('SearchForReceiver_Page/Missing_UPC'))

WebUI.delay(GlobalVariable.Timeout_MinDelay)

WebUI.switchToDefaultContent()

WebUI.waitForElementVisible(findTestObject('SearchForReceiver_Page/Close_Button'), GlobalVariable.Timeout)

WebUI.click(findTestObject('SearchForReceiver_Page/Close_Button'))

