package Next_TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Next_BaseResource.Next_ProjectBase;
import Next_HomePage.LogOut;
import Next_HomePage.Login;

public class Next_LogIn_LogOut extends Next_ProjectBase{
	 public WebDriver driver;
	Login lg;
	LogOut lo;
	
	@BeforeTest
	public void baseNavigation() throws IOException {
		driver=initializeDriver();
		lg= new Login();
		lo= new LogOut();
	}
	
	@Test()
	public void LogIn() throws InterruptedException{
		lg.logIn();
		lo.logOut();
}
	@AfterTest
	public void TearDown(){
		driver.close();
	}
}
