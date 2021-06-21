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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.goibibo.com/')

WebUI.verifyElementPresent(findTestObject('Page_Goibibo/span_Flights_header-sprite logo'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Goibibo/a_Flights'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Goibibo/a_Bus'), 0)

WebUI.setText(findTestObject('Page_Flight Tickets, Flights Booking at Low_71ea7c/input_Multicity_gosuggest_inputDest'), 
    'beng')

WebUI.click(findTestObject('Page_1623758105219/div_Bengaluru, India(BLR)Kempegowda International AirportIN'))

WebUI.setText(findTestObject('Page_Flight Tickets, Flights Booking at Low_71ea7c/input_Multicity_gosuggest_inputSrc'), 'Hubli')

WebUI.click(findTestObject('Page_1623758105219/div_Hubli, India(HBX)Hubli AirportIN'))

WebUI.click(findTestObject('Page_Goibibo/input_Multicity_departureCalendar'))

WebUI.verifyElementPresent(findTestObject('Page_Goibibo/div_June 2021'), 0)

WebUI.click(findTestObject('Page_Goibibo/span_Multicity_DayPicker-NavButton DayPicker-NavButton--next'))

WebUI.click(findTestObject('Page_Goibibo/PickDate'))

WebUI.click(findTestObject('Page_Goibibo/input_Multicity_returnCalendar'))

WebUI.click(findTestObject('Page_Goibibo/div_62454'))

WebUI.click(findTestObject('Page_Goibibo/button_SEARCH'))

WebUI.closeBrowser()

