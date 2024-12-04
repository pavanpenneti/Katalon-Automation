import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.model.FailureHandling

Mobile.startExistingApplication('com.cms.amplifier')
Mobile.delay(15)
Mobile.tap(findTestObject('Object Repository/Health Status/Status/android.widget.Button - Connect'), 0)
Mobile.delay(15)
Mobile.tap(findTestObject('Object Repository/Health Status/Status/android.widget.Button - Login'), 0)
Mobile.delay(8)
Mobile.tap(findTestObject('Object Repository/Health Status/Status/android.widget.Button - BLE180.210001'), 0)
Mobile.delay(2)
Mobile.tap(findTestObject('Object Repository/Health Status/Status/android.widget.Button - Main Menu'), 0)
Mobile.delay(2)
Mobile.tap(findTestObject('Object Repository/Health Status/Status/android.widget.Button - Health Status'), 0)
Mobile.delay(2)
for (int x = 3; x < 10; x++) {
    String toggle_XPATH = ('//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.GridView[1]/android.view.View[' + 
    x) + ']/android.view.View[4]/android.widget.ToggleButton[1]/android.widget.ToggleButton[1]'
    TestObject toggleButton = new TestObject('dynamicToggleButton')
    toggleButton.addProperty('xpath', ConditionType.EQUALS, toggle_XPATH)
    try {
        Mobile.tap(toggleButton, 10)
        println('Tapped on Toggle Button at index: ' + x)
        Mobile.delay(5)
    }
    catch (Exception e) {
        println('Failed to interact with Toggle Button at index: ' + x)
    } 
}
Mobile.delay(8)
String dots3_XPATH = '//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.GridView[1]/android.view.View[3]/android.view.View[7]/android.view.View[1]'
TestObject dots3 = new TestObject('dynamicDots3')
dots3.addProperty('xpath', ConditionType.EQUALS, dots3_XPATH)
Mobile.tap(dots3, 3)
Mobile.delay(5)


def setRandomValue(Map input) {
    TestObject testObject = new TestObject("dynamicTextField")
    testObject.addProperty("xpath", ConditionType.EQUALS, input.xpath)
    Random random = new Random()
    int randomValue = random.nextInt(input.max - input.min + 1) + input.min  // Generate random number between min and max
    Mobile.setText(testObject, randomValue.toString(), 0)
    println("Set value: " + randomValue + " for XPath: " + input.xpath)
}

def createDynamicTestObject(String xpath) {
	TestObject dynamicObject = new TestObject("dynamicButton")
	dynamicObject.addProperty("xpath", ConditionType.EQUALS, xpath)
	return dynamicObject
}

// Define inputs with unique ranges
def inputs = [
    [xpath: "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.EditText[1]", min: 85, max: 103],
    [xpath: "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.widget.EditText[1]", min: 40, max: 45],
    [xpath: "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[4]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.widget.EditText[1]", min: 70, max: 85],
    [xpath: "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[4]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.widget.EditText[1]", min: 45, max: 55]
]
String set1_XPATH = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.widget.Button[1]"
String set2_XPATH = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[4]/android.view.View[2]/android.view.View[1]/android.widget.Button[1]"

TestObject set1Button = createDynamicTestObject(set1_XPATH)
TestObject set2Button = createDynamicTestObject(set2_XPATH)

setRandomValue(inputs[0])
setRandomValue(inputs[1])
Mobile.tap(set1Button, 0)
Mobile.delay(5)
setRandomValue(inputs[2])
setRandomValue(inputs[3])
Mobile.tap(set2Button, 0)
Mobile.delay(15)


Mobile.closeApplication()

