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

WebUI.navigateToUrl('https://d11602ph6cbhrk.cloudfront.net/pricing')

WebUI.click(findTestObject('Object Repository/Page_Qlue Smart City  Pricing Plan/button_GET STARTED'))

WebUI.click(findTestObject('Object Repository/Page_Qlue Smart City  Cart/button_ADD'))

WebUI.verifyElementPresent(findTestObject('Page_Qlue Smart City  Cart/p_Custom Plan'), 0)

WebUI.click(findTestObject('Object Repository/Page_Qlue Smart City  Cart/path'))

WebUI.click(findTestObject('Object Repository/Page_Qlue Smart City  Cart/button_ADD_1'))

WebUI.verifyElementPresent(findTestObject('Page_Qlue Smart City  Cart/p_Custom Plan'), 0)

WebUI.click(findTestObject('Object Repository/Page_Qlue Smart City  Cart/path'))

WebUI.click(findTestObject('Object Repository/Page_Qlue Smart City  Cart/button_ADD_1_2'))

WebUI.verifyElementPresent(findTestObject('Page_Qlue Smart City  Cart/p_Custom Plan'), 0)

WebUI.click(findTestObject('Object Repository/Page_Qlue Smart City  Cart/svg'))

WebUI.click(findTestObject('Object Repository/Page_Qlue Smart City  Cart/button_ADD_1_2_3'))

WebUI.verifyElementPresent(findTestObject('Page_Qlue Smart City  Cart/p_Custom Plan'), 0)

WebUI.click(findTestObject('Object Repository/Page_Qlue Smart City  Cart/path'))

WebUI.click(findTestObject('Object Repository/Page_Qlue Smart City  Cart/button_ADD_1_2_3_4'))

WebUI.verifyElementPresent(findTestObject('Page_Qlue Smart City  Cart/p_Custom Plan'), 0)

WebUI.click(findTestObject('Object Repository/Page_Qlue Smart City  Cart/path'))

WebUI.click(findTestObject('Object Repository/Page_Qlue Smart City  Cart/button_ADD_1_2_3_4_5'))

WebUI.verifyElementPresent(findTestObject('Page_Qlue Smart City  Cart/p_Custom Plan'), 0)

WebUI.click(findTestObject('Object Repository/Page_Qlue Smart City  Cart/svg'))

WebUI.click(findTestObject('Object Repository/Page_Qlue Smart City  Cart/button_ADD_1_2_3_4_5_6'))

WebUI.verifyElementPresent(findTestObject('Page_Qlue Smart City  Cart/p_Custom Plan'), 0)

WebUI.click(findTestObject('Object Repository/Page_Qlue Smart City  Cart/path'))

WebUI.click(findTestObject('Object Repository/Page_Qlue Smart City  Cart/button_ADD_1_2_3_4_5_6_7'))

WebUI.verifyElementPresent(findTestObject('Page_Qlue Smart City  Cart/p_Custom Plan'), 0)

WebUI.click(findTestObject('Object Repository/Page_Qlue Smart City  Cart/svg'))

WebUI.closeBrowser()

