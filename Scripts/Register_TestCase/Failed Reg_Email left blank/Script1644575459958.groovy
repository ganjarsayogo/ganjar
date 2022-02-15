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

WebUI.navigateToUrl('https://dev.qlue.ai/register/')

WebUI.setText(findTestObject('Object Repository/Page_Qlue Smart City  Register Free Trial/input_Name_name'), 'Ganjar')

WebUI.setText(findTestObject('Object Repository/Page_Qlue Smart City  Register Free Trial/input_Email_email'), '')

WebUI.setText(findTestObject('Object Repository/Page_Qlue Smart City  Register Free Trial/input_Company_company'), 'PT. ABC')

WebUI.click(findTestObject('Object Repository/Page_Qlue Smart City  Register Free Trial/div_Phone_arrow down'))

WebUI.click(findTestObject('Object Repository/Page_Qlue Smart City  Register Free Trial/span_Indonesia'))

WebUI.setText(findTestObject('Object Repository/Page_Qlue Smart City  Register Free Trial/input_358_phone'), '81345755941')

WebUI.click(findTestObject('Object Repository/Page_Qlue Smart City  Register Free Trial/button_GET STARTED NOW'))

WebUI.verifyElementPresent(findTestObject('Page_Qlue Smart City  Register Free Trial/span_Please enter Your email'), 0)

WebUI.closeBrowser()

