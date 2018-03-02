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

Mobile.waitForElementPresent(findTestObject('Register/txt/txt Dont have account'), 0)

Mobile.tap(findTestObject('Register/txt/txt Dont have account'), 0)

Mobile.waitForElementPresent(findTestObject('Register/edt/edt Name'), 0)

Mobile.setText(findTestObject('Register/edt/edt Name'), GlobalVariable.NAME_RGT, 0)

Mobile.waitForElementPresent(findTestObject('Register/edt/edt E-mail'), 0)

Mobile.setText(findTestObject('Register/edt/edt E-mail'), 'patawee', 0)

Mobile.waitForElementPresent(findTestObject('Register/edt/edt Pass'), 0)

Mobile.setText(findTestObject('Register/edt/edt Pass'), GlobalVariable.PASS_RGT, 0)

Mobile.waitForElementPresent(findTestObject('Register/edt/edt RePass'), 0)

Mobile.setText(findTestObject('Register/edt/edt RePass'), GlobalVariable.PASS_RGT, 0)

Mobile.waitForElementPresent(findTestObject('Register/img/img Profile'), 0)

Mobile.tap(findTestObject('Register/img/img Profile'), 0)

Mobile.waitForElementPresent(findTestObject('Register/img/img In Select img'), 0)

Mobile.tap(findTestObject('Register/img/img In Select img'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Register/img/img In Select img'), 0)

Mobile.tap(findTestObject('Register/img/img In Select img'), 0)

Mobile.scrollToText('Facebook', FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Register/btn/btn Register Submit'), 0)

Mobile.tap(findTestObject('Register/btn/btn Register Submit'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Register/edt/edt E-mail'), 0)

Mobile.setText(findTestObject('Register/edt/edt E-mail'), GlobalVariable.EMAIL_RGT, 0)

Mobile.closeApplication()

