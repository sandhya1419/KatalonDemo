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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.click(findTestObject('Object Repository/Page_Goibibo - Best Travel Website. Book Ho_c2e78c/a_Flights'))

WebUI.setText(findTestObject('Object Repository/Page_Flight Tickets, Flights Booking at Low_71ea7c/input_Multicity_gosuggest_inputSrc'), 
    'Beng')

WebUI.click(findTestObject('Page_1623758105219/div_Bengaluru, India(BLR)Kempegowda International AirportIN'))

WebUI.setText(findTestObject('Object Repository/Page_Flight Tickets, Flights Booking at Low_71ea7c/input_Multicity_gosuggest_inputDest'), 
    'Hubli')

WebUI.click(findTestObject('Page_1623758105219/div_Hubli, India(HBX)Hubli AirportIN'))

WebUI.click(findTestObject('Page_Goibibo - Best Travel Website. Book Ho_c2e78c/input_Multicity_departureCalendar'))

WebUI.selectOptionByValue(findTestObject('Page_Goibibo - Best Travel Website. Book Ho_c2e78c/input_Multicity_departureCalendar'), 
    'Sat, 26 Jun', false)

not_run: WebUI.click(findTestObject('Page_Goibibo - Best Travel Website. Book Ho_c2e78c/div_15'))

WebUI.click(findTestObject('Object Repository/Page_Flight Tickets, Flights Booking at Low_71ea7c/input_Multicity_returnCalendar'))

WebUI.click(findTestObject('Object Repository/Page_Flight Tickets, Flights Booking at Low_71ea7c/div_202454'))

WebUI.click(findTestObject('Object Repository/Page_Flight Tickets, Flights Booking at Low_71ea7c/div_1 Traveller,  EconomyERROR Adults (12 y_6ed1b1'))

WebUI.click(findTestObject('Object Repository/Page_Flight Tickets, Flights Booking at Low_71ea7c/button_'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Flight Tickets, Flights Booking at Low_71ea7c/select_EconomyBusinessFirst classPremium Economy'), 
    'F', true)

WebUI.click(findTestObject('Object Repository/Page_Flight Tickets, Flights Booking at Low_71ea7c/button__1'))

WebUI.click(findTestObject('Object Repository/Page_Flight Tickets, Flights Booking at Low_71ea7c/a_ERROR_pax_close'))

WebUI.click(findTestObject('Object Repository/Page_Flight Tickets, Flights Booking at Low_71ea7c/button_SEARCH'))

WebUI.waitForAlert(0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Book Cheap Flights, Air Tickets, Hotel_9fe8af/div_Sorry, we could not find any flights fo_d79a71'), 
    'Sorry, we could not find any flights for this route')

WebUI.click(findTestObject('Object Repository/Page_Book Cheap Flights, Air Tickets, Hotel_9fe8af/button_Modify search and try again'))

WebUI.closeBrowser()

