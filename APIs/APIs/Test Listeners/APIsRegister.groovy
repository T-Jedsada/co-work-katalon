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
import java.util.UUID;

import org.junit.After

class APIsRegister {
	
	private RequestObject apiProvider = findTestObject('Object Repository/Register/registerProvider')
	private RequestObject apiUser = findTestObject('Object Repository/Register/registerUser')
	
	def response
	
	private void postAPIProvider(){
		if(true){
			response = WS.sendRequest(apiProvider)
			WS.verifyResponseStatusCode(response, 200)
		}
	}
	
	private void postAPIUser(){
		if(true){
			response = WS.sendRequest(apiUser)
			WS.verifyResponseStatusCode(response, 200)
		}
	}
	

	def setHttpBodyProvider() {
		String messageJSON = 	'{\
								 "name":"Test Automated Provider",\
								 "email":"'+generateString()+'@golfja.com",\
								 "password":"provider_password",\
								 "phone":"080-12345678",\
								 "contact": "123 m.2 pangtest merng chiangmail 54000",\
								 "image": "url_image.image"\
								}'	
		apiProvider.setHttpBody(messageJSON)
		postAPIProvider()
	}
	
	def setHttpBodyUser() {
		String messageJSON = 	'{\
								 "name":"Test Automated User",\
								 "email":"'+generateString()+'@golfja.com",\
								 "password":"user_password",\
								 "image": "url_image.image"\
								}'
		apiUser.setHttpBody(messageJSON)
		postAPIUser()
	}
	
	protected String generateString() {
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 8) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;

	}
	
	
}