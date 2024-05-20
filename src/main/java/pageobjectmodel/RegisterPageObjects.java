package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPageObjects {
	
	public WebDriver driver;
	
	private By firstName = By.xpath("//input[@id = 'input-firstname']");
	
	private By lastName = By.xpath("//input[@id = 'input-lastname']");
	
	private By email = By.xpath("//input[@id = 'input-email']");
	
	private By telephone = By.xpath("//input[@id = 'input-telephone']");
	
	private By password = By.xpath("//input[@id = 'input-password']");
	
	private By passwordConfirm = By.xpath("//input[@id = 'input-confirm']");
	
	private By checkBox = By.xpath("//input[@type = 'checkbox']");
	
	private By continueButton  = By.xpath("//input[@type = 'submit']");
	
	//for blank 
	 private   By FirstNameErrorMsg = By.xpath("(//div[@class='text-danger'])[1]");
	 private   By LastNameErrorMsg = By.xpath("(//div[@class='text-danger'])[2]");
	 protected By emailErrorMsg = By.xpath("(//div[@class='text-danger'])[3]");
	 protected By TelephoneErrorMsg = By.xpath("(//div[@class='text-danger'])[4]");
	 protected By passwordErrorMsg =By.xpath("(//div[@class='text-danger'])[5]");
	 protected By privacyPolicyAlertErrormsg = By.xpath("//div[text()= ' Warning: You must agree to the Privacy Policy!']");
	 protected By confirmPasswordErrorMessage = By.xpath("//div[@class = 'text-danger']");
	 protected By emailAlreadyRegisteredErrorMsg = By.xpath("//div[text() = ' Warning: E-Mail Address is already registered!']");
	 
	 private By registrationSuccessfulmsg = By.xpath("//div/h1[text() ='Your Account Has Been Created!']");
	
	public RegisterPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement enterFirstName() {
		// driver.findElement(by.xpath"")
		return driver.findElement(firstName);
	}
	
	public WebElement enterLastName() {
		// driver.findElement(by.xpath"")
		return driver.findElement(lastName);
	}
	
	public WebElement enterEmail() {
		// driver.findElement(by.xpath"")
		return driver.findElement(email);
	}
	
	public WebElement enterTelephone() {
		// driver.findElement(by.xpath"")
		return driver.findElement(telephone);
	}
	
	public WebElement enterPassword() {
		// driver.findElement(by.xpath"")
		return driver.findElement(password);
	}
	
	public WebElement enterPasswordConfirm() {
		// driver.findElement(by.xpath"")
		return driver.findElement(passwordConfirm);
	}
	
	public WebElement clickOnCheckbox() {
		// driver.findElement(by.xpath"")
		return driver.findElement(checkBox);
	}
	
	public WebElement clickOnContinueButton() {
		// driver.findElement(by.xpath"")
		return driver.findElement(continueButton);
	}
	
	public WebElement getRegistrationSuccesfulText() {
		return driver.findElement(registrationSuccessfulmsg);
	}
	
	public WebElement getFirstNameErrorMsg() {
		return driver.findElement(FirstNameErrorMsg);
	}
	
	public WebElement getLastNameErrorMsg() {
		return driver.findElement(LastNameErrorMsg);
	}
	
	public WebElement getEmailErrorMsg() {
		return driver.findElement(emailErrorMsg);
	}
	
	public WebElement getTelephoneErrorMsg() {
		return driver.findElement(TelephoneErrorMsg);
	}
	
	public WebElement getPasswordErrorMsg() {
		return driver.findElement(passwordErrorMsg);
	}
	
	public WebElement getPrivacyPolicyAlertErrorMsg() {
		return driver.findElement(privacyPolicyAlertErrormsg);
	}
	
	public WebElement getemailAlreadyRegisteredErrorMsg() {
		return driver.findElement(emailAlreadyRegisteredErrorMsg);
	}

}
