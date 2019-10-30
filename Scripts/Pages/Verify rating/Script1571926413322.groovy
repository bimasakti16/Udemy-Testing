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

String object_text = WebUI.getText(MyKeyword.getTestObjectByXpath('//div[@class=\'clp-lead__element-item\']'))
String rating_text;

for(int i=0; i < object_text.length(); i++) {
		
	if(object_text.substring(i, i+1) == "3" || object_text.substring(i, i+1) == "4" || object_text.substring(i, i+1) == "5") {
		rating_text = object_text.substring(i, 3)
		
		break;
	}
}

double actual_rating = Double.parseDouble(rating_text)

switch (expected_rating) {
	case GlobalVariable.rating_45_up :
		if(actual_rating >= 4.5 || actual_rating <= 5.0) {
			WebUI.comment('rating between 4.5-5.0!!! ' + actual_rating)
		}
	break;
	
	case GlobalVariable.rating_40_up :
		if(actual_rating >= 4.0 || actual_rating < 4.5) {
			WebUI.comment('rating between 4.0-4.5!!! ' + actual_rating)
		}
	break;
	
	case GlobalVariable.rating_35_up :
		if(actual_rating >= 3.5 || actual_rating < 4.0) {
			WebUI.comment('rating between 3.5-4.0!!! ' + actual_rating)
		}
	break;
	
	case GlobalVariable.rating_30_up :
		if(actual_rating >= 3.0 || actual_rating < 3.5) {
			WebUI.comment('rating between 3.0-3.5!!! ' + actual_rating)
		}
	break;
	
	default :
	break;

}
