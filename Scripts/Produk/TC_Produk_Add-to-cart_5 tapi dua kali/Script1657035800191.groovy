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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

Mobile.startExistingApplication(GlobalVariable.appId, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Produk/Pilih Produk'), 0)

Mobile.tap(findTestObject('Produk/android.widget.Button - ADD TO CART'), 0)

Mobile.setText(findTestObject('Produk/android.widget.EditText'), setText5, 0)

Mobile.tap(findTestObject('Produk/android.widget.Button - ADD'), 0)

AppiumDriver<?> driver = MobileDriverFactory.getDriver()

def toast = driver.findElementByXPath('//android.widget.Toast[@text=\'Success add Product to cart\']')

println('Toast element: ' + toast)

if (toast == null) {
    KeywordUtil.markFailed('ERROR: Toast object not found!')
}

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Produk/android.widget.Button - ADD TO CART'), 0)

Mobile.setText(findTestObject('Produk/android.widget.EditText'), setText5, 0)

Mobile.tap(findTestObject('Produk/android.widget.Button - ADD'), 0)

AppiumDriver<?> driver2 = MobileDriverFactory.getDriver()

def toast2 = driver2.findElementByXPath('//android.widget.Toast[@text=\'Stock is not enough\']')

println('Toast element: ' + toast)

if (toast2 == null) {
    KeywordUtil.markFailed('ERROR: Toast object not found!')
}

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

