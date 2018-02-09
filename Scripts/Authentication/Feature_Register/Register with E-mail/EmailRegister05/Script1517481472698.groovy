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

'รอ Navbar hamburger'
Mobile.waitForElementPresent(findTestObject('HOME_PAGE/gotoNavbar'), 0)

Mobile.tap(findTestObject('HOME_PAGE/gotoNavbar'), 0)

'รอ Navbar Login'
Mobile.waitForElementPresent(findTestObject('INSIDE_NAVBAR/navbarLogin'), 0)

Mobile.tap(findTestObject('INSIDE_NAVBAR/navbarLogin'), 0)

'รอข้อความ Register'
Mobile.waitForElementPresent(findTestObject('LOGINPAGE/txt/txt Register'), 0)

Mobile.tap(findTestObject('LOGINPAGE/txt/txt Register'), 0)

'รอรูป\r\n'
Mobile.waitForElementPresent(findTestObject('REGISTERPAGE/Add Profile Image'), 0)

Mobile.scrollToText('Next', FailureHandling.STOP_ON_FAILURE)

'ติ้กถูก agreement'
Mobile.waitForElementPresent(findTestObject('REGISTERPAGE/checkbox/checkbox Agreement'), 0)

Mobile.tap(findTestObject('REGISTERPAGE/checkbox/checkbox Agreement'), 0)

'submit'
Mobile.waitForElementPresent(findTestObject('REGISTERPAGE/btn/btn Next'), 0)

Mobile.tap(findTestObject('REGISTERPAGE/btn/btn Next'), 0)

'req img'
Mobile.scrollToText(GlobalVariable.REQ_IMAGE, FailureHandling.STOP_ON_FAILURE)

'req img'
Mobile.scrollToText(GlobalVariable.REQ_NAME, FailureHandling.STOP_ON_FAILURE)

'req email'
Mobile.scrollToText(GlobalVariable.REQ_EMAIL, FailureHandling.STOP_ON_FAILURE)

'req pass'
Mobile.scrollToText(GlobalVariable.REQ_PASS, FailureHandling.STOP_ON_FAILURE)

'req repass'
Mobile.scrollToText(GlobalVariable.REQ_REPASS, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

