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

Mobile.startExistingApplication('com.socialnmobile.dictapps.notepad.color.note')

Mobile.tap(findTestObject('Create Note/android.widget.TextView - My first note'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Note/android.widget.ImageButton (5)'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Note/android.widget.TextView - Delete'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Note/android.widget.Button - OK (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Note/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Note/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Create Note/android.widget.TextView - My first note'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Note/android.widget.ImageButton (6)'), 0)

Mobile.tap(findTestObject('Edit Note/android.widget.Button - OK'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('Create Note/android.widget.TextView - My first note'), 0)

Mobile.closeApplication()

