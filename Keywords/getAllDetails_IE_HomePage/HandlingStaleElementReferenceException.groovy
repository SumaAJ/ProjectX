package getAllDetails_IE_HomePage



import org.openqa.selenium.By
import org.openqa.selenium.StaleElementReferenceException
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory

public class HandlingStaleElementReferenceException {

	@Keyword
	def clickOnOpenLink(){
		WebDriver driver = DriverFactory.getWebDriver();

		while(true){
			try {
				WebElement openLink=driver.findElement(By.xpath("//span[@class='k-grid-menu-button-title']"))
				//WebElement openLink=driver.findElement(By.xpath("(//span[text()='1634']/preceding::td)[3]"))
				Actions action = new Actions(driver);
				action.moveToElement(openLink).click().perform();
				break;
			} catch (StaleElementReferenceException e) {
				//e.printStackTrace()
			}
		}
	}
}
