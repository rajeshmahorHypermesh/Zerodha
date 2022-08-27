package Test_Kite;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.Base_Acti_Class;
import POM.Acti_Pom;
import POM.Acti_Pom2;
import Utility.Utility_ActiClass;

public class Test_Acti extends Base_Acti_Class{
	
	Acti_Pom ap;
	Acti_Pom2 ap2;
	
	@BeforeClass
	public void openBrowser() {
		OpenTheBrowser();
		
		//object of All POM classes
		ap=new Acti_Pom(driver);
		ap2=new Acti_Pom2(driver);
	}
	
	@BeforeMethod
	public void LoginApp() throws Throwable {
		
		//enter UN
		ap.enterUN(Utility_ActiClass.GetTD(0, 0));
		
		//enter PWD
		ap.enterPassword(Utility_ActiClass.GetTD(0, 1));
		
		//click on Login
		ap.ClickLogin();
	}
	
	@Test
	public void VerifyText() throws Throwable {
		String expT = Utility_ActiClass.GetTD(0, 2);
		String actT = ap2.VerifyText();
		Assert.assertEquals(expT, actT,"Both are different then test case is fail");	
	}
	
	@AfterMethod
	public void LogoutApp() {
		Reporter.log("logout to App",true);
	}
	
	@AfterClass()
	public void CloseBrowser() {
		Reporter.log("Close the Browser",true);
	}

}
