import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

class Slack {
	
	private RequestObject slackMessage = findTestObject('Object Repository/APIs/Slack')
	private String testCaseStatus = "ERROR"
	private String testCaseName = ""
	private String testSuiteName = ""
	private String testSuiteStatus = "PASSED"
	
	private void postToSlack() {
		if (true) {
			WS.sendRequest(slackMessage)
		}
	}
	
//	@BeforeTestCase
//	def notifyBeforeTestCase(TestCaseContext testCaseContext) {
//
//		slackMessage.setHttpBody('{"text": "Test APIs : ' + testCaseContext.getTestCaseId()+ ': Running"}"')
//		postToSlack()
//
//	}
	
	@AfterTestCase
	def notifyAfterTestCase(TestCaseContext testCaseContext) {

		testCaseStatus = testCaseContext.getTestCaseStatus()
		testCaseName = testCaseContext.getTestCaseId()
		def value = testCaseName.split('/')
		def result = value[value.size()-1]
		//Map variables = testCaseContext.getTestCaseVariables()
//		slackMessage.setHttpBody('{"text": "Test APIs : ' + testCaseContext.getTestCaseId() + ': ' + testCaseStatus + '"}"')
//		postToSlack()
		if (!testCaseStatus.equals("PASSED")){
			testSuiteStatus = "FAILED"
		} 
		if(testCaseStatus.equals("ERROR")){
			slackMessage.setHttpBody('{"text": "Test APIs : ' + result + ': ' + testCaseStatus + '"}"')
			postToSlack()
		}
	}

//	@BeforeTestSuite
//	def notifyBeforeTestSuite(TestSuiteContext testSuiteContext) {
//
//		testSuiteName = testSuiteContext.getTestSuiteId()
//		def value = testSuiteName.split('/')
//		def result = value[value.size()-1]
//		slackMessage.setHttpBody('{"text": TestSuite APIs : "' + result + ': Started"}"')
//		postToSlack()
//		
//	}
//
//	@AfterTestSuite
//	def notifyAfterTestSuite(TestSuiteContext testSuiteContext) {
//		testSuiteName = testSuiteContext.getTestSuiteId()
//		def value = testSuiteName.split('/')
//		def result = value[value.size()-1]
//		slackMessage.setHttpBody('{"text": TestSuite APIs : "' + result + ': ' + testSuiteStatus + '"}"')
//		postToSlack()
//	}
 }