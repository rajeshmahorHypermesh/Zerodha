package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {

	//declaration
	@FindBy(xpath = "//input[@id='userid']")private WebElement UN;
	@FindBy(xpath = "//input[@id='password']")private WebElement PWD;
	@FindBy(xpath = "//button[text()='Login ']")private WebElement Login;
	
	//initialization
	public Pom1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//implementation
	public void enterUserName(String UserID) {
		UN.sendKeys(UserID);
	}
	public void enterPassword(String Pass) {
		PWD.sendKeys(Pass);
	}
	public void ClickLogin() {
		Login.click();
	}
	
}
