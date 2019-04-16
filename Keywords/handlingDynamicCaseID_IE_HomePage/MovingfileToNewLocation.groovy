package handlingDynamicCaseID_IE_HomePage
import java.nio.file.Path

import com.google.common.io.Files
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.util.KeywordUtil

public class CaseID_GetCurrentDate {

	KeywordLogger log=new KeywordLogger();
	@Keyword
	def getFile() {

		File oldfile=new File("Downloads\\CAT.xlsx");
		if(oldfile.exists()){
			File newfile=new File("C:\\Users\\vn50b7u\\Katalon Studio\\Demo\\Data Files\\Team Leader1.xlsx");
			if(!newfile.exists()) {
				Files.copy(oldfile.toPath(), newfile.toPath());
				KeywordUtil.logInfo( "File is successfully moved")
				//oldfile.renameTo(newfile);
			}

			else{
				newfile.delete();
				Files.copy(oldfile.toPath(), newfile.toPath());
				log.logInfo("Deleted the old file and moved new file")
			}
		}
	}
}
















