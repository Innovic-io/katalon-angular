import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

pizzaType1 = WebUI.getText(findTestObject('Place order/Pizza type'))

price1 = WebUI.getText(findTestObject('Place order/Pizza price'))

WebUI.click(findTestObject('Select pizza section/Medium pizza'))

WebUI.verifyElementPresent(findTestObject('Select pizza section/Medium pizza active'), 1)

pizzaType2 = WebUI.getText(findTestObject('Place order/Pizza type'))

price2 = WebUI.getText(findTestObject('Place order/Pizza price'))

WebUI.verifyNotMatch(pizzaType1, pizzaType2, true)

WebUI.verifyNotMatch(price1, price2, true)

WebUI.click(findTestObject('Select pizza section/Large pizza'))

WebUI.verifyElementPresent(findTestObject('Select pizza section/Large pizza active'), 1)

pizzaType3 = WebUI.getText(findTestObject('Place order/Pizza type'))

WebUI.verifyNotMatch(pizzaType2, pizzaType3, true)

WebUI.verifyElementClickable(findTestObject('Place order/Place order button'))

