import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import MyKeyword as MyKeyword

WebUI.delay(2)

WebUI.click(findTestObject('Page_Online Courses - Anytime Anywhere  Udemy/button_All FiltersFilters'))

WebUI.delay(2)

if (WebUI.verifyElementClickable(level)) {
    WebUI.click(level)
}

if (WebUI.verifyElementClickable(language)) {
    WebUI.click(language)
}

if (WebUI.verifyElementClickable(price)) {
    WebUI.click(price)
}

if (WebUI.verifyElementClickable(rating)) {
    WebUI.click(rating)
}

if (WebUI.verifyElementClickable(duration)) {
    WebUI.click(duration)
}

WebUI.delay(2)

WebUI.click(MyKeyword.getTestObjectByXpath('//button[contains(text(),\'Apply\')]'))

