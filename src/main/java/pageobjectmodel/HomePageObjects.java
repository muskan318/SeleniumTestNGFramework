package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {

	public WebDriver driver;

	private By myAccount = By.xpath("//i[@class='fa fa-user']");
	private By register = By.xpath("//a[text()='Register']");
	private By login = By.xpath("//a[text() = 'Login']");

	// created this constructor, to take baseclass driver scope in
	// registrationtestcases while creating object of this class
	
	public HomePageObjects(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement clickOnmyaccount() {
		// driver.findElement(by.xpath"")
		return driver.findElement(myAccount);
	}

	public WebElement clickOnRegister() {

		return driver.findElement(register);
	}
	
	public WebElement clickOnLogin() {
		return driver.findElement(login);
	}

}
