import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication(GlobalVariable.APK_URL, false)

Mobile.waitForElementPresent(findTestObject('Register/btn/btnRegister'), 0)

Mobile.tap(findTestObject('Register/btn/btnRegister'), 0)

Mobile.waitForElementPresent(findTestObject('Register/edt/edtName'), 0)

Mobile.setText(findTestObject('Register/edt/edtName'), GlobalVariable.NAME_RGT, 0)

Mobile.waitForElementPresent(findTestObject('Register/edt/edtEmail'), 0)

Mobile.setText(findTestObject('Register/edt/edtEmail'), 'patawee', 0)

Mobile.waitForElementPresent(findTestObject('Register/edt/edtPassword'), 0)

Mobile.setText(findTestObject('Register/edt/edtPassword'), GlobalVariable.PASS_RGT, 0)

Mobile.waitForElementPresent(findTestObject('Register/btn/btnSubmit'), 0)

Mobile.waitForElementPresent(findTestObject('Register/btn/btnFacebookRegister'), 0)

Mobile.tap(findTestObject('Register/btn/btnSubmit'), 0)

Mobile.scrollToText('', FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

