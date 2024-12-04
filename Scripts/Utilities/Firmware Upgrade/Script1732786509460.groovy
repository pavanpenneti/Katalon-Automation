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
import com.kms.katalon.core.util.KeywordUtil
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication('com.cms.amplifier')
Mobile.delay(15)
Mobile.tap(findTestObject('Object Repository/Utilities/Firmware Upgrade/android.widget.Button - Connect'), 0)
Mobile.delay(15)
Mobile.tap(findTestObject('Object Repository/Utilities/Firmware Upgrade/android.widget.Button - Login'), 0)
Mobile.delay(15)
Mobile.tap(findTestObject('Object Repository/Utilities/Firmware Upgrade/android.widget.Button - BLE180.210001'), 0)
Mobile.delay(5)
Mobile.tap(findTestObject('Object Repository/Utilities/Firmware Upgrade/android.widget.Button - Main Menu'), 0)
Mobile.delay(5)
Mobile.tap(findTestObject('Object Repository/Utilities/Firmware Upgrade/android.widget.Button - Utilities'), 0)
Mobile.delay(5)
Mobile.tap(findTestObject('Object Repository/Utilities/Firmware Upgrade/android.widget.Button - Firmware Upgrade'), 0)
Mobile.delay(5)
// Define an array of firmware files
def firmwareFiles = [
	"MB_BLE180_4.22.dfu",
	"MB_BLE180_4.26.dfu",
	"MB_BLE180_4.25.dfu",
	
]

// Loop through each firmware file
firmwareFiles.each { firmwareFile ->
	// Tap on the 'Browse' button
	Mobile.tap(findTestObject('Object Repository/Utilities/Firmware Upgrade/android.widget.Button - Browse'), 0)
	Mobile.delay(5)
	
	// Select the firmware file
	Mobile.tap(findTestObject("Object Repository/Utilities/Firmware Upgrade/android.widget.TextView - ${firmwareFile}"), 0)
	Mobile.delay(5)
	
	// Tap on the 'Upgrade' button
	Mobile.tap(findTestObject('Object Repository/Utilities/Firmware Upgrade/android.widget.Button - Upgrade'), 0)
	Mobile.delay(5)
	
	// Confirm the upgrade
	Mobile.tap(findTestObject('Object Repository/Utilities/Firmware Upgrade/android.widget.Button - Yes'), 0)
	Mobile.delay(200)
}


Mobile.closeApplication()

