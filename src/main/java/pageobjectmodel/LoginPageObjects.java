package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	public WebDriver driver;
	
	private By email = By.xpath("//input[@id = 'input-email']");
	
	private By password = By.xpath("//input[@id = 'input-password']");
	
	private By login = By.xpath("//input[@value = 'Login']");
	
	private By loginSuccessfulText = By.xpath("//h2[text()='My Account']");
	
	private By invalidLoginText = By.xpath("//div[text() = ' Warning: No match for E-Mail Address and/or Password.']");
	
	public LoginPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement enterEmail() {
		return driver.findElement(email);
	}
	
	public WebElement enterPassword() {
		return driver.findElement(password);
	}
	
	public WebElement clickOnLogin() {
		return driver.findElement(login);
	}
	
	public WebElement getLoginSuccessfulText() {
		return driver.findElement(loginSuccessfulText);
	}
	
	public WebElement getInvalidLoginText() {
		return driver.findElement(invalidLoginText);
	}

}
