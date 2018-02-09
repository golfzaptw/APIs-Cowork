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

Mobile.waitForElementPresent(findTestObject('HOME_PAGE/gotoNavbar'), 0)

Mobile.tap(findTestObject('HOME_PAGE/gotoNavbar'), 0)

Mobile.waitForElementPresent(findTestObject('INSIDE_NAVBAR/navbarLogin'), 0)

Mobile.tap(findTestObject('INSIDE_NAVBAR/navbarLogin'), 0)

Mobile.waitForElementPresent(findTestObject('LOGINPAGE/edt/edt Email Address'), 0)

Mobile.setText(findTestObject('LOGINPAGE/edt/edt Email Address'), 'psgolf11@gmail.com', 0)

Mobile.waitForElementPresent(findTestObject('LOGINPAGE/edt/edt Password'), 0)

Mobile.setText(findTestObject('LOGINPAGE/edt/edt Password'), '123123', 0)

Mobile.waitForElementPresent(findTestObject('LOGINPAGE/btn/btn Log In'), 0)

Mobile.tap(findTestObject('LOGINPAGE/btn/btn Log In'), 0)

Mobile.waitForElementPresent(findTestObject('HOME_PAGE/gotoNavbar'), 0)

Mobile.tap(findTestObject('HOME_PAGE/gotoNavbar'), 0)

Mobile.scrollToText('Golfza Ptw', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

