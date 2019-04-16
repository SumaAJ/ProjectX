package getAllDetails_IE_HomePage

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory

public class Match_Reconcile_Detail {

	WebDriver driver=DriverFactory.getWebDriver();


	@Keyword
	def getHeaderDetailsOfMatchAndReconcile() {
		try{
			List<WebElement> elements=driver.findElements(By.xpath("//div[@class='sqf-col-xs-12 sqf-control-group-v sqw8_tm']"));
			for(def ele:elements) {
				println ("List of header button:"+ele.getText())
			}
		}
		catch(Exception e) {
			e.printStackTrace()
			println "unable to get the header details in Match & Reconcile"
		}
	}



	@Keyword
	def getDetailsOfMatchAndReconcile(String TaponElement) {
		try{
			List<WebElement> elements=driver.findElements(By.xpath("(//ul[@class='rtsUL'])[2]/li"));
			for(def ele:elements) {
				println ("List of Tab displayed with following text:"+ele.getText())
				if((ele.getText()).equals(TaponElement)) {
					ele.click();
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace()
			println "unable to get the details of Match & Reconcile"
		}
	}


	@Keyword
	def getlistofReconHeader() {
		try{
			List<WebElement> elements=driver.findElements(By.xpath("//div[@class='sqw8_align_child']"));
			for(def ele:elements) {
				println ("List of recon header button:"+ele.getText())
			}
		}
		catch(Exception e) {
			e.printStackTrace()
			println "unable to get the recon header details in Match & Reconcile"
		}
	}








	@Keyword
	def getDetailsofReconHeader() {
		try{
			List<WebElement> elements=driver.findElements(By.xpath("(//table[@class='rgMasterTable'])[1]//th"));
			for(def ele:elements) {
				println ("List of Recon header :"+ele.getText())
			}
		}
		catch(Exception e) {
			e.printStackTrace()
			println "unable to find the details of recon header"
		}
	}

	@Keyword
	def getDetailsofReceiverHeader() {
		try{
			def xpath="(//table[@class='rgMasterTable'])[2]//th";
			List<WebElement> elements=driver.findElements(By.xpath(xpath));
			for(def ele:elements) {
				println ("List of Receiver header :"+ele.getText())
			}
		}
		catch(Exception e) {
			e.printStackTrace()
			println "unable to get the details of receiver header"
		}
	}


	/*@Keyword
	 def getDetailsofReconAndReceiverHeader() {
	 def xpath="(//table[@class='rgMasterTable'])[2]//th";
	 for(def i=1;i<=2;i++) {
	 List<WebElement> elements=driver.findElements(By.xpath("(//table[@class='rgMasterTable'])['"+i+"']//th"));
	 for(def ele:elements) {
	 println ("List of header :"+ele.getText())
	 }
	 }
	 }*/
}
