package testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageobjectmodel.HomePageObjects;
import pageobjectmodel.RegisterPageObjects;
import resources.baseClass;
import resources.commonMethods;
import resources.testData;

public class RegistrationTestCases extends baseClass {

	// testcases will execute based on alphabetical order so blank will run first

	// to fill all fields correctly and register
	@Test(priority = 1)
	public void verifyRegisterationWithValidData() throws IOException, InterruptedException {

		// driver from base class -- scope avaialbale as it is global var in baseclass
		// and we have extended that baseclass, so its scope is available here

		// driver.get("https://naveenautomationlabs.com/opencart/");

		// home page objects is not having scope of driver, so passing the driver that
		// has scope from base class and creating constructor with this driver argument
		// in home page objects
		HomePageObjects hpo = new HomePageObjects(driver);

		commonMethods.handleExplictWait(driver, 4, hpo.clickOnmyaccount());

		hpo.clickOnmyaccount().click();
		hpo.clickOnRegister().click();

		RegisterPageObjects rpo = new RegisterPageObjects(driver);

		rpo.enterFirstName().sendKeys(testData.firstname);
		rpo.enterLastName().sendKeys(testData.lastname);
		rpo.enterEmail().sendKeys(emailId);
		rpo.enterTelephone().sendKeys(testData.telephome);
		rpo.enterPassword().sendKeys(testData.password);
		rpo.enterPasswordConfirm().sendKeys(testData.password);
		rpo.clickOnCheckbox().click();
		rpo.clickOnContinueButton().click();

		// assertion to check if registration is done successfully
		String expected = testData.registrationSuccessfulTextExpected; // requirement document
		String actual = rpo.getRegistrationSuccesfulText().getText(); // after running the scripts

		commonMethods.handleAssertion(actual, expected);

	}

	// to test if register twice with same mailid
	@Test(priority = 2)
	public void verifyRegisterationWithInvalidValidData() throws IOException, InterruptedException {

		HomePageObjects hpo = new HomePageObjects(driver);

		commonMethods.handleExplictWait(driver, 4, hpo.clickOnmyaccount());

		hpo.clickOnmyaccount().click();
		hpo.clickOnRegister().click();

		RegisterPageObjects rpo = new RegisterPageObjects(driver);

		rpo.enterFirstName().sendKeys(testData.firstname);
		rpo.enterLastName().sendKeys(testData.lastname);
		rpo.enterEmail().sendKeys(emailId);// registering with same mailid
		rpo.enterTelephone().sendKeys(testData.telephome);
		rpo.enterPassword().sendKeys(testData.password);
		rpo.enterPasswordConfirm().sendKeys(testData.password);
		rpo.clickOnCheckbox().click();
		rpo.clickOnContinueButton().click();

		// assert to check for already registered mail id errormsg

		String emailAlreadyRegisteredErrormsgExpected = testData.emailAlreadyRegisteredErrorExpected;
		String emailAlreadyRegisteredErrormsgActual = rpo.getemailAlreadyRegisteredErrorMsg().getText();

		commonMethods.handleAssertion(emailAlreadyRegisteredErrormsgActual, emailAlreadyRegisteredErrormsgExpected);
	}

	// to test validation errors on empty fields and click on continue
	@Test(priority = 3)
	public void verifyRegisterationWithBlankData() throws IOException, InterruptedException {

		HomePageObjects hpo = new HomePageObjects(driver);

		commonMethods.handleExplictWait(driver, 4, hpo.clickOnmyaccount());

		hpo.clickOnmyaccount().click();
		hpo.clickOnRegister().click();

		RegisterPageObjects rpo = new RegisterPageObjects(driver);

		rpo.clickOnContinueButton().click();

		// assert to check, if on blank data we get validation error msgs

		String fnExpected = testData.firstnameExpected;
		String fnActual = rpo.getFirstNameErrorMsg().getText();

		String lnExpected = testData.lastnameExpected;
		String lnActual = rpo.getLastNameErrorMsg().getText();

		String emailExpected = testData.emailaddressExpected;
		String emailActual = rpo.getEmailErrorMsg().getText();

		String telephoneExpected = testData.telephonenumberExpected;
		String telephoneActual = rpo.getTelephoneErrorMsg().getText();

		String passwordExpected = testData.passwordisExpected;
		String passwordActual = rpo.getPasswordErrorMsg().getText();

		String privacyPolicyExpected = testData.privacyPolicyisExpected;
		String privacyPolicyActual = rpo.getPrivacyPolicyAlertErrorMsg().getText();

		commonMethods.handleAssertion(fnActual, fnExpected);
		commonMethods.handleAssertion(lnActual, lnExpected);
		commonMethods.handleAssertion(emailActual, emailExpected);
		commonMethods.handleAssertion(telephoneActual, telephoneExpected);
		commonMethods.handleAssertion(passwordActual, passwordExpected);
		commonMethods.handleAssertion(privacyPolicyActual, privacyPolicyExpected);

	}

}
