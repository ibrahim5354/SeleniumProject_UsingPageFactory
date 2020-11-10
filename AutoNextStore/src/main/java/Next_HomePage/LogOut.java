package Next_HomePage;

import org.openqa.selenium.support.PageFactory;

import Next_PageObjectsTest.pageFactory_LogOut;

public class LogOut extends pageFactory_LogOut{
	public LogOut(){
		PageFactory.initElements(driver, this);
	}
	
	public void  logOut(){
		clickOnUser.click();
		logOut.click();

	}
}
