package testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageobjectmodel.HomePageObjects;
import pageobjectmodel.LoginPageObjects;
import resources.baseClass;
import resources.commonMethods;
import resources.testData;

public class loginTestCases extends baseClass {

	@Test(priority = 1)

	public void verifyLoginWithValidData() throws IOException, InterruptedException {

		HomePageObjects hpo = new HomePageObjects(driver);

		commonMethods.handleExplictWait(driver, 4, hpo.clickOnmyaccount());

		hpo.clickOnmyaccount().click();
		hpo.clickOnLogin().click();

		LoginPageObjects lpo = new LoginPageObjects(driver);
		lpo.enterEmail().sendKeys(emailId);
		lpo.enterPassword().sendKeys(testData.password);
		lpo.clickOnLogin().click();

		// assertion to check if login is done successfully
		String expected = testData.loginSuccesfulexpected; // requirement document
		String actual = lpo.getLoginSuccessfulText().getText(); // after running the scripts

		commonMethods.handleAssertion(actual, expected);

	}

	// to test when passing blank email during login(invalid data)
	@Test(priority = 2)
	public void verifyLoginWithInvalidData() throws IOException, InterruptedException {

		HomePageObjects hpo = new HomePageObjects(driver);

		commonMethods.handleExplictWait(driver, 4, hpo.clickOnmyaccount());

		hpo.clickOnmyaccount().click();
		hpo.clickOnLogin().click();

		LoginPageObjects lpo = new LoginPageObjects(driver);
		lpo.enterEmail().sendKeys("");
		lpo.enterPassword().sendKeys(testData.password);
		lpo.clickOnLogin().click();

		// assertion to check error on blank email during login
		String expected = testData.blankEmailDuringLoginErrorExpected; // requirement document
		String actual = lpo.getInvalidLoginText().getText(); // after running the scripts

		commonMethods.handleAssertion(actual, expected);

	}

}
