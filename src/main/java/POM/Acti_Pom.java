package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Acti_Pom {

	//declaration
	@FindBy(xpath = "//input[@id='username']")private WebElement UN;
	@FindBy(xpath = "//input[@name='pwd']")private WebElement PWD;
	@FindBy(xpath = "//a[@id='loginButton']")private WebElement Login;
	
	//initialization
	public Acti_Pom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//implementation/utilization
	public void enterUN(String UserName) {
		UN.sendKeys(UserName);
	}
	public void enterPassword(String Pass) {
		PWD.sendKeys(Pass);
	}
	public void ClickLogin() {
		Login.click();
	}
}
