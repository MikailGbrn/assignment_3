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

Mobile.startExistingApplication(GlobalVariable.appId, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Produk/Pilih Produk'), 0)

Mobile.tap(findTestObject('Produk/android.widget.Button - ADD TO CART'), 0)

Mobile.setText(findTestObject('Produk/android.widget.EditText'), '1', 0)

Mobile.tap(findTestObject('Produk/android.widget.Button - ADD'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Cart/cart_button'), 0)

Mobile.tap(findTestObject('Cart/android.widget.Button - CHECKOUT'), 0)

Mobile.tap(findTestObject('Cart/dropdown_shipping'), 0)

Mobile.tap(findTestObject('Cart/Pilihan_ups'), 0)

Mobile.tap(findTestObject('Cart/android.widget.EditText - Comment'), 0)

Mobile.setText(findTestObject('Cart/android.widget.EditText - Comment'), '21938019283091283098', 0)

Mobile.tap(findTestObject('Cart/android.widget.Button - PROCESS CHECKOUT'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Cart/txt_process_checkout'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Cart/android.widget.Button - YES'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Cart/android.widget.TextView - Congratulation'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Cart/android.widget.Button - OK'), 0, FailureHandling.STOP_ON_FAILURE)

driver.terminateApp(GlobalVariable.appId)

