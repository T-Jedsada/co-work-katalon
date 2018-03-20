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

class APIsLogin {
	
	private RequestObject emailLogin = findTestObject('Object Repository/Login/emailLogin')
	private RequestObject facebookLogin = findTestObject('Object Repository/Login/facebookLogin')
	private RequestObject adminLogin = findTestObject('Object Repository/Login/adminLogin')
	private String facebook_id = "364537690693538"
	
	def response
	

	private void postAPIEmailLogin(){
		if(true){
			response = WS.sendRequest(emailLogin)
			WS.verifyResponseStatusCode(response, 200)
		}
	}
	
	private void postAPIFacebookLogin(){
		if(true){
			response = WS.sendRequest(facebookLogin)
			WS.verifyResponseStatusCode(response, 200)
		}
	}
	
	private void postAPIAdminLogin(){
		if(true){
			response = WS.sendRequest(adminLogin)
			WS.verifyResponseStatusCode(response, 200)
		}
	}
	

	def setHttpBodyEmailTrue() {
		String messageJSON = 	'{\
								"email" : "psgolf16@gmail.com",\
								"password" : "123123"\
								}'
		emailLogin.setHttpBody(messageJSON)
		postAPIEmailLogin()
	}
	
	def setHttpBodyFacebookFalse() {
		String messageJSON = 	'{\
								"facebook_id" : "sdsds"\
								}'
		facebookLogin.setHttpBody(messageJSON)
		postAPIFacebookLogin()
	}
	
	def setHttpBodyFacebookSuccess() {
		String messageJSON = 	'{\
								"facebook_id" : "'+facebook_id+'"\
								}'
		facebookLogin.setHttpBody(messageJSON)
		postAPIFacebookLogin()
	}
	
	def setHttpBodyAdminSuccess() {
		String messageJSON = 	'{\
								"email" : "admin@admin.admin",\
								"password" : "123456"\
								}'
		adminLogin.setHttpBody(messageJSON)
		postAPIAdminLogin()
	}
	
}