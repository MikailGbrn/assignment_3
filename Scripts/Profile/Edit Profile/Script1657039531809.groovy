import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver

Mobile.startExistingApplication(GlobalVariable.appId)

driver = MobileDriverFactory.getDriver()

Mobile.tap(findTestObject('Profile/btn_profile'), 0)

Mobile.tap(findTestObject('Profile/edit_button'), 0)

Mobile.tap(findTestObject('Object Repository/Profile/Layout_name'), 0)

Mobile.clearText(findTestObject('Object Repository/Profile/edit_text_name'), 0)

Mobile.setText(findTestObject('Object Repository/Profile/edit_text_name'), name, 0)

Mobile.tap(findTestObject('Object Repository/Profile/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Profile/email_layout'), 0)

Mobile.clearText(findTestObject('Profile/edit_text_mail'), 0)

Mobile.setText(findTestObject('Profile/edit_text_mail'), email, 0)

Mobile.tap(findTestObject('Object Repository/Profile/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Profile/phone_layout'), 0)

Mobile.clearText(findTestObject('Object Repository/Profile/edit_text_name'), 0)

Mobile.setText(findTestObject('Object Repository/Profile/edit_text_name'), phone, 0)

Mobile.tap(findTestObject('Object Repository/Profile/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Profile/address_layout'), 0)

Mobile.clearText(findTestObject('Object Repository/Profile/edit_text_name'), 0)

Mobile.setText(findTestObject('Object Repository/Profile/edit_text_name'), address, 0)

Mobile.tap(findTestObject('Object Repository/Profile/android.widget.Button - OK'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Profile/textview_name'), name)

driver.terminateApp(GlobalVariable.appId)

