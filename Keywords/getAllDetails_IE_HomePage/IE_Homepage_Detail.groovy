package getAllDetails_IE_HomePage

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory

public class IE_Homepage_Detail {

	WebDriver driver=DriverFactory.getWebDriver();
	@Keyword
	def getDetails() {
		try{
			WebElement elements=driver.findElement(By.xpath("//div[@id='Div_ShowHide']"));
			println ("List of show more details is displayed with text: "+elements.getText())
		}
		catch(Exception e) {
			e.printStackTrace()
			println "unable to get the details of show more details"
		}
	}

	@Keyword
	def getDetailofHistory() {
		try{
			List<WebElement> elements=driver.findElements(By.xpath("//table[@class='rgMasterTable']//tbody/tr/td"));
			for(def ele:elements) {
				println ("List of History details :"+ele.getText())
			}
		}
		catch(Exception e) {
			e.printStackTrace()
			println "unable to find the details of history"
		}
	}

	@Keyword
	def verifySwitchTabonIEHOME(String TaponElement) {
		try{
			List<WebElement> elements=driver.findElements(By.xpath("//ul[@class='rtsUL']/li/span"));
			for(def ele:elements) {
				println ("Header of the IE Home page:"+ele.getText())
				if((ele.getText()).equals(TaponElement)) {
					ele.click();
				}
			}
		}

		catch(Exception e) {
			e.printStackTrace()
			println "unable to switch between tabs"
		}
	}
}





