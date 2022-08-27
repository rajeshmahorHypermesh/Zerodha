package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2 {

	//declaration
	@FindBy(xpath = "//input[@id='pin']")private WebElement PIN;
	@FindBy(xpath = "//button[text()='Continue ']")private WebElement CtnBtn;
	
	//Constructor//initialization
	public Pom2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//implementation
	public void enterPIN(String PinValue) {
		PIN.sendKeys(PinValue);
	}
	public void ClickCtnBtn() { 
		CtnBtn.click();
	}
}
