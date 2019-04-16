package handlingDynamicCaseID_IE_HomePage
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory

public class ListOfCaseIDDetails_IE_HOME {
	WebDriver driver=DriverFactory.getWebDriver();
	WebDriverWait wait


	@Keyword
	def getListOfCaseID() {
		try{

			wait=new WebDriverWait(driver, 10)
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='k-grid-content k-auto-scrollable']//tr)//td[4]/span")))
			List<WebElement> caseIDs=driver.findElements(By.xpath("(//div[@class='k-grid-content k-auto-scrollable']//tr)//td[4]/span"));
			for(def caseID:caseIDs) {
				println ("List of caseID:"+caseID.getText())
			}
		}
		catch(Exception e) {
			e.printStackTrace()
			println "unable to get the list of caseID"
		}
	}

	//String pageNo="//li[@class='k-current-page']/span"
	//String nextbutton="//span[@class='k-icon k-i-arrow-60-right']"

	@Keyword
	def verifyCaseIDPresent(){
	}
}
