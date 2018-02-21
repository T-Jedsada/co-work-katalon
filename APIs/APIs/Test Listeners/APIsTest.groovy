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

class APIsTest {
	
	private RequestObject api = findTestObject('Object Repository/Register')
	
	private void postAPI(){
		if(true){
			def response = WS.sendRequest(api)
			WS.verifyResponseStatusCode(response, 200)
		}
	}
	
	public static String generateString() {
		String uuid = UUID.randomUUID().toString();
		return uuid;
	}
	

	
	def sampleBeforeTestCase() {
		api.setHttpBody('{"display_name": "test register","email": "'+generateString()+'@golfja.com","password": "123456","password_confirmation": "123456","g_recaptcha_response": "LUoOhpwUbIe5sfgwsotJ2nDXx99jvflG","newsletter": 1,"profile_image": "url","lang": "en"}')
		postAPI()
	}
	
}