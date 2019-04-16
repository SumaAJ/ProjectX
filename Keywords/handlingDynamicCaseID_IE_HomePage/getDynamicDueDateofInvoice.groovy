package handlingDynamicCaseID_IE_HomePage

import org.openqa.selenium.By
import org.openqa.selenium.support.ui.ExpectedConditions
import com.kms.katalon.core.webui.driver.DriverFactory
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Date
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.WebDriverWait
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class getDynamicDueDateofInvoice {

	WebDriver driver=DriverFactory.getWebDriver();
	WebDriverWait wait;

	@Keyword
	def getCurrentDate() {

		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

		Date date = new Date();

		String date1= dateFormat.format(date);

		println("Current date and time is " +date1);

		return date1;
	}

	@Keyword
	def getInvoicedueDate() {
		String todayDate=getCurrentDate();
		println todayDate

		wait=new WebDriverWait(driver, 10)
		WebElement ANDCheckbox=driver.findElement(By.xpath("//input[@id='TaskDueDateandLogic']"));
		if(ANDCheckbox.isSelected()) {
			WebElement	dropdown=driver.findElement(By.xpath("(//span[@class='k-select'])[2]"));
			dropdown.click();

			List<WebElement> list=driver.findElements(By.xpath("//ul[@id='kendo-operations_listbox']//li"));
			for(def element:list) {
				println element.getText();
				if(element.getText().equalsIgnoreCase("Before")) {
					element.click();
					WebUI.delay(3);
					//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@role='combobox'])[1]")))
					driver.findElement(By.xpath("(//span[@role='button'])[1]")).click();
					driver.findElement(By.xpath("//a[@class='k-link k-nav-today']")).click();

					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Filter']")))
					driver.findElement(By.xpath("//button[text()='Filter']")).click();
					break;
				}
			}
		}
		else{

			ANDCheckbox.click();
		}
	}
}
