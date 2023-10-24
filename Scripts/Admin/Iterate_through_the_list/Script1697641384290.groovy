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
import org.openqa.selenium.Webdriver as Webdriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUi.openBrowser('')

WebUI.navigateToUrl('https://pointposmqa.live1.dev.radixweb.net/pointposm#/dHJhY2tTdGF0dXM00')

WebUI.setText(findTestObject('Object Repository/Category_TC/Page_Point POSM/input_Login_email'), 'raeesa@pointgroup.biz')

WebUI.setEncryptedText(findTestObject('Object Repository/Category_TC/Page_Point POSM/input_Login_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Category_TC/Page_Point POSM/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Category_TC/Page_Point POSM/a_Category'))

WebUI.click(findTestObject('Object Repository/Category_TC/Page_Point POSM/a_Add Category'))

WebUI.click(findTestObject('Object Repository/Category_TC/Page_Point POSM/input_Client_'))

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> client = driver.findElements(By.xpath('//*[@id=s2id_autogen11]/li'))

printIn(client.size())

for (WebElements el : client) {
    printIn(el.getText())

    if (el.getText().equals('Adjust SA')) {
        el.click()

        break
    }
}

