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
import groovy.ui.SystemOutputInterceptor as SystemOutputInterceptor
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.goibibo.com/')

WebUI.click(findTestObject('Page_Goibibo - Best Travel Website. Book Hotels, Flights, Trains, Bus and Cabs with upto 50 off/Picker1'))

WebUI.click(findTestObject('Page_Goibibo/span_Multicity_DayPicker-NavButton DayPicker-NavButton--next'))

String CMonthYear = WebUI.getText(findTestObject('Page_Goibibo - Best Travel Website. Book Hotels, Flights, Trains, Bus and Cabs with upto 50 off/MonthYear'), 
    FailureHandling.STOP_ON_FAILURE)

System.println(CMonthYear)

String date1 = '12-August 2021'

String eDate = date1.split('-')[0]

String eMonthYear = date1.split('-')[1]

System.println(eDate)

while (!(CMonthYear.equals(eMonthYear))) {
    WebUI.click(findTestObject('Page_Goibibo/span_Multicity_DayPicker-NavButton DayPicker-NavButton--next'))

    CMonthYear = WebUI.getText(findTestObject('Page_Goibibo - Best Travel Website. Book Hotels, Flights, Trains, Bus and Cabs with upto 50 off/MonthYear'), 
        FailureHandling.STOP_ON_FAILURE)
}

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> e1 = driver.findElements(By.xpath('//*[@class = \'DayPicker-Day\']'))


  for(WebElement e :e1){
      System.print(e.getText()+"***")
	  if(e.getText().equals(eDate)){
		  e.click()
		  break;
	  }
   WebUI.closeBrowser()

  }

