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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver

Mobile.startExistingApplication(GlobalVariable.appId, FailureHandling.STOP_ON_FAILURE)

driver = MobileDriverFactory.getDriver()

Mobile.tap(findTestObject('Produk/Pilih Produk'), 0)

Mobile.tap(findTestObject('Produk/android.widget.Button - ADD TO CART'), 0)

Mobile.setText(findTestObject('Produk/android.widget.EditText'), '1', 0)

Mobile.tap(findTestObject('Produk/android.widget.Button - ADD'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Cart/cart_button'), 0)

Mobile.verifyElementExist(findTestObject('Cart/item_cart'), 0)

Mobile.tap(findTestObject('Cart/item_cart'), 0)

Mobile.waitForElementPresent(findTestObject('Cart/txt_confirmation_cart'), 0)

Mobile.tap(findTestObject('Cart/btn_yes_clear_cart'), 40)

Mobile.verifyElementExist(findTestObject('Cart/txt_whoops_cart_is_empty'), 40)

driver.terminateApp(GlobalVariable.appId)

