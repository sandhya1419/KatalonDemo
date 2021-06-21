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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.click(findTestObject('Object Repository/Page_Amazon.com. Spend less. Smile more/select_All Departments'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Amazon.com. Spend less. Smile more/select_All Departments'), 
    'Electronics', false)

WebUI.setText(findTestObject('Object Repository/Page_Amazon.com. Spend less. Smile more/input_Electronics_field-keywords'), 
    'mackbook')

//WebUI.click(findTestObject('Object Repository/Page_Amazon.com. Spend less. Smile more/div_macbook pro'))
WebUI.click(findTestObject('Object Repository/Page_Amazon.com. Spend less. Smile more/input_All_nav-search-submit-button'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Amazon.com  macbook pro/a_1'), 2)

WebUI.click(findTestObject('Object Repository/Page_Amazon.com  macbook pro/a_2'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Amazon.com macbook pro International Shipping Electronics/span_13-24 of over 20,000 results for'), 
    3)

