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

WebUI.navigateToUrl('https://pointposmqa.live1.dev.radixweb.net/pointposm#/dHJhY2tTdGF0dXM00')

WebUI.setText(findTestObject('Object Repository/Add brief template/Page_Point POSM/input_Login_email'), 'raeesa@pointgroup.biz')

WebUI.setEncryptedText(findTestObject('Object Repository/Add brief template/Page_Point POSM/input_Login_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Add brief template/Page_Point POSM/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Add brief template/Page_Point POSM/a_Brief Templates'))

WebUI.click(findTestObject('Add brief template/Page_Point POSM/span_Brief Templates'))

WebUI.click(findTestObject('Object Repository/Add brief template/Page_Point POSM/a_Add Brief'))

WebUI.setText(findTestObject('Object Repository/Edit brief template/Page_Point POSM/input_Project Name_form-control ng-pristine_c278e6'), 
    Project_Name)

WebUI.setText(findTestObject('Edit brief template/Page_Point POSM/input_Project In Trade Date_form-control ng_e6d133'), 
    Project_Start_Date)

WebUI.setText(findTestObject('Edit brief template/Page_Point POSM/input_End date of Campaign_form-control ng-_c17a0d'), 
    End_Date)

WebUI.setText(findTestObject('Brief_Templates_Objects/Page_Point POSM/Spec-Details'), Spec_details)

WebUI.selectOptionByValue(findTestObject('Dropdown re/Page_Point POSM/Category'), Category1, false)

WebUI.selectOptionByIndex(findTestObject('Dropdown re/Page_Point POSM/select_Select Brand'), Brand)

WebUI.setText(findTestObject('Brief_Templates_Objects/Page_Point POSM/Element_Quantiti'), Element_Quantity)

WebUI.selectOptionByIndex(findTestObject('Brief_Templates_Objects/Page_Point POSM/Element_CPA'), Element_CPA, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Brief_Templates_Objects/Page_Point POSM/Product_Type'), Product_Type, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Brief_Templates_Objects/Page_Point POSM/Unit_Price'), Unit_Price)

WebUI.setText(findTestObject('Brief_Templates_Objects/Page_Point POSM/Total_Price'), Total_Price)

WebUI.setText(findTestObject('Brief_Templates_Objects/Page_Point POSM/Special_notes'), Special_Notes)

WebUI.click(findTestObject('Object Repository/Edit brief template/Page_Point POSM/button_Save'))

def checkAdded = true
def isValid = expected_results == 'valid'
def navigated = WebUI.getUrl() != 'https://pointposmqa.live1.dev.radixweb.net/pointposm#/YnJpZWZUZW1wbGF0ZQ0000'
checkAdded = ((isValid && navigated) || (!(navigated ) && !(isValid)))
WebUI.closeBrowser()
//assert checkAdded
