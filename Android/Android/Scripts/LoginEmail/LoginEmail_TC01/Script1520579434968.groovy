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

Mobile.startApplication(GlobalVariable.APK_URL, true)

Mobile.waitForElementPresent(findTestObject('go to login page'), 0)

Mobile.tap(findTestObject('go to login page'), 0)

Mobile.waitForElementPresent(findTestObject('Login/edt E-mail'), 0)

Mobile.setText(findTestObject('Login/edt E-mail'), GlobalVariable.EMAIL_RGT, 0)

Mobile.waitForElementPresent(findTestObject('Login/edt pass'), 0)

Mobile.setText(findTestObject('Login/edt pass'), GlobalVariable.PASS_RGT, 0)

Mobile.waitForElementPresent(findTestObject('Login/btn Log in'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Login/btn Log in'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('go to login page'), 0)

Mobile.tap(findTestObject('go to login page'), 0)

Mobile.closeApplication()

