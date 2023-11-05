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

WebUI.navigateToUrl('https://pointposmqa.live1.dev.radixweb.net/pointposm#/dXNlcg0000/UG9zdA0000')

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Admin - Add user manager/Page_Point POSM/input_Login_email'), 'Raeesa@pointgroup.biz')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin - Add user manager/Page_Point POSM/input_Login_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Admin - Add user manager/Page_Point POSM/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Admin - Add user manager/Page_Point POSM/span_Admin'))

WebUI.click(findTestObject('Object Repository/Admin - Add user manager/Page_Point POSM/a_User Manager'))

WebUI.click(findTestObject('Object Repository/Admin - Add user manager/Page_Point POSM/a_Add User'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Admin - Add user manager/Page_Point POSM/select_Select User TypeWebMobile'), 
    User_Type, true)

WebUI.setText(findTestObject('Object Repository/Admin - Add user manager/Page_Point POSM/input_First Name_form-control ng-pristine n_04448b'), 
    First_Name)

WebUI.setText(findTestObject('Object Repository/Admin - Add user manager/Page_Point POSM/input_Last Name_form-control ng-pristine ng_38b227'), 
    Last_Name)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Admin - Add user manager/Page_Point POSM/select_Select TimeZone(GMT-1200) Internatio_f829c1'), 
    TimeZone1, false)

WebUI.setText(findTestObject('Object Repository/Admin - Add user manager/Page_Point POSM/input_Email (Username)_form-control ng-scop_609227'), 
    Email_Username)

//WebUI.check(findTestObject('Admin - Add user manager/Page_Point POSM/input_F_06O'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/Admin - Add user manager/Page_Point POSM/select_Select CompanyA.M Design AgencyAddvi_c53b82'), 
    Company, true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Admin - Add user manager/Page_Point POSM/select_Select StructureAccount MDesign Mana_d4c27f'), 
    C_Department, true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Admin - Add user manager/Page_Point POSM/select_Select CountryAfghanistanAlbaniaAlge_8ea0a4'), 
    Country, true)

WebUI.setText(findTestObject('Object Repository/Admin - Add user manager/Page_Point POSM/input_State_form-control ng-pristine ng-valid'), 
    State)

WebUI.setText(findTestObject('Object Repository/Admin - Add user manager/Page_Point POSM/input_City_form-control ng-pristine ng-valid'), 
    City)

WebUI.setText(findTestObject('Object Repository/Admin - Add user manager/Page_Point POSM/input_Street_form-control ng-pristine ng-valid'), 
    Street)

WebUI.setText(findTestObject('Object Repository/Admin - Add user manager/Page_Point POSM/input_Postal Code_form-control ng-pristine _95092a'), 
    Postal_Code)

WebUI.setText(findTestObject('Object Repository/Admin - Add user manager/Page_Point POSM/input_Mobile Phone No_form-control ng-scope_b75639'), 
    Mobile_N)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Admin - Add user manager/Page_Point POSM/select_Select RoleSuperAdminClient3rd Party_b43c2d'), 
    Role, true)

WebUI.uploadFile(findTestObject('User-manager checkboxes/Input-profile-photo/input_Profile Photo_uploadImage'), Profile_Photo)

OutputFile = WebUI.getText(findTestObject('User-manager checkboxes/Upload_image/Uploaded_img_name'))

System.out.print(OutputFile + '***')

WebUI.click(findTestObject('Object Repository/Admin - Add user manager/Page_Point POSM/input_Default User_module'))

WebUI.check(findTestObject('User-manager checkboxes/Page_Point POSM/checkbox_Asset Tracker_module'))

WebUI.setText(findTestObject('Admin - Add user manager/User_id/input_User Id'), User_Id)

WebUI.check(findTestObject('User-manager checkboxes/Page_Point POSM/Checkbox_Distribution Mail_ng-pristine ng-valid'))

WebUI.click(findTestObject('Object Repository/Admin - Add user manager/Page_Point POSM/button_Save'))

WebUI.closeBrowser()

