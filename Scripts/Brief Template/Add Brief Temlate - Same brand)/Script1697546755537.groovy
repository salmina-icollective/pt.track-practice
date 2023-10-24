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

WebUI.setText(findTestObject('Object Repository/Edit brief template/Page_Point POSM/input_Login_email'), 'Raeesa@pointgroup.biz')

WebUI.setEncryptedText(findTestObject('Object Repository/Edit brief template/Page_Point POSM/input_Login_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Edit brief template/Page_Point POSM/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Edit brief template/Page_Point POSM/span_Brief Templates'))

WebUI.click(findTestObject('Object Repository/Edit brief template/Page_Point POSM/a_Add Brief'))

WebUI.setText(findTestObject('Object Repository/Edit brief template/Page_Point POSM/input_Project Name_form-control ng-pristine_c278e6'), 
    Project_Name)

WebUI.setText(findTestObject('Edit brief template/Page_Point POSM/input_Project In Trade Date_form-control ng_e6d133'), 
    Project_Start_Date)

WebUI.setText(findTestObject('Edit brief template/Page_Point POSM/input_End date of Campaign_form-control ng-_c17a0d'), 
    End_Date)

WebUI.click(findTestObject('Edit brief template/Page_Point POSM/input_Same Brand_ng-pristine ng-valid'))

WebUI.click(findTestObject('Brief_Templates_Objects/Page_Point POSM/Category1'))

WebUI.selectOptionByValue(findTestObject('Brief_Templates_Objects/Page_Point POSM/Category1'), Category1, false)

WebUI.click(findTestObject('Brief_Templates_Objects/Page_Point POSM/Brand1'))

WebUI.selectOptionByValue(findTestObject('Dropdown re/Page_Point POSM/select_Select Brand'), Brand, false)

WebUI.setText(findTestObject('Object Repository/Edit brief template/Page_Point POSM/input_Non Point_form-control ng-pristine ng_a5d557'), 
    Spec_details)

WebUI.setText(findTestObject('Object Repository/Edit brief template/Page_Point POSM/input_Non Point_form-control ng-pristine ng_a8cb20'), 
    Element_Quantity)

WebUI.selectOptionByIndex(findTestObject('Brief_Templates_Objects/Page_Point POSM/Element_CPA'), Element_CPA, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Brief_Templates_Objects/Page_Point POSM/Product_Type'), Product_Type)

WebUI.setText(findTestObject('Brief_Templates_Objects/Page_Point POSM/Unit_Price'), Unit_Price)

WebUI.setText(findTestObject('Brief_Templates_Objects/Page_Point POSM/Total_Price'), Total_Price)

WebUI.setText(findTestObject('Brief_Templates_Objects/Page_Point POSM/Special_notes'), Special_Notes)

WebUI.click(findTestObject('Object Repository/Edit brief template/Page_Point POSM/button_Save'))

