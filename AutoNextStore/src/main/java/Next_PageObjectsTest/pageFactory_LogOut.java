package Next_PageObjectsTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Next_BaseResource.Next_ProjectBase;

public class pageFactory_LogOut extends Next_ProjectBase{
	

	@FindBy(xpath = "/html/body/header/div/section/section[3]/ul/li[1]/a")
	protected
	WebElement clickOnUser;
	@FindBy(xpath="/html/body/header/div/section/section[3]/ul/div/span[2]/a")
	protected
	WebElement logOut;

}
