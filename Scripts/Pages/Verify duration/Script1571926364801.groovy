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

double actual_duration = Double.parseDouble(WebUI.getText(MyKeyword.getTestObjectByXpath('//span[@data-purpose=\'video-content-length\']')).substring(
        0, 3))

switch (expected_duration) {
    case GlobalVariable.dura_0_2h :
		if(actual_duration >= 0.0 || actual_duration < 3.0) {
			WebUI.comment('duration between 0-2!!! ' + actual_duration)
		}
	break;
	
	case GlobalVariable.dura_3_6h :
		if(actual_duration >= 3.0 || actual_duration < 7.0) {
			WebUI.comment('duration between 3-6!!! ' + actual_duration)
		}
	break;
	
	case GlobalVariable.dura_7_16h :
		if(actual_duration >= 7.0 || actual_duration < 17.0) {
			WebUI.comment('duration between 7-16!!! ' + actual_duration)
		}
	break;
	
	case GlobalVariable.dura_17h :
		if(actual_duration >= 17.0) {
			WebUI.comment('duration more than 17!!! ' + actual_duration)
		}
	break;
	
	default :
	break;

}

