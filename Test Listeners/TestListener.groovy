import org.testng.IInvokedMethod
import org.testng.IInvokedMethodListener
import org.testng.ISuite
import org.testng.ISuiteListener
import org.testng.ITestContext
import org.testng.ITestListener
import org.testng.ITestNGMethod
import org.testng.ITestResult
import org.testng.Reporter

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

class Listener implements ITestListener,ISuiteListener, IInvokedMethodListener{
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */
	@BeforeTestCase
	def sampleBeforeTestCase(TestCaseContext testCaseContext) {
		println testCaseContext.getTestCaseId()
		println testCaseContext.getTestCaseVariables()
	}

	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
	@AfterTestCase
	def sampleAfterTestCase(TestCaseContext testCaseContext) {
		println testCaseContext.getTestCaseId()
		println testCaseContext.getTestCaseStatus()
		//WebUI.closeBrowser()
	}

	/**
	 * Executes before every test suite starts.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	@BeforeTestSuite
	def sampleBeforeTestSuite(TestSuiteContext testSuiteContext) {
		println testSuiteContext.getTestSuiteId()
	}

	/**
	 * Executes after every test suite ends.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	@AfterTestSuite
	def sampleAfterTestSuite(TestSuiteContext testSuiteContext) {
		println testSuiteContext.getTestSuiteId()
	}

	//Belong to ISuiteListener 
	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		Reporter.log("About to end executing Test :"+arg0.getName(), true)
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		Reporter.log("About to begin executing Test :"+arg0.getName(), true)
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		printTestResults(arg0)
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		println "Test execution of main test start now"
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		printTestResults(arg0)
	}
	
	
	
	private void printTestResults(ITestResult result) {
		
		Reporter.log("Test Method resides in " + result.getTestClass().getName(), true);
		
		if (result.getParameters().length != 0) {
		
		String params = null;
		
		for (Object parameter : result.getParameters()) {
		
		params += parameter.toString() + ",";
		
		}
		
		Reporter.log("Test Method had the following parameters : " + params, true);
		
		}
		
		String status = null;
		
		switch (result.getStatus()) {
		
		case ITestResult.SUCCESS:
		
		status = "Pass";
		
		break;
		
		case ITestResult.FAILURE:
		
		status = "Failed";
		
		break;
		
		case ITestResult.SKIP:
		
		status = "Skipped";
		
		}
		
		Reporter.log("Test Status: " + status, true);
		
		}

	@Override
	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub
		String textMsg = "Completed executing following method : " + returnMethodName(arg0.getTestMethod());
		
		Reporter.log(textMsg, true);
	}

	@Override
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub
		String textMsg = "About to begin executing following method : " + returnMethodName(arg0.getTestMethod());
		
		Reporter.log(textMsg, true);
	}

	@Override
	public void onFinish(ISuite arg0) {
		// TODO Auto-generated method stub
		Reporter.log("About to end executing suite :"+arg0.getName(), true)
	}

	@Override
	public void onStart(ISuite arg0) {
		// TODO Auto-generated method stub
		Reporter.log("About to begin executing suite :"+arg0.getName(), true)
	}
	
	private String returnMethodName(ITestNGMethod method) {
		
		return method.getRealClass().getSimpleName() + "." + method.getMethodName();
		
		}
}