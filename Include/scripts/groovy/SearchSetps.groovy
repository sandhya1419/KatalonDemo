import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class SearchSetps {

	@Given("user launch the webiste")
	public void user_launch_website() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()

		WebUI.navigateToUrl('https://www.amazon.com/')
	}



	@When("user enter the (.*)")
	public void user_enter_the_product(String product) {
		println "I am inside When"
		WebUI.setText(findTestObject('Object Repository/Page_Amazon.com. Spend less. Smile more/input_Electronics_field-keywords'),
				product)
	}

	@And("clicks on search button")
	public void clicks_on_search_button() {
		println "I am inside And"
		WebUI.click(findTestObject('Object Repository/Page_Amazon.com. Spend less. Smile more/input_All_nav-search-submit-button'))
	}

	@Then("user is naviagted to results page")
	public void user_is_naviagted_to_results_page() {
		println "I am inside Then"
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Amazon.com  macbook pro/a_1'), 2)
	}
}