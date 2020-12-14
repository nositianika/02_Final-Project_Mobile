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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\hp\\Downloads\\training katalon\\FINAL PROJECTS\\MOBILE\\app-debug.apk', true)

Mobile.tap(findTestObject('001_Registrasi/android.widget.Button0 - CREATE A PROFILE'), 0)

Mobile.setText(findTestObject('001_Registrasi/android.widget.EditText0 - First Name'), 'tianika', 0)

Mobile.setText(findTestObject('001_Registrasi/android.widget.EditText0 - Last Name'), 'tia', 0)

Mobile.setText(findTestObject('001_Registrasi/android.widget.EditText0 - Country'), 'Indonesia', 0)

String username = CustomKeywords.'com.test2.function.util.randomUsername.getRandomEmail'()

Mobile.setText(findTestObject('001_Registrasi/android.widget.EditText0 - Username'), username, 0)

Mobile.setText(findTestObject('001_Registrasi/android.widget.EditText0 - Password'), 'nosii12345', 0)

Mobile.setText(findTestObject('001_Registrasi/android.widget.EditText0 - Confirm Password'), 'nosii12345', 0)

Mobile.tap(findTestObject('001_Registrasi/android.widget.Button0 - Create Profile'), 0)

//Mobile.tap(findTestObject('001_Registrasi/android.widget.Button0 - LOGIN'), 0)



