import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
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

WebUI.callTestCase(findTestCase('IEHomePageTestCase/TC005_NavigateTO_IE_HOME - Copy'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('IE_Home_ShowMoreDetail_Page/ShowMoreDetails'), GlobalVariable.Timeout)

WebUI.click(findTestObject('IE_Home_ShowMoreDetail_Page/ShowMoreDetails'))

CustomKeywords.'getAllDetails_IE_HomePage.IE_Homepage_Detail.getDetails'()

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('IE_Home_ShowMoreDetail_Page/ShowLessDetail'), GlobalVariable.Timeout)

String textOfShowlessDetail=WebUI.getText(findTestObject('IE_Home_ShowMoreDetail_Page/ShowLessDetail'))

CustomKeywords.'getAllDetails_IE_HomePage.PrintStatement.getTextofElement'(textOfShowlessDetail)

