package Test_Kite;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import POM.Pom1;
import POM.Pom2;
import POM.Pom3;
import Utility.Utility_Class_;

public class Test_Class extends BaseClass {
	Pom1 login1;
	Pom2 login2;
	Pom3 home;
	

	@BeforeClass
	public void openBrowser() {
		initializeBrowser();
		
		//object of all POM classes
		login1=new Pom1(driver);
		login2=new Pom2(driver);
		home=new Pom3(driver);
	}
	
	@BeforeMethod
	public void LoginToApp() throws Throwable {
		
		//enter UN
		login1.enterUserName(Utility_Class_.getTD(1, 0));
		
		//enter PWD
		login1.enterPassword(Utility_Class_.getTD(1, 1));
		
		//click on Login
		login1.ClickLogin();
		
		//enter PIN
		login2.enterPIN(Utility_Class_.getTD(1, 2));
		
		//Clock on Continue Btn
		login2.ClickCtnBtn();
	}
	
	@Test
	public void Verify() throws Throwable {
		Reporter.log("runing verify user id",true);
		String actID = home.VerifyuserID();
		String expID=Utility_Class_.getTD(1, 0);
		Assert.assertEquals(actID, expID,"Both are different test case is fail");
	}
	
	@AfterMethod
	public void LogoutToApp() {
		Reporter.log("Logout to App",true);
	}
	
	@AfterClass
	public void CloseTheBrowser() {
		Reporter.log("Close the current Browser",true);
	}
}
