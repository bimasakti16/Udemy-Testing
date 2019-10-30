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

WebUI.callTestCase(findTestCase('Pages/Start Web Testing'), [('url') : 'https://www.udemy.com/'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Search course with input_title'), [('input_title') : 'automation testing'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Apply Filters'), [('level') : GlobalVariable.level_intermediate, ('language') : GlobalVariable.lang_english
        , ('price') : GlobalVariable.price_free, ('rating') : GlobalVariable.rating_45_up, ('duration') : GlobalVariable.dura_0_2h], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Select title course contain expected_title'), [('expected_title') : 'Test2', ('expected_title2') : 'Multi'], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Verify rating'), [('expected_rating') : GlobalVariable.rating_45_up], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Verify language'), [('expected_language') : 'English'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Verify duration'), [('expected_duration') : GlobalVariable.dura_0_2h], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Verify price'), [('expected_price') : 'Free'], FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('screenshot.png')

WebUI.closeBrowser()

