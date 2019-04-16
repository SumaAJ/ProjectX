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

WebUI.waitForElementPresent(findTestObject('IE_Home_MatchAndReconcile_Page/HeaderOfMatchAndReconcile'), GlobalVariable.Timeout)

String elements = WebUI.getText(findTestObject('IE_Home_MatchAndReconcile_Page/HeaderOfMatchAndReconcile'))

CustomKeywords.'getAllDetails_IE_HomePage.PrintStatement.getTextofElement'(elements)

WebUI.delay(GlobalVariable.Timeout_MinDelay)

CustomKeywords.'getAllDetails_IE_HomePage.Match_Reconcile_Detail.getHeaderDetailsOfMatchAndReconcile'()

CustomKeywords.'getAllDetails_IE_HomePage.Match_Reconcile_Detail.getlistofReconHeader'()

CustomKeywords.'getAllDetails_IE_HomePage.Match_Reconcile_Detail.getDetailsofReconHeader'()

WebUI.delay(GlobalVariable.Timeout_MinDelay)

CustomKeywords.'getAllDetails_IE_HomePage.Match_Reconcile_Detail.getDetailsofReceiverHeader'()

