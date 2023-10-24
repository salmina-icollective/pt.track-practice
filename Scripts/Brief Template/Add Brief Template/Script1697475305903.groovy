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

WebUI.click(findTestObject('Add brief template/Page_Point POSM/a_Brief Templates'))

WebUI.click(findTestObject('Add brief template/Page_Point POSM/span_Brief Templates'))

WebUI.click(findTestObject('Add brief template/Page_Point POSM/a_Add Brief'))

WebUI.setText(findTestObject('Add brief template/Page_Point POSM/input_Project Name_form-control ng-pristine_c278e6'), Project Name)

WebUI.setText(findTestObject('Add brief template/Page_Point POSM/input_Project In Trade Date_form-control ng_e6d133'), ProjectIn TradeName)

WebUI.click(findTestObject('Add brief template/Page_Point POSM/datePicker'))

WebUI.click(findTestObject('Add brief template/Page_Point POSM/itemDate'))

WebUI.click(findTestObject('Add brief template/Page_Point POSM/datePicker'))

WebUI.click(findTestObject('Add brief template/Page_Point POSM/itemDate'))

WebUI.click(findTestObject('Object Repository/Add brief template/Page_Point POSM/input_Same Brand_ng-pristine ng-valid'))

WebUI.click(findTestObject('Object Repository/Add brief template/Page_Point POSM/ul_Category_select2-choices'))

WebUI.rightClick(findTestObject('Object Repository/Add brief template/Page_Point POSM/ul_Category_select2-choices'))

WebUI.click(findTestObject('Object Repository/Add brief template/Page_Point POSM/input_Category_s2id_autogen4'))

WebUI.click(findTestObject('Object Repository/Add brief template/Page_Point POSM/ul_Brand_select2-choices'))

WebUI.setText(findTestObject('Object Repository/Add brief template/Page_Point POSM/input_Non Point_form-control ng-pristine ng_a5d557'), 
    'PNT')

WebUI.selectOptionByValue(findTestObject('Object Repository/Add brief template/Page_Point POSM/select_Select CategoryBaby FoodsBottled wat_5c5654'), 
    'false', true)

WebUI.setText(findTestObject('Object Repository/Add brief template/Page_Point POSM/input_Non Point_form-control ng-valid-numbe_be02ca'), 
    '3')

WebUI.selectOptionByValue(findTestObject('Object Repository/Add brief template/Page_Point POSM/select_Select Unit ClassExecution CPANestle_b65fef'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add brief template/Page_Point POSM/select_Select Product Type3D Aisle WingAisl_5ac5af'), 
    '18', true)

WebUI.setText(findTestObject('Object Repository/Add brief template/Page_Point POSM/input_Non Point_form-control ng-pristine ng-valid'), 
    '14000')

WebUI.setText(findTestObject('Object Repository/Add brief template/Page_Point POSM/input_Non Point_form-control ng-pristine ng-valid_1'), 
    '18000')

WebUI.click(findTestObject('Object Repository/Add brief template/Page_Point POSM/button_Save'))

