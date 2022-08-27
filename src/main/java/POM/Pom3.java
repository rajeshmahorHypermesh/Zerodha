package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom3 {

	//declaration
	@FindBy(xpath = "//span[@class='user-id']")private WebElement UserId;
	
	//initialization
	//constructor
	public Pom3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//implementation
	public String VerifyuserID() {
		String actID=UserId.getText();
		return actID;
		
	}
}
